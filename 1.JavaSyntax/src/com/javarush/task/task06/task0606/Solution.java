package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        for (int i = 0; i < number.length(); i++) {
            if (Integer.parseInt(String.valueOf(number.charAt(i))) % 2 == 0)
                even++;
            else odd++;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
