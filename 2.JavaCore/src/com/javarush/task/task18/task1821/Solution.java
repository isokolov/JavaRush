package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(args[0]);
        Map<Character, Integer> map = new TreeMap<>();

        while (fileReader.ready()) {
            char myChar = (char)fileReader.read();
            if (!map.containsKey(myChar)) {
                map.put(myChar, 1);
            } else {
                map.put(myChar, map.get(myChar) + 1);
            }
        }

        fileReader.close();
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
