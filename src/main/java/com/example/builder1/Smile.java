package com.example.builder1;

import javafx.scene.Group;

public class Smile extends Group
{
    public Smile() {

    }

    public void setHead(Head m)    {

        getChildren().add(m);

    }

    public void setMouth(Mounth m)   {

        getChildren().add(m);

    }

    public void setEyes(Eyes m)    {

        getChildren().add(m);

    }
    public void setBrows(Brows m)    {

        getChildren().add(m);

    }

    public String toString()

    {

        return new String ("Смайлик");

    }
}
