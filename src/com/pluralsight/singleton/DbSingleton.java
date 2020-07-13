package com.pluralsight.singleton;

import java.util.Objects;

public class DbSingleton {

    private static volatile DbSingleton instance;

    private DbSingleton() {
        if (!Objects.isNull(instance)) {
            throw new RuntimeException("Use getInstance() method to create!");
        }
    }

    public static DbSingleton getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (DbSingleton.class) {
                if (Objects.isNull(instance)) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }
}
