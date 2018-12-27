package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean acsend = true;
        int index = 0;
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        /*for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).length() >= list.get(i+1).length()) {
                acsend = false;
                index = i;
            }
            if(!acsend) {
                System.out.println(index);
                break;
            }
        }*/
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).length() > list.get(i+1).length()) {
                System.out.println(i+1);
                break;
            }
        }
    }
}
