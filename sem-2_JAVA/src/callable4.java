import java.sql.*;
import java.util.Scanner;

public class callable4
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException
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
        String SQL = "{call insertStudent(?,?,?)}";
        assert con != null;
        CallableStatement cst = con.prepareCall(SQL);
        System.out.println("enter name of student");
        cst.setString(1,sc.next());
        System.out.println("enter his/her Marks");
        cst.setDouble(2,sc.nextDouble());
        System.out.println("enter his/her Mobile number");
        cst.setLong(3,sc.nextLong());
        int rs = cst.executeUpdate();
        if (rs > 0)
        {
            System.out.println(rs +" Lines update");
        }
        else
        {
            System.out.println("DATA update Failed");
        }
    }
}
