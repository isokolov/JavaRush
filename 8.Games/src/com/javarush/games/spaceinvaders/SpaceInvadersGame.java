package com.javarush.games.spaceinvaders;

import com.javarush.engine.cell.*;
import com.javarush.games.spaceinvaders.gameobjects.EnemyFleet;
import com.javarush.games.spaceinvaders.gameobjects.Star;

import java.util.ArrayList;
import java.util.List;

public class SpaceInvadersGame extends Game {

    public final static int WIDTH = 64;
    public final static int HEIGHT = 64;
    private List<Star> stars;
    private EnemyFleet enemyFleet;


    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }

    @Override
    public void onTurn(int step) {
        //super.onTurn(step);
        drawScene();
    }

    private void drawField() {
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                setCellValueEx(i, j, Color.BLACK, "");
            }
        }

        for(Star star: stars) {
            star.draw(this);
        }
    }

    private void drawScene() {
        drawField();
        enemyFleet.draw(this);
    }

    private void createGame() {
        createStars();
        enemyFleet = new EnemyFleet();
        drawScene();
        setTurnTimer(40);
    }

    private void createStars() {
        stars = new ArrayList<Star>();
        stars.add(new Star(1,1));
        stars.add(new Star(1,2));
        stars.add(new Star(1,5));
        stars.add(new Star(1,6));
        stars.add(new Star(3,1));
        stars.add(new Star(3,7));
        stars.add(new Star(4,4));
        stars.add(new Star(4,5));
    }


}
