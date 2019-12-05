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
        itemsGol.add(new ModelRecycler(R.drawable.aba1,"برگ انجیری"));
        itemsGol.add(new ModelRecycler(R.drawable.agl1,"آگلونما"));
        itemsGol.add(new ModelRecycler(R.drawable.alo1,"آلوئورا"));
        itemsGol.add(new ModelRecycler(R.drawable.amp1,"امپیشن"));
        itemsGol.add(new ModelRecycler(R.drawable.ank1,"عنکبوتی"));
        itemsGol.add(new ModelRecycler(R.drawable.aza1,"آزالیا"));
        itemsGol.add(new ModelRecycler(R.drawable.bgo1,"بگونیا"));
        itemsGol.add(new ModelRecycler(R.drawable.bid1,"برگ بیدی"));
        itemsGol.add(new ModelRecycler(R.drawable.azh1,"اژدر"));
        itemsGol.add(new ModelRecycler(R.drawable.bnt1,"بنت"));
        itemsGol.add(new ModelRecycler(R.drawable.esh1,"عشق"));
        itemsGol.add(new ModelRecycler(R.drawable.hos1,"حسن یوسف"));
        itemsGol.add(new ModelRecycler(R.drawable.fit1,"فتونیا"));
        itemsGol.add(new ModelRecycler(R.drawable.kho1,"خورشیدی"));
        itemsGol.add(new ModelRecycler(R.drawable.kri1,"کاکتوس کریسمس"));
        itemsGol.add(new ModelRecycler(R.drawable.lan1,"لانتا"));
        itemsGol.add(new ModelRecycler(R.drawable.pic1,"پیچک انگلیسی"));
        itemsGol.add(new ModelRecycler(R.drawable.pil1,"پیله آ"));
        itemsGol.add(new ModelRecycler(R.drawable.pir1,"پیرومیا قاشقی"));
        itemsGol.add(new ModelRecycler(R.drawable.pto1,"پتوس"));
        itemsGol.add(new ModelRecycler(R.drawable.san1,"سانسوریا"));
        itemsGol.add(new ModelRecycler(R.drawable.sar1,"سرخس شمشیری"));
        itemsGol.add(new ModelRecycler(R.drawable.sek1,"سکه ای"));
        itemsGol.add(new ModelRecycler(R.drawable.she1,"شیپوری هلندی"));
        itemsGol.add(new ModelRecycler(R.drawable.sol1,"لیلی صلح"));
        itemsGol.add(new ModelRecycler(R.drawable.ver1,"وریزیا"));
        itemsGol.add(new ModelRecycler(R.drawable.kal1,"کالانکوا"));
        itemsGol.add(new ModelRecycler(R.drawable.zhe1,"ژربرا دیزی"));
        itemsGol.add(new ModelRecycler(R.drawable.kok1,"کوکب"));
        itemsGol.add(new ModelRecycler(R.drawable.sik1,"سیکلمه"));
        itemsGol.add(new ModelRecycler(R.drawable.sin1,"سینره"));
    }
    }
