package com.javarush.games.snake;

import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.List;

public class Snake {

    private List<GameObject> snakeParts = new ArrayList<>();
    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "\u26AB";
    public boolean isAlive = true;
    private Direction direction = Direction.LEFT;

    public Snake(int x, int y) {
        GameObject object1 = new GameObject(x, y);
        GameObject object2 = new GameObject(x + 1, y);
        GameObject object3 = new GameObject(x + 2, y);
        snakeParts.add(object1);
        snakeParts.add(object2);
        snakeParts.add(object3);
    }

    public int getLength() {
        return snakeParts.size();
    }

    public void setDirection(Direction direction) {
        if ( (this.direction == Direction.LEFT && direction != Direction.RIGHT)
        || (this.direction == Direction.RIGHT && direction != Direction.LEFT)
        || (this.direction == Direction.UP && direction != Direction.DOWN)
        || (this.direction == Direction.DOWN && direction != Direction.UP) ) {
            this.direction = direction;
        }

    }

    public GameObject createNewHead() {
        GameObject gameObject = null;
        switch (direction) {
            case RIGHT:
                gameObject = new GameObject(snakeParts.get(0).x + 1, snakeParts.get(0).y);
               break;
            case LEFT:
                gameObject = new GameObject(snakeParts.get(0).x - 1, snakeParts.get(0).y);
                break;
            case UP:
                gameObject = new GameObject(snakeParts.get(0).x, snakeParts.get(0).y - 1);
                break;
            case DOWN:
                gameObject = new GameObject(snakeParts.get(0).x, snakeParts.get(0).y + 1);
                break;
        }

        return gameObject;
    }

    public void removeTail() {
        snakeParts.remove(snakeParts.size() - 1);
    }

    public void draw(Game game) {
        Color snakeColor = Color.BLUE;
        if (!isAlive) {
            snakeColor = Color.RED;
        }
        for(int i = 0; i < snakeParts.size(); i++) {
            if (i == 0) {
                game.setCellValueEx(snakeParts.get(0).x, snakeParts.get(0).y, Color.NONE, HEAD_SIGN, snakeColor, 75);
            } else {
                game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, BODY_SIGN, snakeColor, 75);
            }


        }
    }

    public boolean checkCollision(GameObject gameObject) {
        for (GameObject object: snakeParts) {
            if (object.x == gameObject.x && object.y == gameObject.y) {
                return true;
            }
        }
        return false;
    }

    public void move(Apple apple) {
        GameObject gameObject = createNewHead();
        if (checkCollision(gameObject)) {
            isAlive = false;
            return;
        }
        if (gameObject.x == SnakeGame.WIDTH || gameObject.x < 0 ||
                gameObject.y == SnakeGame.HEIGHT || gameObject.y < 0) {
            isAlive = false;
            return;
        }
        if (gameObject.x == apple.x && gameObject.y == apple.y) {
            apple.isAlive = false;
            snakeParts.add(0, gameObject);
            return;
        }
        snakeParts.add(0, gameObject);
        removeTail();
    }

    
}
