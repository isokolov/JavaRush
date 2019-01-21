package com.javarush.games.snake;

import java.util.ArrayList;
import java.util.List;

public class Snake {

    private List<GameObject> snakeParts = new ArrayList<>();

    public Snake(int x, int y) {
        GameObject object1 = new GameObject(x, y);
        GameObject object2 = new GameObject(x + 1, y);
        GameObject object3 = new GameObject(x + 2, y);
        snakeParts.add(object1);
        snakeParts.add(object2);
        snakeParts.add(object3);
    }
}
