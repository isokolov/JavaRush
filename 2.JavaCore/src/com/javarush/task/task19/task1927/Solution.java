package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
В методе main подмени объект System.out написанной тобой реадер-оберткой.
Твоя реадер-обертка должна выводить на консоль контекстную рекламу после каждого второго println-а.
Вызови готовый метод printSomething(), воспользуйся testString.
Верни переменной System.out первоначальный поток.
Рекламный текст: "JavaRush - курсы Java онлайн"
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        String ads = "JavaRush - курсы Java онлайн";

        PrintStream consoleStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream((byteArrayOutputStream));
        System.setOut(stream);
        testString.printSomething();
        String result = byteArrayOutputStream.toString();

        System.setOut(consoleStream);
        String[] resultArray = result.split("\n");
        for (int i = 0; i < resultArray.length; i++) {
            //resultBuilder.append(resultArray[i] + "\n");
            System.out.println(resultArray[i]);
            if (i % 2 != 0 && i != 0) {
                //resultBuilder.append(ads + "\n");
                System.out.println(ads);
            }
        }
        //System.out.println(result);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
