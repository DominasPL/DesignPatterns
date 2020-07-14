package com.pluralsight.designpatterns.structural.facade;

import com.pluralsight.designpatterns.creational.singleton.DbSingleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {

    private DbSingleton instance;

    public JdbcFacade() {
        this.instance = DbSingleton.getInstance();
    }

    public int createTable() {
        int count = 0;
        try {
            Connection connection = instance.getConnection();
            Statement statement = connection.createStatement();
            count = statement.executeUpdate("CREATE TABLE T_ADDRESS " +
                    "(ID INTEGER, StreetName VARCHAR(255), City VARCHAR(255))");
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public int insertIntoTable() {
        int count = 0;
        try {
            Connection connection = instance.getConnection();
            Statement statement = connection.createStatement();
            count = statement.executeUpdate("INSERT INTO T_ADDRESS (ID, StreetName, City) " +
                    "VALUES (1, 'BigStreet', 'Hello')");
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public List<Address> getAddresses() {
        List<Address> addresses = new ArrayList<>();

        try {
            Connection connection = instance.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM T_ADDRESS");

            while(resultSet.next()) {
                System.out.println(resultSet.getInt(1) + resultSet.getString(2)
                        + resultSet.getString(3));
                Address address = new Address();
                address.setId(resultSet.getInt(1));
                address.setStreetName(resultSet.getString(2));
                address.setCity(resultSet.getString(3));
                addresses.add(address);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return addresses;
    }
}
