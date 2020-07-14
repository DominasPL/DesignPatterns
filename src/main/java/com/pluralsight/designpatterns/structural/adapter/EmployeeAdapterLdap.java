package com.pluralsight.designpatterns.structural.adapter;

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
        StringBuilder builder = new StringBuilder();
        builder.append("id: ");
        builder.append(instance.getCn());
        builder.append(", firstName: ");
        builder.append(instance.getSurname());
        builder.append(", lastName: ");
        builder.append(instance.getGivenName());
        builder.append(", email: ");
        builder.append(instance.getEmail());
        return builder.toString();
    }
}
