package com.example.products;

import org.jooq.impl.DSL;

import java.sql.*;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionProvider {
    private static Connection connection;
    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    // Connection URL
    private static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/hotel_mis?allowPublicKeyRetrieval=true&useSSL=false";
    // your user name
    private static final String USERNAME = "root";
    // your password
    private static final String PASSWORD = "root";
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER_NAME);
            connection = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
