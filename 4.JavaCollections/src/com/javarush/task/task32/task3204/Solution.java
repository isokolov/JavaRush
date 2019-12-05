package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* 
Генератор паролей
*/
public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";

        //Остальные 5 символов
        String shuffle = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuffer password = new StringBuffer();
        for (int i = 0; i < 4; i++) {
            password.append(shuffle.charAt((int)(Math.random() * 40)));
        }
        password.append(digits.charAt((int)(Math.random() * 10)));
        password.append(lowercase.charAt((int)(Math.random() * 26)));
        for (int i = 0; i < 2; i++) {
            password.append(uppercase.charAt((int)(Math.random() * 26)));
        }
        try {
            byteArrayOutputStream.write(password.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }


        return byteArrayOutputStream;
    }
}
