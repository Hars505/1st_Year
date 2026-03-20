import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class callable3
{
    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
        Scanner sc = new Scanner(System.in);
        String D_name = "com.mysql.cj.jdbc.Driver";
        Class.forName(D_name);
        System.out.println("Driver Registered successfully");
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
        String SQL = "{call updateStudentByName(?,?,?)}";
        assert con != null;
        CallableStatement cst = con.prepareCall(SQL);
        System.out.println("enter the updated marks");
        cst.setDouble(1,sc.nextDouble());
        System.out.println("enter the updated mobile number");
        cst.setLong(2,sc.nextLong());
        System.out.println("enter the name you want to change");
        cst.setString(3,sc.next());
        int rs = cst.executeUpdate();
        if (rs > 0)
        {
            System.out.println(rs +" Lines update");
        }
        else
        {
            System.out.println("Data not available");
        }
    }
}
