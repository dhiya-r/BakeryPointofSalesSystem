package GUI;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginScreen extends javax.swing.JFrame
{

    private Data.UsersData ud;//declares an object of the usersData class

    public LoginScreen() throws SQLException
    {
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(227, 242, 253));//changes the colour of the background
        ud = new Data.UsersData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lpLoginScreen = new javax.swing.JLayeredPane();
        lblLogin = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txfPassword = new javax.swing.JPasswordField();
        txfUsername = new javax.swing.JTextField();
        cbShowPassword = new javax.swing.JCheckBox();
        btnNext = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        lpLoginScreen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblLogin.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(19, 100, 173));
        lblLogin.setText("LOGIN");

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(19, 100, 173));
        lblUsername.setText("Username:");

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(19, 100, 173));
        lblPassword.setText("Password: ");

        txfPassword.setBackground(new java.awt.Color(227, 242, 253));
        txfPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfPassword.setForeground(new java.awt.Color(19, 100, 173));
        txfPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txfUsername.setBackground(new java.awt.Color(227, 242, 253));
        txfUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfUsername.setForeground(new java.awt.Color(19, 100, 173));
        txfUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbShowPassword.setBackground(new java.awt.Color(227, 242, 253));
        cbShowPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbShowPassword.setForeground(new java.awt.Color(19, 100, 173));
        cbShowPassword.setText("Show Password");
        cbShowPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbShowPassword.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cbShowPasswordActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(197, 227, 218));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnNext.setForeground(new java.awt.Color(19, 100, 173));
        btnNext.setText(" Next ");
        btnNext.setToolTipText("Opens up Main Menu");
        btnNext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnNext.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNextActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(197, 227, 218));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(19, 100, 173));
        btnCancel.setText("Cancel");
        btnCancel.setToolTipText("Closes the Login Screen");
        btnCancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnCancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelActionPerformed(evt);
            }
        });

        lpLoginScreen.setLayer(lblLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpLoginScreen.setLayer(lblUsername, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpLoginScreen.setLayer(lblPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpLoginScreen.setLayer(txfPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpLoginScreen.setLayer(txfUsername, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpLoginScreen.setLayer(cbShowPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpLoginScreen.setLayer(btnNext, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpLoginScreen.setLayer(btnCancel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpLoginScreen.setLayer(lblImage, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpLoginScreenLayout = new javax.swing.GroupLayout(lpLoginScreen);
        lpLoginScreen.setLayout(lpLoginScreenLayout);
        lpLoginScreenLayout.setHorizontalGroup(
            lpLoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpLoginScreenLayout.createSequentialGroup()
                .addGroup(lpLoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lpLoginScreenLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(lblLogin))
                    .addGroup(lpLoginScreenLayout.createSequentialGroup()
                        .addGroup(lpLoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lpLoginScreenLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(lpLoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(lpLoginScreenLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(lblUsername))
                                    .addComponent(lblPassword))
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpLoginScreenLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(lpLoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(lpLoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbShowPassword)
                                .addComponent(txfUsername)
                                .addComponent(txfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        lpLoginScreenLayout.setVerticalGroup(
            lpLoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpLoginScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogin)
                .addGap(18, 18, 18)
                .addGroup(lpLoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(lpLoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lpLoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lpLoginScreenLayout.createSequentialGroup()
                        .addComponent(cbShowPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lpLoginScreen)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lpLoginScreen)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelActionPerformed
    {//GEN-HEADEREND:event_btnCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNextActionPerformed
    {//GEN-HEADEREND:event_btnNextActionPerformed
        Data.Users u = ud.getUser(txfUsername.getText().trim());//creates an object of the Users class - its intialized 
        //to find the position of the user entered in the usersList and to hold the information for the user
        if (u.getUsername().equals(txfUsername.getText().trim()))//checks that the username in the database equals the 
        //username entered
        {
            if (u.getUserPassword().equals(txfPassword.getText().trim()))//checks if the password matches the password 
            //in the database
            {
                if (u.getUserStatus())//gets the user status of the user
                {
                    this.dispose();//closes the screen
                    new MainMenuScreen(txfUsername.getText(), u.getUserLevel()).setVisible(true);//opens up the main 
                    //menu screen - uses the username and password entered s parameters to display the username and 
                    //userlevel of the user on the main menu screen
                } else
                {
                    JOptionPane.showMessageDialog(null, "Invalid user", "ERROR", JOptionPane.ERROR_MESSAGE);
                    txfPassword.setText("");
                    txfUsername.setText("");
                    txfPassword.requestFocus();
                }
            } else
            {
                JOptionPane.showMessageDialog(null, "Invalid Password", "ERROR", JOptionPane.ERROR_MESSAGE);
                txfPassword.setText("");
                txfPassword.requestFocus();
            }
        } else
        {
            JOptionPane.showMessageDialog(null, "Invalid Username", "ERROR", JOptionPane.ERROR_MESSAGE);
            txfUsername.setText("");
            txfUsername.requestFocus();
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void cbShowPasswordActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cbShowPasswordActionPerformed
    {//GEN-HEADEREND:event_cbShowPasswordActionPerformed
        if (cbShowPassword.isSelected())//checks if checkbox is selected
        {
            txfPassword.setEchoChar((char) 0);//shows the characters of the password
        } else
        {
            txfPassword.setEchoChar('•');//hides the characters of the password
        }
    }//GEN-LAST:event_cbShowPasswordActionPerformed

    public static void main(String args[]) throws SQLException
    {
        new LoginScreen().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnNext;
    private javax.swing.JCheckBox cbShowPassword;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLayeredPane lpLoginScreen;
    private javax.swing.JPasswordField txfPassword;
    private javax.swing.JTextField txfUsername;
    // End of variables declaration//GEN-END:variables
}
