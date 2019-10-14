package com.espinas.slideshow;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;



public class SlideShow extends PagerAdapter {

    private Context context;
    LayoutInflater inflater;


    public int[] images ={
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5
    };


    public SlideShow(Context context) {
        this.context = context;
    }


    @Override
    public int getCount() {

        return images.length;
    }


    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return (view==(LinearLayout)o);
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {

       inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       View view = inflater.inflate(R.layout.slideshow,container,false);

        final ImageView img = (ImageView) view.findViewById(R.id.imageView_id);
        img.setImageResource(images[position]);


        container.addView(view);
       return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0 : return "درباره ما";
            case 1 : return "درختچه ها";
            case 2 : return "گلهای آپارتمانی";
            case 3 : return "علاقه مندی های";
            case 4 : return "انواع خاک";
            default: return "";
        }
    }
}
