package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maxLine = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            String str = reader.readLine();
            if (str.length() > maxLine)
                maxLine = str.length();
            strings.add(str);
        }

        for (String str: strings) {
            if (str.length() == maxLine)
                System.out.println(str);
        }
    }
}
