package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
Времена года на Терре
Напишите метод checkSeason. По номеру месяца, метод должен определить
время года (зима, весна, лето, осень) и вывести на экран.
Пример для номера месяца 2:
зима
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //напишите тут ваш код
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("Wrong month.");

            /* shorter coding
            if (month>=3 && month<=5)
            System.out.println("весна");
            if (month>=6 && month<=8)
                System.out.println("лето");
            if (month>=9 && month<=11)
                System.out.println("осень");
            if (month==12 || (month>=1 && month<=2))
                System.out.println("зима"); */
        }
    }
}
