package GUI;

import Data.ReportsData;
import java.sql.SQLException;

public class ReportsScreen extends javax.swing.JFrame
{

    private String username;//declaring the username variable as a global variable that can only be accessed in this 
    //frame
    private int userLevel;//declaring hte userLevel variable as a global variable that cna oly be accessed within this 
    //frame
    private Data.ReportsData rd;//declaring an object of the ReportsData class

    public ReportsScreen(String inUsername, int inUserlevel) throws SQLException
    {
        initComponents();
        username = inUsername;
        userLevel = inUserlevel;
        lblUsernameDB.setText(username);//sets the username lbl to the user that has logged in
        lblUserLevelDB.setText("" + userLevel);//sets the value of the user level lbl to the user level of the user 
        //that has logged in
        rd = new ReportsData();//inirializing the object of the reportsData class
        this.getContentPane().setBackground(new java.awt.Color(227, 242, 253));//to change to colour of a screen
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lpReports = new javax.swing.JLayeredPane();
        btnMainMenu = new javax.swing.JButton();
        lblUserLevelDB = new javax.swing.JLabel();
        lblReports = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblUsernameDB = new javax.swing.JLabel();
        lblUserLevel = new javax.swing.JLabel();
        spReports = new javax.swing.JScrollPane();
        txaDisplay = new javax.swing.JTextArea();
        btnDailySales = new javax.swing.JButton();
        btnProductsPerCategory = new javax.swing.JButton();
        btnProdPrice = new javax.swing.JButton();
        btnUsersSales = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(227, 242, 253));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        lpReports.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnMainMenu.setBackground(new java.awt.Color(197, 227, 218));
        btnMainMenu.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnMainMenu.setForeground(new java.awt.Color(19, 100, 173));
        btnMainMenu.setText("Main Menu");
        btnMainMenu.setToolTipText("return to Main Menu");
        btnMainMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnMainMenu.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMainMenuActionPerformed(evt);
            }
        });

        lblUserLevelDB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUserLevelDB.setForeground(new java.awt.Color(19, 100, 173));
        lblUserLevelDB.setText("DB");

        lblReports.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblReports.setForeground(new java.awt.Color(19, 100, 173));
        lblReports.setText("Reports");

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(19, 100, 173));
        lblUsername.setText("Username: ");

        lblUsernameDB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsernameDB.setForeground(new java.awt.Color(19, 100, 173));
        lblUsernameDB.setText("DB");

        lblUserLevel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUserLevel.setForeground(new java.awt.Color(19, 100, 173));
        lblUserLevel.setText("User Level: ");

        txaDisplay.setBackground(new java.awt.Color(227, 242, 253));
        txaDisplay.setColumns(20);
        txaDisplay.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txaDisplay.setForeground(new java.awt.Color(19, 100, 173));
        txaDisplay.setRows(5);
        spReports.setViewportView(txaDisplay);

        btnDailySales.setBackground(new java.awt.Color(197, 227, 218));
        btnDailySales.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnDailySales.setForeground(new java.awt.Color(19, 100, 173));
        btnDailySales.setText("Sales For The Day");
        btnDailySales.setToolTipText("Displays the Sales for the day");
        btnDailySales.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnDailySales.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDailySalesActionPerformed(evt);
            }
        });

        btnProductsPerCategory.setBackground(new java.awt.Color(197, 227, 218));
        btnProductsPerCategory.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnProductsPerCategory.setForeground(new java.awt.Color(19, 100, 173));
        btnProductsPerCategory.setText("Products Per Category");
        btnProductsPerCategory.setToolTipText("Displays the number of products per category");
        btnProductsPerCategory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnProductsPerCategory.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnProductsPerCategoryActionPerformed(evt);
            }
        });

        btnProdPrice.setBackground(new java.awt.Color(197, 227, 218));
        btnProdPrice.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnProdPrice.setForeground(new java.awt.Color(19, 100, 173));
        btnProdPrice.setText("Product Selling Price");
        btnProdPrice.setToolTipText("Displays the products selling price");
        btnProdPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnProdPrice.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnProdPriceActionPerformed(evt);
            }
        });

        btnUsersSales.setBackground(new java.awt.Color(197, 227, 218));
        btnUsersSales.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnUsersSales.setForeground(new java.awt.Color(19, 100, 173));
        btnUsersSales.setText("User's Daily Sales");
        btnUsersSales.setToolTipText("Displays the users daily sales");
        btnUsersSales.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnUsersSales.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnUsersSalesActionPerformed(evt);
            }
        });

        btnPrint.setBackground(new java.awt.Color(197, 227, 218));
        btnPrint.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(19, 100, 173));
        btnPrint.setText("Print");
        btnPrint.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnPrint.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPrintActionPerformed(evt);
            }
        });

        btnHelp.setBackground(new java.awt.Color(197, 227, 218));
        btnHelp.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnHelp.setForeground(new java.awt.Color(19, 100, 173));
        btnHelp.setText("Help");
        btnHelp.setToolTipText("Go to Help screen");
        btnHelp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnHelpActionPerformed(evt);
            }
        });

        lpReports.setLayer(btnMainMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpReports.setLayer(lblUserLevelDB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpReports.setLayer(lblReports, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpReports.setLayer(lblUsername, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpReports.setLayer(lblUsernameDB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpReports.setLayer(lblUserLevel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpReports.setLayer(spReports, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpReports.setLayer(btnDailySales, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpReports.setLayer(btnProductsPerCategory, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpReports.setLayer(btnProdPrice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpReports.setLayer(btnUsersSales, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpReports.setLayer(btnPrint, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpReports.setLayer(btnHelp, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpReportsLayout = new javax.swing.GroupLayout(lpReports);
        lpReports.setLayout(lpReportsLayout);
        lpReportsLayout.setHorizontalGroup(
            lpReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpReportsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lpReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lpReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(lpReportsLayout.createSequentialGroup()
                            .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(lpReportsLayout.createSequentialGroup()
                            .addGroup(lpReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnUsersSales, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnProductsPerCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDailySales, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(spReports, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(lpReportsLayout.createSequentialGroup()
                        .addGroup(lpReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUsername)
                            .addComponent(lblUserLevel))
                        .addGap(18, 18, 18)
                        .addGroup(lpReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserLevelDB, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsernameDB, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(164, 164, 164)
                        .addComponent(lblReports)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lpReportsLayout.setVerticalGroup(
            lpReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpReportsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lpReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lpReportsLayout.createSequentialGroup()
                        .addGroup(lpReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsername)
                            .addComponent(lblUsernameDB, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(lpReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserLevelDB, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUserLevel)))
                    .addComponent(lblReports, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(lpReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lpReportsLayout.createSequentialGroup()
                        .addComponent(btnDailySales, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnProductsPerCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnUsersSales, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addComponent(spReports))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lpReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnDailySales.getAccessibleContext().setAccessibleName("");
        btnProductsPerCategory.getAccessibleContext().setAccessibleName("");
        btnProdPrice.getAccessibleContext().setAccessibleName("");
        btnUsersSales.getAccessibleContext().setAccessibleName("");
        btnPrint.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lpReports)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lpReports)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPrintActionPerformed
    {//GEN-HEADEREND:event_btnPrintActionPerformed
        try
        {
            txaDisplay.print();//prints the reports displayed in the text area
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnUsersSalesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnUsersSalesActionPerformed
    {//GEN-HEADEREND:event_btnUsersSalesActionPerformed
        try
        {
            txaDisplay.setText(rd.getUsersDailySales());//sets the text area to the report UsersDailySales
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnUsersSalesActionPerformed

    private void btnProdPriceActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnProdPriceActionPerformed
    {//GEN-HEADEREND:event_btnProdPriceActionPerformed
        try
        {
            txaDisplay.setText(rd.getProductSellingPrice());//sets the text area to the report ProductSellingPrice
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnProdPriceActionPerformed

    private void btnProductsPerCategoryActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnProductsPerCategoryActionPerformed
    {//GEN-HEADEREND:event_btnProductsPerCategoryActionPerformed
        try
        {
            txaDisplay.setText(rd.getProductsPerCategory());//sets the text area to the report ProductsPerCategory
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnProductsPerCategoryActionPerformed

    private void btnDailySalesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDailySalesActionPerformed
    {//GEN-HEADEREND:event_btnDailySalesActionPerformed
        try
        {
            txaDisplay.setText(rd.getDailySales());//sets the text area to the report DailySales
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnDailySalesActionPerformed

    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMainMenuActionPerformed
    {//GEN-HEADEREND:event_btnMainMenuActionPerformed
        this.dispose();
        try
        {
            new MainMenuScreen(lblUsernameDB.getText().trim(), Integer.parseInt(
                    lblUserLevelDB.getText().trim())).setVisible(true);//used to return to the main menu screen - the 
            //parameters are used to set the username and user level
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnMainMenuActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHelpActionPerformed
    {//GEN-HEADEREND:event_btnHelpActionPerformed
        try
        {
            new HelpScreen("HelpScreenReports.txt", lblUsernameDB.getText().trim(), Integer.parseInt(
                    lblUserLevelDB.getText().trim())).setVisible(true);//opens up the help screen and populates the 
            //text area in the help screen with the text document
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnHelpActionPerformed

    public static void main(String args[]) throws SQLException
    {
        new ReportsScreen("KDanvers4", 3).setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDailySales;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnProdPrice;
    private javax.swing.JButton btnProductsPerCategory;
    private javax.swing.JButton btnUsersSales;
    private javax.swing.JLabel lblReports;
    private javax.swing.JLabel lblUserLevel;
    private javax.swing.JLabel lblUserLevelDB;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsernameDB;
    private javax.swing.JLayeredPane lpReports;
    private javax.swing.JScrollPane spReports;
    private javax.swing.JTextArea txaDisplay;
    // End of variables declaration//GEN-END:variables
}
