package com.espinas.slideshow;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterRecyclerDrakht extends RecyclerView.Adapter<AdapterRecyclerDrakht.ViewHolder> {

    List<ModelRecycler> modelRecyclers;


    public AdapterRecyclerDrakht(List<ModelRecycler> modelRecyclers) {
        this.modelRecyclers = modelRecyclers;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from((viewGroup.getContext())).inflate(R.layout.custom_card,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        ModelRecycler modelRecycler = modelRecyclers.get(i);
        viewHolder.imgShow.setImageResource(modelRecycler.getImg());
        viewHolder.txtInfo.setText(modelRecycler.getName());

    }

    @Override
    public int getItemCount() {
        return modelRecyclers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgShow;
        TextView txtInfo;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgShow = (ImageView) itemView.findViewById(R.id.imgShow);
            txtInfo = (TextView) itemView.findViewById(R.id.txtInfo);
        }
    }
}
