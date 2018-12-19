package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Числа по возрастанию
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17


*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] myArray = new int[5];
        //напишите тут ваш код
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(myArray);
        for (int i: myArray) {
            System.out.println(i);
        }
    }
}
