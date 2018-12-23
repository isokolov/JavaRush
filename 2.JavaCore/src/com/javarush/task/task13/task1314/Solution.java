package com.javarush.task.task13.task1314;

import java.awt.*;


/* 
Большая лисица — это такая лисица
1. Исправь класс BigFox так, чтобы программа компилировалась.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());

    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public static class BigFox extends Fox implements Animal { /* added extends Fox implements Animal */
        public Color getColor() { /* changed Color() to Color getColor() */
            return Color.GRAY;
        }
    }

}
