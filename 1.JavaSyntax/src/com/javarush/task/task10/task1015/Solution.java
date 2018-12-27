package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Массив списков строк
Создать массив, элементами которого будут списки строк.
Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] massivArrayList = new ArrayList[5];
        massivArrayList[0] = new ArrayList<>(Arrays.asList("Hello, Russian"));
        massivArrayList[1] = new ArrayList<>(Arrays.asList("Mama", "Mila", "Ramu"));
        massivArrayList[2] = new ArrayList<>(Arrays.asList("Matrix", "Neo", "Trinity"));
        massivArrayList[3] = new ArrayList<>(Arrays.asList("Matrix reloaded", "Agents", "Zion"));
        massivArrayList[4] = new ArrayList<>(Arrays.asList("Matrix revolution", "Reloading", "Cool"));


        return massivArrayList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
