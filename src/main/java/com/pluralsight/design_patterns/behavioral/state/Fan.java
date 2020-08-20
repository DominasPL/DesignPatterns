package com.pluralsight.design_patterns.behavioral.state;

public class Fan {

    private State fanOffState;
    private State fanLowState;
    private State fanMediumState;
    private State fanHighState;

    private State state;

    public Fan() {
        this.fanOffState = new FanOffState(this);
        this.fanLowState = new FanLowState(this);
        this.fanMediumState = new FanMediumState(this);
        this.fanHighState = new FanHighState(this);

        state = fanOffState;
    }

    public void pullChain() {
        state.handleRequest();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getFanOffState() {
        return fanOffState;
    }

    public State getFanLowState() {
        return fanLowState;
    }

    public State getFanMediumState() {
        return fanMediumState;
    }

    public State getFanHighState() {
        return fanHighState;
    }

    @Override
    public String toString() {
        return state.toString();
    }
}
