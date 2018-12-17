package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());


        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static int min(int a, int b, int c, int d, int e) {
        int min1 = Math.min(a, b);
        int min2 = Math.min(c, d);
        int min3 = Math.min(min1, min2);

        return Math.min(min3, e);
    }

    /*
    public static int min(int a, int b, int c, int d, int e) {
        int minimum = a < b ? a : b;
        minimum = c < minimum ? c : minimum;
        minimum = d < minimum ? d : minimum;
        minimum = e < minimum ? e : minimum;

        return minimum;
    }
     */
}

