package com.pluralsight.designpatterns.structural.bridge.shape1;

public class Red implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}
