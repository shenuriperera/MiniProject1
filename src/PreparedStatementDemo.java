import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/a";
        String user = "root";
        String password = "ShenuriPerera2002.";

        try (Connection con = DriverManager.getConnection(url, user, password)) {
            // SQL with placeholders
            String sql = "INSERT INTO students (name, age,marks) VALUES (?, ?, ?)";

            // Create PreparedStatement
            PreparedStatement pst = con.prepareStatement(sql);

            // Set values for the first record
            pst.setString(1, "max");
            pst.setInt(2, 21);
            pst.executeUpdate();

            // Set values for another record
            pst.setString(1, "bella");
            pst.setInt(2, 22);
            pst.executeUpdate();

            System.out.println("Records inserted successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}