package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        /* System.out.println(Math.max(Math.max(Math.max(n1,n2), n3),n4)); */
        System.out.println(Math.max(Math.max(a, b), Math.max(c, d)));
    }
}