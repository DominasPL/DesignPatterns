package com.pluralsight.design_patterns.behavioral.chain_of_responsibility;

public class VP extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.PURCHASE) {
            if (request.getAmount() < 1500) {
                System.out.println("VPs can approve purchases below 1500");
            } else {
                succesor.handleRequest(request);
            }
        }
    }
}
