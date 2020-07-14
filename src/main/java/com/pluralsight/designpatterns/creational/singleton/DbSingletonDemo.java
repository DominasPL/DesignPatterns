package com.pluralsight.designpatterns.creational.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {

    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();

        long timeBefore;
        long timeAfter;

        Connection connection;
        Statement statement;
        try {
            System.out.println(instance);

            timeBefore = System.currentTimeMillis();
            connection = instance.getConnection();
            timeAfter = System.currentTimeMillis();
            System.out.println(timeAfter - timeBefore);

            statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE T_ADDRESS (ID INT, StreetName VARCHAR(20), City VARCHAR(20))");
            System.out.println("Table created");
            statement.close();

            timeBefore = System.currentTimeMillis();
            instance.getConnection();
            timeAfter = System.currentTimeMillis();
            System.out.println(timeAfter - timeBefore);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
