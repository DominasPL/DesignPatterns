package com.pluralsight.design_patterns.behavioral.visitor;

public class VisitorDemo {

    public static void main(String[] args) {
        Visitor taxVisitor = new TaxVisitor();
        Visitor taxHolidayVisitor = new TaxHolidayVisitor();

        Liquor vodka = new Liquor(11.99);
        Tabacco cigars = new Tabacco(19.99);
        Necessity milk = new Necessity(3.47);

        System.out.println(vodka.accept(taxVisitor));
        System.out.println(cigars.accept(taxVisitor));
        System.out.println(milk.accept(taxVisitor));

        System.out.println("\nHOLIDAY PRICES\n");

        System.out.println(vodka.accept(taxHolidayVisitor));
        System.out.println(cigars.accept(taxHolidayVisitor));
        System.out.println(milk.accept(taxHolidayVisitor));
    }
}
