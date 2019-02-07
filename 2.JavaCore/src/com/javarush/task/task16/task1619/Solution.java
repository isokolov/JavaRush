package com.javarush.task.task16.task1619;

/* 
А без interrupt слабо?
Метод run должен выводить надпись "he-he" каждые пол секунды,
пока не будет вызван метод ourInterruptMethod.
Необходимо изменить условие цикла while в методе run.
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() throws InterruptedException {
        TestThread.isCanceled = true;
        //Thread.sleep(1);
    }

    public static class TestThread implements Runnable {
        public static boolean isCanceled = false;
        public void run() {
            while (!isCanceled) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
