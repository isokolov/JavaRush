package com.javarush.task.task26.task2611;

import java.util.concurrent.ConcurrentHashMap;

public class Producer implements Runnable {

    private ConcurrentHashMap<String, String> map;
    public static int count = 1;

    public Producer(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }

    @Override
    public void run() {
        //Thread thread = Thread.currentThread();

        try {
            while(true) {
                map.put(String.valueOf(count), "Some text for " + count);
                Thread.sleep(500);
                count++;
            }
        } catch (InterruptedException e) {
            //e.printStackTrace();
            System.out.println(Thread.currentThread().getName() + " thread was terminated");
        }
    }
}
