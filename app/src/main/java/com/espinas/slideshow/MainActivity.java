package com.espinas.slideshow;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    Context context = this;
    TabLayout tabLayout;
    ViewPager viewPager;
    List<Fragment> fragments;
    String [] titles;
    Toolbar toolbar;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);
        initViewPager();


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    private void initViewPager() {
        fragments = new ArrayList<>();
        fragments.add(Starter_Fragment.newInstance());
        fragments.add(Tecnical_Fragment.newInstance());
        fragments.add(Fandamental_Fragment.newInstance());
        fragments.add(TabloKhani_Fragment.newInstance());
        fragments.add(Tajrobe_Fragment.newInstance());

        titles = new String[]{"گام آغازین بورس","تحلیل تکنیکال","تحلیل بنیادی","تابلو خوانی","روانشناسی بازار"};

        tabLayout =(TabLayout) findViewById(R.id.tabLayout_id);
        viewPager = (ViewPager)findViewById(R.id.viewPager_id);

        viewPager.setAdapter(new Fragment_adapter(getSupportFragmentManager(),fragments,titles));
        tabLayout.setupWithViewPager(viewPager);

    }

  @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId())
        {

            case R.id.nav_aboutUs : startActivity(new Intent(this,AboutUsActivity.class));
                return true;
            case R.id.nav_exit: exitAppEvent();
                return true;
            default: return true;

        }

    }

    public void exitAppEvent(){

        AlertDialog.Builder hoshdar = new AlertDialog.Builder(MainActivity.this);

        hoshdar.setTitle("هشدار");
        hoshdar.setMessage("آیا قصد خروج از برنامه را دارید؟");

        hoshdar.setPositiveButton("بله", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        hoshdar.setNegativeButton("خیر", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        hoshdar.show();
    }


}
