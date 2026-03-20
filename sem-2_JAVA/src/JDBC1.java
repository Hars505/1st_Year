import java.security.cert.TrustAnchor;
import java.sql.*;

public class JDBC1
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
        // Step:1 - Loading and Registering Driver
        String D_name = "com.mysql.cj.jdbc.Driver";
        Class.forName(D_name);
        System.out.println("Driver Registered successfully");

        // Step:2 - Creating Connection
        String DbUrl = "jdbc:mysql://localhost/d5";
        String DbUser = "root";
        String DbPassword = "";
        Connection con = DriverManager.getConnection(DbUrl,DbUser,DbPassword);

        if(con!=null)
        {
            System.out.println("Connection Established");
        }
        else
        {
            System.out.println("connection is not Established");
        }

        // Step:3 - Create Statement Object
        assert con != null;
        Statement st = con.createStatement();

        // Step:4 - Write SQL Query
        String SQL = "INSERT INTO student VALUES(001,'Harshil',99,4785961452,'INDUS');";

        // Step:5 - Execution of Query
        int r = con.createStatement().executeUpdate(SQL);
        if(r>0)
        {
            System.out.println("Insertion completed");
        }
        else
        {
            System.out.println("Query is empty");
        }

        // Step:6 - Close The Connection
        con.close();
    }
}
