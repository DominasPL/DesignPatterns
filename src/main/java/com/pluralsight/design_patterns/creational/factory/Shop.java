package com.pluralsight.design_patterns.creational.factory;

public class Shop extends Website {

    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new SearchPage());
        pages.add(new ContactPage());
    }
}