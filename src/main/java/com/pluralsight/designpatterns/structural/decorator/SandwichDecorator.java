package com.pluralsight.designpatterns.structural.decorator;

public abstract class SandwichDecorator implements Sandwich {

    private Sandwich customSandwich;

    public SandwichDecorator(Sandwich customSandwich) {
        this.customSandwich = customSandwich;
    }

    @Override
    public String make() {
        return customSandwich.make();
    }
}
