package com.espinas.slideshow;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterRecyclerGol extends RecyclerView.Adapter<AdapterRecyclerGol.ViewHolder> {

    List<ModelRecycler> items;

    public AdapterRecyclerGol(List<ModelRecycler> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from (viewGroup.getContext()).inflate(R.layout.custom_card,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        ModelRecycler modelRecycler = items.get(i);
        viewHolder.img.setImageResource(modelRecycler.getImg());
        viewHolder.txt.setText(modelRecycler.getName());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView txt;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.imgShow);
            txt = (TextView)itemView.findViewById(R.id.txtInfo);
        }
    }
}
