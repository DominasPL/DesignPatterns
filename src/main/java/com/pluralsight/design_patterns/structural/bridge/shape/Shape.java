package com.pluralsight.design_patterns.structural.bridge.shape;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void applyColor();
}
