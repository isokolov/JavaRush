package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
В статическом блоке инициализировать labels 5 различными парами ключ-значение.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.1, "Hello");
        labels.put(1.2, "Hello2");
        labels.put(1.3, "Hello3");
        labels.put(1.4, "Hello4");
        labels.put(1.5, "Hello5");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
