package Data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProductsData
{

    private dbManager db;//connects to the dbManager class
    public List<Products> productList = new ArrayList();

    public ProductsData() throws SQLException//default constructor of the class
    {
        db = new dbManager();
        getAllProducts();

    }

    public void getProductsList(String sql) throws SQLException//connects to the table in the database
    {
        ResultSet rs = db.query(sql);//contains the results of an sql query
        productList.clear();//clears out any values in the productList
        while (rs.next())
        {
            Products p = new Products();//creates an object of the Products class

            p.setCost(rs.getInt("COST"));//connects to the cost column from the tabe
            p.setDescription(rs.getString("Description"));//connects to the description from the products tbl
            p.setMarkup(rs.getInt("MARKUP"));//connects to the markup column from the products table
            p.setProductID(rs.getString("PRODUCTID"));//connects and reads the value in the Product ID column in the 
            //table
            p.setProductName(rs.getString("PRODUCTNAME"));//connects and reads the value in the Product name column in 
            //the table
            p.setQuantity(rs.getInt("QUANTITY"));//connects and reads the value in the quantity column in the table
            productList.add(p);//adds the values to the productList
        }
    }

    public void getAllProducts() throws SQLException//SQL - retrieves data from table and orders it according to 
    {//product id and displays it
        getProductsList("SELECT * FROM PRODUCTS ORDER BY PRODUCTID");
    }

    public void getAllProductsByCost(int cost) throws SQLException//retrieves value from table according to a specific 
    {//cost and displays it
        getProductsList("SELECT * FROM PRODUCTS WHERE COST = " + cost);
    }

    public void getAllProductsByDesc(String desc) throws SQLException//retrieves values from table according to a 
    {//specific description and displays it
        getProductsList("SELECT * FROM PRODUCTS WHERE DESCRIPTION LIKE '%" + desc + "%'");
    }

    public void getAllProductsByMarkup(int markup) throws SQLException//retrieves values from table according to a 
    {//markup and displays the retrieved value and displays it
        getProductsList("SELECT * FROM PRODUCTS WHERE MARKUP = " + markup);
    }

    public void getAllProductsByQuantity(int quantity) throws SQLException//get values fom table according to the 
    {//quantity and displays it
        getProductsList("SELECT * FROM PRODUCTS WHERE QUANTITY = " + quantity);
    }

    public void getAllProductsByProdId(String prodId) throws SQLException//gets value from table according to the 
    //product id thats needed and displays it
    {
        getProductsList("SELECT * FROM PRODUCTS WHERE PRODUCTID LIKE '%" + prodId + "%'");
    }

    public void getAllProductsByProdName(String prodName) throws SQLException//gets the values from table according to 
    //specified product nams entered/searched for etc. and displays it
    {
        getProductsList("SELECT * FROM PRODUCTS WHERE PRODUCTNAME LIKE '%" + prodName + "%'");
    }

    public Products getProduct(String prodID)//locates a product in the products table according to the product ID and 
    //sees if its in the table.
    {
        Products p = new Products();//creates an object of the products class

        boolean found = false;//used as a check
        int counter = 0;
        while (found == false && counter < productList.size())
        {
            p = productList.get(counter);//used to get the data at the specific position in the product list
            if (p.getProductID().equalsIgnoreCase(prodID))//condition to check that the id at the position equals the 
            //id entered as a parameter
            {
                found = true;
            }

            counter++;
        }
        return p;
    }

    public void populateJTable(javax.swing.JTable productTable, int rowPosition)//populates the table in the screen 
    //with the fields in the database
    {
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        model.setRowCount(0);
        for (int i = 0; i < productList.size(); i++)
        {
            Data.Products p = productList.get(i);
            Object[] rowData =
            {
                p.getProductID(), p.getProductName(), p.getDescription(), p.getQuantity(), p.getCost(), p.getMarkup()
            //the order that the table will be displayed. It must be in the same order as the fields in the database 
            //otherwise the values will be mixed and incorrect
            };
            model.addRow(rowData);
        }
        productTable.setModel(model);
        if (productTable.getRowCount() > 0)
        {
            productTable.setRowSelectionInterval(rowPosition, rowPosition);//selects the row
            productTable.scrollRectToVisible(productTable.getCellRect(rowPosition, 0, true));//this is to move the 
            //scroller to the selected row
        } else
        {
            JOptionPane.showMessageDialog(null, "No records available", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public int getProductPosition(String productID)//gets the position of a product according to the productID.
    {
        Products p = new Products();//creates an object of the products class to call on methods from the products class

        boolean found = false;
        int counter = 0;
        while (found == false && counter < productList.size())
        {
            p = productList.get(counter);//used to get the data at a specific position in the products list
            if (p.getProductID().equalsIgnoreCase(productID))//checks that the id entered is the same id at the position
            {
                found = true;
            }
            counter++;
        }
        return counter - 1;//returns the position that the id entered was at
    }

    public void editProducts(String productId, String prodName, String descr, int quantity, int cost, int markup) throws
            SQLException//method to edit a specific product in the products screen.
    {
        if (db.update("UPDATE PRODUCTS SET PRODUCTNAME = '" + prodName + "', DESCRIPTION = '" + descr + "', QUANTITY = "
                + "" + quantity + ", COST = " + cost + ", MARKUP = " + markup + " WHERE PRODUCTID = '" + productId
                + "'") > 0)//SQL - updates the product in the database 
        {
            getAllProducts();//It refreshes the list because the password of a user has been changed - gets all current 
            //data
            JOptionPane.showMessageDialog(null, "User successfully edited", "INFORMATION",
                    JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "User NOT edited", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void deleteProduct(String prodId) throws SQLException//detetes a product from the database
    {
        if (db.update("DELETE * FROM PRODUCTS WHERE PRODUCTID = '" + prodId + "'") > 0)//SQL to delete a product 
        //according to a specific product id
        {
            getAllProducts();//refreshes the table in the screen to display the new/updated table
            JOptionPane.showMessageDialog(null, "Product successfully deleted", "INFORMATION",
                    JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "Product NOT deleted", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void addProduct(String productID, String productName, String description, int quantity, int cost, int markup)
            throws SQLException//method to add a product to the database. The parameters are the new values being added 
    //to the database
    {
        if (db.update("INSERT INTO PRODUCTS(PRODUCTID, PRODUCTNAME, DESCRIPTION, QUANTITY, COST, MARKUP) VALUES('"
                + productID + "','" + productName + "','" + description + "'," + quantity + "," + cost + "," + markup
                + ")") > 0)//SQL - to insert/add a product to the database
        {
            getAllProducts();//once the product has been added/updated this refreshes the list and displays the updated 
            //table
            JOptionPane.showMessageDialog(null, "Product successfully added to database", "INFORMATION",
                    JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "Product NOT added to database", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}
