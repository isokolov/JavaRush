package com.javarush.task.task23.task2305;

/*
Inner
Реализовать метод getTwoSolutions, который должен возвращать
массив из 2-х экземпляров класса Solution.
Для каждого экземпляра класса Solution инициализировать поле innerClasses двумя значениями.
Инициализация всех данных должна происходить только в методе getTwoSolutions.
*/
public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {

        Solution[] solutions = new Solution[2];
        solutions[0] = new Solution();
        solutions[1] = new Solution();
        solutions[0].innerClasses[0] = new Solution().new InnerClass();
        solutions[0].innerClasses[1] = new Solution().new InnerClass();
        solutions[1].innerClasses[0] = new Solution().new InnerClass();
        solutions[1].innerClasses[1] = new Solution().new InnerClass();

        return solutions;
    }

    public static void main(String[] args) {
        /*Solution[] test = getTwoSolutions();
        System.out.println(Arrays.toString(test));*/
    }
}
