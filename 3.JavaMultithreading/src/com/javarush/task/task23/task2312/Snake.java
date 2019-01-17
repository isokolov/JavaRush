package com.javarush.task.task23.task2312;

import java.util.ArrayList;
import java.util.List;

public class Snake {

    private List<SnakeSection> sections;
    private boolean isAlive;
    private SnakeDirection direction;

    public Snake(int x, int y) {
        sections = new ArrayList<>();
        sections.add(0, new SnakeSection(x, y));
        isAlive = true;
    }

    public List<SnakeSection> getSections() {
        return sections;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection getDirection() {
        return direction;
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }

    public int getX() {
        return sections.get(0).getX();
    }

    public int getY() {
        return sections.get(0).getY();
    }

    public void move() {
        if (isAlive == false) {
            return;
        }
        if (direction == SnakeDirection.UP) {
            move(0, -1);
        }
        if (direction == SnakeDirection.RIGHT) {
            move(1, 0);
        }
        if (direction == SnakeDirection.DOWN) {
            move(0, 1);
        }
        if (direction == SnakeDirection.LEFT) {
            move(-1, 0);
        }
    }

    public void checkBody(SnakeSection head) {
        for (SnakeSection snakeSection: sections) {
            if (head.equals(snakeSection)) {
                isAlive = false;
            }
        }
    }
    public void checkBorders(SnakeSection head) {
        if (head.getX() >= Room.game.getWidth() || head.getY() >= Room.game.getHeight()) {
            isAlive = false;
        }
        if (head.getX() < 0 || head.getY() < 0) {
            isAlive = false;
        }
    }

    public void move(int a, int b) {

    }
}
