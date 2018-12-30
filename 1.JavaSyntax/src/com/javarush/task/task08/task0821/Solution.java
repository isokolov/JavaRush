package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов", "Вася");
        map.put("Иванов", "Петя");
        map.put("Петров", "Олег");
        map.put("Петровский", "Олег");
        map.put("Петровцев", "Олег");
        map.put("Сокол", "Виктор");
        map.put("Соколов", "Виктор");
        map.put("Сокольник", "Настя");
        map.put("Соколь", "Виктория");
        map.put("Соколова", "Катерина");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
