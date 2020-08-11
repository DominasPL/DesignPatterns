package com.pluralsight.design_patterns.structural.bridge.shape;

public class Red implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}
