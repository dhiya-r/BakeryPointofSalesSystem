package Data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SalesData
{

    private dbManager db;//connects to the dbManager class
    public List<Sales> salesList = new ArrayList();

    public SalesData() throws SQLException
    {
        db = new dbManager();
        getAllSales();
    }

    public void getSalesList(String sql) throws SQLException//connects to the table in the database
    {
        ResultSet rs = db.query(sql);//this contains the results of an sql query
        salesList.clear();//clears out any values in the salesList
        while (rs.next())
        {
            Sales s = new Sales();//creates an object of the Sales class

            s.setDateOfSale(rs.getDate("DATEOFSALE"));//connects to and reads the value from the Date of Sale column 
            //in the sales tbl
            s.setSalesId(rs.getInt("SALESID"));//connects to and reads the value from the SalesID column in the 
            //sales tbl
            s.setTimeOfSale(rs.getDate("TIMEOFSALE"));//connects to and reads the value from the Time of Sale column 
            //in the sales tbl
            s.setUsername(rs.getString("USERNAME"));//connects to and reads the value from the username column in the 
            //sales tbl
            salesList.add(s);//adds the values to the salesList
        }
    }

    public void getAllSales() throws SQLException//SQL - retrieves data from table and orders it according to the 
            //sales id and displays it
    {
        getSalesList("SELECT * FROM SALES ORDER BY SALESID");
    }

    public void getAllSalesBySalesDate(String salesDate) throws SQLException//SQL - retrieves data from the table 
            //according to a specific salesDate
    {
        getSalesList("SELECT * FROM SALES WHERE DATEOFSALE = " + salesDate);
    }

    public void getAllSalesBySalesID(int salesId) throws SQLException//gets data from the table according to a 
            //specific salesID
    {
        getSalesList("SELECT * FROM SALES WHERE SALESID = " + salesId);
    }

    public void getAllSalesByUsername(String username) throws SQLException//gets data from the table according to a 
            //specific user
    {
        getSalesList("SELECT * FROM SALES WHERE USERNAME LIKE '%" + username);
    }

    public void getAllSalesBySalesTime(String salesTime) throws SQLException//gets data from the table according to a 
            //specific salesTime
    {
        getSalesList("SELECT * FROM SALES WHERE TIMEOFSALE = " + salesTime);
    }

    public Sales getSales(int stockID)//locates a sale in the table according to the sale ID and sees if its in 
            //the table.
    {
        Sales s = new Sales();//creates an object of the Sales class

        boolean found = false;
        int counter = 0;
        while (found == false && counter < salesList.size())
        {
            s = salesList.get(counter);//used to get data at a specific position in the sales list
            if (s.getSalesId() == stockID)//checks whether the id at the positiion in the list is equal to the id that 
                //was entered as parameters
            {
                found = true;
            }
            counter++;
        }
        return s;
    }

    public int getStockSoldPosition(int stockID)//gets the position of a product according to the productID.
    {
        Sales s = new Sales();//creates an object of the Sales class to call on methods from the sales class

        boolean found = false;
        int counter = 0;
        while (found == false && counter < salesList.size())
        {
            s = salesList.get(counter);//used to get the data at a specific position in the products list
            if (s.getSalesId() == stockID)//checks that the id entered is the same id at the position in the list
            {
                found = true;
            }
            counter++;
        }
        return counter - 1;//returns the position that the id was at
    }

    public int newSalesID() throws SQLException//method to get the maximum value for the salesID
    {
        ResultSet rs = db.query("SELECT MAX(SALESID) FROM SALES");
        int value = 0;
        while (rs.next())
        {
            value = rs.getInt(1);
        }
        return value;
    }

    public void addSale(String user) throws SQLException//method to add a sale to the database
    {
        if (db.update("INSERT INTO Sales(DATEOFSALE, TIMEOFSALE, USERNAME) VALUES( Date(), Time(), '" + user + "')") 
                > 0)//SQL - to insert/add a sale to the database
        {
            getAllSales();//once the product has been added/updated this refreshes the list and displays the updated 
            //table
            JOptionPane.showMessageDialog(null, "Sale successfully added to database", "INFORMATION", 
                    JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "Sale NOT added to database", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}
