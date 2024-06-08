package Data;

import java.util.Date;

public class Sales
{
    private int salesId;//declaring the salesId variable as a global variable that can only be accessed within the 
    //Sales class
    private Date dateOfSale;//declaring the dateOfSale variable as a global variable that can only be accessed within 
    //the Sales class
    private Date timeOfSale;//declaring the timeOfSale variable as a global variable that can only be accessed within 
    //the Sales class
    private String username;//declaring the username variable as a global variable that can only be accessed within 
    //the Sales class

    public Sales(int inSalesId, Date inDateOfSale, Date inTimeOfSale,String inUsername)//the parameterised constructorb 
            //- retrieves values to be altered as parameters
    {
        salesId = inSalesId;//sets the value of the salesId variable to the value of the parameters(inSalesId)
        dateOfSale = inDateOfSale;//sets the value of the dateOfSale variable to the value of the parmeter(inDateOfSale)
        timeOfSale = inTimeOfSale;//sets the value of the timeOfSale variable to the value of the parameters
        //(inTimeOfSale)
        username = inUsername;//sets the value of the username variable to the value of the parameters(inUsername)
    }

    public Sales()//the default constructor - it runs when no parameters are passed through the parameterized 
    {//constructor
    }

    public int getSalesId()//returns the value stored in the salesId variable
    {
        return salesId;
    }

    public Date getDateOfSale()//returns the value stored in the dateOfSale variable
    {
        return dateOfSale;
    }

    public Date getTimeOfSale()//returns the value stored in the timeOfSale variable
    {
        return timeOfSale;
    }

    public String getUsername()//returns the value stored in the username variable
    {
        return username;
    }

    public void setSalesId(int inSalesId)//a sales id is passed through as a parameter and is stored in the salesId 
            //variable
    {
        salesId = inSalesId;
    }

    public void setDateOfSale(Date inDateOfSale)//a date of sale value is passed through as a parameter and is stored 
            //in the dateOfSale variable
    {
        dateOfSale = inDateOfSale;
    }

    public void setTimeOfSale(Date inTimeOfSale)//a time of sale value is paassed as parameters and is stored in the 
            //timeOfSale variable
    {
        timeOfSale = inTimeOfSale;
    }

    public void setUsername(String inUsername)//a username value is passed as parameters and stored in the username 
            //variable
    {
        username = inUsername;
    }

    @Override
    public String toString()//combines and returns all the fields of the object in the form of a String
    {
        return "Sales{" + "salesId=" + salesId + ", dateOfSale=" + dateOfSale + ", timeOfSale=" + timeOfSale + ", "
                + "username=" + username + '}';
    }

    
}
