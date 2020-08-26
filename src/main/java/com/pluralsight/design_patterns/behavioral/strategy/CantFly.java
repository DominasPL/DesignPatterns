package com.pluralsight.design_patterns.behavioral.strategy;

public class CantFly implements Fly {

    @Override
    public String fly() {
        return "Can't fly";
    }
}
