package com.example.builder1;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;

public class Brows extends Line
{
    public Brows(double startX, double startY, double endX, double endY)
    {
        super(startX, startY, endX, endY);
    }

    public Brows()
    {
        super(2,5,6,8);
    }
}
