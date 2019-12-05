package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream consoleStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(byteArrayOutputStream);
        System.setOut(stream);

        testString.printSomething();
        String result[] = byteArrayOutputStream.toString().split(" ");
        String finalResult = "";

        if (result[1].equals("+")) {
            finalResult = result[0] + " + " + result[2] + " = " + (Integer.parseInt(result[0]) + Integer.parseInt(result[2]));
        }
        if (result[1].equals("-")) {
            finalResult = result[0] + " - " + result[2] + " = " + (Integer.parseInt(result[0]) - Integer.parseInt(result[2]));
        }
        if (result[1].equals("*")) {
            finalResult = result[0] + " * " + result[2] + " = " + (Integer.parseInt(result[0]) * Integer.parseInt(result[2]));
        }
        System.setOut(consoleStream);
        System.out.println(finalResult);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}
