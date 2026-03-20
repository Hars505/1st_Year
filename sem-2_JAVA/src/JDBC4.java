import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

// WAP to Change marks and clg Name of a Student by his name and roll Number By User input
public class JDBC4
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
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
        System.out.println("Enter roll Number you want to change");
        int newrn = sc.nextInt();
        System.out.println("Student name you want to change");
        String newname = sc.next();
        System.out.println("Enter roll Number you want to update");
        int srn = sc.nextInt();
        System.out.println("Student name you want to update");
        String sname = sc.next();
        String SQL = "UPDATE table1 SET smarks="+newrn+" , scn='"+newname+"' WHERE sname='"+sname+"' AND srn="+srn+";";
        int r = st.executeUpdate(SQL);
        if (r > 0)
        {
            System.out.println(r+" Lines update");
        }
        else
        {
            System.out.println("Data not available");
        }
    }
}
