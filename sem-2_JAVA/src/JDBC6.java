import java.sql.*;
import java.util.Scanner;

// WAP to print name and marks of Students Who are belong to lJ
public class JDBC6
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);
        String D_name = "com.mysql.cj.jdbc.Driver";
        Class.forName(D_name);
        System.out.println("Driver Registered successfully");
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
        assert con != null;
        Statement st = con.createStatement();
        String SQL = "SELECT sname,smarks FROM table1 WHERE scn='LJIET';";
        ResultSet rs = st.executeQuery(SQL);
        while (rs.next())
        {
            System.out.print(rs.getString(1));
            System.out.println("       "+rs.getString(2));
        }
    }
}
