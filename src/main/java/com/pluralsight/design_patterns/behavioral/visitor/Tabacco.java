package com.pluralsight.design_patterns.behavioral.visitor;

public class Tabacco implements Visitable {

    private double price;

    public Tabacco(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
