package org.example.ch15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class Result {
    public static void main(String[] args) throws SQLException {
        String url = "url";
        String sql = "SELECT id, name FROM exhhibits";
        var idToNameMap = new HashMap<Integer,String>();

        Connection conn = DriverManager.getConnection(url);

        try (var ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                // for a primitive it uses the wrapper class
                System.out.println(rs.getObject("id"));
                idToNameMap.put(id,name);
            }
            System.out.println(idToNameMap);
        }
    }
}
