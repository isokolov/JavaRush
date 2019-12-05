package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) {


        try {
            StringBuilder builder = new StringBuilder();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()));
            while(bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                for (int i = 0; i< 13; i++) {
                    //line = line.replaceAll("\\s" + i + "\\s", " " + map.get(i) + " ");
                    line = line.replaceAll("\\b" + i + "\\b", map.get(i));
                }
                builder.append(line + "\n");
            }
            System.out.println(builder.toString());
            reader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
