package com.example.perfumerydeliveryapp; // Replace with your actual package name

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the Get Started button by its ID
        Button getStartedButton = findViewById(R.id.get_started_button);

        // Set an OnClickListener for the button
        getStartedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the CategoryActivity
                Intent intent = new Intent(MainActivity.this, categoryactivity.class); // Ensure this matches the activity class name
                startActivity(intent);
            }
        });
    }
}
