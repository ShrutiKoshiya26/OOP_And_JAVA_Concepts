package com.javaconcepts.opp_and_java_concepts_application.OOP_Java_Concepts;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.javaconcepts.opp_and_java_concepts_application.OOP_Java_Concepts.Abstraction.GraduateStudent;
import com.javaconcepts.opp_and_java_concepts_application.OOP_Java_Concepts.Abstraction.SavingsAccount;
import com.javaconcepts.opp_and_java_concepts_application.OOP_Java_Concepts.Abstraction.UndergraduateStudent;
import com.javaconcepts.opp_and_java_concepts_application.OOP_Java_Concepts.Encapsulation.BankAccount;
import com.javaconcepts.opp_and_java_concepts_application.OOP_Java_Concepts.Polymorphism.Car;
import com.javaconcepts.opp_and_java_concepts_application.OOP_Java_Concepts.Polymorphism.Motorcycle;
import com.javaconcepts.opp_and_java_concepts_application.OOP_Java_Concepts.Polymorphism.Vehicle;
import com.javaconcepts.opp_and_java_concepts_application.databinding.ActivityOopbasicsBinding;

public class OOPBasicsActivity extends AppCompatActivity {

    private static final String TAG = OOPBasicsActivity.class.getName();
    ActivityOopbasicsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityOopbasicsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //encapsulation

        /*

         concept of bundling data and methods that manipulate the data within a single unit,
         called a class, and hiding the internal details of the class from the outside world.
         In Java, this is achieved using access modifiers such as private, public, and protected.

         The deposit() and withdraw() methods update the account balance, but the user of the class does not need to
         know or understand how the account balance is stored or updated internally.
         In summary, encapsulation is a powerful concept in Java that allows you to hide the internal details
         of a class and provide a clean interface for users of the class to interact with.

         */

        BankAccount bankAccount = new BankAccount();
        bankAccount.setCustomerName("shruti");
        bankAccount.deposit(3000);
        bankAccount.withDraw(2000);

        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.setCustomerName("harsh");
        bankAccount2.deposit(4000);
        bankAccount2.withDraw(1000);

        /* now if we want that, out account number will automatically generated by bank,
         then there is a method in private bank account class, we can only get acc num from that.
         */

        binding.textView.setText(bankAccount.getCustomerName() + "--");
        binding.textView.append(bankAccount.getAccountnumber() + "--");
        binding.textView.append(bankAccount.getAccountBalance() + "");
        binding.textView.append("\n");
        binding.textView.append(bankAccount2.getCustomerName() + "--");
        binding.textView.append(bankAccount2.getAccountnumber() + "--");
        binding.textView.append(bankAccount2.getAccountBalance() + "");


        //abstraction

        /*

        Abstraction is a fundamental concept in object-oriented programming that involves hiding unnecessary
        details while exposing only essential features of an object or system.
         Each account has some common properties like an account number, account holder name,
         and account balance. However, there might be different types of accounts such as savings accounts,
         checking accounts, and credit card accounts, each with their own unique behaviors.

         */

        //example 1

        SavingsAccount savings = new SavingsAccount("123456789", "John Doe", 1000.0, 5);

        // update the savings account balance based on the interest rate
        savings.updateAccount();


        //example 2

        double[] grades = {3.5, 4.0, 3.7, 3.9};
        UndergraduateStudent alice = new UndergraduateStudent("Alice", 20, 8786, grades);

// Create a graduate student
        GraduateStudent bob = new GraduateStudent("Bob", 25, 23456);

// Calculate the GPAs of the students
        System.out.println(alice.getName() + "'s GPA is " + alice.getGPA());
        System.out.println(bob.getName() + "'s GPA is " + bob.getGPA());



 /*---------polymorphism---------------------


     In this example, the startEngine() method is polymorphic because it is defined in the Vehicle class,
        but each subclass (Car and Motorcycle) provides its own implementation. When you call startEngine()
        on a Vehicle object,
        the appropriate implementation is called based on the type of the object at runtime.
*/

        Vehicle vehicle=new Vehicle();
        vehicle.startEngine();

        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();


        car.startEngine(); // Output: Starting car engine...
        motorcycle.startEngine(); // Output: Starting motorcycle engine...
    }





}