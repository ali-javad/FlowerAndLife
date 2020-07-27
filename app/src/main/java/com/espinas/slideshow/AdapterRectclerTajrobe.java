package com.espinas.slideshow;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterRectclerTajrobe extends RecyclerView.Adapter<AdapterRectclerTajrobe.ViewHolder> {

    List<ModelRecycler> modelRecyclers;
    public AdapterRectclerTajrobe(List<ModelRecycler> modelRecyclers){

        this.modelRecyclers = modelRecyclers;
    }

    public AdapterRectclerTajrobe.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from((viewGroup.getContext())).inflate(R.layout.custom_card,viewGroup,false);
        return new AdapterRectclerTajrobe.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRectclerTajrobe.ViewHolder viewHolder, int i) {
        ModelRecycler modelRecycler = modelRecyclers.get(i);
        viewHolder.imgShow.setImageResource(modelRecycler.getImg());
        viewHolder.txtInfo.setText(modelRecycler.getName());

    }

    public int getItemCount() {
        return modelRecyclers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imgShow;
        TextView txtInfo;
        public ViewHolder(@NonNull View itemView){

            super(itemView);
            imgShow = itemView.findViewById(R.id.imgShow);
            txtInfo = itemView.findViewById(R.id.txtInfo);

        }
    }
}
