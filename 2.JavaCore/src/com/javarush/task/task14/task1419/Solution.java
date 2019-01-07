package com.javarush.task.task14.task1419;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;
        } catch (ArithmeticException e) {
            exceptions.add(e);
        }
        //напишите тут ваш код
        try {
            int[] array = new int[5];
            array[6] = 2;
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            int[] array = new int[-2];
        }  catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }
        try {
            Integer a = Integer.parseInt("vvv");
        }   catch (NumberFormatException e) {
            exceptions.add(e);
        }
        try {
            String s = null;
            s.toLowerCase();
        }  catch (NullPointerException e) {
            exceptions.add(e);
        }
        try {
            List<Integer> list = new ArrayList<>(2);
            list.add(4);
            list.get(44);
        }  catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            throw new RuntimeException();
        }  catch (RuntimeException e) {
            exceptions.add(e);

        }
        try {
            String a = "This is like chipping "; // length is 22
            char c = a.charAt(24); // accessing 25th element
        }  catch (StringIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            File file = new File("E://file.txt");
            FileReader fr = new FileReader(file);
        }  catch (FileNotFoundException e) {
            exceptions.add(e);
        }
        try {
            new URL("malformedurl");
        } catch (MalformedURLException e) {
            exceptions.add(e);
        }

    }
}
