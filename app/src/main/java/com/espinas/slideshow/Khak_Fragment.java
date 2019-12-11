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

public class Khak_Fragment extends Fragment
{
    RecyclerView khakrecycler;
    ArrayList<ModelRecycler> itemKhak = new ArrayList<>();
    AdapterRecyclerKhak recyclerKhak;
    View khak_view;
    int i=0;






    public static Khak_Fragment newInstance(){
        Bundle args = new Bundle();
        Khak_Fragment khak_fragment =new Khak_Fragment();
        khak_fragment.setArguments(args);
        return khak_fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        khak_view = inflater.inflate(R.layout.khakha,container,false);
        recyclerKhak = new AdapterRecyclerKhak(itemKhak);
        khakrecycler = khak_view.findViewById(R.id.khakhaRecycler);
        khakrecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        khakrecycler.setAdapter(recyclerKhak);
        if(i==0){
            showKhak();
            i++;
        }

        return khak_view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
    private void showKhak(){
        itemKhak.add(new ModelRecycler(R.drawable.khbarg,"خاک برگ"));
        itemKhak.add(new ModelRecycler(R.drawable.khros,"خاک رس"));
        itemKhak.add(new ModelRecycler(R.drawable.khak1,"خاک سلیتی"));
        itemKhak.add(new ModelRecycler(R.drawable.khak2,"خاک هوموس"));
        itemKhak.add(new ModelRecycler(R.drawable.khak3,"ورمی کمپوست"));
        itemKhak.add(new ModelRecycler(R.drawable.khak4,"پرلیت"));
        itemKhak.add(new ModelRecycler(R.drawable.khak5,"پیت ماس"));
        itemKhak.add(new ModelRecycler(R.drawable.khak6,"کود حیوانی"));
        itemKhak.add(new ModelRecycler(R.drawable.khak7,"کوکوپیت"));
    }
}
