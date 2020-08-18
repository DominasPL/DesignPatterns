package com.pluralsight.design_patterns.behavioral.mediator;

//concrete colleague
public class TurnOnAllLightsColleague implements Colleague {

    private Mediator mediator;

    public TurnOnAllLightsColleague(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOnAllLights();
    }
}
