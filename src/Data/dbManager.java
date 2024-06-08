package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbManager
{
    Connection conn;
    public dbManager() throws SQLException
    {
        try
        {
            String filename = "PATdb.mdb";//name of the database
            String username = "";//put username and password here if you put it in database
            String password = "";
           
            // Load the UCanAccess JDBC driver
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String database = "jdbc:ucanaccess://" + filename.trim();
            conn = DriverManager.getConnection(database, username, password);
        } 
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }

    public ResultSet query(String SQL) throws SQLException
    {
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(SQL);
        return result;
    }

    public int update(String SQL) throws SQLException 
    {
        Statement stmt = conn.createStatement();
        int done = stmt.executeUpdate(SQL);
        return done;
    }

    public int updateReturnID(String SQL) throws SQLException
    {
        Statement stmt = conn.createStatement();
        int id = -1;
        stmt.executeUpdate(SQL, Statement.RETURN_GENERATED_KEYS);
        ResultSet result = stmt.getGeneratedKeys();
        if (result.next())
        {
            id = result.getInt(1);
        }
        return id;
    }
}
