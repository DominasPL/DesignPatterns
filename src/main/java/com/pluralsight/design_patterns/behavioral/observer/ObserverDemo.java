package com.pluralsight.design_patterns.behavioral.observer;

public class ObserverDemo {

    public static void main(String[] args) {

        Subject twitter = new Twitter();
        Observer customer1 = new Customer("Bolek");
        Observer customer2 = new Customer("Romek");
        Observer customer3 = new Customer("Grazynka");

        twitter.registerObserver(customer1);
        twitter.notifyObservers();
        twitter.removeObserver(customer1);

        twitter.removeObserver(customer2);
        twitter.notifyObservers();
        twitter.notifyObservers();

        twitter.registerObserver(customer3);
        twitter.notifyObservers();
    }
}
