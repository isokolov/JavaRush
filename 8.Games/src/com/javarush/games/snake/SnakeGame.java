package com.javarush.games.snake;

import com.javarush.engine.cell.*;

public class SnakeGame extends Game {

    public static final int WIDTH = 15;
    public static final int HEIGHT = 15;
    private Snake snake;
    private Apple apple;
    private int turnDelay;

   @Override
    public void initialize() {
       setScreenSize(WIDTH, HEIGHT);
       createGame();
    }

    @Override
    public void onKeyPress(Key key) {
        switch (key) {
            case UP:
                snake.setDirection(Direction.UP);
                break;
            case DOWN:
                snake.setDirection(Direction.DOWN);
                break;
            case LEFT:
                snake.setDirection(Direction.LEFT);
                break;
            case RIGHT:
                snake.setDirection(Direction.RIGHT);
                break;
        }
    }

    private void drawScene() {
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                setCellValueEx(i, j, Color.DARKSEAGREEN, "");
            }
        }
        snake.draw(this);
        apple.draw(this);
    }

    private void createGame() {
       snake = new Snake(WIDTH / 2, HEIGHT / 2);
       //apple = new Apple(5, 5);
       turnDelay = 300;
       setTurnTimer(turnDelay);
       createNewApple();
       drawScene();
    }

    @Override
    public void onTurn(int step) {
       snake.move(apple);
       if (apple.isAlive == false) {
           createNewApple();
       }
       drawScene();
    }

    private void createNewApple() {
        int appleX = getRandomNumber(WIDTH);
        int appleY = getRandomNumber(HEIGHT);
        apple = new Apple(appleX, appleY);
    }


}
