package com.javarush.task.task40.task4012;

/*
Полезные методы DateTime API
*/

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Solution {
    public static void main(String[] args) {

    }

    /*public static boolean isLeap(LocalDate date) {

    }

    public static boolean isBefore(LocalDateTime dateTime) {

    }

    public static LocalTime addTime(LocalTime time, int n, ChronoUnit chronoUnit) {
    }

    public static Period getPeriodBetween(LocalDate firstDate, LocalDate secondDate) {

    }*/
    public static boolean isLeap(LocalDate date) {
        return date.isLeapYear();
    }

    public static boolean isBefore(LocalDateTime dateTime) {
        return dateTime.isBefore(LocalDateTime.now());
    }

    public static LocalTime addTime(LocalTime time, int n, ChronoUnit chronoUnit) {
        return time.plus(n, chronoUnit);
    }

    public static Period getPeriodBetween(LocalDate firstDate, LocalDate secondDate) {
        return firstDate.isBefore(secondDate)
                ? Period.between(firstDate, secondDate)
                : Period.between(secondDate, firstDate);
    }
}
