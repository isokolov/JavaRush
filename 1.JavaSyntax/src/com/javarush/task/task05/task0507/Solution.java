package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int index = 0;
        double average = 0;
        int sum = 0;
        while (true) {
            int number = Integer.parseInt(reader.readLine());
            if (number == -1)
                break;
            sum += number;
            index++;
            average = (double) sum / index;
        }
        System.out.println(average);
    }
}


