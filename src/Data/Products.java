package Data;

import java.util.Date;

public class Products
{
    private String productID;//declaring the productID variable as a global variable that can only be accessed within 
    //the Products class
    private String productName;//declaring the productName variable as a global variable that can only be accessed 
    //within the Products class
    private String description;//declaring the description variable as a global variable that can only be accessed 
    //within the Products class
    private int quantity;//declaring the quantity variable as a global variable that can only be accessed within the 
    //Products class
    private int cost;//declaring the cost variable as a global variable that can only be accessed within the Products 
    //class
    private int markup;//declaring the markup variable as a global variable that can only be accessed within the 
    //Products class

    public Products(String inProductID, String inProductName, String inDescription, int inQuantity, int inCost, 
            int inMarkup)//the parameterised constructor of the Products class
    {//retrieves values as a parameter
        productID = inProductID;//sets the value of the productID variable to the value of the parameters(inProductID)
        productName = inProductName;//sets the value of the productName variable to the value of the parameters
        //(inProductName)
        description = inDescription;//sets the value of the description variable to the value of the parameters
        //(inDescription)
        quantity = inQuantity;//sets the value of the quantity variable to the value of the parameters(inQuantity)
        cost = inCost;//sets the value of the cost variable to the value of the parameters(inCost)
        markup = inMarkup;//sets the value of the markup variable to the value of the parameters(inMarkup)
    }

    public Products()//the default constructor - it runs when no parameters are passed through the parameterized 
    {//constructor
    }

    public String getProductID()//returns the value stored in the productID variable
    {
        return productID;
    }

    public String getProductName()//returns the value stored in the ProductName variable
    {
        return productName;
    }

    public String getDescription()//returns the value stored in the description variable
    {
        return description;
    }

    public int getQuantity()//returns the value stored in the quantity variable
    {
        return quantity;
    }

    public int getCost()//returns the value stored in the cost variable
    {
        return cost;
    }

    public int getMarkup()//returns the value stored in the markup variable
    {
        return markup;
    }
    
    public void setProductID(String inProductID)//retrieves the productId so the value can be altered
    {
        productID = inProductID;
    }

    public void setProductName(String inProductName)//retrieves the product name so name can be changed
    {
        productName = inProductName;
    }

    public void setDescription(String inDescription)//gets the description so it can be changed
    {
        description = inDescription;
    }

    public void setQuantity(int inQuantity)//gets the quantity so it can be altered
    {
        quantity = inQuantity;
    }

    public void setCost(int inCost)//retrieves the cost so the value can be changed
    {
        cost = inCost;
    }

    public void setMarkup(int inMarkup)//retrieves the markup so that it can be changed/updated
    {
        markup = inMarkup;
    }

    @Override
    public String toString()//combines and returns all the fields of the object in the form of a String
    {
        return "Products{" + "productID=" + productID + ", productName=" + productName + ", description=" + 
                description + ", quantity=" + quantity + ", cost=" + cost + ", markup=" + markup + '}';
    }

    
    
}
