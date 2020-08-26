package com.pluralsight.design_patterns.behavioral.template;

import java.util.Arrays;
import java.util.List;

public class SandwichOfTheWeek extends Sandwich {

    private List<String> meatUsed = Arrays.asList("Salami", "Ham", "Peperroni");
    private List<String> cheeseUsed = Arrays.asList("Gouda", "Mozarella");

    @Override
    boolean customerWantsVegetables() {
        return false;
    }

    @Override
    boolean customerWantsCondiments() {
        return false;
    }

    @Override
    void addMeat() {
        System.out.println("Adding double Meat");
        System.out.print("Adding the Meat: ");
        meatUsed.forEach(m -> System.out.print(m + " "));
        System.out.print("\nAdding the Meat: ");
        meatUsed.forEach(m -> System.out.print(m + " "));
    }

    @Override
    void addCheese() {
        System.out.print("\nAdding double Cheese");
        System.out.print("\nAdding the Cheese: ");
        cheeseUsed.forEach(c -> System.out.print(c + " "));
        System.out.print("\nAdding the Cheese: ");
        cheeseUsed.forEach(c -> System.out.print(c + " "));
    }

    @Override
    void addVegetables() {
    }

    @Override
    void addCondiments() {
    }
}
