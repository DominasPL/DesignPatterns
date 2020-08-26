package com.pluralsight.design_patterns.behavioral.template;

import java.util.Arrays;
import java.util.List;

public class VegeSandwich extends Sandwich {

    private List<String> vegetablesUsed = Arrays.asList("Lettuce", "Tomato", "Onion");
    private List<String> condimentsUsed = Arrays.asList("Oil", "Vinegar");

    @Override
    boolean customerWantsMeat() {
        return false;
    }

    @Override
    boolean customerWantsCheese() {
        return false;
    }

    @Override
    void addMeat() {}

    @Override
    void addCheese() {}

    @Override
    void addVegetables() {
        System.out.print("Adding the Vegetables: ");
        vegetablesUsed.forEach(v -> System.out.print(v + " "));
    }

    @Override
    void addCondiments() {
        System.out.print("\nAdding the Condiments: ");
        condimentsUsed.forEach(c -> System.out.print(c + " "));
    }
}
