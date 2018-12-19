package com.javarush.task.task04.task0441;


/* 
Как-то средненько
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.
*/
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int middle = Integer.MIN_VALUE;
        if (number1 == number2 || number2 == number3)
            middle = number2;
        if (number1 == number3 && number1 != number2)
            middle = number1;

        int max = Math.max(number1, Math.max(number2, number3));
        int min = Math.min(number1, Math.min(number2, number3));
        if (number1 < max && number1 > min)
            middle = number1;
        if (number2 < max && number2 > min)
            middle = number2;
        if (number3 < max && number3 > min)
            middle = number3;
        System.out.println(middle);
        /* if (a==b && b==c && c==a) {
            System.out.println(a);
            return;
        }


        if (max == a && min == b) {
            System.out.println(c);
            return;
        }

        if (max == b && min == a) {
            System.out.println(c);
            return;
        }


        if (max == c && min == a) {
            System.out.println(b);
            return;
        }

        if (max == a && min == c) {
            System.out.println(b);
            return;
        }


        if (max == c && min == b) {
            System.out.println(a);
            return;
        }

        if (max == b && min == c) {
            System.out.println(a);
            return;
        }
         */
    }
}
