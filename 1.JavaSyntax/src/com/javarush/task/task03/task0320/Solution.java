package com.javarush.task.task03.task0320;


/* 
Скромность украшает программиста
Ввести с клавиатуры имя и вывести надпись:
name зарабатывает $5,000. Ха-ха-ха!
Пример:
Тимур зарабатывает $5,000. Ха-ха-ха!
Требования:
1. Программа должна выводить текст.
2. Программа должна считывать данные с клавиатуры.
3. Выведенный текст должен содержать введенное имя.
4. Выведенный тест должен полностью соответствовать заданию.
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");
    }
}
