package com.javarush.task.task32.task3210;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

/* 
Используем RandomAccessFile
В метод main приходят три параметра:
1) fileName - путь к файлу;
2) number - число, позиция в файле;
3) text - текст.

Считать текст с файла начиная с позиции number, длинной такой же как и длинна переданного текста в третьем параметре.
Если считанный текст такой же как и text, то записать в конец файла строку 'true', иначе записать 'false'.
Используй RandomAccessFile и его методы seek(long pos), read(byte b[], int off, int len), write(byte b[]).
Используй один из конструкторов класса String для конвертации считанной строчки в текст.
*/

public class Solution {
    public static void main(String... args) {
        String fileName = args[0];
        int number = Integer.parseInt(args[1]);
        String text = args[2];
        try {
            RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
            raf.seek(number);

            byte[] buffer = new byte[text.length()];
            raf.read(buffer, 0, text.length());
            String newText = new String(buffer);
            //String newText = new String(buffer, StandardCharsets.UTF_8);
            raf.seek(raf.length());
            if (newText.equals(text)) {
                raf.write("true".getBytes());
            } else {
                raf.write("false".getBytes());
            }

            raf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/* 19%, 4, 2.92, 2210 */