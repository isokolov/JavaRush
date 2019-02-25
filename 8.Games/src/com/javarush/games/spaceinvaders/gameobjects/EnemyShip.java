package com.javarush.games.spaceinvaders.gameobjects;

import com.javarush.games.spaceinvaders.Direction;
import com.javarush.games.spaceinvaders.ShapeMatrix;

public class EnemyShip extends Ship {

    public EnemyShip(double x, double y) {
        super(x, y);
        setStaticView(ShapeMatrix.ENEMY);
    }

    @Override
    public Bullet fire() {
        return new Bullet(x + 1, y + height, Direction.DOWN);
    }

    public void move(Direction direction, double speed) {
        if (direction == Direction.RIGHT) {
            x += speed;
        }
        if (direction == Direction.LEFT) {
            x -= speed;
        }
        if (direction == Direction.DOWN) {
            y += 2;
        }
    }
}
