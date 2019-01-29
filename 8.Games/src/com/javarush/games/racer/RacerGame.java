package com.javarush.games.racer;


import com.javarush.engine.cell.*;

public class RacerGame extends Game {

    public static final int WIDTH = 64;
    public static final int HEIGHT = 64;
    public static final int CENTER_X = WIDTH / 2;
    public static final int ROADSIDE_WIDTH = 14;

    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        showGrid(false);
        createGame();
    }

    private void drawField() {
        for (int i = 0; i < WIDTH ; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                if (i == CENTER_X) {
                    setCellColor(i, j, Color.WHITE);
                } else if(i >= ROADSIDE_WIDTH && i < (WIDTH - ROADSIDE_WIDTH)) {
                    setCellColor(i, j, Color.DIMGREY);
                } else {
                    setCellColor(i, j, Color.GREEN);
                }
            }
        }
    }
    
    private void drawScene() {
        drawField();
    }
    private void createGame() {
        drawScene();
    }
}
