package com.example.perfumerydeliveryapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PerfumeAdapter extends RecyclerView.Adapter<PerfumeAdapter.PerfumeViewHolder> {

    private Context context;
    private List<perfume> perfumeList;

    public PerfumeAdapter(Context context, List<perfume> perfumeList) {
        this.context = context;
        this.perfumeList = perfumeList;
    }

    @Override
    public PerfumeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_perfume, parent, false);
        return new PerfumeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PerfumeViewHolder holder, int position) {
        perfume perfume = perfumeList.get(position);
        holder.nameTextView.setText(perfume.getName());
        holder.descriptionTextView.setText(perfume.getDescription());
        holder.priceTextView.setText("$" + perfume.getPrice());

        // Add to Cart functionality
        holder.addToCartButton.setOnClickListener(v -> {
            cart.addToCart(perfume); // Add item to the cart
            Snackbar.make(v, perfume.getName() + " has been added to your cart!", Snackbar.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return perfumeList.size();
    }

    public static class PerfumeViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView, descriptionTextView, priceTextView;
        Button addToCartButton;

        public PerfumeViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.perfume_name);
            descriptionTextView = itemView.findViewById(R.id.perfume_description);
            priceTextView = itemView.findViewById(R.id.perfume_price);
            addToCartButton = itemView.findViewById(R.id.add_to_cart_button);
        }
    }
}
