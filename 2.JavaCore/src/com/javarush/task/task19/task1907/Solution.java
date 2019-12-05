package com.javarush.task.task19.task1907;

/* 
Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        int count = 0;
        //Pattern pattern = Pattern.compile("[^a-zA-Z0-9]world[^a-zA-Z0-9\\s]");
        Pattern pattern = Pattern.compile("\\bworld\\b");

        Matcher matcher = null;

        while (fileReader.ready()) {
            String line = fileReader.readLine();
            matcher = pattern.matcher(line);
            while(matcher.find()) {
                count++;
            }
        }


        System.out.println(count);

        reader.close();
        fileReader.close();
    }
}
