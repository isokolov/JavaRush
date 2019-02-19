package com.javarush.games.moonlander;

public class Rocket extends GameObject {

    private double speedX = 0;
    private double speedY = 0;
    private double boost = 0.05;

    public Rocket(double x, double y) {
        super(x, y, ShapeMatrix.ROCKET);
    }

    private void checkBorders() {


        if (x < 0) {
            x = 0;
            speedX = 0;
        } else if (x + width > MoonLanderGame.WIDTH) {
            x = MoonLanderGame.WIDTH - width;
            speedX = 0;
        }
        if (y < 0) {
            y = 0;
            speedY = 0;
        }
        /*if (x < 0) {
            x = 0;
            speedX = 0;
        }
        else if (x + width > MoonLanderGame.WIDTH) {
            speedX = 0;
        }
        else if (x + width < MoonLanderGame.WIDTH) {
            x = (MoonLanderGame.WIDTH - width);
        }
        if (y < 0) {
            y = 0;
            speedY = 0;
        }*/
    }

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
        checkBorders();

    }
}
