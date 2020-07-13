package com.pluralsight.singleton;

import org.apache.derby.jdbc.EmbeddedDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

public class DbSingleton {

    private static volatile DbSingleton instance;
    private static volatile Connection conn;

    private DbSingleton() {
        try {
            DriverManager.registerDriver(new EmbeddedDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (!Objects.isNull(conn)) {
            throw new RuntimeException("Use getConnection() method to create!");
        }

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

    public Connection getConnection() {
        if (Objects.isNull(conn)) {
            synchronized (DbSingleton.class) {
                if (Objects.isNull(conn)) {
                    try {
                        String dbUrl = "jdbc:derby:memory:codejave/webdb;create=true";
                        conn = DriverManager.getConnection(dbUrl);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return conn;
    }
}
