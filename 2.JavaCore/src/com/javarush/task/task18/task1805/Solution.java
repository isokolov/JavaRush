package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.TreeSet;

/* 
Сортировка байт
Ввести с консоли имя файла.
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран.
Закрыть поток ввода-вывода.
Пример байт входного файла:
44 83 44
Пример вывода:
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);
        /*TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());*/
        TreeSet<Integer> treeSet = new TreeSet<>();

        while(inputStream.available() > 0) {
            int data = inputStream.read();
            treeSet.add(data);
        }

        for(int data: treeSet) {
            System.out.print(data + " ");
        }

        reader.close();
        inputStream.close();
    }
}
