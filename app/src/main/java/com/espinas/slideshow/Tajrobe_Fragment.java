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

public class Tajrobe_Fragment extends Fragment {

    RecyclerView tajroberecycler;
    ArrayList<ModelRecycler> itemTajrobe = new ArrayList<>();
    AdapterRecyclerKhak recyclerTajrobe;
    View tajrobe_view;
    int i=0;

    public static Tajrobe_Fragment newInstance(){
        Bundle args = new Bundle();
        Tajrobe_Fragment tajrobe_fragment =new Tajrobe_Fragment();
        tajrobe_fragment.setArguments(args);
        return tajrobe_fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        tajrobe_view = inflater.inflate(R.layout.tajrobe,container,false);
        recyclerTajrobe = new AdapterRecyclerKhak(itemTajrobe);
        tajroberecycler = tajrobe_view.findViewById(R.id.tajrobeRecycler);
        tajroberecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        tajroberecycler.setAdapter(recyclerTajrobe);
        if(i==0){
            showTajrobe();
            i++;
        }

        return tajrobe_view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
    private void showTajrobe(){
        itemTajrobe.add(new ModelRecycler(R.drawable.khbarg,"خاک برگ"));
        itemTajrobe.add(new ModelRecycler(R.drawable.khros,"خاک رس"));
        itemTajrobe.add(new ModelRecycler(R.drawable.khak1,"خاک سلیتی"));
        itemTajrobe.add(new ModelRecycler(R.drawable.khak2,"خاک هوموس"));
        itemTajrobe.add(new ModelRecycler(R.drawable.khak3,"ورمی کمپوست"));
        itemTajrobe.add(new ModelRecycler(R.drawable.khak4,"پرلیت"));
        itemTajrobe.add(new ModelRecycler(R.drawable.khak5,"پیت ماس"));
        itemTajrobe.add(new ModelRecycler(R.drawable.khak6,"کود حیوانی"));
        itemTajrobe.add(new ModelRecycler(R.drawable.khak7,"کوکوپیت"));
    }
}
