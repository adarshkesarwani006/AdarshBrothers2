package com.example.adarshbrothers2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.GridView;


import java.util.ArrayList;
import java.util.List;

public class CowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);

        List<items> itemsList = new ArrayList<>();
        itemsList.add(new items(R.drawable.cowmat4, "Material: Eva Rubber"));
        itemsList.add(new items(R.drawable.cowmat1, "Size: 8'x5"));
        itemsList.add(new items(R.drawable.cowmat3, "Thickness: 25-28mm"));
        itemsList.add(new items(R.drawable.cowmat7, "Slip Resistant"));
        itemsList.add(new items(R.drawable.cowmat5, "Water Proof"));
        itemsList.add(new items(R.drawable.cowmat6, "Anti Bacterial"));
        itemsList.add(new items(R.drawable.cowmat2, "Easy to Clean"));
        itemsList.add(new items(R.drawable.cowmat8, "Avoid Injuries"));

        GridView gridView = findViewById(R.id.grid_view);
        CustomAdapter customAdapter = new CustomAdapter(this, R.layout.custom_view, itemsList);
        gridView.setAdapter(customAdapter);
    }

    @Override
    protected void onStop(){
        super.onStop();
        setContentView(R.layout.activity_main);
    }
}



