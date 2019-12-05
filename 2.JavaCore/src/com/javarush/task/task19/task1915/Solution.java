package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine());
            PrintStream consoleStream = System.out;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PrintStream stream = new PrintStream(byteArrayOutputStream);
            System.setOut(stream);

            testString.printSomething();
            String result = byteArrayOutputStream.toString();
            fileOutputStream.write(result.getBytes());
            System.setOut(consoleStream);
            System.out.println(result);
            reader.close();
            fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
