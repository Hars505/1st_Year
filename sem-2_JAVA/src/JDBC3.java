import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC3
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
        Scanner sc = new Scanner(System.in);
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
        System.out.println("Insert the number of Student's details you want to add");
        int n = sc.nextInt();
        for(int i = 1; i<=n ; i++)
        {
            System.out.println("Enter for "+i+" Student");
            System.out.println("Enter ROll Number");
            int ROllNO = sc.nextInt();
            System.out.println("Enter Name");
            String Name = sc.next();
            System.out.println("Enter Marks");
            double Marks = sc.nextDouble();
            System.out.println("Enter Mobile number ");
            long Mobile = sc.nextLong();
            System.out.println("Enter college Name");
            String clg = sc.next();
            String SQL = "INSERT INTO table1 VALUES(" + ROllNO + ",'" + Name + "'," + Marks + "," + Mobile + ",'"+clg+"');";

            // Step:5 - Execution of Query
            int r = st.executeUpdate(SQL);
            if(r>0)
            {
                System.out.println(i+" Lines are Inserted");
            }
            else
            {
                System.out.println("Insertion Failed");
            }
        }
        // Step:6 - Close The Connection
        con.close();
    }
}
