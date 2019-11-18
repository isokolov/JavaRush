package com.javarush.task.task39.task3913;

import java.nio.file.Paths;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        LogParser logParser = new LogParser(Paths.get("c:/logs/"));
        System.out.println(logParser.getNumberOfUniqueIPs(null, new Date()));
        long start = System.currentTimeMillis();
        System.out.println(logParser.execute("get date"));
        System.out.println(System.currentTimeMillis() - start);
    }
}