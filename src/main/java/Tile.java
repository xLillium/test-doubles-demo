public class Tile {
    private boolean state;
    private int x;
    private int y;


    public Tile(int x, int y, boolean state) {
        this.x = x;
        this.y = y;
        this.state = state;
    }

    @Override
    public String toString() {
        return this.state ? "+" : "o";
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
