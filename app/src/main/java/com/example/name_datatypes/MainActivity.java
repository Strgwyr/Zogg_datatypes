package com.example.name_datatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView display;

        display = findViewById(R.id.displayText);

        String nextString = "whatever";
        String result="";

        String firstname = "Ethan James";
        char middleInitital = 'O';
        String lastname = "Zogg";
        int myAge = 18;
        float myDreamTVLGrade = 99.0f;


        double myMoney =9999999.99;


        //double into string
        //Double.parseDouble => converts datatypes to double
        //Integer.parseDouble => converts datatypes to double
        //String.valueOf => converts datatypes to String



        //String.valueOf(myMoney);
        display.setText("my firstname is "+firstname+ " "
                +String.valueOf(myAge)+" and my money is "+String.valueOf(middleInitital)+" "
                +lastname+ " \nand my age is "
                +myAge+ ". \nI want my grade in TVL3 to be "
                +String.valueOf(myDreamTVLGrade));

        boolean amIMarried = false;

        

    }
}