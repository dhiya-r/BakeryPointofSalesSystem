package Data;

public class Users
{

    private String userName;//declaring the username variable as a global variable that can only be accessed within 
    //the Users class
    private String passwords;//declaring the passwords variable as a global variable that can only be accessed within 
    //the Users class
    private int userLevel;//declaring the userLevel variable as a global variable that can only be accessed within the 
    //Users class
    private boolean userStatus;//declaring the userStatus variable as a global variable that can only be accessed within 
    //the Users class

    public Users(String inUsers, String inPasswords, int inLevels, boolean inStatus)//the parameterized constructor 
    //of the Users class - it recieves values as parameters
    {
        userName = inUsers;//sets the value of the username variable to the value of the parameter(inUsers)
        passwords = inPasswords;//sets the value of the passwords variable to the value of the parameter(inPasswords)
        userLevel = inLevels;//sets the value of the userLevel variable to the value of the parameter(inLevels)
        userStatus = inStatus;//sets the value of the userstatus variable to the value of the parameters(inStatus)
    }

    public Users()//the default constructor - it runs when no parameters are passed through the parameterized 
    {//constructor
    }

    public String getUsername()//returns the value stored in the username variable from the table
    {
        return userName;
    }

    public String getUserPassword()//returns the value stored in the paswords variable in the table
    {
        return passwords;
    }

    public int getUserLevel()//returns the value stored in the userlevel variable
    {
        return userLevel;
    }

    public void setUserName(String inUsers)//retrieves the username so the value can be altered
    {
        userName = inUsers;
    }

    public void setPassword(String inPasswords)//gets the password value so it can be changed
    {
        passwords = inPasswords;
    }

    public void setUserLevel(int inLevels)//gets the user level so it can be changed
    {
        userLevel = inLevels;
    }

    public boolean getUserStatus()//reads the user level value from the table
    {
        return userStatus;
    }

    public void setUIserStatus(boolean inStatus)//gets the status of the user so it can be changed
    {
        userStatus = inStatus;
    }

}
