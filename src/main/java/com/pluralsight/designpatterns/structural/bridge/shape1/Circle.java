package com.pluralsight.designpatterns.structural.bridge.shape1;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        color.applyColor();
    }
}
