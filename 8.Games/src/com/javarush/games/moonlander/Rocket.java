package com.javarush.games.moonlander;

import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.List;

public class Rocket extends GameObject {
    private double speedY = 0;
    private double speedX = 0;
    private double boost = 0.05;
    private double slowdown = boost / 10;
    private RocketFire downFire;
    private RocketFire leftFire;
    private RocketFire rightFire;

    public Rocket(double x, double y) {
        super(x, y, ShapeMatrix.ROCKET);
        List<int[][]> frameList = new ArrayList<>();
        List<int[][]> frameList2 = new ArrayList<>();
        List<int[][]> frameList3 = new ArrayList<>();
        frameList.add(ShapeMatrix.FIRE_DOWN_1);
        frameList.add(ShapeMatrix.FIRE_DOWN_2);
        frameList.add(ShapeMatrix.FIRE_DOWN_3);
        frameList2.add(ShapeMatrix.FIRE_SIDE_1);
        frameList2.add(ShapeMatrix.FIRE_SIDE_2);
        frameList3.add(ShapeMatrix.FIRE_SIDE_1);
        frameList3.add(ShapeMatrix.FIRE_SIDE_2);
        downFire = new RocketFire(frameList);
        leftFire = new RocketFire(frameList2);
        rightFire = new RocketFire(frameList3);
    }

    @Override
    public void draw(Game game) {
        super.draw(game);
        downFire.draw(game);
        leftFire.draw(game);
        rightFire.draw(game);
    }

    public void move(boolean isUpPressed, boolean isLeftPressed, boolean isRightPressed) {
        if (isUpPressed) {
            speedY -= boost;
        } else {
            speedY += boost;
        }
        y += speedY;

        if (isLeftPressed) {
            speedX -= boost;
            x += speedX;
        } else if (isRightPressed) {
            speedX += boost;
            x += speedX;
        } else if (speedX > slowdown) {
            speedX -= slowdown;
        } else if (speedX < -slowdown) {
            speedX += slowdown;
        } else {
            speedX = 0;
        }
        x += speedX;
        checkBorders();
        switchFire(isUpPressed, isLeftPressed, isRightPressed);
    }

    public void land(){
        y--;
    }

    public void crash() {
        matrix = ShapeMatrix.ROCKET_CRASH;
    }

    private void checkBorders() {
        if (x < 0) {
            x = 0;
            speedX = 0;
        } else if (x + width > MoonLanderGame.WIDTH) {
            x = MoonLanderGame.WIDTH - width;
            speedX = 0;
        }
        if (y <= 0) {
            y = 0;
            speedY = 0;
        }
    }

    /*private void switchFire(boolean isUpPressed) {
        if (isUpPressed) {
            downFire.x = x + (width / 2);
            downFire.y = y + height;
            downFire.show();
        }
        if (!isUpPressed) {
            downFire.hide();
        }
    }*/

    private void switchFire(boolean isUpPressed, boolean isLeftPressed, boolean isRightPressed) {
        if (isUpPressed) {
            downFire.x = x + (width / 2);
            downFire.y = y + height;
            downFire.show();
        }
        if (!isUpPressed) {
            downFire.hide();
        }
        if (isLeftPressed) {
            leftFire.x = this.x + width;
            leftFire.y = this.y + height;
            leftFire.show();
        }
        if (!isLeftPressed) {
            leftFire.hide();
        }
        if (isRightPressed) {
            rightFire.x = this.x - ShapeMatrix.FIRE_SIDE_1[0].length;
            rightFire.y = this.y + height;
            rightFire.show();
        }
        if (!isRightPressed) {
            rightFire.hide();
        }
    }

    public boolean isStopped() {
        return speedY < 10 * boost;
    }

    public boolean isCollision(GameObject object) {
        int transparent = Color.NONE.ordinal();

        for (int matrixX = 0; matrixX < width; matrixX++) {
            for (int matrixY = 0; matrixY < height; matrixY++) {
                int objectX = matrixX + (int) x - (int) object.x;
                int objectY = matrixY + (int) y - (int) object.y;

                if (objectX < 0 || objectX >= object.width || objectY < 0 || objectY >= object.height)
                    continue;

                if (matrix[matrixY][matrixX] != transparent && object.matrix[objectY][objectX] != transparent)
                    return true;
            }
        }
        return false;
    }
}
