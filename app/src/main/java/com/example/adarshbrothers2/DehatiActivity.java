package com.example.adarshbrothers2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.GridView;
import java.util.ArrayList;
import java.util.List;

public class DehatiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);

        List<items> itemsList = new ArrayList<>();
        itemsList.add(new items(R.drawable.dehati2, "Copper Windings"));
        itemsList.add(new items(R.drawable.dehati3, "Heavy Bearings"));
        itemsList.add(new items(R.drawable.dehati5, "Auto-Cut on Load"));
        itemsList.add(new items(R.drawable.dehati4, "Long Life Capacitors"));
        itemsList.add(new items(R.drawable.dehati1, "Foam & Carton Pack"));
        itemsList.add(new items(R.drawable.dehati6, "Cast Iron Body"));

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



