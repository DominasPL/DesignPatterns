package com.pluralsight.designpatterns.structural.bridge.shape;

public class Blue implements Color {

    @Override
    public void applyColor() {
        System.out.println("Applying blue color");
    }
}
