package org.example.ch15;

import java.sql.*;

public class CallStatement {
    public static void main(String[] args) throws SQLException {
    }

    void withoutParameters() throws SQLException {
        String url = "url";
        String sql = "{call read_e_names()}";
        Connection conn = DriverManager.getConnection(url);
        try (CallableStatement cs = conn.prepareCall(sql); ResultSet rs = cs.executeQuery()) {
            while (rs.next()) {
                System.out.println(rs.getString(3));
            }
        }
    }
}
