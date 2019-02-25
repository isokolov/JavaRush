package com.javarush.games.spaceinvaders.gameobjects;

import com.javarush.engine.cell.Game;
import com.javarush.games.spaceinvaders.ShapeMatrix;

import java.util.ArrayList;
import java.util.List;

public class EnemyFleet {

    private static final int ROWS_COUNT = 3;
    private static final int COLUMNS_COUNT = 10;
    private static final int STEP = ShapeMatrix.ENEMY.length + 1;
    private List<EnemyShip> ships;

    public EnemyFleet() {
        createShips();
    }

    public void draw(Game game) {
        for(EnemyShip enemyShip: ships) {
            enemyShip.draw(game);
        }
    }

    private double getLeftBorder() {
        double minX = Integer.MAX_VALUE;
        for (EnemyShip enemyShip: ships) {
            if (enemyShip.x < minX) {
                minX = enemyShip.x;
            }
        }

        return minX;
    }

    private double getRightBorder() {
        double maxX = Integer.MIN_VALUE;
        for (EnemyShip enemyShip: ships) {
            if ((enemyShip.x + enemyShip.width) > maxX) {
                maxX = enemyShip.x + enemyShip.width;
            }
        }

        return maxX;
    }

    private void createShips() {

        ships = new ArrayList<EnemyShip>();
        for (int x = 0; x < COLUMNS_COUNT; x++) {
            for (int y = 0; y < ROWS_COUNT; y++) {
                ships.add(new EnemyShip(x * STEP, y * STEP + 12));
            }
        }
    }
}
