package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {


        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()));
            while (fileReader.ready()) {
                String line = fileReader.readLine();
                line = line.replaceAll("\\d*\\p{L}\\d*\\s*", "");
                //line = line.replaceAll("\\d*\\D+", "");
                fileWriter.write(line);
            }
            reader.close();
            fileReader.close();
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
