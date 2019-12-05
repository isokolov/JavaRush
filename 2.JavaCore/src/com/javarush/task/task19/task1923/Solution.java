package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {

        try {
            StringBuilder builder = new StringBuilder();
            //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
            FileWriter fileWriter = new FileWriter(args[1]);
            //Pattern pattern = Pattern.compile("\\b[a-zA-Z0-9]*\\d+[a-zA-Z0-9]*\\b");
            //Pattern pattern = Pattern.compile("\\b[a-zA-Z0-9]*\\d+[a-zA-Z0-9]*\\b");
            //Pattern pattern = Pattern.compile("\\b\\w*\\d+\\w*\\b");
            /*while(fileReader.ready()) {
                String line = fileReader.readLine();
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    fileWriter.write(matcher.group() + " ");
                }

            }*/
            while (fileReader.ready()) {
                String line = fileReader.readLine();
                String[] array = line.split(" ");
                for (String str: array) {
                    if(str.matches(".*\\d+.*$")) {
                        fileWriter.write(str + " ");
                    }
                }
            }
            System.out.println(builder.toString());
            fileReader.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
