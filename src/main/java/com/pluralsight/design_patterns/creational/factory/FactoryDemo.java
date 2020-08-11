package com.pluralsight.design_patterns.creational.factory;

public class FactoryDemo {

    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite(WebsiteKey.BLOG);
        System.out.println(site.getPages());
        site = WebsiteFactory.getWebsite(WebsiteKey.SHOP);
        System.out.println(site.getPages());
    }

}
