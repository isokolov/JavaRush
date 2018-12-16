package com.javarush.task.task05.task0530;

import java.io.*;

/* 
Шеф, что-то не пашет
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // int a = reader.readLine(); at program beginning
        // int b = reader.read();
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
/* 18%, 1, 1.25, 51090 */