package GUI;

import Data.ProductsData;
import Data.Validation;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProductsScreen extends javax.swing.JFrame
{

    private Data.ProductsData pd;//declaring an object of the ProductsData class
    private String prodID;//declaring the prodID variable as a global variable that van only be accessed within 
    //this frame
    private Data.Validation v;//declaring an object of the Validation class
    private int rowSelected;//declaring the rowSelected variable as a global variable that can only be accessed within 
    //this frame

    public ProductsScreen(String username, int userLevel) throws SQLException//parameterized constructor - parameters 
    //used to dsplay username and userlevel of the user thats logged on
    {
        initComponents();
        lblUsernameDB.setText(username);//sets the username lbl to the user that has logged in
        lblUserLevelDB.setText("" + userLevel);//sets the value of the user level lbl to the user level of the user 
        //that has logged in
        pd = new ProductsData();//initializing the object of the productsData class
        v = new Validation();//initializing the object of the Validation class
        pd.populateJTable(tblProducts, 0);
        populateDetailsPnl();//method to populate the details panel
        this.getContentPane().setBackground(new java.awt.Color(227, 242, 253));//to change to colour of a screen
        if (userLevel == 1)//to restrict the use of certain features to users that aren't of the appropriate userlevel
        {
            btnDelete.setEnabled(false);//disables the delete btn
            btnAdd.setEnabled(false);//disables the add btn
            btnSaveNew.setEnabled(false);//disables the save new btn
        }

        if (userLevel == 2)//restricts certain features to level 2 users
        {
            btnAdd.setEnabled(false);//restricts the add btn
            btnSaveNew.setEnabled(false);//restricts the save new btn
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        rbgSearch = new javax.swing.ButtonGroup();
        lpProducts = new javax.swing.JLayeredPane();
        btnMainMenu = new javax.swing.JButton();
        lblUserLevelDB = new javax.swing.JLabel();
        lblUserlevel = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblUsernameDB = new javax.swing.JLabel();
        lblProducts = new javax.swing.JLabel();
        pnlNavigation = new javax.swing.JPanel();
        SPNavTbl = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        btnFirst = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        pnlDetails = new javax.swing.JPanel();
        lblProductID = new javax.swing.JLabel();
        lblProductName = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        txfProductID = new javax.swing.JTextField();
        txfProductName = new javax.swing.JTextField();
        txfDescription = new javax.swing.JTextField();
        lblCost = new javax.swing.JLabel();
        lblMarkup = new javax.swing.JLabel();
        txfCost = new javax.swing.JTextField();
        txfMarkup = new javax.swing.JTextField();
        spnQty = new javax.swing.JSpinner();
        pnlSearch = new javax.swing.JPanel();
        rbProductID = new javax.swing.JRadioButton();
        rbProductName = new javax.swing.JRadioButton();
        txfSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        rbAll = new javax.swing.JRadioButton();
        pnlOptions = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        pnlSaveOptions = new javax.swing.JPanel();
        btnSaveNew = new javax.swing.JButton();
        btnSaveEdit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        lpProducts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        lblUserLevelDB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUserLevelDB.setForeground(new java.awt.Color(19, 100, 173));
        lblUserLevelDB.setText("User Level DB");

        lblUserlevel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUserlevel.setForeground(new java.awt.Color(19, 100, 173));
        lblUserlevel.setText("User Level: ");

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(19, 100, 173));
        lblUsername.setText("Username: ");

        lblUsernameDB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsernameDB.setForeground(new java.awt.Color(19, 100, 173));
        lblUsernameDB.setText("UsernameDB");

        lblProducts.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblProducts.setForeground(new java.awt.Color(19, 100, 173));
        lblProducts.setText("Products");

        pnlNavigation.setBackground(new java.awt.Color(227, 242, 253));
        pnlNavigation.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Navigation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(19, 100, 173))); // NOI18N
        pnlNavigation.setForeground(new java.awt.Color(227, 242, 253));

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
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false
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
        tblProducts.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblProducts.getTableHeader().setReorderingAllowed(false);
        tblProducts.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tblProductsMouseClicked(evt);
            }
        });
        SPNavTbl.setViewportView(tblProducts);
        tblProducts.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tblProducts.getColumnModel().getColumnCount() > 0)
        {
            tblProducts.getColumnModel().getColumn(0).setResizable(false);
            tblProducts.getColumnModel().getColumn(0).setPreferredWidth(7);
            tblProducts.getColumnModel().getColumn(1).setResizable(false);
            tblProducts.getColumnModel().getColumn(1).setPreferredWidth(75);
            tblProducts.getColumnModel().getColumn(2).setResizable(false);
            tblProducts.getColumnModel().getColumn(2).setPreferredWidth(11);
            tblProducts.getColumnModel().getColumn(3).setResizable(false);
            tblProducts.getColumnModel().getColumn(3).setPreferredWidth(8);
            tblProducts.getColumnModel().getColumn(4).setResizable(false);
            tblProducts.getColumnModel().getColumn(4).setPreferredWidth(4);
            tblProducts.getColumnModel().getColumn(5).setResizable(false);
            tblProducts.getColumnModel().getColumn(5).setPreferredWidth(0);
        }

        btnFirst.setBackground(new java.awt.Color(197, 227, 218));
        btnFirst.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnFirst.setForeground(new java.awt.Color(19, 100, 173));
        btnFirst.setText("First");
        btnFirst.setToolTipText("Go to the first product");
        btnFirst.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnFirst.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnFirstActionPerformed(evt);
            }
        });

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

        btnLast.setBackground(new java.awt.Color(197, 227, 218));
        btnLast.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnLast.setForeground(new java.awt.Color(19, 100, 173));
        btnLast.setText("Last");
        btnLast.setToolTipText("Go to the last product");
        btnLast.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnLast.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLastActionPerformed(evt);
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

        javax.swing.GroupLayout pnlNavigationLayout = new javax.swing.GroupLayout(pnlNavigation);
        pnlNavigation.setLayout(pnlNavigationLayout);
        pnlNavigationLayout.setHorizontalGroup(
            pnlNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNavigationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SPNavTbl)
                    .addGroup(pnlNavigationLayout.createSequentialGroup()
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlNavigationLayout.setVerticalGroup(
            pnlNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNavigationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SPNavTbl, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnlNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlDetails.setBackground(new java.awt.Color(227, 242, 253));
        pnlDetails.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(19, 100, 173))); // NOI18N
        pnlDetails.setForeground(new java.awt.Color(227, 242, 253));

        lblProductID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblProductID.setForeground(new java.awt.Color(19, 100, 173));
        lblProductID.setText("Product ID");

        lblProductName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblProductName.setForeground(new java.awt.Color(19, 100, 173));
        lblProductName.setText("Product Name");

        lblDescription.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(19, 100, 173));
        lblDescription.setText("Description");

        lblQuantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(19, 100, 173));
        lblQuantity.setText("Quantity");

        txfProductID.setBackground(new java.awt.Color(227, 242, 253));
        txfProductID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfProductID.setEnabled(false);

        txfProductName.setBackground(new java.awt.Color(227, 242, 253));
        txfProductName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfProductName.setEnabled(false);

        txfDescription.setBackground(new java.awt.Color(227, 242, 253));
        txfDescription.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfDescription.setEnabled(false);

        lblCost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCost.setForeground(new java.awt.Color(19, 100, 173));
        lblCost.setText("Cost");

        lblMarkup.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMarkup.setForeground(new java.awt.Color(19, 100, 173));
        lblMarkup.setText("Markup");

        txfCost.setBackground(new java.awt.Color(227, 242, 253));
        txfCost.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCost.setEnabled(false);

        txfMarkup.setBackground(new java.awt.Color(227, 242, 253));
        txfMarkup.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfMarkup.setEnabled(false);

        spnQty.setModel(new javax.swing.SpinnerNumberModel(1, 1, 70, 1));
        spnQty.setEnabled(false);

        javax.swing.GroupLayout pnlDetailsLayout = new javax.swing.GroupLayout(pnlDetails);
        pnlDetails.setLayout(pnlDetailsLayout);
        pnlDetailsLayout.setHorizontalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDetailsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDetailsLayout.createSequentialGroup()
                                .addComponent(lblProductID)
                                .addGap(41, 41, 41))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDetailsLayout.createSequentialGroup()
                                .addComponent(lblProductName)
                                .addGap(18, 18, 18))))
                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescription)
                            .addComponent(lblCost)
                            .addComponent(lblMarkup)
                            .addComponent(lblQuantity))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txfCost, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(txfDescription, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfProductName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfProductID, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfMarkup)
                    .addComponent(spnQty))
                .addGap(22, 22, 22))
        );
        pnlDetailsLayout.setVerticalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailsLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductID)
                    .addComponent(txfProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductName))
                .addGap(18, 18, 18)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescription))
                .addGap(18, 18, 18)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(spnQty, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCost))
                .addGap(18, 18, 18)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfMarkup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMarkup))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pnlSearch.setBackground(new java.awt.Color(227, 242, 253));
        pnlSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(19, 100, 173))); // NOI18N
        pnlSearch.setForeground(new java.awt.Color(227, 242, 253));

        rbProductID.setBackground(new java.awt.Color(227, 242, 253));
        rbgSearch.add(rbProductID);
        rbProductID.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rbProductID.setForeground(new java.awt.Color(19, 100, 173));
        rbProductID.setText("ProductID");
        rbProductID.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbProductIDActionPerformed(evt);
            }
        });

        rbProductName.setBackground(new java.awt.Color(227, 242, 253));
        rbgSearch.add(rbProductName);
        rbProductName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rbProductName.setForeground(new java.awt.Color(19, 100, 173));
        rbProductName.setText("Product Name");
        rbProductName.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbProductNameActionPerformed(evt);
            }
        });

        txfSearch.setBackground(new java.awt.Color(227, 242, 253));
        txfSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnSearch.setBackground(new java.awt.Color(197, 227, 218));
        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(19, 100, 173));
        btnSearch.setText("Search");
        btnSearch.setToolTipText("Search for your specified value");
        btnSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnSearch.setEnabled(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSearchActionPerformed(evt);
            }
        });

        rbAll.setBackground(new java.awt.Color(227, 242, 253));
        rbgSearch.add(rbAll);
        rbAll.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rbAll.setForeground(new java.awt.Color(19, 100, 173));
        rbAll.setSelected(true);
        rbAll.setText("All");
        rbAll.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSearchLayout = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbAll, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSearchLayout.setVerticalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbProductID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbProductName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(txfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlOptions.setBackground(new java.awt.Color(227, 242, 253));
        pnlOptions.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(19, 100, 175))); // NOI18N
        pnlOptions.setForeground(new java.awt.Color(227, 242, 253));

        btnAdd.setBackground(new java.awt.Color(197, 227, 218));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(19, 100, 173));
        btnAdd.setText("Add");
        btnAdd.setToolTipText("Add a new product");
        btnAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnAdd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(197, 227, 218));
        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(19, 100, 173));
        btnEdit.setText("Edit");
        btnEdit.setToolTipText("Edit an existing product");
        btnEdit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnEdit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(197, 227, 218));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(19, 100, 173));
        btnDelete.setText("Delete");
        btnDelete.setToolTipText("Delete an existing product");
        btnDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnDelete.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOptionsLayout = new javax.swing.GroupLayout(pnlOptions);
        pnlOptions.setLayout(pnlOptionsLayout);
        pnlOptionsLayout.setHorizontalGroup(
            pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOptionsLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        pnlOptionsLayout.setVerticalGroup(
            pnlOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlSaveOptions.setBackground(new java.awt.Color(227, 242, 253));
        pnlSaveOptions.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Save Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(19, 100, 173))); // NOI18N
        pnlSaveOptions.setForeground(new java.awt.Color(227, 242, 253));

        btnSaveNew.setBackground(new java.awt.Color(197, 227, 218));
        btnSaveNew.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnSaveNew.setForeground(new java.awt.Color(19, 100, 173));
        btnSaveNew.setText("Save New");
        btnSaveNew.setToolTipText("Save a new product");
        btnSaveNew.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnSaveNew.setEnabled(false);
        btnSaveNew.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSaveNewActionPerformed(evt);
            }
        });

        btnSaveEdit.setBackground(new java.awt.Color(197, 227, 218));
        btnSaveEdit.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnSaveEdit.setForeground(new java.awt.Color(19, 100, 173));
        btnSaveEdit.setText("Save Edit");
        btnSaveEdit.setToolTipText("Save an edit made to a product");
        btnSaveEdit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnSaveEdit.setEnabled(false);
        btnSaveEdit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSaveEditActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(197, 227, 218));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(19, 100, 173));
        btnCancel.setText("Cancel");
        btnCancel.setToolTipText("Cancel any changes");
        btnCancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnCancel.setEnabled(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSaveOptionsLayout = new javax.swing.GroupLayout(pnlSaveOptions);
        pnlSaveOptions.setLayout(pnlSaveOptionsLayout);
        pnlSaveOptionsLayout.setHorizontalGroup(
            pnlSaveOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSaveOptionsLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(pnlSaveOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSaveNew, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        pnlSaveOptionsLayout.setVerticalGroup(
            pnlSaveOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSaveOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSaveNew, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnSaveEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

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

        lpProducts.setLayer(btnMainMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpProducts.setLayer(lblUserLevelDB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpProducts.setLayer(lblUserlevel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpProducts.setLayer(lblUsername, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpProducts.setLayer(lblUsernameDB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpProducts.setLayer(lblProducts, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpProducts.setLayer(pnlNavigation, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpProducts.setLayer(pnlDetails, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpProducts.setLayer(pnlSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpProducts.setLayer(pnlOptions, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpProducts.setLayer(pnlSaveOptions, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpProducts.setLayer(btnHelp, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpProductsLayout = new javax.swing.GroupLayout(lpProducts);
        lpProducts.setLayout(lpProductsLayout);
        lpProductsLayout.setHorizontalGroup(
            lpProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpProductsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lpProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lpProductsLayout.createSequentialGroup()
                        .addGroup(lpProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(lpProductsLayout.createSequentialGroup()
                                .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(124, 124, 124)
                                .addComponent(pnlOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(lpProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lpProductsLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(pnlSaveOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpProductsLayout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(btnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(lpProductsLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(pnlDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(lpProductsLayout.createSequentialGroup()
                        .addGroup(lpProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserlevel)
                            .addComponent(lblUsername))
                        .addGap(18, 18, 18)
                        .addGroup(lpProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserLevelDB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsernameDB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(155, 155, 155)
                        .addComponent(lblProducts)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        lpProductsLayout.setVerticalGroup(
            lpProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpProductsLayout.createSequentialGroup()
                .addGroup(lpProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lpProductsLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(lpProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsername)
                            .addComponent(lblUsernameDB, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(lpProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserLevelDB, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUserlevel)))
                    .addGroup(lpProductsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblProducts)))
                .addGap(30, 30, 30)
                .addGroup(lpProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlNavigation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(lpProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lpProductsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(pnlSaveOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(lpProductsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(lpProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(lpProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lpProducts, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lpProducts)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void populateDetailsPnl()//this has nothing to do with the database - only with transferring gui components
    {//method to populate the details panel in the frame
        try
        {
            if (tblProducts.getRowCount() > 0)
            {//sets the text fields to specific values according to the row selected
                txfProductID.setText((String) tblProducts.getValueAt(tblProducts.getSelectedRow(), 0));//sets the text 
                //field to the product ID at a specific row in the table
                txfProductName.setText((String) tblProducts.getValueAt(tblProducts.getSelectedRow(), 1));//sets the 
                //text field to the product Name at a specific row in the table
                txfDescription.setText((String) tblProducts.getValueAt(tblProducts.getSelectedRow(), 2));//sets the 
                //text field to the description at a specific row in the table
                spnQty.setValue((int) (tblProducts.getValueAt(tblProducts.getSelectedRow(), 3)));//sets the text field 
                //to the quantity at a specific row in the table
                txfCost.setText("" + (tblProducts.getValueAt(tblProducts.getSelectedRow(), 4)));//sets the text field 
                //to the cost at a specific row in the table
                txfMarkup.setText("" + (tblProducts.getValueAt(tblProducts.getSelectedRow(), 5)));//sets the text field 
                //to the mark up at a specific row in the table
            } else
            {
                txfCost.setText("");//no values in the text field
                txfDescription.setText("");//no values in the text field
                txfMarkup.setText("");//no values in the text field
                txfProductID.setText("");//no values in the text field
                txfProductName.setText("");//no values in the text field
                spnQty.setValue(1);//no values in the text field
            }
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }

    public void enableNav(boolean nav)
    {//enables/disables navigation pnl and the components in the panel
        tblProducts.setEnabled(nav);
        btnFirst.setEnabled(nav);
        btnLast.setEnabled(nav);
        btnPrevious.setEnabled(nav);
        btnNext.setEnabled(nav);
    }

    public void enableDetails(boolean details)
    {//enables/disables detailspnl and the components in the panel
        txfCost.setEnabled(details);
        txfDescription.setEnabled(details);
        txfMarkup.setEnabled(details);
        txfProductID.setEnabled(details);
        txfProductName.setEnabled(details);
        spnQty.setEnabled(details);
    }

    public void enableSearch(boolean search)
    {//enables/disables search pnl and the components in the panel
        rbProductID.setEnabled(search);
        rbProductName.setEnabled(search);
        txfSearch.setEnabled(search);
        btnSearch.setEnabled(search);
    }

    public void enableOptions(boolean options)
    {//enables/disables options pnl and the components in the panel
        btnAdd.setEnabled(options);
        btnEdit.setEnabled(options);
        btnDelete.setEnabled(options);
    }

    public void enableSaveOptions(boolean save)
    {//enables/disables save options pnl and the components in the panel
        btnSaveEdit.setEnabled(save);
        btnSaveNew.setEnabled(save);
        btnCancel.setEnabled(save);
    }

    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMainMenuActionPerformed
    {//GEN-HEADEREND:event_btnMainMenuActionPerformed
        try
        {
            this.dispose();//closes the screen
            new MainMenuScreen(lblUsernameDB.getText().trim(), Integer.parseInt(
                    lblUserLevelDB.getText())).setVisible(true);//used to return to the main menu screen - the 
            //parameters are used to set the username and user level
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnMainMenuActionPerformed

    private void rbAllActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbAllActionPerformed
    {//GEN-HEADEREND:event_rbAllActionPerformed
        try // updates/refreshes the list
        {//displays all the values in the table
            btnSearch.setEnabled(false);//disables the search btn
            txfSearch.setEnabled(false);//disables the search text field
            txfSearch.setText("");//clears the search text field
            pd.getAllProducts();//used to display all the products in the table
            pd.populateJTable(tblProducts, 0);//used to populate the table and sets the cursor to the top of the table
            populateDetailsPnl();
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_rbAllActionPerformed

    private void rbProductIDActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbProductIDActionPerformed
    {//GEN-HEADEREND:event_rbProductIDActionPerformed
        //enables you to search for a specific product according to the product id
        btnSearch.setEnabled(true);//enables the search btn
        txfSearch.setEnabled(true);//enables the search text field
        txfSearch.setText("");//clears the search text field
        txfSearch.requestFocus();//the text field will get input focus
    }//GEN-LAST:event_rbProductIDActionPerformed

    private void rbProductNameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbProductNameActionPerformed
    {//GEN-HEADEREND:event_rbProductNameActionPerformed
        //enables you to search for a specific product according to the product name
        btnSearch.setEnabled(true);//enables the search btn
        txfSearch.setEnabled(true);//enables the search text field
        txfSearch.setText("");//clears the search text field
        txfSearch.requestFocus();//the text field will get input focus
    }//GEN-LAST:event_rbProductNameActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSearchActionPerformed
    {//GEN-HEADEREND:event_btnSearchActionPerformed
        try
        {
            if (rbProductID.isSelected())//will search for a productid
            {
                if (!(txfSearch.getText().equalsIgnoreCase("")))//condition to check if anything is entered in the text 
                //field
                {
                    if (v.vStringAZ09(txfSearch.getText().trim(), "Only Letters (A to Z) and Digits (0 - 9) are "
                            + "allowed", "Please enter a Value"))
                    {
                        pd.getAllProductsByProdId(txfSearch.getText().trim());//will display according to the product 
                        //ID entered
                        pd.populateJTable(tblProducts, 0);
                        populateDetailsPnl();//calling the method that populates the details panel
                    } else
                    {
                        txfSearch.setText("");//clears the search text field
                        txfSearch.requestFocus();
                    }
                } else
                {
                    JOptionPane.showMessageDialog(null, "Please enter a value", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else
            {
                if (!(txfSearch.getText().trim().equalsIgnoreCase("")))//if values/characters are entered in the text 
                //field
                {
                    if (v.vStringAZ(txfSearch.getText().trim(), "Only Letters (A to Z) are allowed", "Please enter a "
                            + "Value"))
                    {
                        pd.getAllProductsByProdName(txfSearch.getText().trim());//will search according to the product 
                        //name
                        pd.populateJTable(tblProducts, 0);
                        populateDetailsPnl();//calls the method to populate the details panel
                    } else
                    {
                        txfSearch.setText("");//clears the text field
                        txfSearch.requestFocus();
                    }
                } else
                {
                    JOptionPane.showMessageDialog(null, "Please enter a value", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e)
        {
            e.toString();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFirstActionPerformed
    {//GEN-HEADEREND:event_btnFirstActionPerformed
        if (tblProducts.getSelectedRow() - 1 > -1)
        {
            tblProducts.setRowSelectionInterval(0, 0);  //select the row
            tblProducts.scrollRectToVisible(tblProducts.getCellRect(0, 0, true)); //move the vertical scroll
            populateDetailsPnl();//calls the method to populate the details panel
        } else
        {
            JOptionPane.showMessageDialog(null, "You are at the FIRST product", "INFORMATION",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNextActionPerformed
    {//GEN-HEADEREND:event_btnNextActionPerformed
        if (tblProducts.getSelectedRow() + 1 < tblProducts.getRowCount())
        {
            tblProducts.setRowSelectionInterval(tblProducts.getSelectedRow() + 1, tblProducts.getSelectedRow() + 1);
            //select the row
            tblProducts.scrollRectToVisible(tblProducts.getCellRect(tblProducts.getSelectedRow() + 1, 0, true)); //move 
            //the vertical scroll
            populateDetailsPnl();//calls the method to populate the details panel
        } else
        {
            JOptionPane.showMessageDialog(null, "You are at the LAST product", "INFORMATION",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLastActionPerformed
    {//GEN-HEADEREND:event_btnLastActionPerformed
        if (tblProducts.getSelectedRow() + 1 < tblProducts.getRowCount())
        {
            tblProducts.setRowSelectionInterval(tblProducts.getRowCount() - 1, tblProducts.getRowCount() - 1);//select 
            //the row
            tblProducts.scrollRectToVisible(tblProducts.getCellRect(tblProducts.getRowCount() - 1, 0, true)); //move 
            //the vertical scroll
            populateDetailsPnl();//calls the method to populate the details panel
        } else
        {
            JOptionPane.showMessageDialog(null, "You are at the LAST product", "INFORMATION",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPreviousActionPerformed
    {//GEN-HEADEREND:event_btnPreviousActionPerformed
        if (tblProducts.getSelectedRow() - 1 > -1)
        {
            tblProducts.setRowSelectionInterval(tblProducts.getSelectedRow() - 1, tblProducts.getSelectedRow() - 1);
            //select the row
            tblProducts.scrollRectToVisible(tblProducts.getCellRect(tblProducts.getSelectedRow() - 1, 0, true));
            //move the vertical scroll
            populateDetailsPnl();//calls the method to populate the details panel
        } else
        {
            JOptionPane.showMessageDialog(null, "You are at the FIRST product", "INFORMATION",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void tblProductsMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblProductsMouseClicked
    {//GEN-HEADEREND:event_tblProductsMouseClicked
        if (tblProducts.isEnabled())//if the table in the frame is enabled
        {
            populateDetailsPnl();//the details panel will be populated
        }
    }//GEN-LAST:event_tblProductsMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddActionPerformed
    {//GEN-HEADEREND:event_btnAddActionPerformed
        try
        {//allows you to enter the details to add a product
            txfCost.setText("");//clears the text in the text field
            txfDescription.setText("");//clears the text in the text field
            txfMarkup.setText("");//clears the text in the text field
            txfProductID.setText("");//clears the text in the text field
            txfProductName.setText("");//clears the text in the text field
            spnQty.setValue(1);//clears the text in the text field
            btnSaveNew.setEnabled(true);//enables the save new button
            btnCancel.setEnabled(true);//enables the cancel button
            txfProductID.requestFocus();//this component gets input focus
            enableDetails(true);//
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveNewActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSaveNewActionPerformed
    {//GEN-HEADEREND:event_btnSaveNewActionPerformed
        try
        {
            if (v.vStringAZ09space(txfProductID.getText().trim(), "Only Letters (A to Z), Digits (0 - 9) and/or space/s"
                    + "are allowed", "Please enter a product ID"))//ensures that the product id isnt empty and contains 
            //only letters and numbers
            {
                if (!pd.getProduct(txfProductID.getText().trim()).getProductID().equalsIgnoreCase(
                        txfProductID.getText().trim()))//ensures that a product id doesnt exist
                {
                    if (v.vStringAZspace(txfProductName.getText().trim(), "Only Letters (A to Z) and/or space/s are "
                            + "allowed", "Please enter a product name"))//ensures that the product name isnt empty
                    {
                        if (v.vDoublePositive(txfCost.getText().trim(), "Incorrect cost value. Please enter digits "
                                + "(0 - 9) or decimal values greater than zero"))//ensures that the cost isnt empty
                        {
                            if (v.vStringAZ(txfDescription.getText().trim(), "Only Letters (A to Z) are allowed",
                                    "Please enter a description"))//ensures that the description isnt empty
                            {
                                if (v.vIntegerPositive(txfMarkup.getText().trim(), "Incorrect markup. Please enter in "
                                        + "the form of digits greater than zero"))//ensures that the markup isnt empty
                                {
                                    enableDetails(false);//disables the details panel
                                    enableNav(true);//enables the navigation button
                                    enableSearch(true);//enables the search panel
                                    enableOptions(true);//enables the options panel
                                    btnSaveNew.setEnabled(false);//disables the save new button
                                    btnCancel.setEnabled(false);//disables the cancel button
                                    txfSearch.setEnabled(false);//disables the search text field
                                    btnSearch.setEnabled(false);//disables the search button
                                    txfSearch.setText("");//clears the search text field
                                    rbAll.setSelected(true);//selects the radio button
                                    pd.addProduct(txfProductID.getText().trim(), txfProductName.getText().trim(),
                                            txfDescription.getText().trim(), (int) spnQty.getValue(),
                                            Integer.parseInt(txfCost.getText().trim()), Integer.parseInt(
                                            txfMarkup.getText().trim()));//adds the product to the database 
                                    //(in the correct order) and gets the data from the details panel
                                    pd.populateJTable(tblProducts, pd.getProductPosition(
                                            txfProductID.getText().trim()));//refreshes the tbl - cursor in the 
                                    //table is on the new product
                                    populateDetailsPnl();//method to populate the details panel
                                } else
                                {
                                    txfMarkup.setText("");
                                    txfMarkup.requestFocus();
                                }
                            } else
                            {
                                txfDescription.setText("");
                                txfDescription.requestFocus();
                            }
                        } else
                        {
                            txfCost.setText("");
                            txfCost.requestFocus();
                        }
                    } else
                    {
                        txfProductName.setText("");
                        txfProductName.requestFocus();
                    }
                } else
                {
                    JOptionPane.showMessageDialog(null, "Please enter a ProductID", "ERROR", JOptionPane.ERROR_MESSAGE);
                    txfProductID.setText("");
                    txfProductID.requestFocus();
                }
            } else
            {
                txfProductID.setText("");
                txfProductID.requestFocus();
            }
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnSaveNewActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEditActionPerformed
    {//GEN-HEADEREND:event_btnEditActionPerformed
        try
        {//enables the details pnl for you to edit the product
            rowSelected = tblProducts.getSelectedRow();
            enableNav(false);
            enableSearch(false);
            enableOptions(false);
            enableDetails(true);
            txfProductID.setEnabled(false);
            txfProductName.setEnabled(false);
            btnSaveEdit.setEnabled(true);
            btnCancel.setEnabled(true);
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDeleteActionPerformed
    {//GEN-HEADEREND:event_btnDeleteActionPerformed
        try
        {
            if (JOptionPane.showConfirmDialog(null, "Are you sure you want to delete Product "
                    + txfProductID.getText().trim(), "Warning", JOptionPane.YES_NO_OPTION) == 0)//allows the user to 
            //confirm that they are deleting the correct product
            {
                pd.deleteProduct(txfProductID.getText().trim());//deletes the specific product entered according to the 
                //products id
                pd.populateJTable(tblProducts, 0);//refreshes the table and sets the cursor to the top of the table
                populateDetailsPnl();//calls the method to populate the details panel
                btnSearch.setEnabled(false);
                txfSearch.setEnabled(false);
                txfSearch.setText("");
                rbAll.setSelected(true);
            }
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelActionPerformed
    {//GEN-HEADEREND:event_btnCancelActionPerformed
        try
        {//allows you to cancel any edits/additions that you want to make
            enableNav(true);
            enableSearch(true);
            if (rbAll.isSelected())
            {
                txfSearch.setEnabled(false);
                btnSearch.setEnabled(false);
            }
            enableOptions(true);
            enableDetails(false);
            btnCancel.setEnabled(false);
            btnSaveEdit.setEnabled(false);
            btnSaveNew.setEnabled(false);
            populateDetailsPnl();//calls the method to populate the details panel
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveEditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSaveEditActionPerformed
    {//GEN-HEADEREND:event_btnSaveEditActionPerformed
        try
        {
            if (v.vStringAZ09(txfProductID.getText().trim(), "Only Letters (A to Z) and Digits (0 - 9) are allowed",
                    "Please enter a Value"))//ensures that the product id isnt empty
            {
                if (v.vStringAZ(txfProductName.getText().trim(), "Only Letters (A to Z) are allowed", "Please enter a "
                        + "Value"))//ensures that the product name isnt empty
                {
                    if (v.vDoublePositive(txfCost.getText().trim(), "Invalid Number"))//ensures that the cost isnt empty
                    {
                        if (v.vStringAZ(txfDescription.getText().trim(), "Only Letters (A to Z) are allowed", "Please "
                                + "enter a Value"))//ensures that the description isnt empty
                        {
                            if (v.vIntegerPositive(txfMarkup.getText().trim(), "Invalid markup. Please enter a markup "
                                    + "in the form of digits greater than zero."))//ensures that the markup isnt empty
                            {
                                enableNav(true);
                                enableSearch(true);
                                enableOptions(true);
                                enableDetails(false);

                                btnSaveNew.setEnabled(false);
                                btnCancel.setEnabled(false);

                                btnSearch.setEnabled(false);
                                txfSearch.setEnabled(false);
                                txfSearch.setText("");
                                rbAll.setSelected(true);

                                pd.editProducts(txfProductID.getText().trim(), txfProductName.getText().trim(),
                                        txfDescription.getText().trim(), (int) spnQty.getValue(), Integer.parseInt(
                                                txfCost.getText().trim()), Integer.parseInt(
                                                txfMarkup.getText().trim()));//adds the edits to the database 
                                //in the correct order
                                pd.populateJTable(tblProducts, pd.getProductPosition(txfProductID.getText().trim()));
                                //refreshes the table and sets the cursor to the edited product
                                populateDetailsPnl();//calls the method to populate the details panel with the details 
                                //of the the user selected
                            } else
                            {
                                txfMarkup.setText("");
                                txfMarkup.requestFocus();
                            }
                        } else
                        {
                            txfDescription.setText("");
                            txfDescription.requestFocus();
                        }
                    } else
                    {
                        txfCost.setText("");
                        txfCost.requestFocus();
                    }
                } else
                {
                    txfProductName.setText("");
                    txfProductName.requestFocus();
                }
            } else
            {
                txfProductID.setText("");
                txfProductID.requestFocus();
            }
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnSaveEditActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHelpActionPerformed
    {//GEN-HEADEREND:event_btnHelpActionPerformed
        try
        {
            new HelpScreen("HelpScreenProducts.txt", lblUsernameDB.getText().trim(), Integer.parseInt(
                    lblUserLevelDB.getText().trim())).setVisible(true);//opens up the help screen and populates the 
            //text area in the help screen with the text document
        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_btnHelpActionPerformed

    public static void main(String args[]) throws SQLException
    {
        new ProductsScreen("KDanvers4", 3).setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane SPNavTbl;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSaveEdit;
    private javax.swing.JButton btnSaveNew;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblMarkup;
    private javax.swing.JLabel lblProductID;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblProducts;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblUserLevelDB;
    private javax.swing.JLabel lblUserlevel;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsernameDB;
    private javax.swing.JLayeredPane lpProducts;
    private javax.swing.JPanel pnlDetails;
    private javax.swing.JPanel pnlNavigation;
    private javax.swing.JPanel pnlOptions;
    private javax.swing.JPanel pnlSaveOptions;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JRadioButton rbAll;
    private javax.swing.JRadioButton rbProductID;
    private javax.swing.JRadioButton rbProductName;
    private javax.swing.ButtonGroup rbgSearch;
    private javax.swing.JSpinner spnQty;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txfCost;
    private javax.swing.JTextField txfDescription;
    private javax.swing.JTextField txfMarkup;
    private javax.swing.JTextField txfProductID;
    private javax.swing.JTextField txfProductName;
    private javax.swing.JTextField txfSearch;
    // End of variables declaration//GEN-END:variables
}
