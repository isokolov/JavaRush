package com.javarush.task.task17.task1710;

import java.util.Date;

public class Person {
    private String name;
    private Sex sex;
    private Date birthDate;
    //private int id;
    //private static int countId = 0;

    private Person(String name, Sex sex, Date birthDate) {
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
        //this.id = countId;
        //System.out.println("сегодня родился    id=" + id);
    }

    public static Person createMale(String name, Date birthDate) {
        //countId++;
        return new Person(name, Sex.MALE, birthDate);
    }

    public static Person createFemale(String name, Date birthDate) {
        //countId++;
        return new Person(name, Sex.FEMALE, birthDate);
    }

    /*public int getId() {
        return id;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
