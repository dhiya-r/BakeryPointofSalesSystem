package Data;

public class StockSold
{

    private int stockID;//declaring the stockID variable as a global variable that can only be accessed within the 
    //StockSold class
    private int salesID;//declaring the salesid variable as a global variable that can only be accessed within the 
    //stocksold class
    private String productID;//declaring the productid variable as a global variable that can only be accessed within 
    //the stocksold class
    private int qtySold;//declaring the qtysold variable as a global variable that can only be accessed within the 
    //stocksold class
    private int cost;//declaring the cost variable as a global variable that can only be accessed within the 
    //stocksold class
    private int sellingPrice;//declaring the sellingPrice variable as a global variable that can only be accessed 
    //within the stocksold class

    public StockSold(int inStockID, int inSalesID, String inProductID, int inQtySold, int inSellingPrice, int inCost)
    //the parameterized constructor of the StockSold class
    {
        stockID = inStockID;//sets the value of the stockID variable to the value of the parameters(inStockID)
        productID = inProductID;//sets the value of the productID variable to the value of the parameters(inProductID)
        qtySold = inQtySold;//sets the value of the qtySold variable to the value of the parameters(inQtySold)
        cost = inCost;//sets the value of the cost variable to the value of the parametersIinCost)
        sellingPrice = inSellingPrice;//sets the value of the sellingPrice to the value of the parameters
        //(inSellingPrice)
    }

    public StockSold()//the default constructor - it runs when no parameters are passed through the parameterized 
    {//constructor
    }

    public int getStockID()//retruns the value stored in the stockID variable
    {
        return stockID;
    }

    public int getSalesID()//returns the value stored in the salesID variable
    {
        return salesID;
    }

    public String getProductID()//returns the value stored in the productID variable
    {
        return productID;
    }

    public int getQtySold()//returns the value stored in the qtySold variable
    {
        return qtySold;
    }

    public int getCost()//returns the value stored in the cost variable
    {
        return cost;
    }

    public int getSellingPrice()//returns the value stored in the sellingPrice variable
    {
        return sellingPrice;
    }

    public void setStockID(int inStockID)//retrieves a stockID as a parameter and sets the variable to the parameter
    {
        stockID = inStockID;
    }

    public void setSalesID(int inSalesID)//retrieves a sales id as a parameter and sets the global variable to the 
    //parameterized value
    {
        salesID = inSalesID;
    }

    public void setProductID(String inProductID)//retrieves a product id as a parameter and sets the variable to the 
    //parameter value
    {
        productID = inProductID;
    }

    public void setQtySold(int inQtySold)//retrives a quantity as a parameter and sets the value of the variable to the 
    //value of the parameter
    {
        qtySold = inQtySold;
    }

    public void setCost(int inCost)//retrieves a value for the cost as a parameter and sets the variable to the value of 
    //the parameter
    {
        cost = inCost;
    }

    public void setSellingPrice(int inSellingPrice)//retrieves a selling price as a parameter and sets the variable to 
    //the value of the parameter
    {
        sellingPrice = inSellingPrice;
    }

    @Override
    public String toString()//combines and returns all the fields of the object in the form of a String
    {
        return "StockSold{" + "stockID=" + stockID + ", salesID=" + salesID + ", productID=" + productID + ", "
                + "qtySold=" + qtySold + ", sellingPrice=" + sellingPrice + ", cost=" + cost + '}';
    }

}
