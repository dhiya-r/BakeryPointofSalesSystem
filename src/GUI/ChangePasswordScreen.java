package GUI;

import Data.Validation;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ChangePasswordScreen extends javax.swing.JFrame
{

    private String username;//declares the username variable as a global variable that can only be accessed within 
    //this frame
    private int userLevel;//declares the userlevel variable as a global variable that can only be accessed within 
    //this frame
    private Data.UsersData ud;//creates an object of the UsersData class
    private Data.Validation v;//declares an object of the Validation Class

    public ChangePasswordScreen(String inUsername, int inUserlevel) throws SQLException//the parameterized constructor 
    //- retrieves values as a parameeter
    {
        initComponents();
        username = inUsername;//sets the value of the username variable to the value of the parameter
        userLevel = inUserlevel;//sets the userlevel variable to the parameterized value
        v = new Validation();
        lblUsernameDB.setText(username);//sets the username lbl to the user that has logged in
        lblUserLevelDB.setText("" + userLevel);//sets the value of the user level lbl to the user level of the 
        //user that has logged in
        ud = new Data.UsersData();
        this.getContentPane().setBackground(new java.awt.Color(227, 242, 253));//to change to colour of a screen
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lpChangePassword = new javax.swing.JLayeredPane();
        lblUsernameDB = new javax.swing.JLabel();
        lblUserLevelDB = new javax.swing.JLabel();
        txfConfirmPassword = new javax.swing.JPasswordField();
        cbShowPassword = new javax.swing.JCheckBox();
        txfOldPassword = new javax.swing.JPasswordField();
        txfNewPassword = new javax.swing.JPasswordField();
        lblConfirmPassword = new javax.swing.JLabel();
        lblNewPassword = new javax.swing.JLabel();
        lblOldPassword = new javax.swing.JLabel();
        lblChangePassword = new javax.swing.JLabel();
        lblUserLevel = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        btnMainMenu = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        lpChangePassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblUsernameDB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsernameDB.setForeground(new java.awt.Color(19, 100, 173));
        lblUsernameDB.setText("DB");

        lblUserLevelDB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUserLevelDB.setForeground(new java.awt.Color(19, 100, 173));
        lblUserLevelDB.setText("DB");

        txfConfirmPassword.setBackground(new java.awt.Color(202, 233, 245));
        txfConfirmPassword.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txfConfirmPassword.setForeground(new java.awt.Color(19, 100, 173));
        txfConfirmPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbShowPassword.setBackground(new java.awt.Color(202, 233, 245));
        cbShowPassword.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        cbShowPassword.setForeground(new java.awt.Color(19, 100, 173));
        cbShowPassword.setText("Show Password");
        cbShowPassword.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cbShowPasswordActionPerformed(evt);
            }
        });

        txfOldPassword.setBackground(new java.awt.Color(202, 233, 245));
        txfOldPassword.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txfOldPassword.setForeground(new java.awt.Color(19, 100, 173));
        txfOldPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txfNewPassword.setBackground(new java.awt.Color(202, 233, 245));
        txfNewPassword.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txfNewPassword.setForeground(new java.awt.Color(19, 100, 173));
        txfNewPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblConfirmPassword.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lblConfirmPassword.setForeground(new java.awt.Color(19, 100, 173));
        lblConfirmPassword.setText("Confirm Password: ");

        lblNewPassword.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lblNewPassword.setForeground(new java.awt.Color(19, 100, 173));
        lblNewPassword.setText("New Password: ");

        lblOldPassword.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lblOldPassword.setForeground(new java.awt.Color(19, 100, 173));
        lblOldPassword.setText("Old Password: ");

        lblChangePassword.setFont(new java.awt.Font("Arial", 1, 42)); // NOI18N
        lblChangePassword.setForeground(new java.awt.Color(19, 100, 173));
        lblChangePassword.setText("Change Password");

        lblUserLevel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUserLevel.setForeground(new java.awt.Color(19, 100, 173));
        lblUserLevel.setText("User Level: ");

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(19, 100, 173));
        lblUsername.setText("Username: ");

        btnOK.setBackground(new java.awt.Color(197, 227, 218));
        btnOK.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnOK.setForeground(new java.awt.Color(19, 100, 173));
        btnOK.setText("OK");
        btnOK.setToolTipText("Verify the changed password");
        btnOK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnOK.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnOKActionPerformed(evt);
            }
        });

        btnMainMenu.setBackground(new java.awt.Color(197, 227, 218));
        btnMainMenu.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnMainMenu.setForeground(new java.awt.Color(19, 100, 173));
        btnMainMenu.setText("Main Menu");
        btnMainMenu.setToolTipText("Return to Main Menu");
        btnMainMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnMainMenu.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMainMenuActionPerformed(evt);
            }
        });

        btnHelp.setBackground(new java.awt.Color(197, 227, 218));
        btnHelp.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnHelp.setForeground(new java.awt.Color(19, 100, 173));
        btnHelp.setText("Help");
        btnHelp.setToolTipText("Open the Help screen");
        btnHelp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnHelpActionPerformed(evt);
            }
        });

        lpChangePassword.setLayer(lblUsernameDB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpChangePassword.setLayer(lblUserLevelDB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpChangePassword.setLayer(txfConfirmPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpChangePassword.setLayer(cbShowPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpChangePassword.setLayer(txfOldPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpChangePassword.setLayer(txfNewPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpChangePassword.setLayer(lblConfirmPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpChangePassword.setLayer(lblNewPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpChangePassword.setLayer(lblOldPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpChangePassword.setLayer(lblChangePassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpChangePassword.setLayer(lblUserLevel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpChangePassword.setLayer(lblUsername, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpChangePassword.setLayer(btnOK, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpChangePassword.setLayer(btnMainMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpChangePassword.setLayer(btnHelp, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpChangePasswordLayout = new javax.swing.GroupLayout(lpChangePassword);
        lpChangePassword.setLayout(lpChangePasswordLayout);
        lpChangePasswordLayout.setHorizontalGroup(
            lpChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpChangePasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lpChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lpChangePasswordLayout.createSequentialGroup()
                        .addComponent(lblUserLevel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUserLevelDB, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lpChangePasswordLayout.createSequentialGroup()
                        .addComponent(lblUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUsernameDB, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lpChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lpChangePasswordLayout.createSequentialGroup()
                            .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lpChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lpChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(lpChangePasswordLayout.createSequentialGroup()
                                    .addComponent(lblConfirmPassword)
                                    .addGap(32, 32, 32)
                                    .addComponent(txfConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(lpChangePasswordLayout.createSequentialGroup()
                                    .addComponent(lblNewPassword)
                                    .addGap(32, 32, 32)
                                    .addComponent(txfNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbShowPassword))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpChangePasswordLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(lblOldPassword)
                                .addGap(32, 32, 32)
                                .addComponent(txfOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblChangePassword))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lpChangePasswordLayout.setVerticalGroup(
            lpChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpChangePasswordLayout.createSequentialGroup()
                .addGroup(lpChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsernameDB, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lpChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserLevel)
                    .addComponent(lblUserLevelDB, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblChangePassword)
                .addGap(18, 18, 18)
                .addGroup(lpChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOldPassword)
                    .addComponent(txfOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lpChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewPassword)
                    .addComponent(txfNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lpChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmPassword)
                    .addComponent(txfConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cbShowPassword)
                .addGap(18, 18, 18)
                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 35, Short.MAX_VALUE)
                .addGroup(lpChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lpChangePassword)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lpChangePassword)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnOKActionPerformed
    {//GEN-HEADEREND:event_btnOKActionPerformed
        try
        {
            if (ud.getUser(username).getUserPassword().equalsIgnoreCase(txfOldPassword.getText()))//checks that the 
            //old password is the correct password entered
            {
                if (txfNewPassword.getText().equals(txfConfirmPassword.getText().trim()))//checks that the new password 
                //and the comfirmed new password are equal
                {
                    if (txfConfirmPassword.getText().trim().length() > 7 && txfConfirmPassword.getText().trim().length()
                            < 31)
                    {
                        if (txfNewPassword.getText().trim().length() > 7 && txfNewPassword.getText().trim().length()
                                < 31)
                        {
                            if (txfOldPassword.getText().trim().length() > 7 && txfOldPassword.getText().trim().length()
                                    < 31)
                            {
                                ud.editUser(username, txfConfirmPassword.getText(), userLevel, true);
                                //we are replacing the old password with the new password only
                            } else
                            {
                                JOptionPane.showMessageDialog(null, "Invalid Password.The password must be more than "
                                        + "8 and less than 30 characters long", "ERROR", JOptionPane.ERROR_MESSAGE);
                                txfOldPassword.setText("");
                                txfOldPassword.requestFocus();
                            }
                        } else
                        {
                            JOptionPane.showMessageDialog(null, "Invalid Password. The password must be more than 8 "
                                    + "and less than 30 characters long", "ERROR", JOptionPane.ERROR_MESSAGE);
                            txfNewPassword.setText("");
                            txfNewPassword.requestFocus();
                        }
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "Invalid Password. The password must be more than 8 and "
                                + "less than 30 characters long", "ERROR", JOptionPane.ERROR_MESSAGE);
                        txfConfirmPassword.setText("");
                        txfConfirmPassword.requestFocus();
                    }
                } else
                {
                    JOptionPane.showMessageDialog(null, "Passwords dont match", "Error", JOptionPane.ERROR);
                    txfNewPassword.setText("");//sets the text field to null
                    txfConfirmPassword.setText("");//sets the text field to null
                    txfNewPassword.requestFocus();
                    txfConfirmPassword.requestFocus();
                }
            } else
            {
                JOptionPane.showMessageDialog(null, "Invalid Password", "Error", JOptionPane.ERROR);
                txfOldPassword.setText("");
                txfOldPassword.requestFocus();
            }
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void cbShowPasswordActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cbShowPasswordActionPerformed
    {//GEN-HEADEREND:event_cbShowPasswordActionPerformed
        if (cbShowPassword.isSelected())//checks to see if the check box is selected
        {
            txfOldPassword.setEchoChar((char) 0);//shows the characters in the old password text field
            txfNewPassword.setEchoChar((char) 0);//shows the characters in the new password text field
            txfConfirmPassword.setEchoChar((char) 0);//shows the characters in the confirm password text field
        } else
        {
            txfOldPassword.setEchoChar('•');//hides the characters and displays the circle instead
            txfNewPassword.setEchoChar('•');
            txfConfirmPassword.setEchoChar('•');
        }
    }//GEN-LAST:event_cbShowPasswordActionPerformed

    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMainMenuActionPerformed
    {//GEN-HEADEREND:event_btnMainMenuActionPerformed
        try
        {
            this.dispose();//returns to the previous screen that the user was on ie - main menu
            new MainMenuScreen(lblUsernameDB.getText().trim(), Integer.parseInt(
                    lblUserLevelDB.getText().trim())).setVisible(true);
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }

    }//GEN-LAST:event_btnMainMenuActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHelpActionPerformed
    {//GEN-HEADEREND:event_btnHelpActionPerformed
        try
        {
            new HelpScreen("HelpScreenChangePassword.txt", lblUsernameDB.getText().trim(), Integer.parseInt(
                    lblUserLevelDB.getText().trim())).setVisible(true);//used to open up the help screen and opens 
            //up the text doc
        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_btnHelpActionPerformed

    public static void main(String args[]) throws SQLException
    {
        new ChangePasswordScreen("KDanvers4", 3).setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JButton btnOK;
    private javax.swing.JCheckBox cbShowPassword;
    private javax.swing.JLabel lblChangePassword;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblNewPassword;
    private javax.swing.JLabel lblOldPassword;
    private javax.swing.JLabel lblUserLevel;
    private javax.swing.JLabel lblUserLevelDB;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsernameDB;
    private javax.swing.JLayeredPane lpChangePassword;
    private javax.swing.JPasswordField txfConfirmPassword;
    private javax.swing.JPasswordField txfNewPassword;
    private javax.swing.JPasswordField txfOldPassword;
    // End of variables declaration//GEN-END:variables
}
