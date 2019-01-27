package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {

    public Solution() {}

    Solution(int number) {}

    protected Solution(String string) {}

    private Solution(double d) {}


    public static void main(String[] args) {

        //SubSolution solution = new SubSolution();
    }

    public class SubSolution extends Solution {

        /*public SubSolution() {}

        SubSolution(int number) {
            super(number);
        }

        protected SubSolution(String string) {
            super(string);
        }*/

        /*public SubSolution(double d) {
            super(d);
        }*/
    }
}

