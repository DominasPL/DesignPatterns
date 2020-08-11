package com.pluralsight.design_patterns.structural.adapter;

import java.util.StringTokenizer;

public class EmployeeCSV {

    private int id;
    private String firstName;
    private String lastName;
    private String emailAddress;

    public EmployeeCSV(String values) {
        StringTokenizer tokenizer = new StringTokenizer(values, ",");
        if (tokenizer.hasMoreElements()) {
            id = Integer.parseInt(tokenizer.nextToken().trim());
        }
        if (tokenizer.hasMoreElements()) {
            firstName = tokenizer.nextToken().trim();
        }
        if (tokenizer.hasMoreElements()) {
            lastName = tokenizer.nextToken().trim();
        }
        if (tokenizer.hasMoreElements()) {
            emailAddress = tokenizer.nextToken().trim();
        }
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }


}
