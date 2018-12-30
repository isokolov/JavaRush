package com.javarush.task.task08.task0813;

import java.util.Set;
import java.util.HashSet;

/* 
20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".
*/

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код
        HashSet<String> set = new HashSet<>();
        set.add("Любовь");
        set.add("Любa");
        set.add("Люк");
        set.add("Лист");
        set.add("Лампа");
        set.add("Лада");
        set.add("Ласты");
        set.add("Лак");
        set.add("Лакомый");
        set.add("Лапки");

        set.add("Липа");
        set.add("Линк");
        set.add("Листы");
        set.add("Листовки");
        set.add("Литр");
        set.add("Лина");
        set.add("Лена");
        set.add("Лера");
        set.add("Лень");
        set.add("Ломтик");

        return set;

    }

    public static void main(String[] args) {

    }
}
