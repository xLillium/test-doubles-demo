import java.util.ArrayList;

public class Board {
    public ArrayList<ArrayList<Tile>> tiles;

    public Board(int x, int y) {
        this.tiles = new ArrayList<>(x);
        for (int i = 0; i < x; i++) {
            ArrayList<Tile> col = new ArrayList<>(y);
            for (int j = 0; j < y; j++) {
                col.add(new Tile(i,j,false));
            }
            this.tiles.add(col);
        }
    }

    @Override
    public String toString() {
        StringBuilder retour = new StringBuilder();
        for (ArrayList<Tile> row : this.tiles) {
            for (Tile cell : row) {
                retour.append(cell.toString());
            }
            retour.append("\n");
        }
        return retour.toString();
    }

   public void setLiveCell(int x, int y) {
        Tile tile = this.tiles.get(x).get(y);
        tile.setState(true);
        this.tiles.get(x).set(y, tile);
    }

    public int getTileLiveNeighbors(Tile tile) {
        int x = tile.getX();
        int y = tile.getY();
        int neighbors = 0;

        if (x > 0 && y > 0) {
            neighbors += this.tiles.get(x-1).get(y-1).getState() ? 1 : 0;
            neighbors += this.tiles.get(x).get(y-1).getState() ? 1 : 0;
            neighbors += this.tiles.get(x - 1).get(y).getState() ? 1 : 0;
        }
        if ( x < this.tiles.size() - 1 && y < this.tiles.get(x).size() - 1) {
            neighbors += this.tiles.get(x+1).get(y+1).getState() ? 1 : 0;
        }

        if (x < this.tiles.size() - 1 && y > 0) {
            neighbors += this.tiles.get(x+1).get(y-1).getState() ? 1 : 0;
        }

        if (this.tiles.size() > x+1) {
            neighbors += this.tiles.get(x+1).get(y).getState() ? 1 : 0;
        }
        if(y < this.tiles.get(x).size() - 1) {
            neighbors += this.tiles.get(x).get(y+1).getState() ? 1 : 0;
        }

        if ( x > 0 && y < this.tiles.get(x).size() - 1) {
            neighbors += this.tiles.get(x - 1).get(y + 1).getState() ? 1 : 0;
        }

        return neighbors;
    }

    public void next() {
        ArrayList<ArrayList<Tile>> nextTiles = new ArrayList<>(this.tiles);
        for (ArrayList<Tile> row : this.tiles) {
            for (Tile tile : row) {
                int numberOfLiveCells = this.getTileLiveNeighbors(tile);
                nextTiles.get(tile.getX()).get(tile.getY()).setState(numberOfLiveCells >= 2);
            }
        }
        this.tiles = nextTiles;
    }
}
