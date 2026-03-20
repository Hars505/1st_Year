import java.sql.*;
public class JDBC7
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
        String D_name = "com.mysql.cj.jdbc.Driver";
        Class.forName(D_name);
        System.out.println("Driver Registered successfully");
        String DbUrl = "jdbc:mysql://localhost/d5";
        String DbUser = "root";
        String DbPassword = "";
        Connection con = DriverManager.getConnection(DbUrl, DbUser, DbPassword);
        if (con != null) {
            System.out.println("Connection Established");
        } else {
            System.out.println("connection is not Established");
        }
        String SQL = "INSERT INTO table1 VALUES(?,?,?,?,?);";
        assert con != null;
        PreparedStatement pst = con.prepareStatement(SQL);
        pst.setInt(1,11);
        pst.setString(2,"Mahesh");
        pst.setDouble(3,94.5);
        pst.setLong(4,9549686444L);
        pst.setString(5,"NIRMA");
        int r = pst.executeUpdate();
        if(r>0)
        {
            System.out.println(r+" numbers of line inserted");
        }
    }
}
