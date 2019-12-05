package com.javarush.task.task20.task2023;

/* 
Делаем правильный вывод
*/
public class Solution {
    public static void main(String[] s) {
        A a = new C();
        a.method2();
    }

    public static class A {
        /*public*/ private void method1() { /* changed */
            System.out.println("A class, method1");
        }

        public void method2() {
            System.out.println("A class, method2");
            method1(); /* added */
        }
    }

    public static class B extends A {
         void method1() {
            super.method2(); /* added */
            System.out.println("B class, method1");
        }

        public void method2() {
            System.out.println("B class, method2");
        }
    }

    public static class C extends B {
        public void method1() {
            System.out.println("C class, method1");
        }

        public void method2() {

            System.out.println("C class, method2");
            //super.method1(); /* added */

        }
    }
}
