package com.pluralsight.design_patterns.behavioral.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class MyIterator implements Iterator<String> {

    private int currentIndex;
    private String[] bikes;

    public MyIterator(String[] bikes) {
        this.currentIndex = 0;
        this.bikes = bikes;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < bikes.length && bikes[currentIndex] != null;
    }

    @Override
    public String next() {
        return bikes[currentIndex++];
    }

    @Override
    public void remove() {
        bikes[currentIndex - 1] = null;
        bikes = Arrays.stream(bikes)
                .filter(b -> !Objects.isNull(b))
                .toArray(size -> new String[bikes.length - 1]);
        currentIndex--;
    }
}
