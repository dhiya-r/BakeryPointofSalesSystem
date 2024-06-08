package Data;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ReportsData
{

    private dbManager db;

    public ReportsData() throws SQLException
    {
        db = new dbManager();
    }

    public String getDailySales() throws SQLException//typed method to get the sales made on a specific day
    {
        String display = "Sales for the Day:\n\n";//initializes the display variable and provides a string which acts 
        //as the heading
        display += "Sales ID" + "\t\t" + "Date of Sale" + "\t\t" + "Time of Sale" + "\t\t" + "Username" + "\n";
//headings for the different columns that will be displayed
        ResultSet rs = db.query("SELECT * FROM SALES WHERE YEAR(DATEOFSALE) = YEAR(NOW()) AND MONTH(DATEOFSALE) = "
                + "MONTH(NOW()) AND DAY(DATEOFSALE) = DAY(NOW())");//SQL to get the sales made that day
        while (rs.next())//checks to see how many sales were made 
        {
            display += rs.getInt(1) + "\t\t" + rs.getDate(2) + "\t\t" + rs.getTime(3) + "\t\t" + rs.getString(4) + "\n";
        }
        return display;
    }
    
    public String getProductSellingPrice() throws SQLException//typed method to show what the selling price of a product 
            //is
    {
        String output = "Product Selling Price:\n\n";//initializes the output variable. Displays a heading
        output += String.format("%-30s%-30s%-30s%n", "PRODUCT ID", "PRODUCT NAME", "SELLING PRICE") + "\n";//displays 
        //headings for the different columns
        ResultSet rs = db.query("SELECT PRODUCTID, PRODUCTNAME, (COST + ((MARKUP/100) * COST)) FROM PRODUCTS");//SQL to 
        //determine the selling price
        while (rs.next())//while there are more products
        {
            output += String.format("%-30s%-30s%-30d%n", rs.getString(1), rs.getString(2),rs.getInt(3));//displays each 
            //product with its selling price
        }
        return output;
    }
    
    public String getProductsPerCategory() throws SQLException//method to display the number of products per category
    {
        String output = "The Number of Products Per Category:\n\n";//initializes theoutput variable. displays a heading
        output += String.format("%-20s%-30s%n", "DESCRIPTION", "NUMBER OF PRODUCTS") + "\n";//displays headings for the 
        //columns
        ResultSet rs = db.query("SELECT DESCRIPTION, COUNT(*) FROM PRODUCTS GROUP BY DESCRIPTION");//SQL to get the 
        //number of products per category
        while (rs.next())
        {
            output += String.format("%-20s%-30d%n", rs.getString(1), rs.getInt(2));
        }
        return output;
    }

    public String getUsersDailySales()throws SQLException//method to display the number of sales a user made during 
            //the day
    {
        String output = "Each Users Daily Sales:\n\n";//initializes the output variable. displays a heading
        output += String.format("%-20s%-30s%n", "USER:", "SALES:") + "\n";//displays headings for the different columns
        ResultSet rs = db.query("SELECT USERNAME, COUNT(*) FROM SALES WHERE YEAR(DATEOFSALE) = YEAR(NOW()) AND "
                + "MONTH(DATEOFSALE) = MONTH(NOW()) AND DAY(DATEOFSALE) = DAY(NOW()) GROUP BY USERNAME");//SQL to count 
        //the number of sales made that day for the user
        while (rs.next())
        {
            output += String.format("%-20s%-30d%n", rs.getString(1), rs.getInt(2));
        }
        return output;
    }
}
