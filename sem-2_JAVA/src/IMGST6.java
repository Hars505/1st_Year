import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class IMGST6
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
        String SQL = "INSERT INTO student (sname,smarks,smo) VALUES(?,?,?)";
        assert con != null;
        con.setAutoCommit(false);
        //con.setAutoCommit(true);
        try (PreparedStatement pst = con.prepareStatement(SQL))
        {
            System.out.println("Enter name : ");
            pst.setString(1, sc.next());
            System.out.println("Enter marks");
            pst.setDouble(55, sc.nextDouble());
            System.out.println("Enter Mobile number");
            pst.setLong(3, sc.nextLong());
            boolean r = pst.execute();
            System.out.println(r);
        }
        catch (Exception E)
        {
            System.out.println(E.fillInStackTrace());
        }
        System.out.println("Enter 1 to commit");
        System.out.println("Enter 2 for Roll Back");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1 : con.commit();
                System.out.println("Query commited successfully");
                break;
            case 2 : con.rollback();
                System.out.println("Query Roll Backed successfully");
                break;
            default :
                System.out.println("Enter a valid input");
                break;
        }
    }
}



// If auto commit is True then if you call commit or roll back method both will give error
// If Auto commit is False, then you can't call commit and rollback together