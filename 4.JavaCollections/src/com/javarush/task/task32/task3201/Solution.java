package com.javarush.task.task32.task3201;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
Запись в существующий файл
В метод main приходят три параметра:
1) fileName - путь к файлу;
2) number - число, позиция в файле;
3) text - текст.
Записать text в файл fileName начиная с позиции number.
Запись должна производиться поверх старых данных, содержащихся в файле.
Если файл слишком короткий, то записать в конец файла.
Используй RandomAccessFile и его методы seek и write.
*/
public class Solution {
    public static void main(String... args) {
        try {
            String fileName = args[0];
            int number = Integer.parseInt(args[1]);
            String text = args[2];
            RandomAccessFile raf = new RandomAccessFile(fileName, "rw");

            if (raf.length() <  number) {
                raf.seek(raf.length());
                raf.write(text.getBytes());
            } else {
                raf.seek(number);
                //raf.writeBytes(text);
                raf.write(text.getBytes());
            }

            raf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/* 44%, 2, 3.03, 3379 */