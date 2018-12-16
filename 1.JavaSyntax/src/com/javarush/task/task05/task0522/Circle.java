package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код
    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /* public Circle(double x, double y) {
        //напишите тут ваш код
    } */

    public Circle(double x, double y) {
        //напишите тут ваш код
        this(x, y, 10);
    }

    public Circle(double x) {
        this.x = x;
        this.y = 0;
        this.radius = 5;
    }

    public Circle(Circle another) {
        this.x = another.x;
        this.y = another.y;
        this.radius = another.radius;
    }

    public Circle() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {

    }
}
/* 21%, 1, 1.34, 19616 */