package com.pluralsight.design_patterns.behavioral.observer;

public class Customer implements Observer {

    private String nickname;

    public Customer(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public void update() {
        System.out.println(nickname + " - There is a new message on Twitter");
    }

    @Override
    public String getNickname() {
        return this.nickname;
    }
}
