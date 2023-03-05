package com.javaconcepts.opp_and_java_concepts_application.OOP_Java_Concepts.Polymorphism;

import android.util.Log;

public class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        Log.d("Motorcycle", "Starting motorcycle engine...");
    }
}
