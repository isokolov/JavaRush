package com.javarush.task.task22.task2210;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getTokens("level22.lesson13.task01", ".")));
    }
    public static String [] getTokens(String query, String delimiter) {

        StringTokenizer st = new StringTokenizer(query, delimiter);
        //StringBuilder builder = new StringBuilder();
        String[] result = new String[st.countTokens()];
        //while(st.hasMoreTokens()) {
        for (int i = 0; st.hasMoreElements(); i++) {
            result[i] = st.nextToken();
            //String val = st.nextToken();
            //System.out.println(key + " : " + val);
            //builder.append(key + " ");
        }
        //return builder.toString().split(" ");
        return result;
    }
}
