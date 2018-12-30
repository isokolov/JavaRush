package com.javarush.task.task08.task0824;

/* 
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human son1 = new Human("Вася", true, 5, new ArrayList<>());
        Human son2 = new Human("Федя", true, 4, new ArrayList<>());
        Human daughter = new Human("Ира", false, 3, new ArrayList<>());
        Human father = new Human("Саша", true, 33, new ArrayList<>(Arrays.asList(son1, son2, daughter)));
        Human mother = new Human("Лена", false, 30, new ArrayList<>(Arrays.asList(son1, son2, daughter)));
        Human grandma1 = new Human("Тамара", false, 60, new ArrayList<>(Arrays.asList(father)));
        Human graandfa1 = new Human("Семен", true, 65, new ArrayList<>(Arrays.asList(father)));
        Human grandma2 = new Human("Настя", false, 62, new ArrayList<>(Arrays.asList(mother)));
        Human graandfa2 = new Human("Игорь", true, 66, new ArrayList<>(Arrays.asList(mother)));

        System.out.println(graandfa1);
        System.out.println(grandma1);
        System.out.println(graandfa2);
        System.out.println(grandma2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(daughter);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
