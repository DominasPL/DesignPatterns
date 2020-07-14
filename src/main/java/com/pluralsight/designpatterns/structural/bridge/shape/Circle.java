package com.pluralsight.designpatterns.structural.bridge.shape;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        color.applyColor();
    }
}
