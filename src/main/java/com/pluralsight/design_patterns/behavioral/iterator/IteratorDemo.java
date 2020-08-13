package com.pluralsight.design_patterns.behavioral.iterator;

import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {
        BikeRepository repository = new BikeRepository();

        repository.addBike("Cervelo");
        repository.addBike("Scott");
        repository.addBike("Fuji");

        Iterator<String> iterator = repository.iterator();

        while(iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
            iterator.remove();
        }


    }
}
