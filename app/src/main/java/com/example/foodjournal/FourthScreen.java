package com.example.foodjournal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Integer.parseInt;

public class FourthScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_screen);
    }

    public void addAnotherFoodButtonPressed(View view) {
        Intent intent = new Intent(this, FourthScreen.class);
        startActivity(intent);

        /** this is storing the amount of protein in the food **/
        TextView foodsProtein = (TextView) findViewById(R.id.foodsProtein);
        String foodsProteinString = foodsProtein.getText().toString();
        int foodsProteinNum = parseInt(foodsProteinString);

        /** this is storing the amount of carbs in the food **/
        TextView foodsCarbs = (TextView) findViewById(R.id.foodsCarbs);
        String foodsCarbsString = foodsProtein.getText().toString();
        int foodsCarbsNum = parseInt(foodsCarbsString);

        /** this is storing the amount of fats in the food **/
        TextView foodsFats = (TextView) findViewById(R.id.foodsFats);
        String foodsFatsString = foodsProtein.getText().toString();
        int foodsFatsNum = parseInt(foodsFatsString);
    }

    public void doneButtonPressed(View view) {
        Intent intent = new Intent(this, FifthScreen.class);
        startActivity(intent);
    }
}
