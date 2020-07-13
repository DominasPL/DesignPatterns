package com.pluralsight.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {

    public static void main(String[] args) {

        String query = "SELECT * FROM MOVIES WHERE TITLE = ?";

        List<String> parameters = new ArrayList<>();

        parameters.add("Star wars");

        Record record = new Record();

        Statement firstStatement = new Statement(query, parameters, record);
        System.out.println(firstStatement);
        System.out.println(firstStatement.getQuery());
        System.out.println(firstStatement.getParameters());
        System.out.println(firstStatement.getRecord());

        System.out.println();
        System.out.println();

        Statement secondStatement = firstStatement.clone();
        System.out.println(secondStatement);
        System.out.println(secondStatement.getQuery());
        System.out.println(secondStatement.getParameters());
        System.out.println(secondStatement.getRecord());
    }
}
