package com.javarush.task.task34.task3403;

/* 
Разложение на множители с помощью рекурсии
*/
public class Solution {
    public void recurse(int n) {

        if (n == 1) return;
        int helper = 2;
        while (n >= helper) {
            if (n % helper == 0 && n != helper) {
                System.out.print(helper + " ");
                recurse(n / helper);
                return;
            }
            if (n % helper == 0 && n == helper) {
                System.out.print(helper + " ");
                return;
            }
            helper++;

        }

    }

    public static void main(String[] args) {
        /*Solution solution = new Solution();
        solution.recurse(132);*/

    }
}
