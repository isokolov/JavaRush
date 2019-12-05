package com.javarush.task.task22.task2208;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        Map<String, String> test = new LinkedHashMap<>();
        //name=Ivanov, country=Ukraine, city=Kiev, age=null}
        test.put("name", "Ivanov");
        test.put("country", "Ukraine");
        test.put("city", "Kiev");
        test.put("age", null);
        System.out.println(getQuery(test));
    }
    public static String getQuery(Map<String, String> params) {

        StringBuilder builder = new StringBuilder("");
        for(Map.Entry<String, String> entry: params.entrySet()) {
            String param = entry.getKey();
            String value = entry.getValue();
            if (value == null) {
                continue;
            }
            if (builder.toString().equals("") && !value.isEmpty()) {
                builder.append(param).append(" = ").append("'"+value+"'");
                continue;
            }
            if (!builder.equals("") && !value.isEmpty()) {
                builder.append(" and ").append(param).append(" = ").append("'"+value+"'");
            }
        }
        return builder.toString();
    }
}
