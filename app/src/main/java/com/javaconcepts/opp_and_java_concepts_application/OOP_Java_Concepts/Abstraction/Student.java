package com.javaconcepts.opp_and_java_concepts_application.OOP_Java_Concepts.Abstraction;

public abstract class Student {

    private String name;

    public Student(String name, int age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
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

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    private int age;
    private int studentId;

    public abstract double getGPA();   //common method that will do different functionality for diff class
}
