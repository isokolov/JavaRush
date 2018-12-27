package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandmo1 = new Human("Katha", false, 55);
        Human grandmo2 = new Human("Nasta", false, 60);
        Human grandfa1 = new Human("Igor", true, 60);
        Human grandfa2 = new Human("Izhak", true, 60);
        Human father = new Human("Jakov", true, 40, grandfa2, grandmo2);
        Human mother = new Human("Adel", false, 33, grandfa1, grandmo1);
        Human daughter = new Human("Feiga", false, 7, father, mother);
        Human son1 = new Human("Efraim", true, 10, father, mother);
        Human son2 = new Human("Shlomo", true, 4, father, mother);
        System.out.println(grandfa1);
        System.out.println(grandmo1);
        System.out.println(grandfa2);
        System.out.println(grandmo2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(daughter);
        System.out.println(son1);
        System.out.println(son2);


    }

    public static class Human {
        // напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}
