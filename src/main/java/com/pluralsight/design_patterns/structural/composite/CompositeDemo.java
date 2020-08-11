package com.pluralsight.design_patterns.structural.composite;

public class CompositeDemo {

    public static void main(String[] args) {

        Component hd = new Leaf(4000, "harddrive");
        Component mouse = new Leaf(100, "mouse");
        Component monitor = new Leaf(500, "monitor");
        Component ram = new Leaf(800, "ram");
        Component cpu = new Leaf(2000, "cpu");

        Composite ph = new Composite("peri");
        Composite cb = new Composite("cabinet");
        Composite mb = new Composite("motherboard");
        Composite computer = new Composite("computer");

        mb.addComponent(cpu);
        mb.addComponent(ram);

        ph.addComponent(mouse);
        ph.addComponent(monitor);
        cb.addComponent(hd);
        cb.addComponent(mb);

        computer.addComponent(ph);
        computer.addComponent(cb);

        computer.showPrice();
    }
}
