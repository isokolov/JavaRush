package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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
        if (number1 == number2 && number2 == number3)
            System.out.print(number1 + " " + number2 + " " + number3);
        if (number1 == number2 && number2 != number3)
            System.out.print(number1 + " " + number2);
        if (number1 != number2 && number2 == number3)
            System.out.print(number2 + " " + number3);
        if (number1 == number3 && number2 != number3)
            System.out.print(number1 + " " + number3);
    }
}
