package com.espinas.slideshow;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class ShowInformation extends AppCompatActivity implements InfoTitle {
    TextView name;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information);
        cast();
        ViewPost();
    }
    void  cast(){
       name = findViewById(R.id.txt_titleinfo);
   }
   void ViewPost(){
       Intent intent = getIntent();
      name.setText(intent.getStringExtra(title));
}
}