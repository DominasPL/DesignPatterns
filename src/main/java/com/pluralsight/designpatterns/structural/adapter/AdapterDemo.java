package com.pluralsight.designpatterns.structural.adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterDemo {

    public static void main(String[] args) {

        Integer[] intArray = new Integer[] {42, 43, 55, 66};
        List<Integer> listOfInts = Arrays.asList(intArray);
        System.out.println(intArray);
        System.out.println(listOfInts);

    }

}
