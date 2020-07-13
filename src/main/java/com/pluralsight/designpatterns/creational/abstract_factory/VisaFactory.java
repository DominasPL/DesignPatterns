package com.pluralsight.designpatterns.creational.abstract_factory;

public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType type) {
        switch (type) {
            case GOLD: {
                return new VisaGoldCreditCard();
            }
            case PLATINUM: {
                return new VisaPlatinumCreditCard();
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
                return new VisaGoldValidator();
            }
            case PLATINUM: {
                return new VisaPlatinumValidator();
            }
            default: {
                return null;
            }
        }
    }
}
