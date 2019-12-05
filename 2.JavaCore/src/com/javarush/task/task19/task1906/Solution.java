package com.javarush.task.task19.task1906;

/* 
Четные символы
Считать с консоли 2 имени файла.
Вывести во второй файл все символы с четным порядковым номером (нумерация начинается с 1).
Пример первого файла:
text in file
Вывод во втором файле:
eti ie
Закрыть потоки ввода-вывод
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        FileWriter fileWriter = new FileWriter(reader.readLine());

        for (int i = 1; fileReader.ready(); i++) {
            int letter = fileReader.read();
            if (i % 2 == 0) {
                fileWriter.write((char)letter);
            }
        }

        reader.close();
        fileReader.close();
        fileWriter.close();
    }
}
