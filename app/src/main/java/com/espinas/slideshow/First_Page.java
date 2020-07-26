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

public class  First_Page extends Fragment
{

    RecyclerView startrecycler;
    ArrayList<ModelRecycler> itemStart = new ArrayList<>();
    AdapterRecyclerKhak recyclerStart;
    View start_view;
    int i=0;

    public static First_Page newInstance(){
        Bundle args = new Bundle();
        First_Page first_fragment =new First_Page();
        first_fragment.setArguments(args);
        return first_fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         start_view = inflater.inflate(R.layout.first_page,container,false);
        recyclerStart = new AdapterRecyclerKhak(itemStart);
        startrecycler = start_view.findViewById(R.id.startRecycler);
        startrecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        startrecycler.setAdapter(recyclerStart);
        if(i==0){
            showStart();
            i++;
        }

        return start_view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    private void showStart()
    {
        itemStart.add(new ModelRecycler(R.drawable.aba1,"برگ انجیری"));
        itemStart.add(new ModelRecycler(R.drawable.agl1,"آگلونما"));
        itemStart.add(new ModelRecycler(R.drawable.alo1,"آلوئورا"));
        itemStart.add(new ModelRecycler(R.drawable.amp1,"امپیشن"));
        itemStart.add(new ModelRecycler(R.drawable.ank1,"عنکبوتی"));
        itemStart.add(new ModelRecycler(R.drawable.aza1,"آزالیا"));
        itemStart.add(new ModelRecycler(R.drawable.bgo1,"بگونیا"));
        itemStart.add(new ModelRecycler(R.drawable.bid1,"برگ بیدی"));
        itemStart.add(new ModelRecycler(R.drawable.azh1,"اژدر"));
        itemStart.add(new ModelRecycler(R.drawable.bnt1,"بنت"));
        itemStart.add(new ModelRecycler(R.drawable.esh1,"عشق"));
        itemStart.add(new ModelRecycler(R.drawable.hos1,"حسن یوسف"));
        itemStart.add(new ModelRecycler(R.drawable.fit1,"فتونیا"));
        itemStart.add(new ModelRecycler(R.drawable.kho1,"خورشیدی"));
        itemStart.add(new ModelRecycler(R.drawable.kri1,"کاکتوس کریسمس"));
        itemStart.add(new ModelRecycler(R.drawable.lan1,"لانتا"));
        itemStart.add(new ModelRecycler(R.drawable.pic1,"پیچک انگلیسی"));
        itemStart.add(new ModelRecycler(R.drawable.pil1,"پیله آ"));
        itemStart.add(new ModelRecycler(R.drawable.pir1,"پیرومیا قاشقی"));
        itemStart.add(new ModelRecycler(R.drawable.pto1,"پتوس"));
        itemStart.add(new ModelRecycler(R.drawable.san1,"سانسوریا"));
        itemStart.add(new ModelRecycler(R.drawable.sar1,"سرخس شمشیری"));
        itemStart.add(new ModelRecycler(R.drawable.sek1,"سکه ای"));
        itemStart.add(new ModelRecycler(R.drawable.she1,"شیپوری هلندی"));
        itemStart.add(new ModelRecycler(R.drawable.sol1,"لیلی صلح"));
        itemStart.add(new ModelRecycler(R.drawable.ver1,"وریزیا"));
        itemStart.add(new ModelRecycler(R.drawable.kal1,"کالانکوا"));
        itemStart.add(new ModelRecycler(R.drawable.zhe1,"ژربرا دیزی"));
        itemStart.add(new ModelRecycler(R.drawable.kok1,"کوکب"));
        itemStart.add(new ModelRecycler(R.drawable.sik1,"سیکلمه"));
        itemStart.add(new ModelRecycler(R.drawable.sin1,"سینره"));
    }
}
