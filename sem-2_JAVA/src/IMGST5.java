import java.sql.*;

public class IMGST5
{
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
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
        String SQL = "SELECT * FROM student";
        assert con != null;
        PreparedStatement pst = con.prepareStatement(SQL);
        ResultSet rs = pst.executeQuery();
        ResultSetMetaData rsmd = rs.getMetaData();
        System.out.println(rsmd.getTableName(1));
        System.out.println(rsmd.getColumnCount());
        System.out.println(rsmd.getColumnName(1));
        System.out.println(rsmd.getColumnType(1));
        System.out.println(rsmd.getColumnTypeName(1));
        System.out.println(rsmd.getColumnDisplaySize(1));
    }
}
