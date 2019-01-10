package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    private List<Horse> horses;
    public static Hippodrome game;

    public Hippodrome(List<Horse> list) {
        horses = list;
    }

    public List<Horse> getHorses() {
        return horses;
    }


    public static void main(String[] args) {

        List<Horse> newHorses = new ArrayList<>();
        Horse horse1 = new Horse("Atos", 3, 0);
        Horse horse2 = new Horse("Partos", 3, 0);
        Horse horse3 = new Horse("Aramis", 3, 0);
        newHorses.add(horse1);
        newHorses.add(horse2);
        newHorses.add(horse3);
        game = new Hippodrome(newHorses);
    }
}
