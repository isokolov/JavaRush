package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/
public class Solution {
    /*public static boolean checkTelNumber(String telNumber) {
        if (telNumber.matches("[\\d+]{11}")) {
            return true;
        }
        if (telNumber.matches("[\\+][\\d]{11}")) {
            return true;
        }
        if (telNumber.matches("[\\d+][(\\d*(\\d{3})\\d*]{11}")) {
            return true;
        }
        if (telNumber.matches("[\\d+]+[((\\d{3})]?[\\d]+[-][\\d]+[-][\\d+]{14}")) {
            return true;
        }
        if (telNumber.matches("[[\\d]+[-]?[\\d]+]{11}")) {
            return true;
        }
        if (telNumber.matches("[[\\d]+[-]?[\\d]+[-]?[\\d]+]{11}")) {
            return true;
        }
        return false;
    }*/


    public static boolean checkTelNumber(String telNumber) {
        boolean result = telNumber != null && telNumber.length() >= 10;
        if (!result) {
            return false;
        }
        int digitCount = telNumber.charAt(0) == '+' ? 12 : 10;
        int hyphenCount = 2;
        int bracketCount = 2;

        for (int i = 0; i < telNumber.length() && result; i++) {
            char c = telNumber.charAt(i);
            if (c > 47 && c < 58 && digitCount > 0) {
                digitCount--;
            } else if (c == '(' && bracketCount == 2 && hyphenCount == 2) {
                bracketCount--;
                result = i < telNumber.length() - 6 && telNumber.charAt(i + 4) == ')';
            } else if (c == ')' && bracketCount == 1) {
                bracketCount--;
            } else if (c == '-' && hyphenCount > 0 && i + 1 != telNumber.length()) {
                hyphenCount--;
                result = telNumber.charAt(i + 1) != '-';
            } else {
                result = i == 0 && c == '+';
            }
        }
        return result && digitCount == 0;
    }


    public static void main(String[] args) {

        System.out.println(checkTelNumber("+38123456789"));
        System.out.println(checkTelNumber("3(81)2345678"));
        System.out.println(checkTelNumber("38050123-45-67"));
        System.out.println(checkTelNumber("050123-4567"));
        System.out.println(checkTelNumber("+38)050(1234567"));
        System.out.println(checkTelNumber("+38(050)1-23-45-6-7"));
        System.out.println(checkTelNumber("050ххх4567"));
        System.out.println(checkTelNumber("050123456"));
        System.out.println(checkTelNumber("(0)501234567"));
    }
}
