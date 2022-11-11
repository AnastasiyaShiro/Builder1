package com.example.builder1;

public class GoodBuilder implements SmileBuilder
{
    private Smile smile;

    public GoodBuilder() {

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
        Mounth mounth=new Mounth();
        smile.setMouth(mounth);

    }

    public Smile getSmile() {

        return smile;

    }
}
