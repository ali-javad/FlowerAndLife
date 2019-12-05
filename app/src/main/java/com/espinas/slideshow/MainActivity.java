package com.espinas.slideshow;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    Context context = this;
    TabLayout tabLayout;
    ViewPager viewPager;
    List<Fragment> fragments;
    String [] titles;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewPager();
    }

    private void initViewPager() {
        fragments = new ArrayList<>();
        fragments.add(First_Page.newInstance());
        fragments.add(Drakht_Fragment.newInstance());
        fragments.add(Gol_Fragment.newInstance());
        fragments.add(Khak_Fragment.newInstance());

        titles = new String[]{"صفحه اصلی","انواع درختچه","گل های آپارتمانی","انواع خاک"};

        tabLayout =(TabLayout) findViewById(R.id.tabLayout_id);
        viewPager = (ViewPager)findViewById(R.id.viewPager_id);

        viewPager.setAdapter(new Fragment_adapter(getSupportFragmentManager(),fragments,titles));
        tabLayout.setupWithViewPager(viewPager);

    }
}
