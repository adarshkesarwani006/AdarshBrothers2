package com.example.adarshbrothers2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.GridView;
import java.util.ArrayList;
import java.util.List;

public class HdpeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);

        List<items> itemsList = new ArrayList<>();
        itemsList.add(new items(R.drawable.hdpe1, "All Lengths & Sizes"));
        itemsList.add(new items(R.drawable.hdpe2, "21,24,27,30,40 mtr"));
        itemsList.add(new items(R.drawable.hdpe7, "Thickness: 6.5 mm"));
        itemsList.add(new items(R.drawable.hdpe8, "Diameter:1,1.25,2.5 in"));
        itemsList.add(new items(R.drawable.hdpe3, "End Type: Cylinder"));
        itemsList.add(new items(R.drawable.hdpe6, "Flow Rate:2L Per Hour"));
        itemsList.add(new items(R.drawable.hdpe4, "Polythene Cover"));
        itemsList.add(new items(R.drawable.hdpe5, "Color:Black & Blue"));

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



