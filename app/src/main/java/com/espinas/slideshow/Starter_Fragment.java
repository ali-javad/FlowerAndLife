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

import static com.espinas.slideshow.R.layout.starter;

public class Starter_Fragment extends Fragment {
    RecyclerView StarterRecycler;
    ArrayList<ModelRecycler> itemsstarter = new ArrayList<>();
    AdapterRecyclerStarter recyclerStarter;
    View starter_view;
    int i = 0;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public static Starter_Fragment newInstance() {
        Bundle args = new Bundle();
        Starter_Fragment starter_Fragment = new Starter_Fragment();
        starter_Fragment.setArguments(args);
        return starter_Fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        starter_view = inflater.inflate(starter, container, false);
        recyclerStarter = new AdapterRecyclerStarter(itemsstarter);
        StarterRecycler = (RecyclerView) starter_view.findViewById(R.id.starterRecyclerLayout);
        StarterRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        StarterRecycler.setAdapter(recyclerStarter);
        if (i == 0) {
            showStarter();
            i++;
        }
        return starter_view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    private void showStarter() {
        itemsstarter.add(new ModelRecycler(R.drawable.ang1, "از کجا شروع کنیم؟"));

    }
}