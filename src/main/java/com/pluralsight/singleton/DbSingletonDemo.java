package com.pluralsight.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {

    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();

        long timeBefore = 0;
        long timeAfter = 0;

        System.out.println(instance);

        timeBefore = System.currentTimeMillis();
        Connection connection = instance.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println(timeAfter - timeBefore);

        Statement statement;
        try {
            statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE T_ADDRESS (ID INT, StreetName VARCHAR(20), City VARCHAR(20))");
            System.out.println("Table created");
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        timeBefore = System.currentTimeMillis();
        instance.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println(timeAfter - timeBefore);

    }
}
