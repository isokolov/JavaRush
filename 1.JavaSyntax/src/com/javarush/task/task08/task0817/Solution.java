package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> hm =new HashMap<>();

        hm.put("Иванов", "Иван");
        hm.put("Иванидзе", "Иван");
        hm.put("Иваник", "Петр");
        hm.put("Петров", "Петр");
        hm.put("Сидоров", "Сидр");
        hm.put("Прутков", "Кузьма");
        hm.put("Толстой", "Алексей");
        hm.put("Тонкий", "Лев");
        hm.put("Пушкин", "Михаил");
        hm.put("Кукушкин", "Сергей");

        return hm;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>(map);

        for(Map.Entry<String, String> entry: map.entrySet()) {
            for(Map.Entry<String, String> entryConcurent: concurrentHashMap.entrySet()) {
                if (entry.getValue().equals(entryConcurent.getValue()) &&
                !entry.getKey().equals(entryConcurent.getKey())) {
                    removeItemFromMapByValue(concurrentHashMap, entryConcurent.getValue());
                }
            }
        }
        map.clear();
        for(Map.Entry<String, String> entryConcurent: concurrentHashMap.entrySet()) {
            map.put(entryConcurent.getKey(), entryConcurent.getValue());
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }

    }

    public static void main(String[] args) {
        /*HashMap<String, String> hm = createMap();
        //System.out.println(hm);
        removeTheFirstNameDuplicates(hm);
        System.out.println(hm);*/
    }
}
