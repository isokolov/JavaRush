package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = null;
        String fileName = "";
        FileInputStream fileInputStream = null;
        while(true) {
            try {
                 reader = new BufferedReader(new InputStreamReader(System.in));
                 fileName = reader.readLine();
                 fileInputStream = new FileInputStream(fileName);
                 fileInputStream.close();
                 reader.close();
            } catch (FileNotFoundException exc) {
                System.out.println(fileName);
                reader.close();
                //fileInputStream.close();
                return;
            }

        }

    }
}
