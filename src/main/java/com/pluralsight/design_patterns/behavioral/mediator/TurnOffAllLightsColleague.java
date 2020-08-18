package com.pluralsight.design_patterns.behavioral.mediator;

public class TurnOffAllLightsColleague implements Colleague {

    private Mediator mediator;

    public TurnOffAllLightsColleague(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOffAllLights();
    }
}
