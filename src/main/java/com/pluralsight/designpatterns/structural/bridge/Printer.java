package com.pluralsight.designpatterns.structural.bridge;

import java.util.List;

public abstract class Printer {

    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    abstract List<Detail> getDetails();
    abstract String getHeader();
}
