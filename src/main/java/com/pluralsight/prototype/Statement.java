package com.pluralsight.prototype;

import java.util.List;

public class Statement implements Cloneable {

    private String query;
    private List<String> parameters;
    private Record record;

    public Statement(String query, List<String> parameters, Record record) {
        this.query = query;
        this.parameters = parameters;
        this.record = record;
    }

    public Statement clone() {
        try {
            return (Statement) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getQuery() {
        return query;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public Record getRecord() {
        return record;
    }
}
