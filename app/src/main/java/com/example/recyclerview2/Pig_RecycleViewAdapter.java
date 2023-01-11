package com.example.recyclerview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Pig_RecycleViewAdapter extends RecyclerView.Adapter<Pig_RecycleViewAdapter.MyViewHolder> {
    Context context;
    ArrayList<PigModel> pigModels;


    public Pig_RecycleViewAdapter(Context context, ArrayList<PigModel> pigModels){
        this.context = context;
        this.pigModels = pigModels;
    }

    @NonNull
    @Override
    public Pig_RecycleViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflate the layout (giving a look to our rows)
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_list, parent, false);
        return new Pig_RecycleViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Pig_RecycleViewAdapter.MyViewHolder holder, int position) {
        //assigning values to views created in recycler_view_row layout file
        //based on position of the recycler view
        holder.tvName.setText(pigModels.get(position).getName());
        holder.imageView.setImageResource(pigModels.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        //Just wants to know amount of items, works with binding view
        return pigModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        //takes views from the pig model layout file
        ImageView imageView;
        TextView tvName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            tvName = itemView.findViewById(R.id.textView);
        }
    }
}
