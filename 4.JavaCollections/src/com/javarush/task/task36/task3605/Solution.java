package com.javarush.task.task36.task3605;

import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

/* 
Использование TreeSet
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        TreeSet<Character> treeSet = new TreeSet();

        try (FileReader reader = new FileReader(fileName)) {
            char[] chars = new char[500];
            reader.read(chars);
            String str = new String(chars).toLowerCase();
            str = str.replaceAll("[^a-z]", "");

            for (Character character : str.toCharArray())
                treeSet.add(character);

            int counter = 0;
            for (Character character : treeSet) {
                if (counter == 5) break;
                System.out.print(character);
                counter++;
            }
        }
    }
}
