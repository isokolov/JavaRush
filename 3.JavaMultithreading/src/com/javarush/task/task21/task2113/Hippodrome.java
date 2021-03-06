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

    public void run() {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException exception) {}
        }
    }

    public void move() {
        for (Horse horse: horses) {
            horse.move();
        }
    }

    public void print() {
        for (Horse horse: horses) {
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }
    }

    public Horse getWinner() {
        double maxDistance = 0;
        Horse winner = null;
        for (Horse horse: horses) {
            if (horse.getDistance() > maxDistance) {
                maxDistance = horse.getDistance();
                winner = horse;
            }
        }

        return winner;
    }

    public void printWinner() {
        Horse winner = getWinner();
        System.out.println("Winner is " + winner.getName() + "!");
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
        game.run();
        game.printWinner();
    }
}
