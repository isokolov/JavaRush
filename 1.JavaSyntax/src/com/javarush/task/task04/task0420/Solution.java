package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.
*/

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[3];
        myArray[0] = scanner.nextInt();
        myArray[1] = scanner.nextInt();
        myArray[2] = scanner.nextInt();
        Arrays.sort(myArray);
        System.out.println(myArray[2] + " " + myArray[1] + " " + myArray[0]);
        /* int[] vect = new int [3];
        vect[0] = Integer.parseInt(br.readLine());
        vect[1] = Integer.parseInt(br.readLine());
        vect[2] = Integer.parseInt(br.readLine());
        int k;
        for (int i=0;i<vect.length;i++) {
            for (int j=i; j<vect.length;j++) {
                if (vect[j]>vect[i]) {
                    k = vect[i];
                    vect[i] = vect[j];
                    vect[j] = k;
                }
            }
        } */
    }
}
