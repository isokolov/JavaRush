package com.javarush.task.task30.task3008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {

    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() {
        String message = null;
        while(true) {
            try {
                 message = bufferedReader.readLine();
                 return message;
            } catch (IOException exception) {
                System.out.println("Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");
            }
        }

    }

    public static int readInt() {
        while(true) {
            try {
                String numberStr = readString();
                int number = Integer.parseInt(numberStr);

                return number;

            } catch (NumberFormatException exc) {
                System.out.println("Произошла ошибка при попытке ввода числа. Попробуйте еще раз.");
            }
        }
    }
}
