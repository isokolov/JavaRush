package com.javarush.task.task08.task0827;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* 
Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(isDateOdd("MAY 1 2013"));
        /*System.out.println(isDateOdd("JANUARY 1 2000"));
        System.out.println(isDateOdd("JANUARY 2 2013"));*/
    }

    public static boolean isDateOdd(String date) {
        Date myDate = new Date(date);
        GregorianCalendar calendar = new GregorianCalendar(myDate.getYear(), myDate.getMonth(), myDate.getDate());
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        if (calendar.get(Calendar.DAY_OF_YEAR) % 2 != 0)
            return true;

        return false;
    }
}
