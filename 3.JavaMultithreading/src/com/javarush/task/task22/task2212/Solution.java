package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/
public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if (telNumber.matches("[\\+][\\d]{11}")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkTelNumber("+38123456789"));
    }
}
