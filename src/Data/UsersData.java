package Data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UsersData
{

    private dbManager db;//connects to the dbManager class
    private List<Users> userList = new ArrayList();

    public UsersData() throws SQLException
    {
        db = new dbManager();
        getAllUsers();
    }

    public void getUsersList(String sql) throws SQLException//connects to the table in the database
    {
        ResultSet rs = db.query(sql);//contains the results of an sql query
        userList.clear();//clears out any values in the productList
        while (rs.next())
        {
            Users u = new Users();//creates an object of the Users class

            u.setUserName(rs.getString("USERNAME"));//connects and reads the value in the username column in the table
            u.setPassword(rs.getString("PASSWORD"));//connects and reads the value in the password column in the table
            u.setUserLevel(rs.getInt("USERLEVEL"));//connects and reads the value in the user level column in the table
            u.setUIserStatus(rs.getBoolean("STATUS"));//connects and reads the value in the user status column in the 
            //table
            userList.add(u);//adds the values to the productList
        }
    }

    public void getAllUsers() throws SQLException//SQL - retrieves data from table and orders it according to the 
    //username and displays it
    {
        getUsersList("SELECT * FROM USERS ORDER BY USERNAME");
    }

    public void getAllUsers(String username) throws SQLException//retrieves value from table according to a specific 
    //username and displays it
    {
        getUsersList("SELECT * FROM USERS WHERE USERNAME LIKE '%" + username + "%'");
    }

    public void getAllUsers(int userLevel) throws SQLException//retrieves value from table according to a specific 
    //user level and displays it
    {
        getUsersList("SELECT * FROM USERS WHERE USERLEVEL = " + userLevel);
    }

    public void getAllUsers(boolean status) throws SQLException//retrieves value from table according to a specific 
    //user status and displays it
    {
        getUsersList("SELECT * FROM USERS WHERE STATUS = " + status);
    }

    public Users getUser(String username)//locates a user in the user table according to the username and sees if its 
    //in the table.
    {
        Users u = new Users();//creates an object of the users class
        boolean found = false;
        int counter = 0;
        while (found == false && counter < userList.size())
        {
            u = userList.get(counter);//used to get the data at a specific position in the list
            if (u.getUsername().equalsIgnoreCase(username))//checks to see that the username at a position in the list 
            //equals the username entered as parameters
            {
                found = true;
            }
            counter++;
        }
        return u;
    }

    public void editUser(String username, String password, int userLevel, boolean userStatus) throws SQLException
    //method to edit a specific user from the users screen.
    {
        if (db.update("UPDATE USERS SET PASSWORD = '" + password + "', USERLEVEL = " + userLevel + ", STATUS = "
                + userStatus + " WHERE USERNAME = '" + username + "'") > 0)//SQL - updates the user in the database
        {
            getAllUsers();//It refreshes the list because the password of a user has been changed - gets all current 
            //data
            JOptionPane.showMessageDialog(null, "User successfully edited", "INFORMATION",
                    JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "User NOT edited", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void populateJTable(javax.swing.JTable userTable, int rowPosition)//populates the table in the screen with 
    //the fields in the database
    {
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();

        model.setRowCount(0);

        for (int i = 0; i < userList.size(); i++)
        {
            Data.Users u = userList.get(i);
            Object[] rowData =
            {
                u.getUsername(), u.getUserPassword(), u.getUserLevel(), u.getUserStatus()//the order that the table 
            //will be displayed. It must be in the same order as the fields in the database otherwise the 
            //values will be mixed and incorrect
            };
            model.addRow(rowData);
        }

        userTable.setModel(model);

        if (userTable.getRowCount() > 0)
        {
            userTable.setRowSelectionInterval(rowPosition, rowPosition);//selects the row
            userTable.setRowSelectionInterval(0, 0);
            userTable.scrollRectToVisible(userTable.getCellRect(rowPosition, 0, true));//this is to move the scroller 
            //to the selected row
        } else
        {
            JOptionPane.showMessageDialog(null, "No records available", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public int getUserPosition(String username)//gets the position of a user according to the username.
    {
        Users u = new Users();//creates an object of the users class

        boolean found = false;
        int counter = 0;
        while (found == false && counter < userList.size())
        {
            u = userList.get(counter);//used to get the data at a specific position in the Users list
            if (u.getUsername().equalsIgnoreCase(username))//checks that the username at a position in the list 
            //equals the username entered as parameters
            {
                found = true;
            }
            counter++;
        }
        return counter - 1;//returns the position that the username was at
    }

    public void deleteUser(String username) throws SQLException//detetes a user from the database
    {
        if (db.update("DELETE * FROM USERS WHERE USERNAME = '" + username + "'") > 0)//SQL to delete a user
        {
            getAllUsers();//refreshes the table in the screen to display the new/updated table without the deleted user
            JOptionPane.showMessageDialog(null, "User successfully deleted", "INFORMATION",
                    JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "User NOT deleted", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void addUser(String username, String password, int userLevel, boolean status) throws SQLException
    //method to add a user to the database
    {
        if (db.update("INSERT INTO USERS(USERNAME, PASSWORD, USERLEVEL,STATUS) VALUES('" + username + "','" + password 
                + "',"+ userLevel + "," + status + ")") > 0)//SQL - to insert/add a user to the database
        {
            getAllUsers();//once the user has been added/updated this refreshes the list and displays the updated table
            JOptionPane.showMessageDialog(null, "User successfully added to database", "INFORMATION",
                    JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "User NOT added to database", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}
