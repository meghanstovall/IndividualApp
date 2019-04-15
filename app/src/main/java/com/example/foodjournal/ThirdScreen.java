package com.example.foodjournal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThirdScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_screen);
    }

    /** Called when the user taps the Next button */
    public void nextButtonPressed(View view) {
        Intent intent = new Intent(this, FourthScreen.class);
        startActivity(intent);
    }
}
