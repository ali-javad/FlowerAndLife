package com.espinas.slideshow;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterRecyclerFandamental extends RecyclerView.Adapter<AdapterRecyclerFandamental.ViewHolder> implements InfoTitle{
    Context context;
    List<ModelRecycler> modelRecyclers;


    public AdapterRecyclerFandamental(Context context,List<ModelRecycler> modelRecyclers) {
        this.context = context;
        this.modelRecyclers = modelRecyclers;
    }

    @NonNull
    @Override
    public AdapterRecyclerFandamental.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from((viewGroup.getContext())).inflate(R.layout.custom_card,viewGroup,false);
        return new AdapterRecyclerFandamental.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecyclerFandamental.ViewHolder viewHolder, int i) {

        final ModelRecycler modelRecycler = modelRecyclers.get(i);
        viewHolder.imgShow.setImageResource(modelRecycler.getImg());
        viewHolder.txtInfo.setText(modelRecycler.getName());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,ShowInformation.class);
                intent.putExtra(title ,modelRecycler.getName());
                context.startActivity(intent);
            }
        });

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
