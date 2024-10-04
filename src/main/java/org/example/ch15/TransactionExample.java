package org.example.ch15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class TransactionExample {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        Savepoint savepoint1 = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
            connection.setAutoCommit(false);

            statement = connection.createStatement();
            statement.executeUpdate("UPDATE accounts SET balance = balance - 100 WHERE id = 1");

            savepoint1 = connection.setSavepoint("Savepoint1");
            statement.executeUpdate("UPDATE accounts SET balance = balance + 100 WHERE id = 2");

            connection.commit();
            System.out.println("Transaction committed successfully.");

        } catch (SQLException e) {
            try {
                if (connection != null) {
                    if (savepoint1 != null) {
                        connection.rollback(savepoint1);
                        System.out.println("Rolled back to Savepoint1.");
                    } else {
                        connection.rollback();
                        System.out.println("Transaction rolled back.");
                    }
                }
            } catch (SQLException rollbackEx) {
                System.out.println("Failed to rollback the transaction: " + rollbackEx.getMessage());
            }
            System.out.println("Transaction failed: " + e.getMessage());
        } finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}


