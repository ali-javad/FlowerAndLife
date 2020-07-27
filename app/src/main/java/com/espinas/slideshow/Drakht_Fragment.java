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
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.zip.Inflater;

import static com.espinas.slideshow.R.layout.drakhtche;

public class Drakht_Fragment extends Fragment
{
    RecyclerView drakhtrecycler;
    ArrayList<ModelRecycler> itemsDrakht = new ArrayList<>();
    AdapterRecyclerDrakht recyclerDrakht;
    View drakht_view;
    int i=0;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        }

    public static Drakht_Fragment newInstance(){
        Bundle args = new Bundle();
        Drakht_Fragment drakht_fragment =new Drakht_Fragment();
        drakht_fragment.setArguments(args);
        return drakht_fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        drakht_view = inflater.inflate(drakhtche,container,false);
        recyclerDrakht = new AdapterRecyclerDrakht(itemsDrakht);
        drakhtrecycler = (RecyclerView) drakht_view.findViewById(R.id.drakhtcheRecyclerLayout);
        drakhtrecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        drakhtrecycler.setAdapter(recyclerDrakht);
        if (i==0){
        showDrakht();
        i++;}
        return drakht_view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
    private void showDrakht()
    {
        itemsDrakht.add(new ModelRecycler(R.drawable.ang1,"برگ انجیری"));

    }


}
