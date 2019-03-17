package com.javarush.task.task33.task3310;

import com.javarush.task.task33.task3310.strategy.HashMapStorageStrategy;
import com.javarush.task.task33.task3310.strategy.StorageStrategy;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        HashMapStorageStrategy hashMapStrategy = new HashMapStorageStrategy();
        Solution.testStrategy(hashMapStrategy, 10000);
    }

    public static Set<Long> getIds(Shortener shortener, Set<String> strings) {
        Set<Long> keys = new HashSet<>();
        for(String str: strings) {
            keys.add(shortener.getId(str));
        }

        return keys;
    }

    public static Set<String> getStrings(Shortener shortener, Set<Long> keys) {
        Set<String> values = new HashSet<>();
        for (Long lng: keys) {
            values.add(shortener.getString(lng));
        }

        return values;
    }

    public static void testStrategy(StorageStrategy strategy, long elementsNumber) {
        Helper.printMessage(strategy.getClass().getSimpleName());
        String randomString;
        Shortener shortener = new Shortener(strategy);
        Set<String> values = new HashSet<>();
        Set<Long> keys = new HashSet<>();
        for (int i = 0; i < elementsNumber; i++) {
            values.add( Helper.generateRandomString());
            //randomString = Helper.generateRandomString();
            //strategy.put(shortener.getId(randomString), randomString);
            //values.add(randomString);
            //keys.add(shortener.getId(randomString));
            keys.add((long)i);
        }

        Date beforeGetIds = new Date();
        Set<Long> strategyIds = getIds(shortener, values);
        Date afterGetIds = new Date();
        Helper.printMessage("Time for processing getIds() " + (afterGetIds.getTime() - beforeGetIds.getTime()) + " miliseconds");
        Date beforeGetStrings = new Date();
        Set<String> strategyStrings = getStrings(shortener, keys);
        Date afterGetStrings = new Date();
        Helper.printMessage("Time for processing getStrings() " + (afterGetStrings.getTime() - beforeGetStrings.getTime()) + " miliseconds");
        if (strategyStrings.size() == values.size()) {
            Helper.printMessage("Тест пройден.");
        } else Helper.printMessage("Тест не пройден.");
    }
}
