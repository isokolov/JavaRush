package com.javarush.task.task36.task3601;

/*
MVC - простая версия
*/
public class Solution {
    public static void main(String[] args) {
        new View().fireShowDataEvent();
        //new Solution().fireShowDataEvent();
    }

    /*public List<String> getData() {
        List<String> data = new ArrayList<String>() {{
            add("First string");
            add("Second string");
            add("Third string");
        }};
        return data;
    }*/

    /*public void fireShowDataEvent() {
        System.out.println(onShowDataList());
    }

    public List<String> getStringDataList() {
        return getData();
    }

    public List<String> onShowDataList() {
        return getStringDataList();
    }*/
}
