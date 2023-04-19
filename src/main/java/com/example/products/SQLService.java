package com.example.products;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLService {
    public static ResultSet getResult(String query) {
// getting the connection
        Connection connection = ConnectionProvider.getConnection();
        ResultSet result = null;
        try {
// creating the statement
            Statement stmt = connection.createStatement();
            if (!query.isEmpty()) {
// injecting the query
                result = stmt.executeQuery(query);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
