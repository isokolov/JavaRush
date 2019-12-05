package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/* 
Находим все файлы
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        File rootDirectory = new File(root);
        BlockingQueue<String> blockingQueue = new LinkedBlockingDeque<>();
        BlockingQueue<String> extraQueue = new LinkedBlockingDeque<>();
        File[] tt = rootDirectory.listFiles();
        for (File file: rootDirectory.listFiles()) {
            if (!file.isDirectory()) {
                blockingQueue.add(file.getAbsolutePath());
            } else {
                extraQueue.add(file.getAbsolutePath());
            }
        }
        while (true) {
            if (!extraQueue.isEmpty()) {
                String root2 = extraQueue.remove();
                File rootFile = new File(root2);
                for (File file : rootFile.listFiles()) {
                    if (!file.isDirectory()) {
                        blockingQueue.add(file.getAbsolutePath());
                    } else {
                        extraQueue.add(file.getAbsolutePath());
                    }
                }
            } else break;
        }

        List<String> list = new ArrayList(blockingQueue);
        return list;

    }

    public static void main(String[] args) {
        /*List<String> test = new ArrayList<>();
        try {
            test = getFileTree("/Users/illyasokolov/Desktop/IntelliJ2018.3/JavaRushTasks/4.JavaCollections/src/com/javarush/task/task31/task3102/package1");
            //test = getFileTree("/4.JavaCollections/src/com/javarush/task/task31/task3102/package1");
            System.out.println(test);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
