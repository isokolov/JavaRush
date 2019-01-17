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


        /* checkBorders(sections.get(0));
            checkBody(sections.get(0)); */

        //if (isAlive) {
            /*SnakeSection head = null;
            if (direction == SnakeDirection.UP) {
                head = new SnakeSection(sections.get(0).getX(), sections.get(0).getY() - b);
            }
            if (direction == SnakeDirection.RIGHT) {
                head = new SnakeSection(sections.get(0).getX() + a, sections.get(0).getY());
            }
            if (direction == SnakeDirection.DOWN) {
                head = new SnakeSection(sections.get(0).getX(), sections.get(0).getY() + b);
            }
            if (direction == SnakeDirection.LEFT) {
                head = new SnakeSection(sections.get(0).getX() - a, sections.get(0).getY());
            }*/
            SnakeSection head = new SnakeSection(sections.get(0).getX() + a, sections.get(0).getY() + b);

            sections.add(0, head);
            if (sections.get(0).getX() == Room.game.getMouse().getX() &&
                    sections.get(0).getY() == Room.game.getMouse().getY()) {
                Room.game.eatMouse();
            } else {
                sections.remove(sections.size() - 1);
            }
            checkBorders(sections.get(0));
            checkBody(sections.get(0));
        //}
    }
}
