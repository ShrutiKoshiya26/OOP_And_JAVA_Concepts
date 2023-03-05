package com.javaconcepts.opp_and_java_concepts_application.OOP_Java_Concepts.Polymorphism;

import android.util.Log;

public class Car extends Vehicle {
    @Override
    public void startEngine() {
        Log.d("Car", "Starting motorcycle engine...");
    }

}
