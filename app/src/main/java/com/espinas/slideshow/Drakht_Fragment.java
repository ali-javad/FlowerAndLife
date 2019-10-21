package com.espinas.slideshow;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

public class Drakht_Fragment extends Fragment
{
    public static Drakht_Fragment newInstance(){
        Bundle args = new Bundle();
        Drakht_Fragment drakht_fragment =new Drakht_Fragment();
        drakht_fragment.setArguments(args);
        return drakht_fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View drakht_view = inflater.inflate(R.layout.drakhtche,container,false);
        return drakht_view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
