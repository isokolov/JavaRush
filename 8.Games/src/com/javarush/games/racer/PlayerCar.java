package com.javarush.games.racer;

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

    public void move() {
        if (direction == Direction.LEFT) {
            x -= 1;
        }
        if (direction == Direction.RIGHT) {
            x += 1;
        }
    }
}
