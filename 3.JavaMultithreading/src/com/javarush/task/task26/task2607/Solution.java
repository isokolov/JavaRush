package com.javarush.task.task26.task2607;

/* 
Вежливость - это искусственно созданное хорошее настроение
*/
public class Solution {

    public static class IntegerHolder {
        private int value;

        public synchronized int get() {
            return value;
        }

        public synchronized void set(int value) {
            //synchronized (IntegerHolder.class) {
                this.value = value;
            //}
        }
    }
    public static void main(String[] args) {
    }
}
