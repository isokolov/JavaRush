package com.javarush.task.task27.task2712.kitchen;


import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.statistic.StatisticManager;
import com.javarush.task.task27.task2712.statistic.event.CookedOrderEventDataRow;

import java.util.Observable;
import java.util.Observer;
import java.util.logging.Logger;

public class Cook extends Observable implements Observer
{
    private String name;
    private static Logger logger = Logger.getLogger(Cook.class.getName());

    public Cook(String name)
    {
        this.name = name;
    }

    public void update(Observable o, Object object) {
        Order order = (Order) object;
        ConsoleHelper.writeMessage(String.format("Start cooking - %s, cooking time %dmin", order, order.getTotalCookingTime()));
        StatisticManager.getInstance().register(new CookedOrderEventDataRow(order.getTablet().toString(), name, order.getTotalCookingTime(), order.getDishes()));
        setChanged();
        notifyObservers(order);
    }

    @Override
    public String toString()
    {
        return name;
    }
}
