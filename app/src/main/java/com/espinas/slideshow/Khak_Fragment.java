package com.espinas.slideshow;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Khak_Fragment extends Fragment
{
    public static Khak_Fragment newInstance(){
        Bundle args = new Bundle();
        Khak_Fragment khak_fragment =new Khak_Fragment();
        khak_fragment.setArguments(args);
        return khak_fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View khak_view = inflater.inflate(R.layout.khakha,container,false);
        return khak_view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
