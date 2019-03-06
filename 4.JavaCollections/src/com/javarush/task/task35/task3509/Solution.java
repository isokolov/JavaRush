package com.javarush.task.task35.task3509;

import java.util.*;


/* 
Collections & Generics
*/
public class Solution {

    public static void main(String[] args) {
    }

    public static /*ArrayList*/<T> ArrayList<T> newArrayList(/*Object*/T... elements) {
        //напишите тут ваш код
        ArrayList<T> arrayList = new ArrayList<T>();
        for (T t: elements) {
            arrayList.add(t);
        }
        return arrayList;
    }

    public static <T> HashSet<T> newHashSet(/*Object*/T... elements) {
        //напишите тут ваш код
        HashSet<T> hashSet = new HashSet<>();
        /* HashSet<T> result = new HashSet<>(Arrays.asList(elements)); */
        for (T t: elements) {
            hashSet.add(t);
        }
        return hashSet;
    }

    public static <K, V> HashMap<K, V> newHashMap(List<? extends K> keys, List<? extends V> values) {
        //напишите тут ваш код
        HashMap<K, V> hashMap = new HashMap<>();
        if (keys.size() != values.size()) {
            throw new IllegalArgumentException("IllegalArgumentException");
        }
        for (int i = 0; i < keys.size(); i++) {
            hashMap.put(keys.get(i), values.get(i));
        }
        return hashMap;
    }
}
