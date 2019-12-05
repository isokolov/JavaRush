package com.javarush.task.task33.task3303;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/* 
Десериализация JSON объекта
*/
public class Solution {
    public static <T> T convertFromJsonToNormal(String fileName, Class<T> clazz) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        //StringReader reader = new StringReader(fileName);
        T t = mapper.readValue(new File(fileName), clazz);

        return t;
    }

    public static void main(String[] args) {

    }
}
