package com.espinas.slideshow;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Gol_Fragment extends Fragment
{
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
    }
}
