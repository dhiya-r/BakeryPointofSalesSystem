package Data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class StockSoldData
{

    private dbManager db;//connects to the dbManager class
    public List<StockSold> stockSoldList = new ArrayList();

    public StockSoldData() throws SQLException//default constructor of the class
    {
        db = new dbManager();
        getAllStockSold();
    }

    public void getStockSoldList(String sql) throws SQLException//connects to the table in the database
    {
        ResultSet rs = db.query(sql);//conrains the results of an sql query
        stockSoldList.clear();//clears out any values in the stock sold list
        while (rs.next())
        {
            StockSold ss = new StockSold();//creates an object of the StockSold class

            ss.setStockID(rs.getInt("STOCKID"));//connects to and reads the value from the stockID column in the table
            ss.setSalesID(rs.getInt("SALESID"));//connects to and reads the value from the salesID column in the table
            ss.setProductID(rs.getString("PRODUCTID"));//connects to and reads the value from the productID column in 
            //the table
            ss.setQtySold(rs.getInt("QUANTITYSOLD"));//connects to and reads the value from the quantity sold column 
            //in the table
            ss.setSellingPrice(rs.getInt("SELLINGPRICE"));//connects to and reads the value from the selling price 
            //column in the table
            ss.setCost(rs.getInt("COSTPRICE"));//connects to and reads the value from the cost price column in the table
            stockSoldList.add(ss);//adds the values to the stock sold list
        }
    }

    public void getAllStockSold() throws SQLException//SQL - retrieves data from table and orders it according to the 
    //stock id and displays it
    {
        getStockSoldList("SELECT * FROM STOCKSOLD ORDER BY STOCKID");
    }

    public void getAllStockSoldByCost(int cost) throws SQLException//retrieves data from the table according to a 
    //specific cost price
    {
        getStockSoldList("SELECT * FROMSTOCKSOLD WHERE COSTPRICE = " + cost);
    }

    public void getAllStockSoldByProductID(int prodID) throws SQLException//retrieves data from the table according 
    //to a specific product id
    {
        getStockSoldList("SELECT * FROMSTOCKSOLD WHERE PRODUCTID LIKE '%" + prodID + "%'");
    }

    public void getAllStockSoldByQtySold(int qty) throws SQLException//retrieves data from the table according to a 
    //specific quantity
    {
        getStockSoldList("SELECT * FROMSTOCKSOLD WHERE QUANTITYSOLD = " + qty);
    }

    public void getAllStockSoldBySalesID(int salesID) throws SQLException//retrieves data from the table according to 
    //a specific sales id
    {
        getStockSoldList("SELECT * FROMSTOCKSOLD WHERE SALESID = " + salesID);
    }

    public void getAllStockSoldBySellingPrice(int sPrice) throws SQLException//retrieves data from the table 
    //according to a specific selling price
    {
        getStockSoldList("SELECT * FROMSTOCKSOLD WHERE SELLINGPRICE = " + sPrice);
    }

    public void getAllStockSoldByStockID(int stockID) throws SQLException//retrieves data from the table according 
    //to a specific stock id
    {
        getStockSoldList("SELECT * FROMSTOCKSOLD WHERE STOCKID = " + stockID);
    }

    public StockSold getStockSold(int stockId)//locates stock sold in the stock sold table according to the stock 
    //sold id and sees if its in the table.
    {
        StockSold ss = new StockSold();//creates an object of the stockSold class

        boolean found = false;
        int counter = 0;
        while (found == false && counter < stockSoldList.size())
        {
            ss = stockSoldList.get(counter);//used to get data at a specific position in the list
            if (ss.getStockID() == stockId)//checks that the stock id at the position in te list is equal to the 
            //stock id entered as a parameter
            {
                found = true;
            }
            counter++;
        }
        return ss;
    }

    public int getStockSoldPosition(int stockId)//method to get the position of stock sold according to the stock id
    {
        StockSold ss = new StockSold();//creates an object of the StockSold class

        boolean found = false;
        int counter = 0;
        while (found == false && counter < stockSoldList.size())
        {
            ss = stockSoldList.get(counter);//used to get data at a specific position in the list
            if (ss.getStockID() == stockId)//checks that the stock id at the position in te list is equal to the stock 
            //id entered as a parameter
            {
                found = true;
            }
            counter++;
        }
        return counter - 1;//returns the positin of the id
    }

    public void addStockSold(int salesID, String productID, int qtySold, double sellingPrice, double cost) throws
            SQLException//method to add a product to the database
    {
        if (db.update("INSERT INTO STOCKSOLD(SALESID, PRODUCTID, QUANTITYSOLD,SELLINGPRICE, COSTPRICE) VALUES("
                + salesID + ",'" + productID + "'," + qtySold + "," + sellingPrice + "," + cost + ")") > 0)//SQL - to 
        //insert/add a product to the database
        {
            getAllStockSold();//once the product has been added/updated this refreshes the list and displays the 
            //updated table
            JOptionPane.showMessageDialog(null, "Stock Sold successfully added to database", "INFORMATION",
                    JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "Product NOT added to database", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }
}
