package com.example.builder1;

public class AngryBuilder implements SmileBuilder
{
    private Smile smile;

    public AngryBuilder() {

        smile = new Smile();

    }

    public void buildHead() {

        Head h=new Head();

        smile.setHead(h);

    }
    public void buildBrows() {

        Brows br=new Brows();

        smile.setBrows(br);

    }
    public void buildEyes()
    {
        Eyes eyes=new Eyes();
        smile.setEyes(eyes);

    }
    public void buildMounth()
    {
        MounthAngry mounth=new MounthAngry();
        smile.setMouth(mounth);

    }

    public Smile getSmile() {

        return smile;

    }
}
