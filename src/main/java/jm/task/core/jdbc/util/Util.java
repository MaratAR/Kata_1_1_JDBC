package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static jm.task.core.jdbc.constants.DBConstants.*;

public class Util {
    private static Connection connection;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection("jdbc:mysql://" + DB_HOST + ":" + PORT + "/" + DB, USER, PASSWORD);
        }
        return connection;
    }

}
