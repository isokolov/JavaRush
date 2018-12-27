package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
1. Создай список строк.
2. Добавь в него 5 различных строк.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello, Russian");
        list.add("Plocho pokrashen");
        list.add("Sarashaem");
        list.add("Chorosha reka Nil");
        list.add("No nasha Volga lucshe");

        System.out.println(list.size());
        for (String str: list) {
            System.out.println(str);
        }
    }
}
