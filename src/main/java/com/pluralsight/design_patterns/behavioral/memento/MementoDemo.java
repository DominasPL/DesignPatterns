package com.pluralsight.design_patterns.behavioral.memento;

public class MementoDemo {

    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Employee employee = new Employee();

        employee.setName("John Wick");
        employee.setAddress("111 Main Street");
        employee.setPhone("888-555-1212");

        System.out.println("Employee before save " + employee);

        careTaker.save(employee);

        employee.setPhone("111-222-333");

        careTaker.save(employee);

        System.out.println("Employee after changed phone number save: " + employee);

        employee.setPhone("444-333-444");

        careTaker.revert(employee);

        System.out.println("Reverts to last point: " + employee);

        careTaker.revert(employee);

        System.out.println("Reverted to original " + employee);
    }
}
