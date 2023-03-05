package com.javaconcepts.opp_and_java_concepts_application.OOP_Java_Concepts.Abstraction;

public class UndergraduateStudent extends Student {

    private double[] grades;

    public UndergraduateStudent(String name, int age, int studentId,double[] grades) {
        super(name, age, studentId);

        this.grades = grades;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    @Override
    public double getGPA() {

        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
}
