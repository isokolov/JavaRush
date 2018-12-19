package com.javarush.task.task04.task0424;

/* 
Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других,
равных между собой. Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
Если все числа разные, ничего не выводить.
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
        if (number1 == number2 && number1 != number3)
            System.out.println(3);
        if (number3 == number2 && number1 != number3)
            System.out.println(1);
        if (number1 == number3 && number1 != number2)
            System.out.println(2);
    }
}
