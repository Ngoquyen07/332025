package com.example.a332025;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Item> items ;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        items = new ArrayList<>();
        items.add(new Item("This is item 1",R.drawable.baseline_3d_rotation_24,"item 1"));
        items.add(new Item("This is item 2",R.drawable.baseline_data_usage_24,"item 2"));
        items.add(new Item("This is item 3",R.drawable.baseline_favorite_border_24,"item 3"));
        items.add(new Item("This is item 4",R.drawable.baseline_favorite_border_24,"item 4"));
        items.add(new Item("This is item 5",R.drawable.baseline_3d_rotation_24,"item 5"));
        items.add(new Item("This is item 6",R.drawable.baseline_data_usage_24,"item 6"));
        items.add(new Item("This is item 7",R.drawable.baseline_3d_rotation_24,"item 7"));
        items.add(new Item("This is item 1",R.drawable.baseline_3d_rotation_24,"item 1"));
        items.add(new Item("This is item 2",R.drawable.baseline_data_usage_24,"item 2"));
        items.add(new Item("This is item 3",R.drawable.baseline_favorite_border_24,"item 3"));
        items.add(new Item("This is item 4",R.drawable.baseline_favorite_border_24,"item 4"));
        items.add(new Item("This is item 5",R.drawable.baseline_3d_rotation_24,"item 5"));
        items.add(new Item("This is item 6",R.drawable.baseline_data_usage_24,"item 6"));
        items.add(new Item("This is item 7",R.drawable.baseline_3d_rotation_24,"item 7"));
        recyclerView = findViewById(R.id.rvItem);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        adapter = new ItemAdapter(this,items);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


    }


}