package com.javarush.task.task16.task1618;

/* 
Снова interrupt
Создай нить TestThread.
В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        TestThread testThread = new TestThread();
        testThread.start();
        Thread.sleep(3000);
        testThread.interrupt();

    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {
        @Override
        public void run() {
            try {
                while(!Thread.currentThread().isInterrupted()) {
                    Thread.sleep(1000);
                    System.out.println("Hello");
                }
            } catch (InterruptedException exc) {
                System.out.println("Thread interrupted");
            }
        }
    }
}
