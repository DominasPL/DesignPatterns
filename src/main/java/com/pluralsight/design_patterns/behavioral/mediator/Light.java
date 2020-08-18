package com.pluralsight.design_patterns.behavioral.mediator;

//receiver
public class Light {

    private String location;
    private boolean isOn = false;

    public Light(String location) {
        this.location = location;
    }

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        if (isOn) {
            off();
            isOn = false;
        } else {
            on();
            isOn = true;
        }
    }

    public void on() {
        System.out.println(location + " Light switched on.");
    }

    public void off() {
        System.out.println(location + " Light switched off");
    }
}
