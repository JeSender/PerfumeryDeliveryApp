package com.example.perfumerydeliveryapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class cartactivity extends AppCompatActivity {

    private TextView cartItemsTextView, totalPriceTextView;
    private Button placeOrderButton;

    // Sample data: Replace with actual cart data
    private int cartItemCount = 3;
    private double totalPrice = 150.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart); // Ensure this layout file exists

        // Initialize views
        cartItemsTextView = findViewById(R.id.cart_items_text_view);
        totalPriceTextView = findViewById(R.id.total_price_text_view);
        placeOrderButton = findViewById(R.id.place_order_button);

        // Update the text views with cart details
        cartItemsTextView.setText("Cart Items: " + cartItemCount); // Example
        totalPriceTextView.setText("Total: $" + totalPrice); // Example

        // Handle Place Order button click
        placeOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                placeOrder();
            }
        });
    }

    private void placeOrder() {
        // Here, you can add logic to process the order (e.g., saving order details, etc.)
        // For now, we show a simple confirmation message
        Toast.makeText(cartactivity.this, "Order Placed Successfully!", Toast.LENGTH_SHORT).show();

        // Optionally, you can navigate to another activity (e.g., order confirmation)
        // Intent intent = new Intent(cartactivity.this, OrderConfirmationActivity.class);
        // startActivity(intent);

        // Finish the activity if you want to return to the previous activity
        // finish();
    }
}
