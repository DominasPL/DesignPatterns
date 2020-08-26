package com.pluralsight.design_patterns.behavioral.strategy;

public class Dog extends Animal {

    public Dog() {
        setFlyingType(new CantFly());
    }
}
