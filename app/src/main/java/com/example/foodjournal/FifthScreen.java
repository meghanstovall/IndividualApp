package com.example.foodjournal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FifthScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_screen);
    }

    public void doneButtonPressed(View view){
        Intent intent = new Intent(this, ThirdScreen.class);
        startActivity(intent);
    }
}
