package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a = 1;
        while (a < 11) {
            System.out.println(a + " " + a * 2 + " " + a * 3 + " " + a * 4 + " " +
                    a * 5 + " " + a * 6 + " " + a * 7 + " " +
                    a * 8 + " " + a * 9 + " " + a * 10);
            a++;
        }

    }
}
