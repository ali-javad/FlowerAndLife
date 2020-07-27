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

import static com.espinas.slideshow.R.layout.tecnical;

public class Tecnical_Fragment extends Fragment
{
    RecyclerView tecnicalrecycler;
    ArrayList<ModelRecycler> itemsTecnical = new ArrayList<>();
    AdapterRecyclerTecnical recyclerTecnical;
    View tecnical_view;
    int i=0;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public static Tecnical_Fragment newInstance(){
        Bundle args = new Bundle();
        Tecnical_Fragment tecnical_Fragment =new Tecnical_Fragment();
        tecnical_Fragment.setArguments(args);
        return tecnical_Fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        tecnical_view = inflater.inflate(tecnical,container,false);
        recyclerTecnical = new AdapterRecyclerTecnical(itemsTecnical);
        tecnicalrecycler = (RecyclerView) tecnical_view.findViewById(R.id.tecnicalRecyclerLayout);
        tecnicalrecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        tecnicalrecycler.setAdapter(recyclerTecnical);
        if (i==0){
            showTecnical();
            i++;}
        return tecnical_view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
    private void showTecnical()
    {
        itemsTecnical.add(new ModelRecycler(R.drawable.ang1,"تکنیکال چیست؟"));

    }
}
