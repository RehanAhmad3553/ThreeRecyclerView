package com.example.threerecyclerviews.ModelClass;

public class ModelClass_recycler2 {
    private String Textt;
    private int image;
private String color;

    public ModelClass_recycler2(String textt, int image, String color) {
        Textt = textt;
        this.image = image;
        this.color = color;
    }

    public String getTextt() {
        return Textt;
    }

    public int getImage() {
        return image;
    }

    public String getColor() {
        return color;
    }
}

