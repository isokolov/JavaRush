package com.javarush.task.task33.task3310.strategy;

import com.javarush.task.task33.task3310.Shortener;

import java.util.HashMap;
import java.util.Map;

public class HashMapStorageStrategy implements StorageStrategy {

    private HashMap<Long, String> data = new HashMap<>();

    public HashMap<Long, String> getData() {
        return data;
    }

    @Override
    public boolean containsKey(Long key) {
        return data.containsKey(key);
    }

    @Override
    public boolean containsValue(String value) {
        return data.containsValue(value);
    }

    @Override
    public void put(Long key, String value) {
        data.put(key, value);
    }

    @Override
    public Long getKey(String value) {
        for (Map.Entry<Long, String> pair: data.entrySet()) {
            Long collectionKey = pair.getKey();
            String collectionValue = pair.getValue();
            if (value.equals(collectionValue))
                return collectionKey;
        }
        return null;
    }

    @Override
    public String getValue(Long key) {
        return data.get(key);

    }
}
