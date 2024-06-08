package GUI;

import java.awt.Desktop;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainMenuScreen extends javax.swing.JFrame
{

    public MainMenuScreen(String username, int userLevel)//parameterized constructor - retrieves parameters for the 
    //username and userlevel
    {
        initComponents();
        lblUsernameDB.setText(username);//sets the username lbl to the user that has logged in
        lblUserLevelDB.setText("" + userLevel);//sets the value of the user level lbl to the user level of the user 
        //that has logged in
        this.getContentPane().setBackground(new java.awt.Color(227, 242, 253));//to change to colour of a screen

        if (userLevel == 1)//for restrictions according to users level ie wont allow users under a certain level to 
        //access certain buttons
        {//restrictios if the user level is equal to 1
            btnUsers.setEnabled(true);//can access this screen
            btnProducts.setEnabled(true);//can access this screen
            btnChangePassword.setEnabled(true);//can access this screen
            btnHelp.setEnabled(true);//can access this screen
            btnLogout.setEnabled(true);//cant access this screen
            btnSales.setEnabled(false);//cant access this screen
            btnReports.setEnabled(true);//cant access this screen
        }

        if (userLevel == 2)//restrictions if the user level is equal to 2
        {
            btnUsers.setEnabled(true);//can access this screen
            btnProducts.setEnabled(true);//can access this screen
            btnChangePassword.setEnabled(true);//can access this screen
            btnHelp.setEnabled(true);//can access this screen
            btnLogout.setEnabled(true);//can access this screen
            btnSales.setEnabled(false);//cant access this screen
            btnReports.setEnabled(true);//cant access this screen
        }

        if (userLevel == 3) //resrrictions if the userlevel is  equal to 3
        {
            btnUsers.setEnabled(true);//can access this screen
            btnProducts.setEnabled(true);//can access this screen
            btnChangePassword.setEnabled(true);//can access this screen
            btnHelp.setEnabled(true);//can access this screen
            btnLogout.setEnabled(true);//can access this screen
            btnSales.setEnabled(true);//can access this screen
            btnReports.setEnabled(true);//can access this screen
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lpMainMenu = new javax.swing.JLayeredPane();
        lblMainMenu = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblUserLevel = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        lblUserLevelDB = new javax.swing.JLabel();
        lblUsernameDB = new javax.swing.JLabel();
        btnChangePassword = new javax.swing.JButton();
        btnUsers = new javax.swing.JButton();
        btnReports = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnProducts = new javax.swing.JButton();
        btnSales = new javax.swing.JButton();

        setUndecorated(true);

        lpMainMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblMainMenu.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblMainMenu.setForeground(new java.awt.Color(19, 100, 173));
        lblMainMenu.setText("Main Menu");

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(19, 100, 173));
        lblUsername.setText("Username: ");

        lblUserLevel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUserLevel.setForeground(new java.awt.Color(19, 100, 173));
        lblUserLevel.setText("User Level: ");

        btnLogout.setBackground(new java.awt.Color(197, 227, 218));
        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(19, 100, 173));
        btnLogout.setText("Logout");
        btnLogout.setToolTipText("Returns to the Login screen");
        btnLogout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnLogout.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLogoutActionPerformed(evt);
            }
        });

        lblUserLevelDB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUserLevelDB.setForeground(new java.awt.Color(19, 100, 173));
        lblUserLevelDB.setText("DB");

        lblUsernameDB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsernameDB.setForeground(new java.awt.Color(19, 100, 173));
        lblUsernameDB.setText("DB");

        btnChangePassword.setBackground(new java.awt.Color(197, 227, 218));
        btnChangePassword.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnChangePassword.setForeground(new java.awt.Color(19, 100, 173));
        btnChangePassword.setText("Change Password");
        btnChangePassword.setToolTipText("Opens the Change Password screen");
        btnChangePassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnChangePassword.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnChangePasswordActionPerformed(evt);
            }
        });

        btnUsers.setBackground(new java.awt.Color(197, 227, 218));
        btnUsers.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnUsers.setForeground(new java.awt.Color(19, 100, 173));
        btnUsers.setText("Users");
        btnUsers.setToolTipText("Opens the Users Screen");
        btnUsers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnUsers.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnUsersActionPerformed(evt);
            }
        });

        btnReports.setBackground(new java.awt.Color(197, 227, 218));
        btnReports.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnReports.setForeground(new java.awt.Color(19, 100, 173));
        btnReports.setText("Reports");
        btnReports.setToolTipText("Opens the Reports Screen");
        btnReports.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnReports.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnReportsActionPerformed(evt);
            }
        });

        btnHelp.setBackground(new java.awt.Color(197, 227, 218));
        btnHelp.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnHelp.setForeground(new java.awt.Color(19, 100, 173));
        btnHelp.setText("Help");
        btnHelp.setToolTipText("Opens the Help screen");
        btnHelp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnHelpActionPerformed(evt);
            }
        });

        btnProducts.setBackground(new java.awt.Color(197, 227, 218));
        btnProducts.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnProducts.setForeground(new java.awt.Color(19, 100, 173));
        btnProducts.setText("Products");
        btnProducts.setToolTipText("Opens the Products Screen");
        btnProducts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnProducts.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnProductsActionPerformed(evt);
            }
        });

        btnSales.setBackground(new java.awt.Color(197, 227, 218));
        btnSales.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnSales.setForeground(new java.awt.Color(19, 100, 173));
        btnSales.setText("Sales");
        btnSales.setToolTipText("Opens the Sales Screen");
        btnSales.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnSales.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSalesActionPerformed(evt);
            }
        });

        lpMainMenu.setLayer(lblMainMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpMainMenu.setLayer(lblUsername, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpMainMenu.setLayer(lblUserLevel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpMainMenu.setLayer(btnLogout, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpMainMenu.setLayer(lblUserLevelDB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpMainMenu.setLayer(lblUsernameDB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpMainMenu.setLayer(btnChangePassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpMainMenu.setLayer(btnUsers, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpMainMenu.setLayer(btnReports, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpMainMenu.setLayer(btnHelp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpMainMenu.setLayer(btnProducts, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpMainMenu.setLayer(btnSales, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpMainMenuLayout = new javax.swing.GroupLayout(lpMainMenu);
        lpMainMenu.setLayout(lpMainMenuLayout);
        lpMainMenuLayout.setHorizontalGroup(
            lpMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpMainMenuLayout.createSequentialGroup()
                .addGroup(lpMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lpMainMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(lpMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lpMainMenuLayout.createSequentialGroup()
                                .addGroup(lpMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblUserLevel)
                                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(lpMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblUsernameDB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUserLevelDB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(lpMainMenuLayout.createSequentialGroup()
                                .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(lpMainMenuLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(lblMainMenu))
                    .addGroup(lpMainMenuLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(lpMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lpMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnSales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUsers, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        lpMainMenuLayout.setVerticalGroup(
            lpMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpMainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lpMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUsernameDB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(lpMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserLevel)
                    .addComponent(lblUserLevelDB, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblMainMenu)
                .addGap(18, 18, 18)
                .addComponent(btnUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSales, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReports, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(lpMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lpMainMenu)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lpMainMenu)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnChangePasswordActionPerformed
    {//GEN-HEADEREND:event_btnChangePasswordActionPerformed
        this.dispose();//closes this screen
        try
        {
            new ChangePasswordScreen(lblUsernameDB.getText().trim(), Integer.parseInt(
                    lblUserLevelDB.getText().trim())).setVisible(true);//used to open the screen - parameters used to 
            //display the username and user level
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void btnUsersActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnUsersActionPerformed
    {//GEN-HEADEREND:event_btnUsersActionPerformed
        this.dispose();//closes this screen(main menu screen)
        try
        {
            new UsersScreen(lblUsernameDB.getText().trim(), Integer.parseInt(
                    lblUserLevelDB.getText().trim())).setVisible(true);//used to open up the users screen - parameters 
            //to display the username and userlevel in the users screen
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnUsersActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLogoutActionPerformed
    {//GEN-HEADEREND:event_btnLogoutActionPerformed
        this.dispose();//closes the main menu screen
        try
        {
            new LoginScreen().setVisible(true);//returns to login screen
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnReportsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnReportsActionPerformed
    {//GEN-HEADEREND:event_btnReportsActionPerformed
        this.dispose();//closes the main menu screen
        try
        {
            new ReportsScreen(lblUsernameDB.getText().trim(), Integer.parseInt(
                    lblUserLevelDB.getText().trim())).setVisible(true);//opens the reports screen - the parameters are 
            //used to display the username and user level in the reports screen
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnReportsActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHelpActionPerformed
    {//GEN-HEADEREND:event_btnHelpActionPerformed
        try
        {//opens the help screen
            new HelpScreen("HelpScreenMainMenu.txt", lblUsernameDB.getText().trim(), Integer.parseInt(
                    lblUserLevelDB.getText().trim())).setVisible(true);//"HelpScreenMainMenu.txt" - used to open the 
            //text document    lblUsernameDB.getText().trim(), Integer.parseInt(lblUserLevelDB.getText().trim()) - used 
            //to display the username and the user level
        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnProductsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnProductsActionPerformed
    {//GEN-HEADEREND:event_btnProductsActionPerformed
        this.dispose();//closes the main menu screen 
        try
        {//opens the products screen
            new ProductsScreen(lblUsernameDB.getText().trim(), Integer.parseInt(
                    lblUserLevelDB.getText().trim())).setVisible(true);//lblUsernameDB.getText().trim(), 
            //Integer.parseInt(lblUserLevelDB.getText().trim()) - used as parameters to display the username and user 
            //level in the products screen
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnProductsActionPerformed

    private void btnSalesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSalesActionPerformed
    {//GEN-HEADEREND:event_btnSalesActionPerformed
        this.dispose();//closes the main menu screen
        try
        {//opens the sales screen
            new SalesScreen(lblUsernameDB.getText().trim(), Integer.parseInt(
                    lblUserLevelDB.getText().trim())).setVisible(true);//lblUsernameDB.getText().trim(), 
            //Integer.parseInt(lblUserLevelDB.getText().trim()) - used as parameters to display the username and 
            //user level in the sales screen
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnSalesActionPerformed

    public static void main(String args[])
    {
        new MainMenuScreen("KDanvers4", 3).setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnProducts;
    private javax.swing.JButton btnReports;
    private javax.swing.JButton btnSales;
    private javax.swing.JButton btnUsers;
    private javax.swing.JLabel lblMainMenu;
    private javax.swing.JLabel lblUserLevel;
    private javax.swing.JLabel lblUserLevelDB;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsernameDB;
    private javax.swing.JLayeredPane lpMainMenu;
    // End of variables declaration//GEN-END:variables
}
