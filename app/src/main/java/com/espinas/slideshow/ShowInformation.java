package com.espinas.slideshow;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;


public class ShowInformation extends AppCompatActivity implements InfoTitle {
    TextView name,txtinfo;
    int i;
    String s,str;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information);
        cast();
        ViewPost();

        switch (s){
            case "از کجا شروع کنیم؟":{
                 str = ReadFromfile("shoroee.txt", this);
                break;
            }
            case "انواع کارگزاری ها":{
                 str = ReadFromfile("kargozari.txt", this);
                break;
            }
            case "انواع بازارهای مالی":{
                 str = ReadFromfile("bazarMali.txt", this);
                break;
            }
            case "انواع استراتژی ها":{
                 str = ReadFromfile("stratzhi.txt", this);
                break;
            }
            case "انواع روش تحلیل":{
                 str = ReadFromfile("tahlil.txt", this);
                break;
            }
            case "روش انتخاب سهم":{
                str = ReadFromfile("entekhab.txt", this);
                break;
            }
            case "فاندامنتال چیست؟":{
                str = ReadFromfile("fand.txt", this);
                break;
            }
            case "معرفی P/E و DPS":{
                str = ReadFromfile("moarfi.txt", this);
                break;
            }
            case "صورت های مالی شرکت ها":{
                str = ReadFromfile("sorat.txt", this);
                break;
            }
            case "ارزش جایگزینی و مارکت سهم":{
                str = ReadFromfile("arzesh.txt", this);
                break;
            }/*
            case "کاربرد تابلو خوانی چیست؟":{
                str = ReadFromfile("entekhab.txt", this);
                break;
            }
            case "اعداد و ارقام مهم روی تابلو":{
                str = ReadFromfile("entekhab.txt", this);
                break;
            }
            case "سهامدار حقیقی و حقوقی":{
                str = ReadFromfile("entekhab.txt", this);
                break;
            }
            case "فیلتر نویسی":{
                str = ReadFromfile("entekhab.txt", this);
                break;
            }
            case "کد به کد چیست؟":{
                str = ReadFromfile("entekhab.txt", this);
                break;
            }
            case "قدرت خریدار و فروشنده":{
                str = ReadFromfile("entekhab.txt", this);
                break;
            }
            case "سابقه معاملات هر سهم":{
                str = ReadFromfile("entekhab.txt", this);
                break;
            }
            case "قیمت پایانی و آخرین معامله چیست؟":{
                str = ReadFromfile("entekhab.txt", this);
                break;
            }*/
            case "تجارب":{
                str = ReadFromfile("tajarob.txt", this);
                break;
            }
            case "بهترین زمان خرید و فروش":{
                str = ReadFromfile("zaman.txt", this);
                break;
            }
            case "فمو یا ترس":{
                str = ReadFromfile("fomo.txt", this);
                break;
            }
            case "اختلاف پایانی با آخرین معامله":{
                str = ReadFromfile("ekhtelaf.txt", this);
                break;
            }
            case "بهترین روش یادگیری":{
                str = ReadFromfile("yadgiri.txt", this);
                break;
            }
            case "سخن پایانی با دوستان":{
                str = ReadFromfile("payani.txt", this);
                break;
            }

        }

        txtinfo = findViewById(R.id.txtinformation);
        txtinfo.setText(str);
    }
    void  cast(){
       name = findViewById(R.id.txt_titleinfo);
   }
   void ViewPost(){
       Intent intent = getIntent();
      name.setText(intent.getStringExtra(title));
      s = intent.getStringExtra(title);
}


    public String ReadFromfile(String fileName, Context context) {
        StringBuilder returnString = new StringBuilder();
        InputStream fIn = null;
        InputStreamReader isr = null;
        BufferedReader input = null;
        try {
            fIn = context.getResources().getAssets()
                    .open(fileName, Context.MODE_WORLD_READABLE);
            isr = new InputStreamReader(fIn);
            input = new BufferedReader(isr);
            String line = "";
            boolean firstRow = true;
            while ((line = input.readLine()) != null) {
                if(firstRow){ // first row
                    returnString.append(line);
                    firstRow = false;
                }else{
                    returnString.append("\n"+line);
                }
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (isr != null)
                    isr.close();
                if (fIn != null)
                    fIn.close();
                if (input != null)
                    input.close();
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
        return returnString.toString();
    }

}