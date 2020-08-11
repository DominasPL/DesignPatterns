package com.pluralsight.design_patterns.behavioral.chain_of_responsibility;

public class CEO extends Handler {

    @Override
    public void handleRequest(Request request) {
        System.out.println("Ceos can approve anything they want");
    }
}
