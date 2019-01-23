package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University  {

    private String name;
    private int age;
    private List<Student> students = new ArrayList<>();

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Student getStudentWithAverageGrade(double value) {
        //TODO:
        Student studentAverage = null;
        for (Student student: students) {
            if (student.getAverageGrade() == value) {
                studentAverage = student;
                return studentAverage;
            }
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        //TODO:
        Student studentMaxAverage = null;
        double maxAverage = 0;
        for (Student student: students) {
            if (student.getAverageGrade() > maxAverage) {
                maxAverage = student.getAverageGrade();
                studentMaxAverage = student;
            }
        }
        return studentMaxAverage;
    }

    /*public void getStudentWithMinAverageGradeAndExpel() {
        //TODO:
    }*/

    public Student getStudentWithMinAverageGrade() {
        Student studentMinAverage = null;
        double minAverage = Integer.MAX_VALUE;
        for (Student student: students) {
            if (student.getAverageGrade() < minAverage) {
                minAverage = student.getAverageGrade();
                studentMinAverage = student;
            }
        }
        return studentMinAverage;
    }

    public void expel(Student student) {
        students.remove(student);
    }


}
