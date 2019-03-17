package com.javarush.task.task33.task3310;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

public class Helper {

    //private static final int OUTPUT_STRING_LENGTH = 26;

    public static String generateRandomString() {

        return new BigInteger(130, new SecureRandom()).toString(36);
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

}
