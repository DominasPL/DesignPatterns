package com.pluralsight.design_patterns.behavioral.template;

import java.util.Arrays;
import java.util.List;

public class MeatSandwich extends Sandwich {

    private List<String> meatUsed = Arrays.asList("Salami", "Ham", "Peperroni");
    private List<String> cheeseUsed = Arrays.asList("Gouda", "Mozarella");
    private List<String> vegetablesUsed = Arrays.asList("Lettuce", "Tomato", "Onion");
    private List<String> condimentsUsed = Arrays.asList("Oil", "Vinegar");

    @Override
    void addMeat() {
        System.out.print("Adding the Meat: ");
        meatUsed.forEach(m -> System.out.print(m + " "));
    }

    @Override
    void addCheese() {
        System.out.print("\nAdding the Cheese: ");
        cheeseUsed.forEach(c -> System.out.print(c + " "));
    }

    @Override
    void addVegetables() {
        System.out.print("\nAdding the Vegetables: ");
        vegetablesUsed.forEach(v -> System.out.print(v + " "));
    }

    @Override
    void addCondiments() {
        System.out.print("\nAdding the Condiments: ");
        condimentsUsed.forEach(c -> System.out.print(c + " "));
    }
}
