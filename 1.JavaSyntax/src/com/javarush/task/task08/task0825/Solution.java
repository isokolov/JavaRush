package com.javarush.task.task08.task0825;

/* 
Модификатор запутался
Переставь один модификатор static, чтобы пример скомпилировался.
*/

public class Solution {
    public static int A = 5; /* here static added */
    public static int B = 2;

    public int C = A * B;
    public static int D = B * A;

    public static void main(String[] args) {
    }

    public /*static*/ int getValue() {
        return D;
    }

    public int getValue2() {
        return C;
    }
}
