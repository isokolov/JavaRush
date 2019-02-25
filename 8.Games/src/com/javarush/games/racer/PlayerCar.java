package com.javarush.games.racer;

import com.javarush.games.racer.road.RoadManager;

public class PlayerCar extends GameObject {

    public int speed = 1;
    private static int playerCarHeight = ShapeMatrix.PLAYER.length;
    private Direction direction;

    public PlayerCar() {
        super(RacerGame.WIDTH / 2 + 2, RacerGame.HEIGHT - playerCarHeight - 1, ShapeMatrix.PLAYER);
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void stop() {
        matrix = ShapeMatrix.PLAYER_DEAD;
    }

    public void move() {
        if (x < RoadManager.LEFT_BORDER) {
            x = RoadManager.LEFT_BORDER;
        }
        if ( x > RoadManager.RIGHT_BORDER - width) {
            x = RoadManager.RIGHT_BORDER - width;
        }
        if (direction == Direction.LEFT) {
            x -= 1;
        }
        if (direction == Direction.RIGHT) {
            x += 1;
        }

    }
}
