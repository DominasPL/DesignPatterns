package com.pluralsight.design_patterns.behavioral.command;

//receiver
public class Light {

    public void on() {
        System.out.println("Light switched on.");
    }

    public void off() {
        System.out.println("Light switched off");
    }
}
