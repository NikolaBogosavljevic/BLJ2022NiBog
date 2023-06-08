package ch.noseryoung.blj;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Game {

    private int[][] gameField;
    private ArrayList<int[]> goalCoords = new ArrayList<>();
    private int posX;
    private int posY;

    public Game() {
        gameField = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 1, 1, 0, 0},
                {0, 1, 1, 1, 0, 0, 0, 1, 0, 0},
                {0, 1, 4, 2, 3, 0, 0, 1, 0, 0},
                {0, 1, 1, 1, 0, 3, 4, 1, 0, 0},
                {0, 1, 4, 1, 1, 3, 0, 1, 0, 0},
                {0, 1, 0, 1, 0, 4, 0, 1, 1, 0},
                {0, 1, 3, 0, 3, 3, 3, 4, 1, 0},
                {0, 1, 0, 0, 0, 4, 0, 0, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        goalCoords.add(new int[]{3, 2});
        goalCoords.add(new int[]{4, 6});
        goalCoords.add(new int[]{5, 2});
        goalCoords.add(new int[]{6, 5});
        goalCoords.add(new int[]{7, 7});
        goalCoords.add(new int[]{8, 5});
        goalCoords.add(new int[]{7, 4});
        colorCorrect();
    }

    public void moveUp() {
        getPlayerPos();
        if (gameField[posY - 1][posX] == 0 || (((gameField[posY - 1][posX] == 3 && gameField[posY - 2][posX] != 3) || (gameField[posY - 1][posX] == 5 && gameField[posY - 2][posX] != 3)) && gameField[posY - 2][posX] != 1) || gameField[posY - 1][posX] == 4) {
            if (gameField[posY - 1][posX] == 3 || gameField[posY - 1][posX] == 5) {
                gameField[posY - 2][posX] = 3;
            }
            if (isGoalCoord()) {
                gameField[posY][posX] = 4;

            } else {
                gameField[posY][posX] = 0;
            }
            gameField[posY - 1][posX] = 2;
        }
        if (isGameDone()) {
            System.exit(0);
        }
        colorCorrect();
    }

    public void moveDown() {
        getPlayerPos();
        if (gameField[posY + 1][posX] == 0 || (((gameField[posY + 1][posX] == 3 && (gameField[posY + 2][posX] != 3) || (gameField[posY + 1][posX] == 5 && gameField[posY + 2][posX] != 3)) && gameField[posY + 2][posX] != 1) || gameField[posY + 1][posX] == 4)) {
            if (gameField[posY + 1][posX] == 3 || gameField[posY + 1][posX] == 5) {
                gameField[posY + 2][posX] = 3;
            }
            if (!isGoalCoord()) {
                gameField[posY][posX] = 0;

            } else {
                gameField[posY][posX] = 4;
            }
            gameField[posY + 1][posX] = 2;
        }
        if (isGameDone()) {
            System.exit(0);
        }
        colorCorrect();
    }

    public void moveLeft() {
        getPlayerPos();
        if (gameField[posY][posX - 1] == 0 || (((gameField[posY][posX - 1] == 3 && (gameField[posY][posX - 2] != 3) || (gameField[posY][posX - 1] == 5 && gameField[posY][posX - 2] != 3)) && gameField[posY][posX - 2] != 1) || gameField[posY][posX - 1] == 4)) {
            if (gameField[posY][posX - 1] == 3 || gameField[posY][posX - 1] == 5) {
                gameField[posY][posX - 2] = 3;
            }
            if (!isGoalCoord()) {
                gameField[posY][posX] = 0;

            } else {
                gameField[posY][posX] = 4;
            }
            gameField[posY][posX - 1] = 2;
        }
        if (isGameDone()){
            System.exit(0);
        }
        colorCorrect();
    }

    public void moveRight() {
        getPlayerPos();
        if (gameField[posY][posX + 1] == 0 || (((gameField[posY][posX + 1] == 3 && (gameField[posY][posX + 2] != 3) || (gameField[posY][posX + 1] == 5 && gameField[posY][posX + 2] != 3)) && gameField[posY][posX + 2] != 1) || gameField[posY][posX + 1] == 4)) {
            if (gameField[posY][posX + 1] == 3 || gameField[posY][posX + 1] == 5) {
                gameField[posY][posX + 2] = 3;
            }
            if (!isGoalCoord()) {
                gameField[posY][posX] = 0;

            } else {
                gameField[posY][posX] = 4;
            }
            gameField[posY][posX + 1] = 2;
        }
        if (isGameDone()){
            System.exit(0);
        }
        colorCorrect();
    }

    public void escAction() {
        System.exit(0);
    }

    public void getPlayerPos() {
        for (int i = 0; i < gameField.length - 1; i++) {
            for (int j = 0; j < gameField.length - 1; j++) {
                if (gameField[i][j] == 2) {
                    posY = i;
                    posX = j;
                }
            }
        }
    }

    public boolean isGoalCoord() {
        for (int[] i : goalCoords) {
            if (i[0] == posY && i[1] == posX) {
                return true;
            }
        }
        return false;
    }

    public boolean isGameDone() {
        for (int[] i : goalCoords) {
            if (gameField[i[0]][i[1]] == 4) {
                return false;
            }
        }
        return true;
    }

    public void colorCorrect(){
        for (int[] i : goalCoords) {
            if (gameField[i[0]][i[1]] == 3) {
                gameField[i[0]][i[1]] = 5;
            }
        }
    }

    public int[][] getField() {
        return gameField;
    }

    public int getColCount() {
        return gameField.length;
    }

    public int getRowCount() {
        return gameField[0].length;
    }
}
