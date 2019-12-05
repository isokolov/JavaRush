package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

/* 
Самые частые байты
Ввести с консоли имя файла.
Найти байт или байты с максимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        int maxRepeat = 0;
        while(inputStream.available() > 0) {
            int data = inputStream.read();
            if (treeMap.containsKey(data)) {
                treeMap.put(data, treeMap.get(data) + 1);
            }
            else {
                treeMap.put(data, 1);
            }
        }

        for (Map.Entry<Integer, Integer> pair: treeMap.entrySet()) {
            if (pair.getValue() >= maxRepeat) {
                maxRepeat = pair.getValue();
            }
        }

        for (Map.Entry<Integer, Integer> pair: treeMap.entrySet()) {
            if (pair.getValue() == maxRepeat) {
                System.out.print(pair.getKey() + " ");;
            }
        }

        reader.close();
        inputStream.close();


    }
}
