package com.pluralsight.designpatterns.creational.abstract_factory;

public class AmexFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType type) {
        switch (type) {
            case GOLD: {
                return new AmexGoldCreditCard();
            }
            case PLATINUM: {
                return new AmexPlatinumCreditCard();
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public Validator getValidator(CardType type) {
        switch (type) {
            case GOLD: {
                return new AmexGoldValidator();
            }
            case PLATINUM: {
                return new AmexPlatinumValidator();
            }
            default: {
                return null;
            }
        }
    }
}
