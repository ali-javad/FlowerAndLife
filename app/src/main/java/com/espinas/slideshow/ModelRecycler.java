package com.espinas.slideshow;

public class ModelRecycler {
    int img;
    String name;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ModelRecycler(int img, String name) {
        this.img = img;
        this.name = name;
    }
}
