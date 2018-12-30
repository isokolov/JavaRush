package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу:
"фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);

        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Chan", df.parse("MAY 11 1978"));
        map.put("Lee", df.parse("AUGUST 1 1980"));
        map.put("Putin", df.parse("NOVEMBER 12 1977"));
        map.put("Leen", df.parse("APRIL 1 1980"));
        map.put("Stallone2", df.parse("JULY 1 1980"));
        map.put("Chan2", df.parse("MAY 11 1978"));
        map.put("Lee2", df.parse("DECEMBER 1 1980"));
        map.put("Putin2", df.parse("FEBRUARY 12 1977"));
        map.put("Leen2", df.parse("APRIL 1 1980"));
        //напишите тут ваш код

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            Date date = pair.getValue();
            if (date.getMonth() == 5 || date.getMonth() == 6 || date.getMonth() == 7)
                iterator.remove();
        }

    }

    public static void main(String[] args) throws Exception {
        /*HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);
        System.out.println(map);*/
    }
}
