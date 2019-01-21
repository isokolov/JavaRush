package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

/* started */
public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> vowelsSentence = new ArrayList<>();
        ArrayList<Character> noVowelsSentence = new ArrayList<>();
        String myText = reader.readLine();

        for (char c: myText.toCharArray()) {
            if (isVowel(c)) {
                vowelsSentence.add(c);
            } else if (!Character.isSpaceChar(c)){
                noVowelsSentence.add(c);
            }
        }

        for(Character c: vowelsSentence) {
            System.out.print(c + " ");
        }
        System.out.println("");

        for(Character c: noVowelsSentence) {
            System.out.print(c + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
