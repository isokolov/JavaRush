package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        count = (a > 0) ? ++count : count;
        count = (b > 0) ? ++count : count;
        count = (c > 0) ? ++count : count;
        System.out.println(count);
        /* int k=0;
        for (int i=0;i<3;i++) {
            int a = Integer.parseInt(br.readLine());
            if (a>0)
                k += 1;
        } */

    }
}
