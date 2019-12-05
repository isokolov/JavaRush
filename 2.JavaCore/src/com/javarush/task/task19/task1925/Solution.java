package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
            FileWriter fileWriter = new FileWriter(args[1]);
            StringBuilder builder = new StringBuilder();
            while (fileReader.ready()) {

                String[] myArray = fileReader.readLine().split("\\s+");
                for (int i = 0; i < myArray.length; i++) {
                    if (myArray[i].length() > 6) {
                        //fileWriter.write(myArray[i] + ",");
                        builder.append(myArray[i]).append(",");
                    }
                }

            }
            builder.deleteCharAt(builder.length() - 1);
            fileWriter.write(builder.toString());
            fileReader.close();
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
