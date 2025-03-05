package com.example.a332025;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    ArrayList<Item> items;
    public ItemAdapter(Context context,ArrayList<Item> items){
        
        this.items = items;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView ivAvatar;
        TextView tvName,tvDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivAvatar = itemView.findViewById(R.id.ivAvarta);
            tvName = itemView.findViewById(R.id.tvName);
            tvDescription = itemView.findViewById(R.id.tvDescription);
            itemView.setOnClickListener( v -> {
                Item item = (Item) v.getTag();

                Toast.makeText(v.getContext(),"Item: "+item.getName() + " \n" + item.getDescription() , Toast.LENGTH_SHORT).show();
            });
        }
    }


    @NonNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemView.setTag(items.get(position));
        holder.ivAvatar.setImageResource(items.get(position).getImage());
        holder.tvName.setText(items.get(position).getName());
        holder.tvDescription.setText(items.get(position).getDescription());
    }


    @Override
    public int getItemCount() {
        return items.size();
    }
}
