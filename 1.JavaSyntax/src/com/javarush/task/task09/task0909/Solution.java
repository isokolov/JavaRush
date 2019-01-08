package com.javarush.task.task09.task0909;

/* 
Исключение при работе с массивами
Исключение при работе с массивами
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int[] m = new int[2];
m[8] = 5;
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        try {
            int[] m = new int[2];
            m[8] = 5;

            //напишите тут ваш код
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception);
        }
    }
}
