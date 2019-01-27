package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        s = s.replaceAll("\\s+", " ");
        //System.out.println(s);

        //напишите тут ваш код
        String[] str = s.split(" ");
        for (int i = 0; i < str.length ; i++) {
            str[i] = Character.toUpperCase(str[i].charAt(0)) + str[i].substring(1);
        }
        String newWord = "";
        for (int i = 0; i < str.length ; i++) {
            newWord = newWord + str[i] + " " ;
        }

        System.out.println(newWord);
    }
}
