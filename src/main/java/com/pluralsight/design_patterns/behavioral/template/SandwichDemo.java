package com.pluralsight.design_patterns.behavioral.template;

public class SandwichDemo {

    public static void main(String[] args) {

        Sandwich meatSandiwch = new MeatSandwich();
        Sandwich vegeSandwich = new VegeSandwich();
        Sandwich sandwichOfTheWeek = new SandwichOfTheWeek();

        meatSandiwch.makeSandwich();
        System.out.println();
        vegeSandwich.makeSandwich();
        System.out.println();
        sandwichOfTheWeek.makeSandwich();
    }
}
