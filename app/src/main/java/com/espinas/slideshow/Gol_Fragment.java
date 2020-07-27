package com.espinas.slideshow;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Gol_Fragment extends Fragment
{
    RecyclerView golrecy;
    ArrayList<ModelRecycler> itemsGol = new ArrayList<>();
    AdapterRecyclerGol recyclerGol;
    RecyclerView recyclerView;
    int i =0;
    public static Gol_Fragment newInstance(){
        Bundle args = new Bundle();
        Gol_Fragment gol_fragment =new Gol_Fragment();
        gol_fragment.setArguments(args);
        return gol_fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View gol_view = inflater.inflate(R.layout.golha,container,false);
        return gol_view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView =(RecyclerView) view.findViewById(R.id.golhaRecycler);

        golrecy = (RecyclerView)view.findViewById(R.id.golhaRecycler);
        recyclerGol = new AdapterRecyclerGol(itemsGol);
        golrecy.setLayoutManager(new LinearLayoutManager(getContext()) );
        golrecy.setAdapter(recyclerGol);
        if (i==0){
        showgol();
        i++;}

    }
    private void showgol()
    {
        itemsGol.add(new ModelRecycler(R.drawable.aba1,"برگ عبایی"));

    }
    }
