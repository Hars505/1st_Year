import java.sql.*;
import java.util.*;
public class CRUD
{
    static Scanner sc = new Scanner(System.in);
    static Connection con;
    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
        String D_name = "com.mysql.cj.jdbc.Driver";
        Class.forName(D_name);
        System.out.println("Driver Registered successfully");
        String DbUrl = "jdbc:mysql://localhost/d5";
        String DbUser = "root";
        String DbPassword = "";
        con = DriverManager.getConnection(DbUrl, DbUser, DbPassword);
        if (con != null)
        {
            System.out.println("Connection Established");
        }
        else
        {
            System.out.println("connection is not Established");
        }
        while(true)
        {
            System.out.println("Enter 1 to insert students in Database");
            System.out.println("Enter 2 to Update marks and mobile number of students by their name or roll number in Database");
            System.out.println("Enter 3 to delete student based on marks in Database");
            System.out.println("Enter 4 to Print all student data");
            System.out.println("Enter 5 to Perform any operation as you want");
            System.out.println("Enter 6 to exit..");
            System.out.println("\n Enter your choice");
            int ch = sc.nextInt();
            switch (ch)
            {
                case  1 : CRUD.insertData();
                break;
                case  2 : CRUD.updateData();
                break;
                case  3 : CRUD.deleteData();
                break;
                case  4 : CRUD.displayALLStudent();
                break;
                case  5 : CRUD.writeAnyQuery();
                break;
                case  6 : System.out.println("THANK YOU FOR USING MY SOFTWARE .\n\nEXITING....");
                System.exit(0);
                default : System.out.println("PLEASE ENTER A VALID NUMBER ");
                break;
            }
        }
    }
    static void insertData() throws SQLException
    {
        String SQL = "INSERT INTO table1 VALUES(?,?,?,?,?);";
        PreparedStatement pst = con.prepareStatement(SQL);
        System.out.println("Enter student roll number");
        pst.setInt(1,sc.nextInt());
        System.out.println("Enter student name");
        pst.setString(2,sc.next());
        System.out.println("Enter student Marks");
        pst.setDouble(3,sc.nextDouble());
        System.out.println("Enter Student Mobile number");
        pst.setLong(4,sc.nextLong());
        System.out.println("Enter Student college name");
        pst.setString(5,sc.next());
        int r = pst.executeUpdate();
        if(r>0)
        {
            System.out.println(r+" row inserted successfully\n\n");
        }
        else
        {
            System.out.println("Insertion fail\n\n");
        }
    }
    static void updateData() throws SQLException
    {
        String SQL = "UPDATE table1 SET smarks=?,smo=? WHERE sname=? AND srn=?;";
        PreparedStatement pst = con.prepareStatement(SQL);
        System.out.println("Enter student roll number");
        pst.setInt(4,sc.nextInt());
        System.out.println("Enter student name");
        pst.setString(3,sc.next());
        System.out.println("Enter Updated student Marks");
        pst.setDouble(1,sc.nextDouble());
        System.out.println("Enter Updated Student Mobile number");
        pst.setLong(2,sc.nextLong());
        int r = pst.executeUpdate();
        if(r>0)
        {
            System.out.println(r+" row updated successfully\n\n");
        }
        else
        {
            System.out.println("Updation failed\n\n");
        }
    }
    static void deleteData() throws SQLException
    {
        String SQL = "DELETE FROM table1 WHERE smarks<?";
        PreparedStatement pst = con.prepareStatement(SQL);
        System.out.println("Enter marks whose data you want to delete");
        pst.setInt(1,sc.nextInt());
        int r = pst.executeUpdate();
        if(r>0)
        {
            System.out.println(r+" row deleted successfully\n\n");
        }
        else
        {
            System.out.println("No records Found\n\n");
        }
    }
    static  void displayALLStudent() throws SQLException
    {
        String SQL = "SELECT * FROM table1;";
        PreparedStatement pst = con.prepareStatement(SQL);
        ResultSet rs = pst.executeQuery();
        System.out.printf("%-3s %-10s %-10s %-13s %-10s","SRN","NAme","MArk","Mobile","CLG name");
        System.out.println();
        System.out.println("-----------------------------------------------------");
        while (rs.next())
        {
            System.out.printf("%-3d %-10s %-1f %-13d %-10s",rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getLong(4),rs.getString(5));
            System.out.println();
        }
    }
    static void writeAnyQuery() throws SQLException
    {
        System.out.println("Enter Any Query");
        sc.nextLine();
        String SQL = sc.nextLine();
        PreparedStatement pst = con.prepareStatement(SQL);
        boolean b = pst.execute();
        if(b)
        {
            ResultSet rs = pst.getResultSet();
            System.out.printf("%-3s %-10s %-10s %-13s %-10s","SRN","NAme","MArk","Mobile","CLG name");
            System.out.println();
            System.out.println("-----------------------------------------------------");
            while (rs.next())
            {
                System.out.printf("%-3d %-10s %-1f %-13d %-10s",rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getLong(4),rs.getString(5));
                System.out.println();
            }
        }
        else
        {
            int r = pst.getUpdateCount();
            if(r>0)
            {
                System.out.println(r+" Execution successfully\n\n");
            }
            else
            {
                System.out.println("Execution failed\n\n");
            }

        }
    }
}
