package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = null;
        ArrayList<Integer> list = new ArrayList<>();
        try {
            String fileName = reader.readLine();
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

            while (bufferedReader.ready()) {
                int number = Integer.parseInt(bufferedReader.readLine());
                if (number % 2 == 0) {
                    list.add(number);
                }
            }
            reader.close();
            bufferedReader.close();
            Collections.sort(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int n: list) {
            System.out.println(n);
        }
    }
}
/* 57%, 1, 3.01, 16221 */