package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int sum = 0;
        String numberString = String.valueOf(number);
        for (int i = 0; i < numberString.length() ; i++) {
            sum += Integer.parseInt(String.valueOf(numberString.charAt(i)));
            //sum += Character.getNumericValue(numberString.charAt(i));
        }

        return sum;
    }
}

