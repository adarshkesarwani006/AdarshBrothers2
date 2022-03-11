package com.example.adarshbrothers2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.GridView;
import java.util.ArrayList;
import java.util.List;

public class IndiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);

        List<items> itemsList = new ArrayList<>();
        itemsList.add(new items(R.drawable.indiamark1, "Iron Body"));
        itemsList.add(new items(R.drawable.indiamark6, "Cyl. diameter:63.5mm"));
        itemsList.add(new items(R.drawable.indiamark8, "Galvanised Steel"));
        itemsList.add(new items(R.drawable.indiamark4, "Max. Stroke:125mm"));
        itemsList.add(new items(R.drawable.indiamark7, "Approx. Discharge: 10m"));
        itemsList.add(new items(R.drawable.indiamark2, "Pumping lift:10-50m"));
        itemsList.add(new items(R.drawable.indiamark3, "Spares Available"));
        itemsList.add(new items(R.drawable.indiamark5, "Type of well:  Borehole"));

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



