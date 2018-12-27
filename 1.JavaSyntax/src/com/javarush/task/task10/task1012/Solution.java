package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв
(для 33 маленьких букв алфавита). Результат вывести на экран в алфавитном порядке.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
...
я 9
как
обрести
вдохновение
источник
радости
в
жизни
Вино
радует
сердца
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        // напишите тут ваш код
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (Character c: alphabet) {
            if (Character.isAlphabetic(c)) {
                map.put(c, 0);
            }
        }

        for(String str: list) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isAlphabetic(str.charAt(i)))
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
        }

        for (Map.Entry<Character, Integer> pair: map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

}
