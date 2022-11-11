package com.example.builder1;

public class Director {
    public Smile construct(SmileBuilder builder) {

        builder.buildHead();

        builder.buildEyes();

        builder.buildMounth();
        builder.buildBrows();

        return builder.getSmile();
    }
}
