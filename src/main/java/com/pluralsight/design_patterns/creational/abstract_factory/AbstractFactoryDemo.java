package com.pluralsight.design_patterns.creational.abstract_factory;

public class AbstractFactoryDemo {

    public static void main(String[] args) {

        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(700);

        CreditCard card1 = abstractFactory.getCreditCard(CardType.GOLD);

        System.out.println(card1.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(600);

        CreditCard card2 = abstractFactory.getCreditCard(CardType.PLATINUM);

        System.out.println(card2.getClass());

    }

}
