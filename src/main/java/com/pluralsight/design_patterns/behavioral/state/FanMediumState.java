package com.pluralsight.design_patterns.behavioral.state;

public class FanMediumState extends State {

    private Fan fan;

    public FanMediumState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan to high");
        fan.setState(fan.getFanHighState());
    }

    @Override
    public String toString() {
        return "Fan is medium";
    }
}
