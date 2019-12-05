package com.javarush.task.task32.task3213;

import java.io.IOException;
import java.io.StringReader;

/* 
Шифр Цезаря
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringReader reader = new StringReader("Khoor#Dpljr#&C,₷B'3");
        System.out.println(decode(reader, -3));  //Hello Amigo #@)₴?$0
    }

    public static String decode(StringReader reader, int key) throws IOException {

        /*BufferedReader bufferedReader = new BufferedReader(reader);
        char[] encodedWord = bufferedReader.readLine().toCharArray();
        char[] decodedWord = new char[encodedWord.length];
        for (int i = 0; i < encodedWord.length; i++) {
            decodedWord[i] = (char)(encodedWord[i] - 3);
        }*/
        if (reader == null)
            return "";
        StringBuilder builder = new StringBuilder();

        for(int c = reader.read();  c != -1; c = reader.read()) {
            builder.append((char)(c + key));
        }

        return builder.toString();
    }
}
