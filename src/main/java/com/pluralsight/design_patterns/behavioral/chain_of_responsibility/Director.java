package com.pluralsight.design_patterns.behavioral.chain_of_responsibility;

public class Director extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println("Directors can approve conferences");
        } else {
            succesor.handleRequest(request);
        }
    }
}
