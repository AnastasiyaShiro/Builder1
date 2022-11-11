package com.example.builder1;

import javafx.scene.shape.Arc;

public class Mounth extends Arc
{
    public Mounth(double centerX, double centerY, double radiusX, double radiusY, double startAngle, double length) {
        super(centerX, centerY, radiusX, radiusY, startAngle, length);
    }

    public Mounth() {
        super(10,50,25,30,22,60);
    }
}
