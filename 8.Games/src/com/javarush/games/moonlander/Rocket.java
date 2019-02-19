package com.javarush.games.moonlander;

public class Rocket extends GameObject {

    private double speedX = 0;
    private double speedY = 0;
    private double boost = 0.05;

    public Rocket(double x, double y) {
        super(x, y, ShapeMatrix.ROCKET);
    }

    /*public void move() {
        speedY += boost;
        y += speedY;
    }*/

    public void move(boolean isUpPressed, boolean isLeftPressed, boolean isRightPressed) {
        if (isUpPressed == true) {
            speedY -= boost;
        } else {
            speedY += boost;
        }
        y += speedY;
        if (isLeftPressed == true) {
            speedX -= boost;
            x += speedX;
        }
        if (isRightPressed == true) {
            speedX += boost;
            x += speedX;
        }

    }
}
