package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.ad.AdvertisementManager;
import com.javarush.task.task27.task2712.ad.NoVideoAvailableException;
import com.javarush.task.task27.task2712.kitchen.Order;

import java.io.IOException;
import java.util.Observable;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;
import static java.util.logging.Level.SEVERE;

public class Tablet extends Observable {
    protected final int number;
    private static Logger logger = Logger.getLogger(Tablet.class.getName());

    public Tablet(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Order createOrder() {
        Order order = null;

        try {
            order = new Order(this);
            if(!order.isEmpty()){
                setChanged();
                notifyObservers(order);
                new AdvertisementManager(order.getTotalCookingTime() * 60).processVideos();
            }
        } catch (IOException e) {
            logger.log(SEVERE, "Console is unavailable.");
        } catch (NoVideoAvailableException e) {
            logger.log(INFO, String.format("No video is available for the order %s", order));
        }

        return order;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "number=" + number +
                '}';
    }
}
