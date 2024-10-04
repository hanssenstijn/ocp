package org.example.ch15;

import java.sql.*;

public class CallStatement {

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

    void passingIN() throws SQLException {
        String url = "url";
        String sql = "{call read_names_by_letter(?)}";
        Connection conn = DriverManager.getConnection(url);
        try (CallableStatement cs = conn.prepareCall(sql,ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY); ResultSet rs =
                cs.executeQuery()) {
            cs.setString("prefix","Z");
            while (rs.next()) {
                System.out.println(rs.getString(3));
            }
        }
    }
}
