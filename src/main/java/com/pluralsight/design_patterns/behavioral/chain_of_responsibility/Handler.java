package com.pluralsight.design_patterns.behavioral.chain_of_responsibility;

public abstract class Handler {

    protected Handler succesor;

    public void setSuccesor(Handler succesor) {
        this.succesor = succesor;
    }

    public abstract void handleRequest(Request request);
}
