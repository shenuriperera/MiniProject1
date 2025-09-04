import java.sql.*;

public class HelloJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/a";
        String user = "root";
        String password = "ShenuriPerera2002.";


        try {
            // 1. Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create a connection
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Database Connected Successfully!");


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

