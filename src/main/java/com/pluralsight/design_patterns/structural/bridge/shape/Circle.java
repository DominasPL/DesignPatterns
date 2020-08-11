package com.pluralsight.design_patterns.structural.bridge.shape;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        color.applyColor();
    }
}
