package com.pluralsight.design_patterns.structural.facade;

import java.util.List;

public class FacadeDemo {

    public static void main(String[] args) {

        JdbcFacade jdbcFacade = new JdbcFacade();
        jdbcFacade.createTable();
        System.out.println("Table created");

        jdbcFacade.insertIntoTable();
        System.out.println("Record inserted");

        List<Address> addresses = jdbcFacade.getAddresses();
        addresses.forEach(a -> System.out.println(a.getId() + " " + a.getStreetName() + " " + a.getCity()));
    }

}
