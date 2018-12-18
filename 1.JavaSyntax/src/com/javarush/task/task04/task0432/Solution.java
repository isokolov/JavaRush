package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int number = scanner.nextInt();
        int a = 0;
        while (a < number) {
            System.out.println(text);
            a++;
        }

    }
}