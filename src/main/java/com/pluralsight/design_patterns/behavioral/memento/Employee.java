package com.pluralsight.design_patterns.behavioral.memento;

import java.io.Serializable;

//originator
public class Employee {

    private String name;
    private String address;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public EmployeeMemento save() {
        return new EmployeeMemento(name, phone);
    }

    public void revert(EmployeeMemento employee) {
        this.name = employee.getName();
        this.phone = employee.getPhone();
    }

    @Override
    public String toString() {
        return this.name + " : " + this.phone;
    }
}
