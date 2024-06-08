package GUI;

import Data.ProductsData;
import Data.SalesData;
import Data.StockSold;
import Data.StockSoldData;
import java.sql.SQLException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

public class SalesScreen extends javax.swing.JFrame
{

    private Data.SalesData sd;//declaring an object of the SalesData class
    private Data.StockSold ss;//declaring an object of the StockSold class
    private Data.ProductsData pd;//declaring an object of the ProductsData class
    private Data.Validation v;//declaring an object of the Validation class
    private Data.StockSoldData ssd;//declaring an object of the StockSoldData class
    private String username;//declaring the username variable as a global variable that can only be accessed within 
    //this frame
    private int userLevel;//declaring the userLevel variable as a global variable that can only be accessed within 
    //this frame
    private double totalSales;//declaring the totalSales variable as a global variable that can only be accessed 
    //within this frame

    public SalesScreen(String inUsername, int inUserLevel) throws SQLException
    {
        initComponents();
        username = inUsername;
        userLevel = inUserLevel;
        lblUsernameDB.setText(username);
        lblUserLevelDB.setText("" + userLevel);
        sd = new SalesData();//initializing the object of the Salesdata class
        pd = new ProductsData();//initializing the object of the productsData class
        ssd = new StockSoldData();//initializing the object of the StockSoldData class
        ss = new StockSold();//initializing the object of the StockSold class
        pd.populateJTable(tblProducts, 0);//populates the table
        selectMaxQty();
        this.getContentPane().setBackground(new java.awt.Color(227, 242, 253));//to change to colour of a screen
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lpSales = new javax.swing.JLayeredPane();
        lblSales = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblUserLevel = new javax.swing.JLabel();
        lblUsernameDB = new javax.swing.JLabel();
        lblUserLevelDB = new javax.swing.JLabel();
        pnlSales = new javax.swing.JPanel();
        spSales = new javax.swing.JScrollPane();
        tblSales = new javax.swing.JTable();
        btnRemove = new javax.swing.JButton();
        pnlItems = new javax.swing.JPanel();
        lblQuantity = new javax.swing.JLabel();
        spnQty = new javax.swing.JSpinner();
        btnOk = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        lblTotalCost = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        txfTotal = new javax.swing.JTextField();
        txfAmount = new javax.swing.JTextField();
        btnRecordSales = new javax.swing.JButton();
        btnMainMenu = new javax.swing.JButton();
        lblChange = new javax.swing.JLabel();
        txfChange = new javax.swing.JTextField();
        btnTotal = new javax.swing.JButton();
        btnRecordStockSold = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        lpSales.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblSales.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblSales.setForeground(new java.awt.Color(19, 100, 173));
        lblSales.setText("Sales");

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(19, 100, 173));
        lblUsername.setText("Username:");

        lblUserLevel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUserLevel.setForeground(new java.awt.Color(19, 100, 173));
        lblUserLevel.setText("User level:");

        lblUsernameDB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsernameDB.setForeground(new java.awt.Color(19, 100, 173));
        lblUsernameDB.setText("UsernameDB");

        lblUserLevelDB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUserLevelDB.setForeground(new java.awt.Color(19, 100, 173));
        lblUserLevelDB.setText("UserLevelDB");

