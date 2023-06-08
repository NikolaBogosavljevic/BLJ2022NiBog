import org.example.Game;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {

    Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    @Test
    void moveRight() {
        int[][] arr = new int[][]{{2, 0, 0}};
        game.setGoalCoords(null);
        game.setGameField(arr);
        game.moveRight();
        int[][] expectedArr = new int[][]{{0, 2, 0}};
        Assertions.assertArrayEquals(expectedArr, game.getField());
    }

    @Test
    void moveRight_againstWall(){
        int[][] arr = new int[][]{{2, 1, 0}};
        game.setGoalCoords(null);
        game.setGameField(arr);
        game.moveRight();
        int[][] expectedArr = new int[][]{{2, 1, 0}};
        Assertions.assertArrayEquals(expectedArr, game.getField());
    }

    @Test
    void moveRight_onGoal(){
        int[][] arr = new int[][]{{2, 4, 0}};
        game.setGoalCoords(null);
        game.setGameField(arr);
        game.moveRight();
        int[][] expectedArr = new int[][]{{0, 2, 0}};
        Assertions.assertArrayEquals(expectedArr, game.getField());
    }
}
