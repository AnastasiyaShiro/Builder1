package com.example.builder1;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class Eyes extends Circle
{
    public Eyes(double centerX, double centerY, double radius, Paint fill) {
        super(centerX, centerY, radius);
    }

    public Eyes() {
        super(5, 10, 11, Color.BLUE);
    }
}
