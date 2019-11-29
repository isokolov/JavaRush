package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.Tablet;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private final Tablet tablet;
    protected List<Dish> dishes = new ArrayList<>();

    public Order(Tablet tablet) {
        this.tablet = tablet;
    }
}
