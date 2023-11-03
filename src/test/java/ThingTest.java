import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class ThingTest {

    @Test
    void live_cell_should_die_if_less_than_two_neighbors() {
        Board board = new Board(3, 4);
        board.setLiveCell(0,1);
        board.setLiveCell(1,2);
        System.out.println(board.toString());
        board.next();
        System.out.println(board.toString());
        assertThat(board.tiles.get(1).get(1).getState()).isFalse();
    }

    @Test
    void live_cell_survive_if_two_neighbors() {
        Board board = new Board(3,3);
        board.setLiveCell(1,1);
        board.setLiveCell(2,1);
        board.setLiveCell(1,2);

        System.out.println(board);
        board.next();
        System.out.println(board);

        assertThat(board.tiles.get(1).get(1).getState()).isTrue();
    }

    @Test
    void live_cell_survive_if_three_neighbors() {
        Board board = new Board(3,3);
        board.setLiveCell(1,1);
        board.setLiveCell(2,1);
        board.setLiveCell(1,2);
        board.setLiveCell(0,1);

        System.out.println(board);
        board.next();
        System.out.println(board);

        assertThat(board.tiles.get(1).get(1).getState()).isTrue();
    }
}
