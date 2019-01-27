package com.javarush.task.task15.task1517;

/* 
Статики и исключения
В статическом блоке выбросьте Exception
В результате класс не загрузится, и вы увидите сообщение об ошибке вместо значения переменной B
*/

import java.io.IOException;

public class Solution {
    public static int A = 0;

    static {
        //throw an exception here - выбросьте эксепшн тут
        try {
            if (true)
            throw new RuntimeException();
        } catch (RuntimeException e) {
            //e.printStackTrace();
            throw e;
        }
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
