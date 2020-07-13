package com.pluralsight.singleton;

import java.util.Objects;

public class DbSingleton {

    private static DbSingleton instance;

    private DbSingleton() {}

    public static DbSingleton getInstance() {
        if (Objects.isNull(instance)) {
            instance = new DbSingleton();
        }
        return instance;
    }
}
