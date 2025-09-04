import java.sql.*;
public class SelectDemo {

    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/a";
        String user = "root";
        String password = "ShenuriPerera2002.";

        try(Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement()){

            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                int grade = rs.getInt("marks");
                System.out.println(id + "|" + name + "|" + age + "|" + marks);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
