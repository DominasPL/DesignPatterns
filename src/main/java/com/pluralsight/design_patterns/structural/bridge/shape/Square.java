package com.pluralsight.design_patterns.structural.bridge.shape;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        color.applyColor();
    }
}
