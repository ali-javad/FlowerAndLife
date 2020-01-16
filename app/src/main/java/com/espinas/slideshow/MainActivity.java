package com.espinas.slideshow;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

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

//drawer and toggle check
        final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

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
        if (drawer.isDrawerOpen(GravityCompat.END)) {
            drawer.closeDrawer(GravityCompat.END);
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

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId())
        {
            case R.id.nav_profile: startActivity(new Intent(this,Register_Page.class));
                return true;
            //case R.id.nav_share: shareApplication();


            default: return true;


        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId())
        {
            case R.id.login_id: startActivity(new Intent(this,Login_Page.class));
            return true;

            default: return true;


        }
    }

    private void shareApplication(){

        try{
        PackageManager pm = this.getPackageManager();
        ApplicationInfo app = pm.getApplicationInfo(this.getPackageName(),0);
        String filePath = app.publicSourceDir;
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("*/*");

        File apk = new File(filePath);


            File tempFile = new File(getExternalCacheDir()+"/ExtractedApk");
            if(!tempFile.isDirectory())
            if(!tempFile.mkdirs())
            return;


            tempFile = new File(tempFile.getPath()+"/"+ getString(app.labelRes).replace("","").toLowerCase()+ ".apk");
            if(!tempFile.exists()) {
                if (!tempFile.createNewFile()) {
                    return;
                }
            }
            InputStream in = new FileInputStream(apk);
            OutputStream out = new FileOutputStream(tempFile);

            byte[] buf = new byte[1024];
            int len;

            while ((len = in.read(buf))>0){
                out.write(buf,0,len);
            }
            in.close();
            out.close();

            System.out.println("File copied.");
            intent.putExtra(Intent.EXTRA_STREAM,Uri.fromFile(tempFile));
            startActivity(Intent.createChooser(intent,"اشتراک گذاری با"));

        }
        catch (Exception e){
            Log.e("shareApp",e.getMessage());
        }


    }
}
