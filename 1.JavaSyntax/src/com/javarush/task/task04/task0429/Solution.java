package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество
отрицательных чисел в исходном наборе, в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б",
где а, б - искомые значения.
Пример:
а) при вводе чисел
2
5
6
получим вывод
количество отрицательных чисел: 0
количество положительных чисел: 3
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int positiv = 0;
        int negativ = 0;
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        positiv = (number1 > 0) ? ++positiv : positiv;
        positiv = (number2 > 0) ? ++positiv : positiv;
        positiv = (number3 > 0) ? ++positiv : positiv;
        negativ = (number1 < 0) ? ++negativ : negativ;
        negativ = (number2 < 0) ? ++negativ : negativ;
        negativ = (number3 < 0) ? ++negativ : negativ;
        /*if (number1 > 0 && number1 != 0) positiv++;
        else negativ++;
        if (number2 > 0 && number2 != 0) positiv++;
        else negativ++;
        if (number3 > 0 && number3 != 0) positiv++;
        else negativ++;*/
        /* int otric=0;
        int polog=0;
        for (int i=0;i<3;i++) {
            int a = Integer.parseInt(br.readLine());
            if (a<0)
                otric += 1;
            if (a>0)
                polog += 1;
        } */
        System.out.println("количество отрицательных чисел: " + negativ);
        System.out.println("количество положительных чисел: " + positiv);

    }
}