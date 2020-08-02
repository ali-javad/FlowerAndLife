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

import static com.espinas.slideshow.R.layout.tablokhani;

public class TabloKhani_Fragment extends Fragment {
    RecyclerView TabloRecycler;
    ArrayList<ModelRecycler> itemstablo = new ArrayList<>();
    AdapterRecyclerTablo recyclerTablo;
    View tablo_view;
    int i = 0;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public static TabloKhani_Fragment newInstance() {
        Bundle args = new Bundle();
        TabloKhani_Fragment tabloKhani_Fragment = new TabloKhani_Fragment();
        tabloKhani_Fragment.setArguments(args);
        return tabloKhani_Fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        tablo_view = inflater.inflate(tablokhani, container, false);
        recyclerTablo = new AdapterRecyclerTablo(getContext(),itemstablo);
        TabloRecycler = (RecyclerView) tablo_view.findViewById(R.id.tabloRecyclerLayout);
        TabloRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        TabloRecycler.setAdapter(recyclerTablo);
        if (i == 0) {
            showtablo();
            i++;
        }
        return tablo_view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    private void showtablo() {
        itemstablo.add(new ModelRecycler(R.drawable.ang1, "کاربرد تابلو خوانی چیست؟"));
        itemstablo.add(new ModelRecycler(R.drawable.ang1, "اعداد و ارقام مهم روی تابلو"));
        itemstablo.add(new ModelRecycler(R.drawable.ang1, "سهامدار حقیقی و حقوقی"));
        itemstablo.add(new ModelRecycler(R.drawable.ang1, "فیلتر نویسی"));
        itemstablo.add(new ModelRecycler(R.drawable.ang1, "کد به کد چیست؟"));
        itemstablo.add(new ModelRecycler(R.drawable.ang1, "قدرت خریدار و فروشنده"));
        itemstablo.add(new ModelRecycler(R.drawable.ang1, "سابقه معاملات هر سهم"));
        itemstablo.add(new ModelRecycler(R.drawable.ang1, "قیمت پایانی و آخرین معامله چیست؟"));

    }
}
