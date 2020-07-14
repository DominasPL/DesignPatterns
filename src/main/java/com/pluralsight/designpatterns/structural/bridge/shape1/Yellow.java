package com.pluralsight.designpatterns.structural.bridge.shape1;

public class Yellow implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying yellow color");
    }
}
