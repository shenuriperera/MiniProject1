import java.sql.*;

public class InsertDemo {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/a";
        String user = "root";
        String password = "ShenuriPerera2002.";

        try(Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement()){

            String sql = "INSERT INTO students (name, age) VALUES "
                    + "('bella', 23, 89), "
                    + "('anne', 22, 92), "
                    + "('bob', 24, 76),"
                    +"('simon',26, 66),"
                    +"('max',22, 94)";
            int rows= stmt.executeUpdate(sql);

            System.out.println(" "+rows+ "records inserted");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
