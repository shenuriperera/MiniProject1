import java.sql.*;
public class UpdateDeleteDemo {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/a";
        String user = "root";
        String password = "ShenuriPerera2002.";

        try(Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement()){

            String updateSql = "UPDATE students SET age=23 WHERE name='bob'";
            int update = stmt.executeUpdate(updateSql);
            System.out.println(" " + update + " record updated.");

            String deleteSql = "DELETE FROM students WHERE name='simon'";
            int deleted = stmt.executeUpdate(deleteSql);
            System.out.println(" " + deleted + " records deleted");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}