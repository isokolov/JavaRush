package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int index = (this.age - anotherCat.age) + (this.weight - anotherCat.weight) + (this.strength - anotherCat.strength);
        return (index > 0) ? true : false;
    }

    public static void main(String[] args) {

    }
}
/* 47%, 1, 3.78, 65942 */