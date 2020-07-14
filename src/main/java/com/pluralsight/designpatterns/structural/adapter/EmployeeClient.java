package com.pluralsight.designpatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {

        List<Employee> employees = new ArrayList<>();
        Employee employeeFromDb = new EmployeeDb("1234", "John", "Wick", "john@wick.pl");

        EmployeeLdap employeeLdap = new EmployeeLdap("bw45", "Solo", "Harry", "soloharry@gmail.com");
        employees.add(employeeFromDb);
        employees.add(new EmployeeAdapterLdap(employeeLdap));

        return employees;
    }
}
