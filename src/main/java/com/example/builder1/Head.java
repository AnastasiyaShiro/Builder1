package com.example.builder1;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class Head extends Circle
{
    public Head(double radius, Paint fill)
    {
        super(radius, fill);
    }
    public Head() {

        super(50,Color.YELLOW);

    }
}
