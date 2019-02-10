package com.javarush.task.task25.task2515;

public class Canvas {

    private int width;
    private int height;
    private char[][] matrix;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        matrix = new char[height][width];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public char[][] getMatrix() {
        return matrix;
    }

    public void clear() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                setPoint(j, i, ' ');
            }
        }
    }

    public void setPoint(double x, double y, char c) {
        if (x < 0 || y < 0 || matrix.length <= y || matrix[0].length <= x) return;
        int xNew = (int)Math.round(x);
        int yNew = (int)Math.round(y);
        matrix[yNew][xNew] = c;
    }

    /*
    Второй метод - drawMatrix копирует переданную ему картинку (матрицу) в матрицу Canvas.
    И не просто копирует, а начиная с координат x, y.
    */
    public void drawMatrix(double x, double y, int[][] matrix, char c) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0) {
                    setPoint(x+j, y+i, c);
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println(matrix[i][j]);
            }

        }
        System.out.println("");
        System.out.println("");
    }


}
