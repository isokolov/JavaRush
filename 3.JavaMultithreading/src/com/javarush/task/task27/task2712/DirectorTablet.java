package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.ad.Advertisement;
import com.javarush.task.task27.task2712.ad.StatisticAdvertisementManager;
import com.javarush.task.task27.task2712.statistic.StatisticManager;

import java.text.SimpleDateFormat;
import java.util.*;

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

    // список активных роликов и оставшееся количество показов по каждому
    public void printActiveVideoSet() {
        StatisticAdvertisementManager statisticAdvertisementManager = StatisticAdvertisementManager.getInstance();

        List<Advertisement> activeVideo = statisticAdvertisementManager.getActiveAdvertisements();
        activeVideo.sort(new Comparator<Advertisement>() {
            @Override
            public int compare(Advertisement o1, Advertisement o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });

        for (Advertisement advertisement : activeVideo){
            ConsoleHelper.writeMessage(String.format("%s - %d", advertisement.getName(), advertisement.getHits()));
        }
    }

    // список неактивных роликов (с оставшемся количеством показов равным нулю)
    public void printArchivedVideoSet() {
        StatisticAdvertisementManager statisticAdvertisementManager = StatisticAdvertisementManager.getInstance();

        List<Advertisement> noActiveVideo = statisticAdvertisementManager.getNoActiveAdvertisements();
        noActiveVideo.sort(new Comparator<Advertisement>() {
            @Override
            public int compare(Advertisement o1, Advertisement o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });

        for (Advertisement advertisement : noActiveVideo){
            ConsoleHelper.writeMessage(advertisement.getName());
        }
    }
}

