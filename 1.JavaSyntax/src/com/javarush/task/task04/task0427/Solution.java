package com.javarush.task.task04.task0427;

/* 
Описываем числа
Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
"четное однозначное число" - если число четное и имеет одну цифру,
"нечетное однозначное число" - если число нечетное и имеет одну цифру,
"четное двузначное число" - если число четное и имеет две цифры,
"нечетное двузначное число" - если число нечетное и имеет две цифры,
"четное трехзначное число" - если число четное и имеет три цифры,
"нечетное трехзначное число" - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
Пример для числа 100:
четное трехзначное число
Пример для числа 51:
нечетное двузначное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean even = (number % 2 == 0) ? true :false;
        int lengthNumber = String.valueOf(number).length();
        /* if (a<1 || a>999)
            return;
         */
        if (even && lengthNumber == 1 && number != 0)
            System.out.println("четное однозначное число");
        if (!even && lengthNumber == 1 && number != 0)
            System.out.println("нечетное однозначное число");
        if (even && lengthNumber == 2 && number != 0)
            System.out.println("четное двузначное число");
        if (!even && lengthNumber == 2 && number != 0)
            System.out.println("нечетное двузначное число");
        if (even && lengthNumber == 3 && number != 0)
            System.out.println("четное трехзначное число");
        if (!even && lengthNumber == 3 && number != 0)
            System.out.println("нечетное трехзначное число");

    }
}