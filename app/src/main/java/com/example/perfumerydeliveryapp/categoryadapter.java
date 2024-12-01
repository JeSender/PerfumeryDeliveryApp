package com.example.perfumerydeliveryapp;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class categoryadapter extends RecyclerView.Adapter<categoryadapter.CategoryViewHolder> {

    private Context context;
    private List<String> categoryList;  // List of categories

    // Constructor to pass context and category data
    public categoryadapter(Context context, List<String> categoryList) {
        this.context = context;
        this.categoryList = categoryList;
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Inflate the item layout for each category
        View view = LayoutInflater.from(context).inflate(R.layout.item_category, parent, false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int position) {
        // Get the category at the given position
        String category = categoryList.get(position);

        // Bind the category name to the TextView
        holder.categoryTextView.setText(category);
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    // Define the ViewHolder class for category items
    public static class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView categoryTextView;

        public CategoryViewHolder(View itemView) {
            super(itemView);
            categoryTextView = itemView.findViewById(R.id.category_name);
        }
    }
}

