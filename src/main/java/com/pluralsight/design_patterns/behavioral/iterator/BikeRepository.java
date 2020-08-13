package com.pluralsight.design_patterns.behavioral.iterator;

import java.util.Iterator;

public class BikeRepository implements Iterable<String> {

    private String[] bikes;
    private int index;

    public BikeRepository() {
        this.bikes = new String[10];
        this.index = 0;
    }

    public void addBike(String bike) {
        if (index == bikes.length) {
            String[] largerBikes = new String[bikes.length + 5];
            System.arraycopy(bikes, 0, largerBikes, 0, largerBikes.length);
            bikes = largerBikes;
            largerBikes = null;
        }

        bikes[index] = bike;
        index++;
    }

    @Override
    public Iterator<String> iterator() {
        return new MyIterator(bikes);
    }
}
