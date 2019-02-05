package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/
public class Solution {

    public static String getPartOfString(String string) throws TooShortStringException{
        if (string == null || string.isEmpty())
            throw new TooShortStringException();

        String[] strs = string.split("\t");
        if (strs.length<3)
            throw new TooShortStringException();

        return strs[1];
    }

    /*public static String getPartOfString(String string) throws TooShortStringException {
        int index1 = string.indexOf('\t');
        int index2 = string.indexOf('\t',index1 + 1);
        if (index1 == -1 || index2 == -1 || string == null || string.isEmpty()) {
            throw new TooShortStringException();
        }
        String[] strs = string.split("\t");
        if (strs.length<3) {
            throw new TooShortStringException();
        }
        return string.substring(index1 + 1, index2);
    }*/

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
        //System.out.println(getPartOfString("\tJavaRush - лучший сервис"));
    }
}
/* 10%, 5, 2.62, 7103 */