package com.pluralsight.design_patterns.behavioral.template;

public abstract class Sandwich {

    public final void makeSandwich() {
        prepareSandwich();
        if (customerWantsMeat()) {
            addMeat();
        }
        if (customerWantsCheese()) {
            addCheese();
        }
        if (customerWantsVegetables()) {
            addVegetables();
        }
        if (customerWantsCondiments()) {
            addCondiments();
        }
        informClient();
    }

    public void prepareSandwich() {
        System.out.println("Your sandwich is preparing");
    }

    public void informClient() {
        System.out.println("\nYour sandwich is ready to pick up");
    }

    boolean customerWantsMeat() {
        return true;
    }

    boolean customerWantsCheese() {
        return true;
    }

    boolean customerWantsVegetables() {
        return true;
    }

    boolean customerWantsCondiments() {
        return true;
    }

    abstract void addMeat();
    abstract void addCheese();
    abstract void addVegetables();
    abstract void addCondiments();
}
