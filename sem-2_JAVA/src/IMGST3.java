import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class IMGST3
{
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException
    {
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
        String SQL = "INSERT INTO imagetable1 VALUES (?,?,?,?,?,?);";
        assert con != null;
        PreparedStatement pst = con.prepareStatement(SQL);
        File F = new File("C:\\Users\\harsh\\IdeaProjects\\DS2025\\src\\HP.txt");
        System.out.println(F.exists());
        pst.setInt(1,2);
        pst.setString(2, F.getName());
        pst.setString(4,F.getAbsolutePath());
        pst.setLong(3, F.length());
        pst.setString(5,F.getName().substring(F.getName().lastIndexOf('.')));
        FileReader FR = new FileReader(F);
        pst.setClob(6, FR , F.length());
        int r = pst.executeUpdate();
        if(r>0)
        {
            System.out.println("TXT inserted successfully");
        }
        else
        {
            System.out.println("FAILED");
        }
    }
}
