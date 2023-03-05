package com.javaconcepts.opp_and_java_concepts_application.Java_Concepts;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


import com.javaconcepts.opp_and_java_concepts_application.databinding.ActivityJavabasicsBinding;

public class JavaBasicsActivity extends AppCompatActivity {

    private static final String TAG = JavaBasicsActivity.class.getName();
    ActivityJavabasicsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityJavabasicsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String str = "shruti";
        str = str.replace("s", "b");
        // binding.textView.setText(str.replace("s","b"));
        binding.textView.append(str);

    }


}