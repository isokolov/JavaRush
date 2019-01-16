package com.javarush.task.task23.task2312;

import java.awt.event.KeyEvent;
import java.util.List;

public class Room {
    private int width;
    private int height;
    private Snake snake;
    private Mouse mouse;

    public static Room game;

    public Room(int width, int height, Snake snake) {
        this.width = width;
        this.height = height;
        this.snake = snake;
        game = this;
    }

    public Snake getSnake() {
        return snake;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    /**
     * Основной цикл программы.
     * Тут происходят все важные действия
     */
    public void run() {
        //Создаем объект "наблюдатель за клавиатурой" и стартуем его.
        KeyboardObserver keyboardObserver = new KeyboardObserver();
        keyboardObserver.start();

        //пока змея жива
        while (snake.isAlive()) {
            //"наблюдатель" содержит события о нажатии клавиш?
            if (keyboardObserver.hasKeyEvents()) {
                KeyEvent event = keyboardObserver.getEventFromTop();
                //Если равно символу 'q' - выйти из игры.
                if (event.getKeyChar() == 'q') return;

                //Если "стрелка влево" - сдвинуть фигурку влево
                if (event.getKeyCode() == KeyEvent.VK_LEFT)
                    snake.setDirection(SnakeDirection.LEFT);
                    //Если "стрелка вправо" - сдвинуть фигурку вправо
                else if (event.getKeyCode() == KeyEvent.VK_RIGHT)
                    snake.setDirection(SnakeDirection.RIGHT);
                    //Если "стрелка вверх" - сдвинуть фигурку вверх
                else if (event.getKeyCode() == KeyEvent.VK_UP)
                    snake.setDirection(SnakeDirection.UP);
                    //Если "стрелка вниз" - сдвинуть фигурку вниз
                else if (event.getKeyCode() == KeyEvent.VK_DOWN)
                    snake.setDirection(SnakeDirection.DOWN);
            }

            snake.move();   //двигаем змею
            print();        //отображаем текущее состояние игры
            sleep();        //пауза между ходами
        }

        System.out.println("Game Over!");
    }

    public void print() {
        //Создаем массив, куда будем "рисовать" текущее состояние игры
        //Рисуем все кусочки змеи
        //Рисуем мышь
        //Выводим все это на экран
        int[][] screen = new int[height][width];
        List<SnakeSection> snakeSections = snake.getSections();

        for (SnakeSection snakeSection : snakeSections)
            screen[snakeSection.getY()][snakeSection.getX()] = 1;

        screen[snake.getY()][snake.getX()] = 2;
        screen[mouse.getY()][mouse.getX()] = 3;

        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                if (screen[j][i] == 1)
                    System.out.print("x");
                else if (screen[j][i] == 2)
                    System.out.print("X");
                else if (screen[j][i] == 3)
                    System.out.print("^");
                else
                    System.out.print(".");
            }
            System.out.println();
        }
        /*char matrix[][] = new char[height][width];
        for (int i = 0; i < height ; i++) {
            for (int j = 0; j < width ; j++) {
                if (mouse.getX() == j && mouse.getY() == i) {
                    matrix[i][j] = '^';
                }
                if (snake.getSections().get(0).getX() == j && snake.getSections().get(0).getY() == i) {
                    matrix[i][j] = 'X';
                }
                for(SnakeSection snakeSection: snake.getSections()) {
                    if (snakeSection.getX() == j && snakeSection.getY() == i) {
                        matrix[i][j] = 'x';
                    }
                }
            }
        }*/

    }

    public void eatMouse() {
        createMouse();
    }

    public void createMouse() {
        int x = (int) (Math.random() * width);
        int y = (int) (Math.random() * height);

        mouse = new Mouse(x, y);
    }

    public static void main(String[] args) {
        game = new Room(20, 20, new Snake(10, 10));
        game.snake.setDirection(SnakeDirection.DOWN);
        game.createMouse();
        game.run();
    }

    public void sleep() {
        // делаем паузу, длинна которой зависит от длинны змеи
        try {
            int initialDelay = 520;
            int snakeSize = getSnake().getSections().size();
            Thread.sleep(500);
            if (snakeSize > 1) {
                int delay = (snakeSize < 15) ? initialDelay - snakeSize * 20 : 200;
                Thread.sleep(delay);
            }
            /*for (int i = 1; i <= getSnake().getSections().size(); i++) {
                if (i > 1 && i <= 15) {
                    Thread.sleep(500 - 20 * (i - 1));
                }
                else {
                    Thread.sleep(200);
                }
            }*/
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
