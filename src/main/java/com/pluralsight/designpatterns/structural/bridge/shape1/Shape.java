package com.pluralsight.designpatterns.structural.bridge.shape1;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void applyColor();
}
