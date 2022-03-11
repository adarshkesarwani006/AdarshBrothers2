package com.example.adarshbrothers2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Motors Category

        // Find the View that shows the motors category
        TextView motors = findViewById(R.id.motors);

        // Set a click listener on that View
        motors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the motors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MotorsActivity}
                Intent MotorsIntent = new Intent(MainActivity.this, MotorsActivity.class);
                // In Above code to connect Motors Activity(Screen) we are creating a new intent in which we are
                // --passing 1. this (name of Activity on which the new Activity will be opened)
                //           2. class(name of Activity which is to be displayed on clicked) and stored in variable numbersIntent.
                //           Here in MotorsActivity.class file the new Activity screen is coded.
                // Start the new activity
                startActivity(MotorsIntent);
            }
        });

        // Dehati Motors Category
        TextView dehati = findViewById(R.id.dehati);
        dehati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent DehatiIntent = new Intent(MainActivity.this, DehatiActivity.class);
                startActivity(DehatiIntent);
            }
        });

        // India Mark II Category
        TextView india = findViewById(R.id.india);
        india.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IndiaIntent = new Intent(MainActivity.this, IndiaActivity.class);
                startActivity(IndiaIntent);
            }
        });

        // Submersible Pump Category
        TextView submersible = findViewById(R.id.sub);
        submersible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent SubmersibleIntent = new Intent(MainActivity.this, SubmersibleActivity.class);
                startActivity(SubmersibleIntent);
            }
        });

        // Cow Mats Category
        TextView cowmat = findViewById(R.id.cow);
        cowmat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent CowMatIntent = new Intent(MainActivity.this, CowActivity.class);
                startActivity(CowMatIntent);
            }
        });

        // HDPE Pipe Category
        TextView hdpe = findViewById(R.id.hdpe);
        hdpe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent HdpePipeIntent = new Intent(MainActivity.this, HdpeActivity.class);
                startActivity(HdpePipeIntent);
            }
        });

        // Hand Pumps Category
        TextView handpump = findViewById(R.id.hand);
        handpump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent HandPumpIntent = new Intent(MainActivity.this, HandPumpActivity.class);
                startActivity(HandPumpIntent);
            }
        });
    }
}