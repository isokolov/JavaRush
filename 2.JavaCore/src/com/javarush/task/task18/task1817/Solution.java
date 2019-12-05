package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fileReader = new FileReader(args[0]);
        int spaceNumber = 0;
        int allChars = 0;
        while (fileReader.ready()) {
            int checkChar = fileReader.read();
            if ((char)checkChar == ' ') {
                spaceNumber++;
                allChars++;
            } else {
                allChars++;
            }
        }

        fileReader.close();
        /*double result = (double)spaceNumber/allChars*100;
        DecimalFormat d = new DecimalFormat("##.00");
        System.out.println(d.format(result));*/

        System.out.printf("%.2f", spaceNumber * 100.0 /  allChars);
    }
}
