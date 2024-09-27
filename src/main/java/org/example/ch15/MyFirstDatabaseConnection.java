package org.example.ch15;

import java.sql.*;

public class MyFirstDatabaseConnection {
    public static void main(String[] args) {
        String url = "jdbc:hsqldb:file:zoo";
        try (Connection conn = DriverManager.getConnection(url,"username","password")) {
            System.out.println(conn);
            PreparedStatement ps = conn.prepareStatement("SELECT name FROM exhibits");
            ResultSet rs = ps.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
