import java.sql.*;

// WAP to Print student table in readable format in console
public class JDBC5
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
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
        String SQL = "SELECT * FROM student;";
        ResultSet rs = st.executeQuery(SQL);
        System.out.printf("%-3s %-10s %-10s %-13s %-10s","srn","sname","smarks","smo","scollege");
        System.out.println();
        System.out.println("-----------------------------------------------------");
        while (rs.next())
        {
            System.out.printf("%-3d %-10s %-1.2f   %-13d    %-10s",rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getLong(4),rs.getString(5));
            System.out.println();
        }
    }
}
