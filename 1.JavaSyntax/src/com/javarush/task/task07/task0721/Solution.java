package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] bigMassiv = new int[20];
        for (int i = 0; i < bigMassiv.length; i++) {
            bigMassiv[i] = Integer.parseInt(reader.readLine());
        }
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        //напишите тут ваш код
        for (int i = 0; i < bigMassiv.length ; i++) {
            if (bigMassiv[i] >= maximum)
                maximum = bigMassiv[i];
            if (bigMassiv[i] <= minimum)
                minimum = bigMassiv[i];
        }

        System.out.print(maximum + " " + minimum);
    }
}
