package com.javarush.task.task18.task1819;

/* 
Объединение файлов
Считать с консоли 2 имени файла.
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов.
Закрыть потоки.
Требования:
1. Программа должна два раза считать имена файлов с консоли.
2. Не используй в программе статические переменные.
3. Для первого файла создай поток для чтения и считай его содержимое.
4. Затем, для первого файла создай поток для записи(поток для записи должен быть один). Для второго - для чтения.
5. Содержимое первого и второго файла нужно объединить в первом файле.
6. Сначала должно идти содержимое второго файла, затем содержимое первого.
7. Созданные для файлов потоки должны быть закрыты.
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = "";
        String filename2 = "";
        try {
             filename1 = reader.readLine();
             filename2 = reader.readLine();
            FileInputStream fileInputStream = new FileInputStream(filename1);
            byte[] buffer1 = new byte[fileInputStream.available()];
            fileInputStream.read(buffer1);
            FileOutputStream fileOutputStream = new FileOutputStream(filename1);
            FileInputStream fileInputStream2 = new FileInputStream(filename2);
            byte[] buffer2 = new byte[fileInputStream2.available()];
            fileInputStream2.read(buffer2);
            fileOutputStream.write(buffer2);
            fileOutputStream.write(buffer1);

            reader.close();
            fileInputStream.close();
            fileInputStream2.close();
            fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
