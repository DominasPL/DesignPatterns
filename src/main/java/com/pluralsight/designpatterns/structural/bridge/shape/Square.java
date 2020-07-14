package com.pluralsight.designpatterns.structural.bridge.shape;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        color.applyColor();
    }
}
