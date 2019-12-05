package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
С консоли считать имя файла.
Посчитать в файле количество символов ',', количество вывести на консоль.
Закрыть потоки.
Подсказка:
нужно сравнивать с ascii-кодом символа ','.
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);

        int komma = 0;

        while(inputStream.available() > 0) {
            int data = inputStream.read();
            if ((char)data == ',') {
                komma++;
            }
        }

        System.out.println(komma);

        reader.close();
        inputStream.close();
    }
}
