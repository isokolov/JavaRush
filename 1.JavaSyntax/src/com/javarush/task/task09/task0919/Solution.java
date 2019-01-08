package com.javarush.task.task09.task0919;

/* 
Деление на ноль
Создай метод public static void divideByZero, в котором подели любое число
на ноль и выведи на экран результат деления.
Оберни вызов метода divideByZero в try..catch. Выведи стек-трейс исключения
используя метод exception.printStackTrace()
*/

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static void divideByZero() {
        System.out.println(77 / 0);;
    }
}
