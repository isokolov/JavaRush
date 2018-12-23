package com.javarush.task.task12.task1217;

/* 
Лететь, бежать и плыть
Напиши public интерфейсы CanFly(летать), CanRun(бежать/ездить), CanSwim(плавать).
Добавить в каждый интерфейс по одному методу.
*/

public class Solution {
    public static void main(String[] args) {

    }

//add interfaces here - добавь интерфейсы тут
    public interface CanFly {
        boolean isFlying();
    }

    public interface CanRun {
        boolean isRunning();
    }

    public interface CanSwim {
        boolean isSwimming();
    }

}
