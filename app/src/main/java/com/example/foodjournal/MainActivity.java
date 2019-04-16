package com.example.foodjournal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    public static final String SHARED_PREF_USERNAME = "USERNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        String username = sharedPref.getString(SHARED_PREF_USERNAME, "");

        if(!username.equals("")){
            Intent intent = new Intent(this, ThirdScreen.class);
            startActivity(intent);
        } **/
    }

    public void nextButtonPressed(View view){
        Intent intent = new Intent(this, SecondScreen.class);

        EditText personName = (EditText) findViewById(R.id.nameField);
        String message = personName.getText().toString();

        //SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        //SharedPreferences.Editor editor = sharedPref.edit();
        //editor.putString(SHARED_PREF_USERNAME, message);

        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }

}
