package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;

        //напишите тут ваш код
        int numbers = Integer.parseInt(reader.readLine());
        int index = 0;
        if (numbers > 0) {
            while (index < numbers) {
                int newNumber = Integer.parseInt(reader.readLine());
                if (newNumber > maximum)
                    maximum = newNumber;
                index++;
            }
        }

        System.out.println(maximum);

        /*
        int N = Integer.parseInt(reader.readLine());
        if (N<=0) return;

        int a;
        maximum = Integer.parseInt(reader.readLine());
        for (int i=0; i<N-1;i++) {
            a = Integer.parseInt(reader.readLine());
            if (a>maximum) {
                maximum = a;
            }
        }
         */
    }
}

