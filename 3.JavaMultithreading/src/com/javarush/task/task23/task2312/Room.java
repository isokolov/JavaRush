package com.javarush.task.task23.task2312;

public class Room {

    private int width;
    private int height;
    private Snake snake;
    private Mouse mouse;

    public Room(int widht, int height, Snake snake) {
        this.width = widht;
        this.height = height;
        this.snake = snake;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int wifth) {
        this.width = wifth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public static void main(String[] args) {
        
    }
}
