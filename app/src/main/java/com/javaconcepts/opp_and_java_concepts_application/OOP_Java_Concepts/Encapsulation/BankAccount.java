package com.javaconcepts.opp_and_java_concepts_application.OOP_Java_Concepts.Encapsulation;

import android.util.Log;

public class BankAccount {

    private static final String TAG = BankAccount.class.getName();
    private String customerName;
    private int accountnumber;
    private double accountBalance = 5000;//set default amount


    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    private void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public int getAccountnumber() {

        setAccountnumber((int) (Math.random() * 7867));
        return accountnumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void deposit(double amount) {
        accountBalance += amount;
    }

    public void withDraw(double amount) {

        if (amount <= accountBalance) {
            accountBalance -= amount;
        } else {
            Log.e(TAG, "insufficient balance");
        }

    }


}
