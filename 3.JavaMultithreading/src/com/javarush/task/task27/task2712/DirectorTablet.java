package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.statistic.StatisticManager;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

public class DirectorTablet {
    public void printAdvertisementProfit() {
        long total = 0;
        for (Map.Entry<Date, Long> entry: StatisticManager.getInstance().advertisementProfit().entrySet()) {
            ConsoleHelper.writeMessage(String.format("%s - %.2f", new SimpleDateFormat("dd-MMM-yyyy", Locale.US).format(entry.getKey()), entry.getValue() / 100.0));
            total += entry.getValue();
        }
        ConsoleHelper.writeMessage(String.format("Total - %.2f", total / 100.0));
    }

    public void printCookWorkloading() {
        Map<Date, Map<String, Integer>> map = StatisticManager.getInstance().cookWorkloading();
        for (Map.Entry entry : map.entrySet()) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH);
            String date = simpleDateFormat.format(entry.getKey());
            ConsoleHelper.writeMessage(date);
            Map<String, Integer> map1 = (Map) entry.getValue();

            for (Map.Entry entry1 : map1.entrySet()) {
                ConsoleHelper.writeMessage(entry1.getKey() + " - " + entry1.getValue() + " min");
            }
        }
    }

    public void printActiveVideoSet() {}

    public void printArchivedVideoSet() {}
}

