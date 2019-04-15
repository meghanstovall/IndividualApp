package com.example.foodjournal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static java.lang.Integer.parseInt;

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

        /** this stores the amount of protein the enter they will need today **/
        TextView gProteinAnswer = (TextView) findViewById(R.id.gProtAnswer);
        String gProteinAnsString = gProteinAnswer.getText().toString();
        int gProteinAnsNum = parseInt(gProteinAnsString);

        /** this stores the amount of carbs the enter they will need today **/
        TextView gCarbsAnswer = (TextView) findViewById(R.id.gCarbsAnswer);
        String gCarbsAnsString = gCarbsAnswer.getText().toString();
        int gCarbsAnsNum = parseInt(gCarbsAnsString);

        /** this stores the amount of fats the enter they will need today **/
        TextView gFatsAnswer = (TextView) findViewById(R.id.gFatsAnswer);
        String gFatsAnsString = gFatsAnswer.getText().toString();
        int gFatsAnsNum = parseInt(gFatsAnsString);
    }
}
