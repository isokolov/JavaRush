package com.javarush.task.task08.task0801;

/* 
HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк:
арбуз, банан, вишня, груша, дыня, ежевика, женьшень
земляника, ирис, картофель
*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashSet<String> set = new HashSet<>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");

        for (String str: set)
            System.out.println(str);

    }
}
