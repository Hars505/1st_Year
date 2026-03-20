import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception
    {
        String D_name = "com.mysql.cj.jdbc.Driver";
        Class.forName(D_name);
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/d5","root","");
        if(con!=null)
        {
            System.out.println("Connection established.");
        }
        else
        {
            System.out.println("Connection Failed");
        }

    }
}