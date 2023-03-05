package com.javaconcepts.opp_and_java_concepts_application.OOP_Java_Concepts.Abstraction;

public abstract class Account {

    public String accountNumber;
    private String accountHolderName;
    private double accountBalance;


    public Account(String accountNumber, String accountHolderName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }

    public void deposit(double amount) {
        accountBalance += amount;
    }

    public void withdraw(double amount) {
        accountBalance -= amount;
    }

    public double getBalance() {
        return accountBalance;
    }

    public abstract void updateAccount(); // abstract method that will be implemented in specific account types


}
