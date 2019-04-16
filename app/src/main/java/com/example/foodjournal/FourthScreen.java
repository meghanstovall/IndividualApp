package com.example.foodjournal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

import static java.lang.Integer.parseInt;

public class FourthScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_screen);

        TextView foodName = (TextView) findViewById(R.id.foodEaten);
        String foodNameString = foodName.getText().toString();

        TextView foodsProteinAmnt = (TextView) findViewById(R.id.foodsProtein);
        String foodsProteinAmntString = foodsProteinAmnt.getText().toString();
        int foodsProteinAmntNum = parseInt(foodsProteinAmntString);

        TextView foodsCarbAmnt = (TextView) findViewById(R.id.foodsCarbs);
        String foodsCarbAmntString = foodsCarbAmnt.getText().toString();
        int foodsCarbAmntNum = parseInt(foodsCarbAmntString);

        TextView foodsFatAmnt = (TextView) findViewById(R.id.foodsFats);
        String foodsFatAmntString = foodsFatAmnt.getText().toString();
        int foodsFatAmntNum = parseInt(foodsFatAmntString);

        FoodItem item = new FoodItem(foodNameString, foodsProteinAmntNum, foodsCarbAmntNum, foodsFatAmntNum);
        //List<FoodItem> foodItemsList = FoodInfoStorage.


    }

    public void addAnotherFoodButtonPressed(View view) {
        Intent intent = new Intent(this, FourthScreen.class);
        startActivity(intent);
    }

    public void doneButtonPressed(View view){
        Intent intent = new Intent(this, FifthScreen.class);
        startActivity(intent);
    }

}
