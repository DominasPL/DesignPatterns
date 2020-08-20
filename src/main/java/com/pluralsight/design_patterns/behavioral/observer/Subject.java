package com.pluralsight.design_patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    protected List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public abstract void registerObserver(Observer observer);
    public abstract void removeObserver(Observer observer);
    public abstract void notifyObservers();
}
