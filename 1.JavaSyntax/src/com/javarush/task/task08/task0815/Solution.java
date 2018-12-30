package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Smith", "John");
        map.put("Smith2", "Alex");
        map.put("Smith3", "Sasha");
        map.put("Smith4", "John");
        map.put("Smith5", "Andrew");
        map.put("Smith6", "John");
        map.put("Smith7", "Viki");
        map.put("Smith8", "John");
        map.put("Smith9", "Sascha");
        map.put("Smith10", "Fedor");

        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int countSameFirstNames = 0;
        for (Map.Entry<String, String> pair: map.entrySet()) {
            if (pair.getValue().equals(name)) {
                countSameFirstNames++;
            }
        }

        return countSameFirstNames;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int countSameLastNames = 0;
        for (Map.Entry<String, String> pair: map.entrySet()) {
            if (pair.getKey().equals(lastName)) {
                countSameLastNames++;
            }
        }

        return countSameLastNames;

    }

    public static void main(String[] args) {

    }
}
