package com.example.adarshbrothers2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.GridView;
import java.util.ArrayList;
import java.util.List;

public class MotorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);

        List<items> itemsList = new ArrayList<>();
        itemsList.add(new items(R.drawable.number_five, "Available in All HP"));
        itemsList.add(new items(R.drawable.number_two, "Auto-Cut on Load"));
        itemsList.add(new items(R.drawable.number_three, "Single & Double Phase"));
        itemsList.add(new items(R.drawable.number_four, "Long Life Capacitors"));
        itemsList.add(new items(R.drawable.number_one, "Copper Windings"));
        itemsList.add(new items(R.drawable.number_six, "Heavy Bearings"));
        itemsList.add(new items(R.drawable.number_seven, "Cast Iron Body"));
        itemsList.add(new items(R.drawable.number_eight, "Induction Based"));

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



