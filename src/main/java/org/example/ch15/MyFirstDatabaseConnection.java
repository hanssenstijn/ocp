package org.example.ch15;

import java.sql.*;

public class MyFirstDatabaseConnection {
    public static void main(String[] args) {
        var updateSql = "UPDATE exhibits SET name = '' WHERE name = 'None'";

        String url = "jdbc:hsqldb:file:zoo";
        try (Connection conn = DriverManager.getConnection(url,"username","password")) {
            System.out.println(conn);
            PreparedStatement ps = conn.prepareStatement("SELECT name FROM exhibits");
            ps.executeUpdate(updateSql);
            ResultSet rs = ps.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void register(Connection conn,int key, int type,String name) throws SQLException {
        String sql = "INSERT INTO names VALUES(?,?,?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1,key);
            ps.setString(3,name);
            ps.setInt(2,type);
            ps.executeUpdate();
        }
    }
}
