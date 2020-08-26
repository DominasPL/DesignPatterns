package com.pluralsight.design_patterns.behavioral.strategy;

public class StrategyDemo {

    public static void main(String[] args) {

        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("DOG " + sparky.tryToFly());
        System.out.println("BIRD " + tweety.tryToFly());
    }
}
