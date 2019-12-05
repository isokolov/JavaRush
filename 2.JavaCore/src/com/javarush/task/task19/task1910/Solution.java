package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()));

        while(fileReader.ready()) {
            String str = fileReader.readLine();
            str = str.replaceAll("\\p{Punct}", "");
            //str = str.replaceAll("[^A-Za-z0-9]+", "");
            fileWriter.write(str);
        }

        reader.close();
        fileReader.close();
        fileWriter.close();
    }
}