        pnlSales.setBackground(new java.awt.Color(227, 242, 253));
        pnlSales.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(19, 100, 173))); // NOI18N

        tblSales.setBackground(new java.awt.Color(227, 242, 253));
        tblSales.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblSales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Product ID", "ProductName", "Quantity", "Cost", "Cost Price"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblSales.setColumnSelectionAllowed(true);
        tblSales.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblSales.getTableHeader().setReorderingAllowed(false);
        spSales.setViewportView(tblSales);
        tblSales.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tblSales.getColumnModel().getColumnCount() > 0)
        {
            tblSales.getColumnModel().getColumn(0).setResizable(false);
            tblSales.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblSales.getColumnModel().getColumn(1).setResizable(false);
            tblSales.getColumnModel().getColumn(2).setResizable(false);
            tblSales.getColumnModel().getColumn(2).setPreferredWidth(30);
            tblSales.getColumnModel().getColumn(3).setResizable(false);
            tblSales.getColumnModel().getColumn(3).setPreferredWidth(30);
            tblSales.getColumnModel().getColumn(4).setMinWidth(0);
            tblSales.getColumnModel().getColumn(4).setPreferredWidth(0);
            tblSales.getColumnModel().getColumn(4).setMaxWidth(0);
        }

        btnRemove.setBackground(new java.awt.Color(197, 227, 218));
        btnRemove.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(19, 100, 173));
        btnRemove.setText("Remove");
        btnRemove.setToolTipText("Removes a row from the sales table");
        btnRemove.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnRemove.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSalesLayout = new javax.swing.GroupLayout(pnlSales);
        pnlSales.setLayout(pnlSalesLayout);
        pnlSalesLayout.setHorizontalGroup(
            pnlSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSalesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spSales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        pnlSalesLayout.setVerticalGroup(
            pnlSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalesLayout.createSequentialGroup()
                .addComponent(spSales, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlItems.setBackground(new java.awt.Color(227, 242, 253));
        pnlItems.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Stock", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(19, 100, 173))); // NOI18N

        lblQuantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(19, 100, 173));
        lblQuantity.setText("Quantity:");

        btnOk.setBackground(new java.awt.Color(197, 227, 218));
        btnOk.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnOk.setForeground(new java.awt.Color(19, 100, 173));
        btnOk.setText("Set Value");
        btnOk.setToolTipText("Sets the quantity of the product sold");
        btnOk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnOk.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnOkActionPerformed(evt);
            }
        });

        tblProducts.setBackground(new java.awt.Color(227, 242, 253));
        tblProducts.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Product ID", "Product Name", "Description", "Quantity", "Cost", "Markup"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, true, false, true, true
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblProducts.setColumnSelectionAllowed(true);
        tblProducts.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblProducts.getTableHeader().setReorderingAllowed(false);
        tblProducts.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tblProductsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProducts);
        tblProducts.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tblProducts.getColumnModel().getColumnCount() > 0)
        {
            tblProducts.getColumnModel().getColumn(0).setResizable(false);
            tblProducts.getColumnModel().getColumn(0).setPreferredWidth(40);
            tblProducts.getColumnModel().getColumn(1).setResizable(false);
            tblProducts.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblProducts.getColumnModel().getColumn(2).setMinWidth(0);
            tblProducts.getColumnModel().getColumn(2).setPreferredWidth(0);
            tblProducts.getColumnModel().getColumn(2).setMaxWidth(0);
            tblProducts.getColumnModel().getColumn(3).setResizable(false);
            tblProducts.getColumnModel().getColumn(3).setPreferredWidth(30);
            tblProducts.getColumnModel().getColumn(4).setMinWidth(0);
            tblProducts.getColumnModel().getColumn(4).setPreferredWidth(0);
            tblProducts.getColumnModel().getColumn(4).setMaxWidth(0);
            tblProducts.getColumnModel().getColumn(5).setMinWidth(0);
            tblProducts.getColumnModel().getColumn(5).setPreferredWidth(0);
            tblProducts.getColumnModel().getColumn(5).setMaxWidth(0);
        }
        tblProducts.getAccessibleContext().setAccessibleDescription("");

        btnNext.setBackground(new java.awt.Color(197, 227, 218));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnNext.setForeground(new java.awt.Color(19, 100, 173));
        btnNext.setText("Next");
        btnNext.setToolTipText("Go to the next product");
        btnNext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnNext.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setBackground(new java.awt.Color(197, 227, 218));
        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(19, 100, 173));
        btnPrevious.setText("Previous");
        btnPrevious.setToolTipText("Go to the previous product");
        btnPrevious.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnPrevious.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPreviousActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlItemsLayout = new javax.swing.GroupLayout(pnlItems);
        pnlItems.setLayout(pnlItemsLayout);
        pnlItemsLayout.setHorizontalGroup(
            pnlItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItemsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlItemsLayout.createSequentialGroup()
                        .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblQuantity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnQty, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlItemsLayout.setVerticalGroup(
            pnlItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlItemsLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spnQty, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblQuantity)
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTotalCost.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblTotalCost.setForeground(new java.awt.Color(19, 100, 173));
        lblTotalCost.setText("Total Cost:");

        lblAmount.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblAmount.setForeground(new java.awt.Color(19, 100, 173));
        lblAmount.setText("Amount:");

        txfTotal.setBackground(new java.awt.Color(227, 242, 253));
        txfTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfTotal.setForeground(new java.awt.Color(19, 100, 173));
        txfTotal.setEnabled(false);

        txfAmount.setBackground(new java.awt.Color(227, 242, 253));
        txfAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfAmount.setForeground(new java.awt.Color(19, 100, 173));

        btnRecordSales.setBackground(new java.awt.Color(197, 227, 218));
        btnRecordSales.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnRecordSales.setForeground(new java.awt.Color(19, 100, 173));
        btnRecordSales.setText("Record Sales");
        btnRecordSales.setToolTipText("Rescord the sales made");
        btnRecordSales.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnRecordSales.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRecordSalesActionPerformed(evt);
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

        lblChange.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblChange.setForeground(new java.awt.Color(19, 100, 173));
        lblChange.setText("Change:");

        txfChange.setBackground(new java.awt.Color(227, 242, 253));
        txfChange.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfChange.setForeground(new java.awt.Color(19, 100, 173));
        txfChange.setEnabled(false);

        btnTotal.setBackground(new java.awt.Color(197, 227, 218));
        btnTotal.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnTotal.setForeground(new java.awt.Color(19, 100, 173));
        btnTotal.setText("Total");
        btnTotal.setToolTipText("Display the total cost");
        btnTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnTotal.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnTotalActionPerformed(evt);
            }
        });

        btnRecordStockSold.setBackground(new java.awt.Color(197, 227, 218));
        btnRecordStockSold.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnRecordStockSold.setForeground(new java.awt.Color(19, 100, 173));
        btnRecordStockSold.setText("Record Stock Sold");
        btnRecordStockSold.setToolTipText("Record the stock sold ");
        btnRecordStockSold.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnRecordStockSold.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRecordStockSoldActionPerformed(evt);
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

        lpSales.setLayer(lblSales, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpSales.setLayer(lblUsername, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpSales.setLayer(lblUserLevel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpSales.setLayer(lblUsernameDB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpSales.setLayer(lblUserLevelDB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpSales.setLayer(pnlSales, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpSales.setLayer(pnlItems, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpSales.setLayer(lblTotalCost, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpSales.setLayer(lblAmount, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpSales.setLayer(txfTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpSales.setLayer(txfAmount, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpSales.setLayer(btnRecordSales, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpSales.setLayer(btnMainMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpSales.setLayer(lblChange, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpSales.setLayer(txfChange, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpSales.setLayer(btnTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpSales.setLayer(btnRecordStockSold, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpSales.setLayer(btnHelp, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpSalesLayout = new javax.swing.GroupLayout(lpSales);
        lpSales.setLayout(lpSalesLayout);
        lpSalesLayout.setHorizontalGroup(
            lpSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpSalesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(lpSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpSalesLayout.createSequentialGroup()
                        .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpSalesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(lpSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpSalesLayout.createSequentialGroup()
                                .addGroup(lpSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblUsername)
                                    .addComponent(lblUserLevel))
                                .addGap(18, 18, 18)
                                .addGroup(lpSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsernameDB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUserLevelDB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(191, 191, 191)
                                .addComponent(lblSales)
                                .addGap(372, 372, 372))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(lpSalesLayout.createSequentialGroup()
                                    .addComponent(pnlItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(pnlSales, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(lpSalesLayout.createSequentialGroup()
                                    .addGap(430, 430, 430)
                                    .addGroup(lpSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpSalesLayout.createSequentialGroup()
                                            .addComponent(btnRecordStockSold, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnRecordSales, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpSalesLayout.createSequentialGroup()
                                            .addComponent(lblAmount)
                                            .addGap(18, 18, 18)
                                            .addComponent(txfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpSalesLayout.createSequentialGroup()
                                            .addComponent(lblTotalCost)
                                            .addGap(18, 18, 18)
                                            .addComponent(txfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpSalesLayout.createSequentialGroup()
                                            .addComponent(lblChange)
                                            .addGap(18, 18, 18)
                                            .addComponent(txfChange, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap())
        );
        lpSalesLayout.setVerticalGroup(
            lpSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpSalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lpSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lpSalesLayout.createSequentialGroup()
                        .addGroup(lpSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsername)
                            .addComponent(lblUsernameDB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(lpSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserLevelDB)
                            .addComponent(lblUserLevel)))
                    .addComponent(lblSales))
                .addGap(30, 30, 30)
                .addGroup(lpSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlSales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(lpSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpSalesLayout.createSequentialGroup()
                        .addComponent(btnTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpSalesLayout.createSequentialGroup()
                        .addGroup(lpSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotalCost))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(lpSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAmount)
                    .addComponent(txfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(lpSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRecordSales, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRecordStockSold, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lpSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblChange))
                .addGap(25, 25, 25)
                .addGroup(lpSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lpSales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lpSales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void populateSalesTbl()
    {
        DefaultTableModel tableModel = (DefaultTableModel) tblSales.getModel();
        double sales = Math.round(((Double.parseDouble(("" + tblProducts.getValueAt(tblProducts.getSelectedRow(), 4)))))
                * (1 + Double.parseDouble("" + tblProducts.getValueAt(tblProducts.getSelectedRow(), 5)))) * ((int) 
                spnQty.getValue());//calculates the selling price
        sales = sales / 100;
        tableModel.addRow(new Object[]
        {
            tblProducts.getValueAt(tblProducts.getSelectedRow(), 0), tblProducts.getValueAt(
            tblProducts.getSelectedRow(), 1), spnQty.getValue(), sales, tblProducts.getValueAt(
            tblProducts.getSelectedRow(), 4)//gets the 
        //values from products tbl to populate the sales tbl    
        });
        totalSales += sales;
    }

    public void selectMaxQty()//sets the maximum value of a spinner component
    {
        int val = (int) (tblProducts.getValueAt(tblProducts.getSelectedRow(), 3));//val is equal to the value of the 
        //quantity
        if (val == 0)
        {
            spnQty.setModel(new SpinnerNumberModel(0, 0, 0, 0));
        } else
        {
            spnQty.setModel(new SpinnerNumberModel(1, 1, ((int) tblProducts.getValueAt(tblProducts.getSelectedRow(),
                    3)), 1));//sets the minimum and maximum values for the spinner component
        }
    }

    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMainMenuActionPerformed
    {//GEN-HEADEREND:event_btnMainMenuActionPerformed
        try
        {
            this.dispose();//closes the sales screen
            new MainMenuScreen(lblUsernameDB.getText().trim(), Integer.parseInt(lblUserLevelDB.getText().trim()))
                    .setVisible(true);//opens the main menu screen
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnMainMenuActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRemoveActionPerformed
    {//GEN-HEADEREND:event_btnRemoveActionPerformed
        ((DefaultTableModel) tblSales.getModel()).removeRow(tblSales.getSelectedRow());//removes a product added to
        //the sales table
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnRecordSalesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRecordSalesActionPerformed
    {//GEN-HEADEREND:event_btnRecordSalesActionPerformed
        try
        {
            if (txfAmount.getText().equalsIgnoreCase(""))//checks if there is a value in the text field
            {
                JOptionPane.showMessageDialog(null, "Please enter an amount", "ERROR", JOptionPane.ERROR_MESSAGE);
                txfAmount.requestFocus();
            } else
            {
                if (txfAmount.getText().matches("[+-]?\\d*\\.?\\d+"))//checks if the value entered isnt a double/decimal 
                //value
                {
                    DecimalFormat df = new DecimalFormat("0.00");
                    if (Double.parseDouble(txfAmount.getText().trim()) >= Double.parseDouble(txfTotal.getText().trim()))
                    //ensures that thre is enough money
                    {
                        double value = Double.parseDouble(txfAmount.getText().trim()) - Double.parseDouble(
                                txfTotal.getText().trim());//calculates the change owed
                        txfChange.setText("R" + df.format(value));
                        sd.addSale(username);//adds the sale to the database
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "Not enough money given", "ERROR",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } else
                {
                    JOptionPane.showMessageDialog(null, "Incorrect value. Pease enter a decimal value with digits "
                            + "(0 - 9)", "ERROR", JOptionPane.ERROR_MESSAGE);
                    txfAmount.setText("");
                    txfAmount.requestFocus();
                }
            }
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }

    }//GEN-LAST:event_btnRecordSalesActionPerformed

    private void tblProductsMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblProductsMouseClicked
    {//GEN-HEADEREND:event_tblProductsMouseClicked
        try
        {//sets the spn value to one if the table is enabled
            if (tblProducts.isEnabled())
            {
                spnQty.setValue(1);
            }
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }

    }//GEN-LAST:event_tblProductsMouseClicked

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnTotalActionPerformed
    {//GEN-HEADEREND:event_btnTotalActionPerformed
        try
        {
            int rowsCount = tblSales.getRowCount();//gets the total number of rows in the table
            double sum = 0;
            for (int i = 0; i < rowsCount; i++)
            {
                sum = sum + Double.parseDouble(tblSales.getValueAt(i, 3).toString());//adds up the cost to find the 
                //total cost
            }
            double round = (double) Math.round(sum * 100) / 100;//formats the cost value
            txfTotal.setText("" + round);
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnTotalActionPerformed

    private void btnRecordStockSoldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRecordStockSoldActionPerformed
    {//GEN-HEADEREND:event_btnRecordStockSoldActionPerformed
        try
        {
            int count = 0;
            for (int i = 0; i < tblSales.getRowCount(); i++)
            {
                ssd.addStockSold((int) sd.newSalesID(), "" + tblSales.getValueAt(i, 0), Integer.parseInt(""
                        + tblSales.getValueAt(i, 2)), Double.parseDouble("" + tblSales.getValueAt(i, 3)),
                        Double.parseDouble("" + tblSales.getValueAt(i, 4)));//ads the stock sold to the database
            }
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnRecordStockSoldActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHelpActionPerformed
    {//GEN-HEADEREND:event_btnHelpActionPerformed
        try
        {
            new HelpScreen("HelpScreenSales.txt", lblUsernameDB.getText().trim(), Integer.parseInt(
                    lblUserLevelDB.getText().trim())).setVisible(true);//opens up the help screen and the text document
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnOkActionPerformed
    {//GEN-HEADEREND:event_btnOkActionPerformed
        populateSalesTbl();
        spnQty.setValue(1);
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNextActionPerformed
    {//GEN-HEADEREND:event_btnNextActionPerformed
        if (tblProducts.getSelectedRow() + 1 < tblProducts.getRowCount())
        {
            tblProducts.setRowSelectionInterval(tblProducts.getSelectedRow() + 1, tblProducts.getSelectedRow() + 1);
            //select the row
            tblProducts.scrollRectToVisible(tblProducts.getCellRect(tblProducts.getSelectedRow() + 1, 0, true));
            //move the vertical scroll
        } else
        {
            JOptionPane.showMessageDialog(null, "You are at the LAST product", "INFORMATION",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPreviousActionPerformed
    {//GEN-HEADEREND:event_btnPreviousActionPerformed
        if (tblProducts.getSelectedRow() - 1 > -1)
        {
            tblProducts.setRowSelectionInterval(tblProducts.getSelectedRow() - 1, tblProducts.getSelectedRow() - 1);
            //select the row
            tblProducts.scrollRectToVisible(tblProducts.getCellRect(tblProducts.getSelectedRow() - 1, 0, true));
            //move the vertical scroll
        } else
        {
            JOptionPane.showMessageDialog(null, "You are at the FIRST product", "INFORMATION",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    public static void main(String args[]) throws SQLException
    {
        new SalesScreen("KDanvers4", 3).setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnRecordSales;
    private javax.swing.JButton btnRecordStockSold;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblChange;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblSales;
    private javax.swing.JLabel lblTotalCost;
    private javax.swing.JLabel lblUserLevel;
    private javax.swing.JLabel lblUserLevelDB;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsernameDB;
    private javax.swing.JLayeredPane lpSales;
    private javax.swing.JPanel pnlItems;
    private javax.swing.JPanel pnlSales;
    private javax.swing.JScrollPane spSales;
    private javax.swing.JSpinner spnQty;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTable tblSales;
    private javax.swing.JTextField txfAmount;
    private javax.swing.JTextField txfChange;
    private javax.swing.JTextField txfTotal;
    // End of variables declaration//GEN-END:variables
}
