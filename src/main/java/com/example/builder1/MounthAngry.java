package com.example.builder1;

import javafx.scene.shape.Arc;

public class MounthAngry extends Mounth
{
    public MounthAngry(double centerX, double centerY, double radiusX, double radiusY, double startAngle, double length) {
        super(centerX, centerY, radiusX, radiusY, startAngle, length);
    }

    public MounthAngry() {
        super(30,20,85,50,82,70);
    }
}
