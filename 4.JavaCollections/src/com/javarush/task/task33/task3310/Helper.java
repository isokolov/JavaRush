package com.javarush.task.task33.task3310;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

public class Helper {

    //private static final int OUTPUT_STRING_LENGTH = 26;

    public static String generateRandomString() {


        return new BigInteger(130, new SecureRandom()).toString(36);

        /*final int OUTPUT_STRING_LENGTH = 26;
        //string containing allowed characters, modify according to your needs
        String strAllowedCharacters =
                "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        //initialize Random
        Random random = new Random();
        StringBuilder sbRandomString = new StringBuilder(OUTPUT_STRING_LENGTH);
        for(int i = 0 ; i < OUTPUT_STRING_LENGTH; i++){
            //get random integer between 0 and string length
            int randomInt = random.nextInt(strAllowedCharacters.length());
            //get char from randomInt index from string and append in StringBuilder
            sbRandomString.append( strAllowedCharacters.charAt(randomInt) );
        }*/

        //return sbRandomString.toString();

    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

}
