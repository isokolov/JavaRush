package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    /*public void fillInPropertiesMap() {
        //implement this method - реализуйте этот метод
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
    }

    public static void main(String[] args) {

    }*/

    public void fillInPropertiesMap() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream = new FileInputStream(reader.readLine());
        reader.close();
        load(inputStream);
    }

    public void save(OutputStream outputStream) throws Exception {
        Properties p = new Properties();
        p.putAll(properties);
        p.save(outputStream,null);
    }

    public void load(InputStream inputStream) throws Exception {

        Properties p = new Properties();
        p.load(inputStream);
        p.forEach((key, value) -> properties.put((String)key,(String)value));
    }

    public static void main(String[] args) throws Exception {
//        Solution s = new Solution();
//        s.fillInPropertiesMap();
//        OutputStream outputStream = new FileOutputStream("/users/mec/test/6.txt");
//        s.save(outputStream);
    }
}
