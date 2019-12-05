package com.javarush.task.task18.task1809;

/* 
Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine());

        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        for (int i = buffer.length - 1; i > -1 ; i--) {
            int data = buffer[i];
            fileOutputStream.write(data);
        }

        reader.close();
        fileInputStream.close();
        fileOutputStream.close();
    }
}
