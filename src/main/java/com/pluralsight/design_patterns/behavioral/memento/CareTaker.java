package com.pluralsight.design_patterns.behavioral.memento;

import java.util.Stack;

//caretaker
public class CareTaker {

    private Stack<EmployeeMemento> employeeHistory = new Stack<>();

    public void save(Employee employee) {
        employeeHistory.push(employee.save());
    }

    public void revert(Employee employee) {
        employee.revert(employeeHistory.pop());
    }

}
