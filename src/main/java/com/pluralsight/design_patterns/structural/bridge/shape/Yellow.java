package com.pluralsight.design_patterns.structural.bridge.shape;

public class Yellow implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying yellow color");
    }
}
