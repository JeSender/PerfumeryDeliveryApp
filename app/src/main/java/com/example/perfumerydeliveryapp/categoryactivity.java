package com.example.perfumerydeliveryapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class categoryactivity extends AppCompatActivity {

    private RecyclerView categoriesRecyclerView, perfumesRecyclerView;
    private categoryadapter categoryAdapter;
    private PerfumeAdapter perfumeAdapter;
    private List<String> categoryList;
    private List<perfume> perfumeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoryactivity);

        // Initialize category RecyclerView
        categoriesRecyclerView = findViewById(R.id.categories_recycler_view);
        categoriesRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        // Initialize perfumes RecyclerView
        perfumesRecyclerView = findViewById(R.id.popular_products_recycler_view);
        perfumesRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Create and set up category list
        categoryList = new ArrayList<>();
        categoryList.add("Female Perfume");
        categoryList.add("Male Perfume");
        categoryList.add("Gift Sets");
        categoryList.add("Body Care");
        categoryList.add("Adult Perfume");


        categoryAdapter = new categoryadapter(this, categoryList);
        categoriesRecyclerView.setAdapter(categoryAdapter);

        // Create and set up perfume list
        perfumeList = new ArrayList<>();
        perfumeList.add(new perfume("Rose Bliss", "A floral scent with a hint of spice.", 50.0));
        perfumeList.add(new perfume("Ocean Mist", "A fresh aquatic fragrance.", 65.0));
        perfumeList.add(new perfume("Citrus Charm", "An invigorating citrus blend.", 45.0));
        perfumeList.add(new perfume("Lemon Charm", "An invigorating citrus blend.", 90.0));
        perfumeList.add(new perfume("Citrus Charm", "An invigorating citrus blend.", 85.0));

        perfumeAdapter = new PerfumeAdapter(this, perfumeList);
        perfumesRecyclerView.setAdapter(perfumeAdapter);



        // Find the Get Started button by its ID
        Button viewCartButton = findViewById(R.id.view_cart_button);

        // Set an OnClickListener for the button
        viewCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the CategoryActivity
                Intent intent = new Intent( categoryactivity.this, cartactivity.class); // Ensure this matches the activity class name
                startActivity(intent);
            }
        });
    }
}
