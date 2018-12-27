package com.javarush.task.task07.task0716;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* 
Р или Л
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву "р"
2.2. удваивать все слова содержащие букву "л".
2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); // 0
        list.add("лоза"); // 1
        list.add("лира"); // 2
        /*list.add("мера");
        list.add("вода");
        list.add("упор");*/
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код

        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()) {
            String string = iterator.next();
            if (string.contains("р") && !string.contains("л"))
                iterator.remove();
            if (!string.contains("р") && string.contains("л"))
                iterator.add(string);

        }

        return list;
        }

}
