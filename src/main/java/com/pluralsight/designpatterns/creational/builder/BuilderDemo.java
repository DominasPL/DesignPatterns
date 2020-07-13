package com.pluralsight.designpatterns.creational.builder;

public class BuilderDemo {

    public static void main(String[] args) {
        LunchOrder lunchOrder = LunchOrder.builder()
                .withBread("White")
                .withCondiments("Lettuce")
                .build();

        System.out.println(lunchOrder);

    }
}
