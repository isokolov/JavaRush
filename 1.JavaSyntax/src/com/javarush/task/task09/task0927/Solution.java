package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
Есть класс кот - Cat, с полем "имя" (String).
Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
Получить из Map множество(Set) всех котов и вывести его на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> map = new HashMap<>();
        map.put("vaska1", new Cat("vaska1"));
        map.put("vaska2", new Cat("vaska2"));
        map.put("vaska3", new Cat("vaska3"));
        map.put("vaska4", new Cat("vaska4"));
        map.put("vaska5", new Cat("vaska5"));
        map.put("vaska6", new Cat("vaska6"));
        map.put("vaska7", new Cat("vaska7"));
        map.put("vaska8", new Cat("vaska8"));
        map.put("vaska9", new Cat("vaska9"));
        map.put("vaska10", new Cat("vaska10"));

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> set = new HashSet<>(map.values());

        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
