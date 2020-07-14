package com.pluralsight.designpatterns.structural.adapter;

public class EmployeeAdapterCsv implements Employee {

    private EmployeeCSV instance;

    public EmployeeAdapterCsv(EmployeeCSV instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getId() + "";
    }

    @Override
    public String getFirstName() {
        return instance.getFirstName();
    }

    @Override
    public String getLastName() {
        return instance.getLastName();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }

    @Override
    public String toString() {
        return "id: " +
                instance.getId() +
                ", firstName: " +
                instance.getFirstName() +
                ", lastName: " +
                instance.getLastName() +
                ", email: " +
                instance.getEmailAddress();
    }
}
