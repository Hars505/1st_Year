import java.sql.*;
import java.util.Scanner;
public class calllable6
{
    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
        Scanner sc = new Scanner(System.in);
        String D_name = "com.mysql.cj.jdbc.Driver";
        Class.forName(D_name);
        System.out.println("Driver Registered Successfully");
        String DbUrl = "jdbc:mysql://localhost/d5";
        String DbUser = "root";
        String DbPassword = "";
        Connection con = DriverManager.getConnection(DbUrl, DbUser, DbPassword);
        if (con != null)
        {
            System.out.println("Connection Established");
        }
        else
        {
            System.out.println("connection is not Established");
        }
        String SQL = "{call displayNameByRollNumber(?,?)}";
        assert con != null;
        CallableStatement cst = con.prepareCall(SQL);
        System.out.println("enter Roll Number of student");
        cst.setInt(1,sc.nextInt());
        System.out.println("Name = "+cst.getString(2));
    }
}
