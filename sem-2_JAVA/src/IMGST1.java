import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class IMGST1
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException
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
        String SQL = "INSERT INTO imagetable VALUES (?,?,?,?,?,?);";
        assert con != null;
        PreparedStatement pst = con.prepareStatement(SQL);
        File F = new File("C:\\Users\\harsh\\OneDrive\\Pictures\\Screenshots\\Screenshot 2025-04-21 195342.png");
        System.out.println(F.exists());
        System.out.println("ENTER ID");
        pst.setInt(1,sc.nextInt());
        pst.setString(2, F.getName());
        pst.setString(3,F.getAbsolutePath());
        pst.setLong(4, F.length());
        pst.setString(5,F.getName().substring(F.getName().lastIndexOf('.')));
        FileInputStream FIS = new FileInputStream(F);
        pst.setBlob(6, FIS);
        int r = pst.executeUpdate();
        if(r>0)
        {
            System.out.println("IMAGE inserted successfully");
        }
        else
        {
            System.out.println("FAILED");
        }
        }
}
