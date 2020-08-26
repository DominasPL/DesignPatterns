package com.pluralsight.design_patterns.behavioral.strategy;

public class Bird extends Animal {

    public Bird() {
        setFlyingType(new ItFlys());
    }
}
