package utils;

import java.sql.*;

public class ConnectionManager {
    private static final String url = System.getenv("url");
    private static final String user = System.getenv("login");
    private static final String password = System.getenv("pass");

    private static Connection connection;
    private static Statement statement;

    static {
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private ConnectionManager(){}

    public static ResultSet executeQueryWithAnswer(String query) throws SQLException {
        return statement.executeQuery(query);
    }

    public static void executeQuery(String query) throws SQLException {
        statement.executeUpdate(query);
    }
}
