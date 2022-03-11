package com.example.adarshbrothers2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.GridView;
import java.util.ArrayList;
import java.util.List;

public class HandPumpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);

        List<items> itemsList = new ArrayList<>();
        itemsList.add(new items(R.drawable.pump2, "Available in All Weights"));
        itemsList.add(new items(R.drawable.pump6, "4 No,6 No,Light,Heavy"));
        itemsList.add(new items(R.drawable.pump4, "Suction cap.22-26Ft."));
        itemsList.add(new items(R.drawable.pump8, "Spare Parts Available"));
        itemsList.add(new items(R.drawable.pump3, "Tied Handles"));
        itemsList.add(new items(R.drawable.pump5, "Heavy Handles"));
        itemsList.add(new items(R.drawable.pump1, "Weighted"));
        itemsList.add(new items(R.drawable.pump7, "Well Painted"));

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



