package com.javarush.task.task14.task1420;

/* 
НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int reminder = Integer.MAX_VALUE;
        int helpNumber = 0;
        int nod = 1;

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number1 <= 0 || number2 <= 0) {
            throw new Exception("Need two positive integer numbers");
        }

        /*int max = Math.max(number1, number2);
        for (int i = max; i>0; i--){
            if (number1 % i == 0  && number2 % i == 0) {
                System.out.println(i);
                break;
            }
        }*/

        /* Euklid Algorithmus */
        while(reminder != 0) {

            helpNumber = number2;
            reminder = number1 % number2;
            if (reminder == 0) {
                nod = number2;
                break;
            }
            number1 = number2;
            number2 = reminder;
        }

        System.out.println(nod);

    }
}
