package com.javaconcepts.opp_and_java_concepts_application.OOP_Java_Concepts.Abstraction;

import android.util.Log;

public class SavingsAccount extends Account {

    private static final String TAG = SavingsAccount.class.getName();

    private int interestrate;

    public SavingsAccount(String accountNumber, String accountHolderName, double accountBalance,int interestrate) {
        super(accountNumber, accountHolderName, accountBalance);
        this.interestrate=interestrate;
    }

    @Override
    public void updateAccount() {

        double interest = getBalance() * interestrate;
        deposit(interest);
        Log.e(TAG, "updateAccount: " + accountNumber);

    }


}
