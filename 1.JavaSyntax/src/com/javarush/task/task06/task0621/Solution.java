package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
Задача: У каждой кошки есть имя и кошка-мама.
Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму.
Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама.
Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.
Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка
Пример вывода:
The cat's name is дедушка Вася, no mother, no father
The cat's name is бабушка Мурка, no mother, no father
The cat's name is папа Котофей, no mother, father is дедушка Вася
The cat's name is мама Василиса, mother is бабушка Мурка, no father
The cat's name is сын Мурчик, mother is мама Василиса, father is папа Котофей
The cat's name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /*String motherName = reader.readLine();
        Cat catMother = new Cat(motherName);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother);

        System.out.println(catMother);
        System.out.println(catDaughter);*/
        /*Cat grandpa = new Cat("дедушка Вася");
        Cat grandma = new Cat("бабушка Мурка");
        Cat father = new Cat("папа Котофей", null, grandpa);
        Cat mother = new Cat("мама Василиса", grandma, null);
        Cat son = new Cat("сын Мурчик", mother, father);
        Cat daughter = new Cat("дочь Пушинка", mother, father);*/
        String grandFatherName = reader.readLine();
        String grandMotherName = reader.readLine();
        String fatherName = reader.readLine();
        String motherName = reader.readLine();
        String sonName = reader.readLine();
        String dauhterName = reader.readLine();
        Cat grandFather = new Cat (grandFatherName,null,null);
        Cat grandMother = new Cat (grandMotherName,null,null);
        Cat father = new Cat (fatherName,null,grandFather);
        Cat mother = new Cat (motherName, grandMother,null);
        Cat son = new Cat (sonName, mother, father);
        Cat daughter = new Cat (dauhterName, mother, father);

        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);
    }

    public static class Cat {
        private String name;
        /*private Cat parent;*/
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        /*Cat(String name, Cat parent) {
            this.name = name;
            this.parent = parent;
        }*/
        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        /*@Override
        public String toString() {
            if (parent == null)
                return "The cat's name is " + name + ", no mother ";
            else
                return "The cat's name is " + name + ", mother is " + parent.name;
        }*/

        @Override
        public String toString() {
            String result = "";
            if (mother == null)
                result = "The cat's name is " + name + ", no mother";
            else
                result = "The cat's name is " + name + ", mother is " + mother.name;
            if (father == null)
                result += ", no father";
            else
                result += ", father is " + father.name;

            return result;
        }
    }

}
