package com.javarush.games.game2048;

import com.javarush.engine.cell.*;

public class Game2048 extends Game {

    private static final int SIDE = 4;
    private int[][] gameField = new int[SIDE][SIDE];

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }

    private void createGame() {
        createNewNumber();
        createNewNumber();
    }

    private void createNewNumber() {
        int x = 0;
        int y = 0;
        do {
            x = getRandomNumber(SIDE);
            y = getRandomNumber(SIDE);

        } while (gameField[x][y] != 0);
            if (getRandomNumber(10) < 9) {
                gameField[x][y] = 2;
            } else {
                gameField[x][y] = 4;
            }
    }

    /*private void createNewNumber() {
        int x = getRandomNumber(SIDE);
        int y = getRandomNumber(SIDE);
        int random = getRandomNumber(10);
        if (gameField[x][y] == 0) {
            if (getRandomNumber(10) == 9) {
                gameField[x][y] = 4;
            } else {
                gameField[x][y] = 2;
            }
        }
    }*/

    private void drawScene() {

        for (int i = 0; i < SIDE ; i++) {
            for (int j = 0; j < SIDE; j++) {
                setCellColor(i, j, Color.CADETBLUE);
            }
        }
    }
}
