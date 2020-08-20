package com.pluralsight.design_patterns.behavioral.observer;

public class Twitter extends Subject {

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.remove(observer)) {
            System.out.println("Customer " + observer.getNickname() + " deleted");
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }
}
