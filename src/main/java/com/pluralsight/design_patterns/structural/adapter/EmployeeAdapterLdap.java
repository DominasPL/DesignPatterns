package com.pluralsight.design_patterns.structural.adapter;

public class EmployeeAdapterLdap implements Employee {

    private EmployeeLdap instance;

    public EmployeeAdapterLdap(EmployeeLdap instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getEmail();
    }

    @Override
    public String toString() {
        return "id: " +
                instance.getCn() +
                ", firstName: " +
                instance.getSurname() +
                ", lastName: " +
                instance.getGivenName() +
                ", email: " +
                instance.getEmail();
    }
}
