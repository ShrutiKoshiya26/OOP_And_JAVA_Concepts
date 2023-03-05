package com.javaconcepts.opp_and_java_concepts_application.OOP_Java_Concepts.Abstraction;

public class GraduateStudent extends Student{
    private String thesisTopic;

    public GraduateStudent(String name, int age, int studentId) {
        super(name, age, studentId);
        this.thesisTopic = thesisTopic;

    }


    public String getThesisTopic() {
        return thesisTopic;
    }

    public void setThesisTopic(String thesisTopic) {
        this.thesisTopic = thesisTopic;
    }

    @Override
    public double getGPA() {
        return 4.0; // Graduate students always have a 4.0 GPA
    }
}
