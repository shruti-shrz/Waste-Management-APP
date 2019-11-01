package com.example.nowaste;

public class Word {
    private int image;
    private String title;
    public Word(String n,int m)
    {
        image = m;
        title = n;
    }
    public String getTitle()
    {
        return title;
    }
    public int getimg()
    {
        return image;
    }
}
