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

import static com.espinas.slideshow.R.layout.fandamental;


public class Fandamental_Fragment extends Fragment {
    RecyclerView FandamentalRecycler;
    ArrayList<ModelRecycler> itemsFandamental = new ArrayList<>();
    AdapterRecyclerFandamental recyclerFandamental;
    View fandamental_view;
    int i = 0;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public static Fandamental_Fragment newInstance() {
        Bundle args = new Bundle();
        Fandamental_Fragment fandamental_Fragment = new Fandamental_Fragment();
        fandamental_Fragment.setArguments(args);
        return fandamental_Fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fandamental_view = inflater.inflate(fandamental, container, false);
        recyclerFandamental = new AdapterRecyclerFandamental(getContext(),itemsFandamental);
        FandamentalRecycler = (RecyclerView) fandamental_view.findViewById(R.id.fandamentalRecyclerLayout);
        FandamentalRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        FandamentalRecycler.setAdapter(recyclerFandamental);
        if (i == 0) {
            showStarter();
            i++;
        }
        return fandamental_view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    private void showStarter() {
        itemsFandamental.add(new ModelRecycler(R.drawable.ang1, "فاندامنتال چیست؟"));
        itemsFandamental.add(new ModelRecycler(R.drawable.ang1, "معرفی P/E و DPS"));
        itemsFandamental.add(new ModelRecycler(R.drawable.ang1, "صورت های مالی شرکت ها"));
        itemsFandamental.add(new ModelRecycler(R.drawable.ang1, "ارزش جایگزینی و مارکت سهم"));

    }
}
