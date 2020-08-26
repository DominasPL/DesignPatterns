package com.pluralsight.design_patterns.behavioral.visitor;

public interface Visitable {
    double accept(Visitor visitor);
}
