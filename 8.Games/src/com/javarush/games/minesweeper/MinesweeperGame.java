package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;

public class MinesweeperGame extends Game {

    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    private void createGame() {
        for (int i = 0; i < SIDE ; i++) {
            for (int j = 0; j < SIDE; j++) {
                if (getRandomNumber(10) == 9) {
                    gameField[i][j] = new GameObject(j, i, true);
                    countMinesOnField++;
                }
                else {
                    gameField[i][j] = new GameObject(j, i, false);
                }
                setCellColor(j, i, Color.ORANGE);
            }
        }
        int mineProbability = getRandomNumber(10);
    }
}
