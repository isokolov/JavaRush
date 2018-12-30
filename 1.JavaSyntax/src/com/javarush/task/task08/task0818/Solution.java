package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Smith", 600);
        map.put("Smith2", 200);
        map.put("Smith3", 400);
        map.put("Smith4", 1600);
        map.put("Smith5", 2600);
        map.put("Smith6", 750);
        map.put("Smith7", 100);
        map.put("Smith8", 200);
        map.put("Smith9", 550);
        map.put("Smith10", 999);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            if (pair.getValue() < 500)
                iterator.remove();
        }
    }

    public static void main(String[] args) {
        /*HashMap<String, Integer> map = createMap();
        removeItemFromMap(map);
        System.out.println(map);*/
    }
}
