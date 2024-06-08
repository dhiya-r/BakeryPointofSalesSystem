package GUI;

import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.sql.SQLException;
import java.util.Scanner;

public class HelpScreen extends javax.swing.JFrame
{

    private String username;//declares the username variable as a global variable that can only be accessed within 
    //this frame
    private int userLevel;//declares the userlevle variable as a global variable that can only be accessed within 
    //this frame
    private Data.UsersData ud;//declares an object of the UsersData class

    public HelpScreen(String filename, String inUsername, int inUserlevel) throws SQLException//the parameterized 
    //constructor - retrieves values as a parameter
    {
        initComponents();
        username = inUsername;//sets the username variable to the value of the parameter
        userLevel = inUserlevel;//sets the userlevel variable to the value of the parameter
        lblUsernameDB.setText(username);//sets the username lbl to the user that has logged in
        lblUserLevelDB.setText("" + userLevel);//sets the value of the user level lbl to the user level of the user 
        //that has logged in
        ud = new Data.UsersData();
        this.getContentPane().setBackground(new java.awt.Color(227, 242, 253));//to change to colour of a screen
        try//reads the data from a text file
        {
            Scanner inputStream = new Scanner(new FileInputStream(filename));//code to read from the text doc to 
            //the text area
            while (inputStream.hasNextLine())
            {
                txaDisplay.append(inputStream.nextLine() + "\n");
            }
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
        txaDisplay.select(0, 0);//sets cursor at the top
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lpHelpScreen = new javax.swing.JLayeredPane();
        lblUsername = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        lblUserLevel = new javax.swing.JLabel();
        lblHelp = new javax.swing.JLabel();
        lblUsernameDB = new javax.swing.JLabel();
        spHelp = new javax.swing.JScrollPane();
        txaDisplay = new javax.swing.JTextArea();
        lblUserLevelDB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Help");
        setUndecorated(true);

        lpHelpScreen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(19, 100, 173));
        lblUsername.setText("Username: ");

        btnReturn.setBackground(new java.awt.Color(197, 227, 218));
        btnReturn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnReturn.setForeground(new java.awt.Color(19, 100, 173));
        btnReturn.setText("Return");
        btnReturn.setToolTipText("Return to Main Menu");
        btnReturn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnReturn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnReturnActionPerformed(evt);
            }
        });

        lblUserLevel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUserLevel.setForeground(new java.awt.Color(19, 100, 173));
        lblUserLevel.setText("User Level: ");

        lblHelp.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblHelp.setForeground(new java.awt.Color(19, 100, 173));
        lblHelp.setText("Help Screen");

        lblUsernameDB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsernameDB.setForeground(new java.awt.Color(19, 100, 173));

        txaDisplay.setEditable(false);
        txaDisplay.setBackground(new java.awt.Color(227, 242, 253));
        txaDisplay.setColumns(20);
        txaDisplay.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txaDisplay.setRows(5);
        txaDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        spHelp.setViewportView(txaDisplay);

        lblUserLevelDB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUserLevelDB.setForeground(new java.awt.Color(19, 100, 173));

        lpHelpScreen.setLayer(lblUsername, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpHelpScreen.setLayer(btnReturn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpHelpScreen.setLayer(lblUserLevel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpHelpScreen.setLayer(lblHelp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpHelpScreen.setLayer(lblUsernameDB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpHelpScreen.setLayer(spHelp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpHelpScreen.setLayer(lblUserLevelDB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpHelpScreenLayout = new javax.swing.GroupLayout(lpHelpScreen);
        lpHelpScreen.setLayout(lpHelpScreenLayout);
        lpHelpScreenLayout.setHorizontalGroup(
            lpHelpScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpHelpScreenLayout.createSequentialGroup()
                .addGroup(lpHelpScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lpHelpScreenLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(lpHelpScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(lpHelpScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(lpHelpScreenLayout.createSequentialGroup()
                                    .addGroup(lpHelpScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblUserLevel)
                                        .addComponent(lblUsername))
                                    .addGap(18, 18, 18)
                                    .addGroup(lpHelpScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblUsernameDB, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                        .addComponent(lblUserLevelDB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(spHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(lpHelpScreenLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(lblHelp)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lpHelpScreenLayout.setVerticalGroup(
            lpHelpScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpHelpScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lpHelpScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(lblUsernameDB, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lpHelpScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUserLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUserLevelDB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lblHelp)
                .addGap(20, 20, 20)
                .addComponent(spHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lpHelpScreen)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lpHelpScreen)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnReturnActionPerformed
    {//GEN-HEADEREND:event_btnReturnActionPerformed
        this.dispose();//closes the help screen
    }//GEN-LAST:event_btnReturnActionPerformed

    public static void main(String args[]) throws SQLException
    {
        new HelpScreen("HelpScreenMainMenu.txt", "KDanvers4", 3).setVisible(true);//need to send the parameter here if 
        //the constructor is parameterized
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel lblHelp;
    private javax.swing.JLabel lblUserLevel;
    private javax.swing.JLabel lblUserLevelDB;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsernameDB;
    private javax.swing.JLayeredPane lpHelpScreen;
    private javax.swing.JScrollPane spHelp;
    private javax.swing.JTextArea txaDisplay;
    // End of variables declaration//GEN-END:variables
}
