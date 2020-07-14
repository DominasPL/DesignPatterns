package com.pluralsight.designpatterns.structural.bridge.shape1;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        color.applyColor();
    }
}
