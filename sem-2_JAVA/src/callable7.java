import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class callable7
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
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
        String SQL = "{call updateSelectStudent(?,?,?,?,?,?)}";
        assert con != null;
        CallableStatement cst = con.prepareCall(SQL);
        System.out.println("enter name of student");
        cst.setString(3,sc.next());
        System.out.println("enter his/her Marks");
        cst.setDouble(1,sc.nextDouble());
        System.out.println("enter his/her Mobile number");
        cst.setLong(2,sc.nextLong());
        System.out.println("enter Roll no. of student whose data you want to Update");
        cst.setInt(6,sc.nextInt());
        cst.execute();
        System.out.println("Name = "+cst.getString(4));
        System.out.println("Mobile Number = "+cst.getLong(5));
    }
}
