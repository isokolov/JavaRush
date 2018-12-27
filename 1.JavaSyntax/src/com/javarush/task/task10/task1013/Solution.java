package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.
Все поля класса Human должны быть private.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private String address;
        private String profession;
        private int age;
        private int height;
        private char sex;

        public Human(String name, String address, String profession, int age, int height, char sex) {
            this.name = name;
            this.address = address;
            this.profession = profession;
            this.age = age;
            this.height = height;
            this.sex = sex;
        }

        public Human(String name, String address, String profession, int age, int height) {
            this.name = name;
            this.address = address;
            this.profession = profession;
            this.age = age;
            this.height = height;
            this.sex = 'm';
        }

        public Human(String name, String address, String profession, int age) {
            this.name = name;
            this.address = address;
            this.profession = profession;
            this.age = age;
            this.height = 170;
            this.sex = 'm';
        }

        public Human(String name, String address, int age) {
            this.name = name;
            this.address = address;
            this.profession = "unemployed";
            this.age = age;
            this.height = 170;
            this.sex = 'm';
        }

        public Human(String name, int age, int height, char sex) {
            this.name = name;
            this.address = "NY 5th Avenue";
            this.profession = "unemployed";
            this.age = age;
            this.height = 170;
            this.sex = sex;
        }

        public Human(String name, String profession, int age, int height, char sex) {
            this.name = name;
            this.address = "NY 5th Avenue";
            this.profession = profession;
            this.age = age;
            this.height = height;
            this.sex = sex;
        }

        public Human(String name, String address, int age, char sex) {
            this.name = name;
            this.address = address;
            this.profession = "unemployed";
            this.age = age;
            this.height = 170;
            this.sex = sex;
        }

        public Human(Human anotherHuman) {
            this.name = anotherHuman.name;
            this.address = anotherHuman.address;
            this.profession = anotherHuman.profession;
            this.age = anotherHuman.age;
            this.height = anotherHuman.height;
            this.sex = anotherHuman.sex;
        }

        public Human(String name, int age, char sex) {
            this.name = name;
            this.address = "NY 5th Avenue";
            this.profession = "unemployed";
            this.age = age;
            this.height = 170;
            this.sex = sex;
        }

        public Human() {
            this.name = "";
            this.address = "NY 5th Avenue";
            this.profession = "unemployed";
            this.age = 25;
            this.height = 170;
            this.sex = 'm';
        }
    }


}
