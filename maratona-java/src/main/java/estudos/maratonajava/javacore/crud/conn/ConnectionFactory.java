package estudos.maratonajava.javacore.crud.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/anime_store";
        String username = "root";
        String password = "123456";
        return DriverManager.getConnection(url, username, password);

    }
}
