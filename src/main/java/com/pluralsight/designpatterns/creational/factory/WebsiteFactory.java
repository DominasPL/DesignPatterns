package com.pluralsight.designpatterns.creational.factory;

public class WebsiteFactory {

    public static Website getWebsite(WebsiteKey key) {
        switch (key) {
            case BLOG: {
                return new Blog();
            }
            case SHOP: {
                return new Shop();
            }
            default: {
                return null;
            }
        }
    }
}
