package com.example.adarshbrothers2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.GridView;
import java.util.ArrayList;
import java.util.List;

public class SubmersibleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);

        List<items> itemsList = new ArrayList<>();
        itemsList.add(new items(R.drawable.submersible3, "All Types Available"));
        itemsList.add(new items(R.drawable.submersible6, "All HP-1,1.5,2,2.5..."));
        itemsList.add(new items(R.drawable.submersible5, "All Stages-10,12..."));
        itemsList.add(new items(R.drawable.submersible4, "Delivery: 32mm"));
        itemsList.add(new items(R.drawable.submersible1, "Bore Size: 100mm"));
        itemsList.add(new items(R.drawable.submersible2, "Head Range: 24-26mm"));

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



