package Controllers;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBHelper {
    static String user = "root";
    static String password = "root";
    static String address = "jdbc:mysql://localhost:3306/airline";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(address,user,password);
    }


}
