package com.javaconcepts.opp_and_java_concepts_application.Java_Concepts;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import com.javaconcepts.opp_and_java_concepts_application.databinding.ActivityJavabasicsBinding;

public class JavaBasicsActivity extends AppCompatActivity {

    private static final String TAG = JavaBasicsActivity.class.getName();
    ActivityJavabasicsBinding binding;
    int random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityJavabasicsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String str = "shruti";
        str = str.replace("s", "b");
        // binding.textView.setText(str.replace("s","b"));
        binding.textView.append(str);

        //miniproject
        //generate number between 1 to 100 and then ley\t user guess if it is right or not

        random = (int) (Math.random() * 100);

        binding.guessBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generateClick();
            }
        });


    }


    private void generateClick() {

        if (!binding.editText.getText().equals("")) {

            int numberFromUser = Integer.parseInt(binding.editText.getText().toString());

            if (numberFromUser == random) {
                Toast.makeText(this, "You Guess the Right Number!", Toast.LENGTH_SHORT).show();

            } else if (numberFromUser > 100 || numberFromUser < 1) {
                Toast.makeText(this, "Please guess between 1 to 100!", Toast.LENGTH_SHORT).show();

            } else if (numberFromUser > random) {
                Toast.makeText(this, "Please guess less then this number!", Toast.LENGTH_SHORT).show();

            } else if (numberFromUser < random) {
                Toast.makeText(this, "Please guess greater then this number!", Toast.LENGTH_SHORT).show();

            } else if (numberFromUser == -1) {
                Toast.makeText(this, "I am tired guessing!! my number is" + random, Toast.LENGTH_SHORT).show();

            }


        } else {
            Toast.makeText(this, "Please guess something!", Toast.LENGTH_SHORT).show();

        }
    }
}