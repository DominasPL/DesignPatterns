package com.pluralsight.design_patterns.behavioral.state;

public class FanHighState extends State {

    private Fan fan;

    public FanHighState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan to off");
        fan.setState(fan.getFanOffState());
    }

    @Override
    public String toString() {
        return "Fan is high";
    }
}
