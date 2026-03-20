import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
public class IMGST4
{
    public static void main(String[] args) throws SQLException, ClassNotFoundException
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
        assert con != null;
        DatabaseMetaData dbmd = con.getMetaData();
        System.out.println("\n\n"+dbmd.getDriverVersion());
        System.out.println(dbmd.getDriverName());
        System.out.println(dbmd.getUserName());
        System.out.println(dbmd.getURL());
        System.out.println(dbmd.getDatabaseProductVersion());
        System.out.println(dbmd.getDatabaseProductName());
        System.out.println(dbmd.getMaxColumnsInTable());
        System.out.println(dbmd.supportsStoredProcedures());
    }
}
