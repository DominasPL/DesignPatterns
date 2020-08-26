package com.pluralsight.design_patterns.behavioral.visitor;

public interface Visitor {

    double visit(Liquor liquorItem);
    double visit(Tabacco tabaccoItem);
    double visit(Necessity necessityItem);

}
