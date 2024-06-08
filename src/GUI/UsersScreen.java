package GUI;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsersScreen extends javax.swing.JFrame
{

    private Data.UsersData ud;//declaring an object of the UsersData class
    private Data.Validation v;//declaring an object of the Validation class
    private String username;//declaring the username variable as a global variable that can only be accessed within 
    //this frame
    private int userlevel;//declaring the userLevel variable as a global variable that can onlr be accessed in this 
    //frame
    private int rowSelected;//declaring the rowSelected variable as a global variable that can only be accessed within 
    //this frame

    public UsersScreen(String inUsername, int inUserLevel) throws SQLException
    {
        initComponents();
        username = inUsername;
        userlevel = inUserLevel;
        lblUsernameDB.setText(username);//sets the username lbl to the user that has logged in
        lblUserLevelDB.setText("" + userlevel);//sets the value of the user level lbl to the user level of the user 
        //that has logged in
        ud = new Data.UsersData();//initializing the object of the UsersData class
        ud.populateJTable(tblUsers, 0);//calling the populateJTable method from the UsersData class to populate the 
        //table in the frame
        populateDetailsPnl();//calling the populateDetails panel to populate the text fields with the data of a user 
        //from the table
        this.getContentPane().setBackground(new java.awt.Color(227, 242, 253));//to change to colour of a screen

        if (userlevel == 1)//to allows users with user level 1 to access specific screens
        {
            btnDelete.setEnabled(false);
            btnAdd.setEnabled(false);
            btnSaveNew.setEnabled(false);
        }

        if (userlevel == 2)//allows users with user level 2 to access certain screens
        {
            btnAdd.setEnabled(false);
            btnSaveNew.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        rgbSearch = new javax.swing.ButtonGroup();
        lpUsers = new javax.swing.JLayeredPane();
        lblUsername = new javax.swing.JLabel();
        lblUsers = new javax.swing.JLabel();
        btnMainMenu = new javax.swing.JButton();
        lblUserLevelDB = new javax.swing.JLabel();
        lblUserlevel = new javax.swing.JLabel();
        lblUsernameDB = new javax.swing.JLabel();
        pnlSearch = new javax.swing.JPanel();
        rbAll = new javax.swing.JRadioButton();
        rbUsername = new javax.swing.JRadioButton();
        rbUserLevel = new javax.swing.JRadioButton();
        txfSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        rbUserStatus = new javax.swing.JRadioButton();
        pnlSaveOptions = new javax.swing.JPanel();
        btnSaveNew = new javax.swing.JButton();
        btnSaveEdit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        pnlNavigation = new javax.swing.JPanel();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        spNavigation = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();
        btnNext = new javax.swing.JButton();
        pnlDetails = new javax.swing.JPanel();
        lblUsernameDetails = new javax.swing.JLabel();
        lblPasswordDetails = new javax.swing.JLabel();
        lblUserLevelDetails = new javax.swing.JLabel();
        txfUsernameDetails = new javax.swing.JTextField();
        spnUserLevels = new javax.swing.JSpinner();
        lblStatus = new javax.swing.JLabel();
        cbActive = new javax.swing.JCheckBox();
        txfPasswordDetails = new javax.swing.JPasswordField();
        cbShowPassword = new javax.swing.JCheckBox();
        pnlSave = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        lpUsers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(19, 100, 173));
        lblUsername.setText("Username: ");

        lblUsers.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblUsers.setForeground(new java.awt.Color(19, 100, 173));
        lblUsers.setText("Users");

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

        lblUsernameDB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsernameDB.setForeground(new java.awt.Color(19, 100, 173));
        lblUsernameDB.setText("UsernameDB");

        pnlSearch.setBackground(new java.awt.Color(227, 242, 253));
        pnlSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(19, 100, 173))); // NOI18N
        pnlSearch.setForeground(new java.awt.Color(227, 242, 253));

        rbAll.setBackground(new java.awt.Color(227, 242, 253));
        rgbSearch.add(rbAll);
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

        rbUsername.setBackground(new java.awt.Color(227, 242, 253));
        rgbSearch.add(rbUsername);
        rbUsername.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rbUsername.setForeground(new java.awt.Color(19, 100, 173));
        rbUsername.setText("Username");
        rbUsername.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbUsernameActionPerformed(evt);
            }
        });

        rbUserLevel.setBackground(new java.awt.Color(227, 242, 253));
        rgbSearch.add(rbUserLevel);
        rbUserLevel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rbUserLevel.setForeground(new java.awt.Color(19, 100, 173));
        rbUserLevel.setText("User Level");
        rbUserLevel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbUserLevelActionPerformed(evt);
            }
        });

        txfSearch.setBackground(new java.awt.Color(227, 242, 253));
        txfSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfSearch.setForeground(new java.awt.Color(19, 100, 173));
        txfSearch.setEnabled(false);

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

        rbUserStatus.setBackground(new java.awt.Color(227, 242, 253));
        rgbSearch.add(rbUserStatus);
        rbUserStatus.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rbUserStatus.setForeground(new java.awt.Color(19, 100, 173));
        rbUserStatus.setText("User Status");
        rbUserStatus.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbUserStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSearchLayout = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfSearch)
                    .addGroup(pnlSearchLayout.createSequentialGroup()
                        .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbUserStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbUserLevel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbAll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 60, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlSearchLayout.setVerticalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbUserLevel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbUserStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlSaveOptions.setBackground(new java.awt.Color(227, 242, 253));
        pnlSaveOptions.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Save Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(19, 100, 173))); // NOI18N
        pnlSaveOptions.setForeground(new java.awt.Color(227, 242, 253));

        btnSaveNew.setBackground(new java.awt.Color(197, 227, 218));
        btnSaveNew.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnSaveNew.setForeground(new java.awt.Color(19, 100, 173));
        btnSaveNew.setText("Save New");
        btnSaveNew.setToolTipText("Save a new user");
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
        btnSaveEdit.setToolTipText("Save an edit made to a user");
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
            .addGroup(pnlSaveOptionsLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pnlSaveOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSaveNew, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(btnSaveEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnlSaveOptionsLayout.setVerticalGroup(
            pnlSaveOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSaveOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSaveNew, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnSaveEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlNavigation.setBackground(new java.awt.Color(227, 242, 253));
        pnlNavigation.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Navigation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(19, 100, 173))); // NOI18N
        pnlNavigation.setForeground(new java.awt.Color(227, 242, 253));

        btnFirst.setBackground(new java.awt.Color(197, 227, 218));
        btnFirst.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnFirst.setForeground(new java.awt.Color(19, 100, 173));
        btnFirst.setText("First");
        btnFirst.setToolTipText("Go to the first user");
        btnFirst.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnFirst.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrevious.setBackground(new java.awt.Color(197, 227, 218));
        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(19, 100, 173));
        btnPrevious.setText("Previous");
        btnPrevious.setToolTipText("Go to the previous user");
        btnPrevious.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnPrevious.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPreviousActionPerformed(evt);
            }
        });

        btnLast.setBackground(new java.awt.Color(197, 227, 218));
        btnLast.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnLast.setForeground(new java.awt.Color(19, 100, 173));
        btnLast.setText("Last");
        btnLast.setToolTipText("Go to the last user");
        btnLast.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnLast.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLastActionPerformed(evt);
            }
        });

        tblUsers.setBackground(new java.awt.Color(227, 242, 253));
        tblUsers.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Username", "Password", "User Level", "Status"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean []
            {
                false, true, false, false
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
        tblUsers.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblUsers.getTableHeader().setReorderingAllowed(false);
        tblUsers.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tblUsersMouseClicked(evt);
            }
        });
        spNavigation.setViewportView(tblUsers);
        tblUsers.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tblUsers.getColumnModel().getColumnCount() > 0)
        {
            tblUsers.getColumnModel().getColumn(0).setResizable(false);
            tblUsers.getColumnModel().getColumn(1).setMinWidth(0);
            tblUsers.getColumnModel().getColumn(1).setPreferredWidth(0);
            tblUsers.getColumnModel().getColumn(1).setMaxWidth(0);
            tblUsers.getColumnModel().getColumn(2).setResizable(false);
            tblUsers.getColumnModel().getColumn(3).setResizable(false);
        }

        btnNext.setBackground(new java.awt.Color(197, 227, 218));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnNext.setForeground(new java.awt.Color(19, 100, 173));
        btnNext.setText("Next");
        btnNext.setToolTipText("Go to the next user");
        btnNext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnNext.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNavigationLayout = new javax.swing.GroupLayout(pnlNavigation);
        pnlNavigation.setLayout(pnlNavigationLayout);
        pnlNavigationLayout.setHorizontalGroup(
            pnlNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNavigationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlNavigationLayout.createSequentialGroup()
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlNavigationLayout.setVerticalGroup(
            pnlNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNavigationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spNavigation, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnlNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlDetails.setBackground(new java.awt.Color(227, 242, 253));
        pnlDetails.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(19, 100, 173))); // NOI18N
        pnlDetails.setForeground(new java.awt.Color(227, 242, 253));

        lblUsernameDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsernameDetails.setForeground(new java.awt.Color(19, 100, 173));
        lblUsernameDetails.setText("Username");

        lblPasswordDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPasswordDetails.setForeground(new java.awt.Color(19, 100, 173));
        lblPasswordDetails.setText("Password");

        lblUserLevelDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUserLevelDetails.setForeground(new java.awt.Color(19, 100, 173));
        lblUserLevelDetails.setText("User Level");

        txfUsernameDetails.setBackground(new java.awt.Color(227, 242, 253));
        txfUsernameDetails.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfUsernameDetails.setEnabled(false);

        spnUserLevels.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spnUserLevels.setModel(new javax.swing.SpinnerNumberModel(1, 1, 3, 1));
        spnUserLevels.setEnabled(false);

        lblStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(19, 100, 173));
        lblStatus.setText("Status");

        cbActive.setBackground(new java.awt.Color(227, 242, 253));
        cbActive.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbActive.setText("Active");
        cbActive.setEnabled(false);

        txfPasswordDetails.setBackground(new java.awt.Color(227, 242, 253));
        txfPasswordDetails.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfPasswordDetails.setEnabled(false);

        cbShowPassword.setBackground(new java.awt.Color(227, 242, 253));
        cbShowPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbShowPassword.setText("Show Password");
        cbShowPassword.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cbShowPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDetailsLayout = new javax.swing.GroupLayout(pnlDetails);
        pnlDetails.setLayout(pnlDetailsLayout);
        pnlDetailsLayout.setHorizontalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                        .addComponent(lblUsernameDetails)
                        .addGap(18, 18, 18)
                        .addComponent(txfUsernameDetails))
                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDetailsLayout.createSequentialGroup()
                                .addComponent(lblUserLevelDetails)
                                .addGap(18, 18, 18)
                                .addComponent(spnUserLevels, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDetailsLayout.createSequentialGroup()
                                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbActive)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                        .addComponent(lblPasswordDetails)
                        .addGap(22, 22, 22)
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfPasswordDetails)
                            .addGroup(pnlDetailsLayout.createSequentialGroup()
                                .addComponent(cbShowPassword)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pnlDetailsLayout.setVerticalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsernameDetails)
                    .addComponent(txfUsernameDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPasswordDetails)
                    .addComponent(txfPasswordDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbShowPassword)
                .addGap(18, 18, 18)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnUserLevels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserLevelDetails))
                .addGap(18, 18, 18)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(cbActive))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pnlSave.setBackground(new java.awt.Color(227, 242, 253));
        pnlSave.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(19, 100, 173))); // NOI18N
        pnlSave.setForeground(new java.awt.Color(227, 242, 253));

        btnAdd.setBackground(new java.awt.Color(197, 227, 218));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(19, 100, 173));
        btnAdd.setText("Add");
        btnAdd.setToolTipText("Adds a new user");
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
        btnEdit.setToolTipText("Edits an existing user");
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
        btnDelete.setToolTipText("Deletes an existing user");
        btnDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 217, 204)));
        btnDelete.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSaveLayout = new javax.swing.GroupLayout(pnlSave);
        pnlSave.setLayout(pnlSaveLayout);
        pnlSaveLayout.setHorizontalGroup(
            pnlSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSaveLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pnlSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        pnlSaveLayout.setVerticalGroup(
            pnlSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSaveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        lpUsers.setLayer(lblUsername, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpUsers.setLayer(lblUsers, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpUsers.setLayer(btnMainMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpUsers.setLayer(lblUserLevelDB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpUsers.setLayer(lblUserlevel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpUsers.setLayer(lblUsernameDB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpUsers.setLayer(pnlSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpUsers.setLayer(pnlSaveOptions, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpUsers.setLayer(pnlNavigation, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpUsers.setLayer(pnlDetails, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpUsers.setLayer(pnlSave, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpUsers.setLayer(btnHelp, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpUsersLayout = new javax.swing.GroupLayout(lpUsers);
        lpUsers.setLayout(lpUsersLayout);
        lpUsersLayout.setHorizontalGroup(
            lpUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpUsersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lpUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(lpUsersLayout.createSequentialGroup()
                        .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lpUsersLayout.createSequentialGroup()
                        .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(pnlSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlSaveOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lpUsersLayout.createSequentialGroup()
                        .addGroup(lpUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(lpUsersLayout.createSequentialGroup()
                                .addGroup(lpUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUserlevel)
                                    .addComponent(lblUsername))
                                .addGap(18, 18, 18)
                                .addGroup(lpUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblUsernameDB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblUserLevelDB, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                .addGap(132, 132, 132)
                                .addComponent(lblUsers)))
                        .addGap(35, 35, 35)
                        .addComponent(pnlDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(126, 126, 126))
        );
        lpUsersLayout.setVerticalGroup(
            lpUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpUsersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lpUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lpUsersLayout.createSequentialGroup()
                        .addGroup(lpUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsername)
                            .addComponent(lblUsernameDB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(lpUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserlevel)
                            .addComponent(lblUserLevelDB, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(lpUsersLayout.createSequentialGroup()
                        .addComponent(lblUsers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(lpUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lpUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lpUsersLayout.createSequentialGroup()
                        .addGroup(lpUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlSaveOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(lpUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lpUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lpUsers)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void populateDetailsPnl()//this has nothing to do with the database - only with transferring gui components
    {
        try
        {//sets the text fields to specific values according to the row selected
            if (tblUsers.getRowCount() > 0)
            {
                txfUsernameDetails.setText((String) tblUsers.getValueAt(tblUsers.getSelectedRow(), 0));//sets the value 
                //of the username text field to the value of the user clicked n in the table
                txfPasswordDetails.setText((String) tblUsers.getValueAt(tblUsers.getSelectedRow(), 1));//sets password 
                //text field to the password of the user clicked on
                spnUserLevels.setValue((int) tblUsers.getValueAt(tblUsers.getSelectedRow(), 2));//sets the spinner 
                //component to the user level of the user clicked on int the table
                cbActive.setSelected((boolean) tblUsers.getValueAt(tblUsers.getSelectedRow(), 3));//sets the check 
                //box to show whether the user selected from the table is active or not
            } else
            {
                txfPasswordDetails.setText("");//sets the password text field to nothing ie - clears the text field
                txfUsernameDetails.setText("");//sets the username text field to null
                spnUserLevels.setValue(1);//sets the spinner component to 1
                cbActive.setSelected(false);//unticks the check box
            }
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }

    private void enableNavigation(boolean enableNav)//enables/disables navigation pnl
    {
        tblUsers.setEnabled(enableNav);
        btnFirst.setEnabled(enableNav);
        btnPrevious.setEnabled(enableNav);
        btnNext.setEnabled(enableNav);
        btnLast.setEnabled(enableNav);
    }

    private void enableDetails(boolean enableDetails)//enables/disables detailspnl
    {
        txfPasswordDetails.setEnabled(enableDetails);
        txfUsernameDetails.setEnabled(enableDetails);
        spnUserLevels.setEnabled(enableDetails);
        cbActive.setEnabled(enableDetails);
    }

    private void enableSearch(boolean enableSearch)//enables/disables search pnl
    {
        rbAll.setEnabled(enableSearch);
        rbUserLevel.setEnabled(enableSearch);
        rbUserStatus.setEnabled(enableSearch);
        rbUsername.setEnabled(enableSearch);
        txfSearch.setEnabled(enableSearch);
        btnSearch.setEnabled(enableSearch);
    }

    private void enableOptions(boolean enableSave)//enables/disables options pnl
    {
        btnAdd.setEnabled(enableSave);
        btnEdit.setEnabled(enableSave);
        btnDelete.setEnabled(enableSave);
    }

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDeleteActionPerformed
    {//GEN-HEADEREND:event_btnDeleteActionPerformed
        try
        {
            if (username.equals(txfUsernameDetails.getText().trim()))//to see whether the user selected in the table 
            //is the user that is logged on - prevents them from deleting themselves and crashing to program
            {
                JOptionPane.showMessageDialog(null, "You can't delete yourself", "ERROR", JOptionPane.ERROR_MESSAGE);
                //this is an error message showsing the user what their error is
            } else
            {
                if (JOptionPane.showConfirmDialog(null, "Are you sure you want to delete user "
                        + txfUsernameDetails.getText().trim(), "Warning", JOptionPane.YES_NO_OPTION) == 0)//allows the 
                //user to confirm that they are deleting the correct user
                {
                    ud.deleteUser(txfUsernameDetails.getText().trim());//deletes the specific user entered according 
                    //to the username entered
                    ud.populateJTable(tblUsers, 0);//when the selected user is deleted the user is taken to the top 
                    //of the table
                    populateDetailsPnl();//repopulates the details panel
                    btnSearch.setEnabled(false);//disables the user from clicking on the search button
                    txfSearch.setEnabled(false);//disables the user from entering anything in the ext field in the 
                    //search panel
                    txfSearch.setText("");//sets the value of the search text field to null
                    rbAll.setSelected(true);//selects the All radio button
                }
            }
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEditActionPerformed
    {//GEN-HEADEREND:event_btnEditActionPerformed
        try
        {//enables the details pnl for you to edit the user
            rowSelected = tblUsers.getSelectedRow();//selects a whole row in the table
            enableNavigation(false);//disables the user from clicking on anything in the navigation panel
            enableSearch(false);//disables the user from using the search panel
            enableOptions(false);//prevents the user from accessing the options panel
            enableDetails(true);//directs the user to the details panel where they will make the necessary changes
            txfUsernameDetails.setEnabled(false);//prevents the user from changing the selected users username
            btnSaveEdit.setEnabled(true);//allows the user to click on the save edit button
            btnCancel.setEnabled(true);//allows the user to press the cancel  buuton
            if (username.equals(txfUsernameDetails.getText().trim()))//stops the user from editing themselves
            {
                cbActive.setEnabled(false);//prevents the user from changing their own user level and thus crashing 
                //the program
                spnUserLevels.setEnabled(false);//prevents the uer from changing their user levels and crashing the 
                //program
            }
            txfPasswordDetails.requestFocus();//directs the user to the password text field
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddActionPerformed
    {//GEN-HEADEREND:event_btnAddActionPerformed
        try
        {//allows you to enter the details to add a user
            txfPasswordDetails.setText("");//clears the Password details text field
            txfUsernameDetails.setText("");//clears the username details text field
            spnUserLevels.setValue(1);//sets the spinner component to a value of one
            cbActive.setSelected(true);//selects the check box
            enableNavigation(false);//disables the Navigation panel
            enableSearch(false);//disables the search panel
            enableOptions(false);//disables the options panel
            enableDetails(true);//enables the details panel
            btnSaveNew.setEnabled(true);//enables the save new button
            btnCancel.setEnabled(true);//enables the cancel button
            txfUsernameDetails.requestFocus();//gives the username details text field input focus
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void cbShowPasswordActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cbShowPasswordActionPerformed
    {//GEN-HEADEREND:event_cbShowPasswordActionPerformed
        if (cbShowPassword.isSelected())//checks to see if the check box is selected
        {
            txfPasswordDetails.setEchoChar((char) 0);//shows the characters in the password
        } else
        {
            txfPasswordDetails.setEchoChar('•');//hides the characters in the password
        }
    }//GEN-LAST:event_cbShowPasswordActionPerformed

    private void tblUsersMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblUsersMouseClicked
    {//GEN-HEADEREND:event_tblUsersMouseClicked
        if (tblUsers.isEnabled())//checks to see if the table is populated
        {
            populateDetailsPnl();//will populate the detaild panel with data if the table is poulated
        }
    }//GEN-LAST:event_tblUsersMouseClicked

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLastActionPerformed
    {//GEN-HEADEREND:event_btnLastActionPerformed
        if (tblUsers.getSelectedRow() + 1 < tblUsers.getRowCount())
        {
            tblUsers.setRowSelectionInterval(tblUsers.getRowCount() - 1, tblUsers.getRowCount() - 1);
            //select the row
            tblUsers.scrollRectToVisible(tblUsers.getCellRect(tblUsers.getRowCount() - 1, 0, true));
            //move the vertical scroll
            populateDetailsPnl();
        } else
        {
            JOptionPane.showMessageDialog(null, "You are at the LAST User", "INFORMATION", 
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnLastActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPreviousActionPerformed
    {//GEN-HEADEREND:event_btnPreviousActionPerformed
        if (tblUsers.getSelectedRow() - 1 > -1)
        {
            tblUsers.setRowSelectionInterval(tblUsers.getSelectedRow() - 1, tblUsers.getSelectedRow() - 1);
            //select the row
            tblUsers.scrollRectToVisible(tblUsers.getCellRect(tblUsers.getSelectedRow() - 1, 0, true));
            //move the vertical scroll
            populateDetailsPnl();
        } else
        {
            JOptionPane.showMessageDialog(null, "You are at the FIRST User", "INFORMATION",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNextActionPerformed
    {//GEN-HEADEREND:event_btnNextActionPerformed
        if (tblUsers.getSelectedRow() + 1 < tblUsers.getRowCount())
        {
            tblUsers.setRowSelectionInterval(tblUsers.getSelectedRow() + 1, tblUsers.getSelectedRow() + 1);
            //select the row
            tblUsers.scrollRectToVisible(tblUsers.getCellRect(tblUsers.getSelectedRow() + 1, 0, true));
            //move the vertical scroll
            populateDetailsPnl();
        } else
        {
            JOptionPane.showMessageDialog(null, "You are at the LAST User", "INFORMATION",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFirstActionPerformed
    {//GEN-HEADEREND:event_btnFirstActionPerformed
        if (tblUsers.getSelectedRow() - 1 > -1)
        {
            tblUsers.setRowSelectionInterval(0, 0);  //select the row
            tblUsers.scrollRectToVisible(tblUsers.getCellRect(0, 0, true)); //move the vertical scroll
            populateDetailsPnl();
        } else
        {
            JOptionPane.showMessageDialog(null, "You are at the FIRST User", "INFORMATION",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelActionPerformed
    {//GEN-HEADEREND:event_btnCancelActionPerformed
        try
        {//allows you to cancel any edits/additions that you want to make
            enableNavigation(true);
            enableSearch(true);
            if (rbAll.isSelected())
            {
                txfSearch.setEnabled(false);
                btnSearch.setEnabled(false);
            }
            enableOptions(true);
            enableDetails(false);
            btnSaveNew.setEnabled(false);
            btnSaveEdit.setEnabled(false);
            btnCancel.setEnabled(false);
            populateDetailsPnl();//will populate the details panel with data from the table
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveEditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSaveEditActionPerformed
    {//GEN-HEADEREND:event_btnSaveEditActionPerformed
        try
        {//saves the edit that you made
            enableNavigation(true);
            enableSearch(true);
            enableOptions(true);
            enableDetails(false);

            btnSaveEdit.setEnabled(false);
            btnCancel.setEnabled(false);

            btnSearch.setEnabled(false);
            txfSearch.setEnabled(false);
            txfSearch.setText("");
            rbAll.setSelected(true);

            if (!(txfPasswordDetails.getText().equalsIgnoreCase("")))//ensures that the password field isnt empty
            {
                if (txfPasswordDetails.getText().trim().length() > 7 && txfPasswordDetails.getText().trim().length()
                        < 31)
                {
                    ud.editUser(txfUsernameDetails.getText().trim(), txfPasswordDetails.getText().trim(), (int) 
                            spnUserLevels.getValue(), cbActive.isSelected());//adds the edits to the database in 
                    //the correct order
                    ud.populateJTable(tblUsers, ud.getUserPosition(txfUsernameDetails.getText().trim()));//refreshes 
                    //the table and puts the cursor on the user that was edited so you can see the changes made
                    populateDetailsPnl();//populates the details panel with data from the table
                } else
                {
                    JOptionPane.showMessageDialog(null, "Invalid password. The password must be more than 8 and less "
                            + "than 30 characters long", "ERROR", JOptionPane.ERROR_MESSAGE);
                    txfPasswordDetails.setText("");
                    txfPasswordDetails.requestFocus();
                }
            } else
            {
                JOptionPane.showMessageDialog(null, "Please enter a password", "ERROR", JOptionPane.ERROR_MESSAGE);
                txfPasswordDetails.requestFocus();
            }
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnSaveEditActionPerformed

    private void btnSaveNewActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSaveNewActionPerformed
    {//GEN-HEADEREND:event_btnSaveNewActionPerformed
        try
        {
            if (!(txfUsernameDetails.getText().equalsIgnoreCase("")))//ensures that the username isnt empty
            {
                if (!ud.getUser(txfUsernameDetails.getText().trim()).getUsername().equalsIgnoreCase(
                        txfUsernameDetails.getText().trim()))//ensures that a username doesnt exist
                {
                    if (!(txfPasswordDetails.getText().equalsIgnoreCase("")))//ensures that the password field isnt 
                    //empty
                    {
                        if (txfPasswordDetails.getText().trim().length() > 7
                                && txfPasswordDetails.getText().trim().length() < 31)
                        {
                            if (txfUsernameDetails.getText().trim().matches("^[a-zA-Z0-9]*$"))
                            {
                                enableNavigation(true);
                                enableSearch(true);
                                enableOptions(true);
                                enableDetails(false);

                                btnSaveNew.setEnabled(false);
                                btnCancel.setEnabled(false);

                                txfSearch.setEnabled(false);
                                btnSearch.setEnabled(false);
                                txfSearch.setText("");
                                rbAll.setSelected(true);

                                ud.addUser(txfUsernameDetails.getText().trim(), txfPasswordDetails.getText().trim(),
                                        (int) spnUserLevels.getValue(), cbActive.isSelected());//adds the user to the 
                                //database - in the correct order
                                ud.populateJTable(tblUsers, ud.getUserPosition(txfUsernameDetails.getText().trim()));
                                //refreshes the table and takes you to the user that was created
                                populateDetailsPnl();//populates the details panel with data from the table
                            } else
                            {
                                txfSearch.setText("");
                                txfSearch.requestFocus();
                                JOptionPane.showMessageDialog(null, "Invalid username. Please enter letters (A to Z) "
                                        + "or digits (0 t0 9)", "ERROR", JOptionPane.ERROR_MESSAGE);
                            }
                        } else
                        {
                            JOptionPane.showMessageDialog(null, "Invalid Password. The password must be more than 8 "
                                    + "and less than 30 characters long", "ERROR", JOptionPane.ERROR_MESSAGE);
                            txfPasswordDetails.setText("");
                            txfPasswordDetails.requestFocus();
                        }
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "Please enter a password", "ERROR",
                                JOptionPane.ERROR_MESSAGE);
                        txfPasswordDetails.requestFocus();
                    }
                } else
                {
                    JOptionPane.showMessageDialog(null, "This username already exists. Please enter a new username.",
                            "ERROR", JOptionPane.ERROR_MESSAGE);
                    txfUsernameDetails.setText("");
                    txfUsernameDetails.requestFocus();
                }
            } else
            {
                JOptionPane.showMessageDialog(null, "Please enter a username.", "ERROR", JOptionPane.ERROR_MESSAGE);
                txfUsernameDetails.requestFocus();
            }

        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnSaveNewActionPerformed

    private void rbUserStatusActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbUserStatusActionPerformed
    {//GEN-HEADEREND:event_rbUserStatusActionPerformed
        //enables you to search for a specific user according to the user status
        btnSearch.setEnabled(true);
        txfSearch.setEnabled(true);
        txfSearch.setText("");
        txfSearch.requestFocus();
    }//GEN-LAST:event_rbUserStatusActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSearchActionPerformed
    {//GEN-HEADEREND:event_btnSearchActionPerformed
        try
        {
            if (rbUsername.isSelected())//if the username radio btn is selected
            {
                if (txfSearch.getText().trim().equalsIgnoreCase(""))//checks if anything has been entered in the text 
                //field
                {
                    JOptionPane.showMessageDialog(null, "Please ENTER a username", "ERROR", JOptionPane.ERROR_MESSAGE);
                } else
                {
                    if (!(txfSearch.getText().matches("^[a-zA-Z0-9]*$")))//checks to see if the digits entered are the 
                    //correct ones ie - letters and digits
                    {
                        txfSearch.setText("");
                        txfSearch.requestFocus();
                        JOptionPane.showMessageDialog(null, "Invalid username. Please enter letters (A to Z) or digits "
                                + "(0 t0 9)", "ERROR", JOptionPane.ERROR_MESSAGE);
                    } else
                    {
                        ud.getAllUsers(txfSearch.getText().trim());//trim removes any spaces after the last character
                        ud.populateJTable(tblUsers, 0);//refreshes the table and takes you to the top
                        populateDetailsPnl();//populates the details panel with the data
                    }
                }
            }

            if (rbUserLevel.isSelected())//if the user level radio button is selected
            {
                if (txfSearch.getText().trim().equalsIgnoreCase(""))//checks to see if anything has been entered in the 
                //search text field
                {
                    JOptionPane.showMessageDialog(null, "Please ENTER a user level", "ERROR",
                            JOptionPane.ERROR_MESSAGE);
                } else
                {
                    int l1 = 1;
                    int l2 = 2;
                    int l3 = 3;
                    if (!(txfSearch.getText().equalsIgnoreCase("" + l1)
                            || txfSearch.getText().equalsIgnoreCase("" + l2)
                            || txfSearch.getText().equalsIgnoreCase("" + l3)))//makes sure that the only characters 
                    //entered for the user level are 1, 2 or 3
                    {
                        txfSearch.setText("");
                        txfSearch.requestFocus();
                        JOptionPane.showMessageDialog(null, "Invalid user level. Please enter a user level of either "
                                + "1, 2 or 3", "ERROR", JOptionPane.ERROR_MESSAGE);
                    } else
                    {
                        ud.getAllUsers(Integer.parseInt(txfSearch.getText().trim()));//checks for the user according 
                        //to the user level
                        ud.populateJTable(tblUsers, 0);//refreshes the table to display the users with the user level 
                        //searched for 
                        populateDetailsPnl();//populates the details panel
                        txfSearch.setText("");
                    }
                }
            }

            if (rbUserStatus.isSelected())//checks to see if the user status button has been selected
            {
                if (txfSearch.getText().trim().equalsIgnoreCase("true")
                        || txfSearch.getText().trim().equalsIgnoreCase("false"))//makes sure the only words entered are 
                //true or false
                {
                    ud.getAllUsers(Boolean.parseBoolean(txfSearch.getText().trim()));//searches for the user 
                    //according to their status
                    ud.populateJTable(tblUsers, 0);//refreshes the table and displays the users with the status 
                    //searched for
                    populateDetailsPnl();//populates the details panel
                } else
                {
                    JOptionPane.showMessageDialog(null, "Please enter either true or false", "ERROR",
                            JOptionPane.ERROR_MESSAGE);
                    txfSearch.setText("");
                    txfSearch.requestFocus();
                }
            }
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void rbUserLevelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbUserLevelActionPerformed
    {//GEN-HEADEREND:event_rbUserLevelActionPerformed
        //enables you to search for a specific user according to the user level
        btnSearch.setEnabled(true);
        txfSearch.setEnabled(true);
        txfSearch.setText("");
        txfSearch.requestFocus();
    }//GEN-LAST:event_rbUserLevelActionPerformed

    private void rbUsernameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbUsernameActionPerformed
    {//GEN-HEADEREND:event_rbUsernameActionPerformed
        //enables you to search for a specific user according to the username
        btnSearch.setEnabled(true);
        txfSearch.setEnabled(true);
        txfSearch.setText("");
        txfSearch.requestFocus();
    }//GEN-LAST:event_rbUsernameActionPerformed

    private void rbAllActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbAllActionPerformed
    {//GEN-HEADEREND:event_rbAllActionPerformed
        try // updates/refreshes the list
        {
            btnSearch.setEnabled(false);
            txfSearch.setEnabled(false);
            txfSearch.setText("");
            ud.getAllUsers();//gets all the users from the database
            ud.populateJTable(tblUsers, 0);//populates the table with all of the users
            populateDetailsPnl();//method to populate the deytails panel
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_rbAllActionPerformed

    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMainMenuActionPerformed
    {//GEN-HEADEREND:event_btnMainMenuActionPerformed
        //this.dispose();
        try
        {
            this.dispose();//closes the users screen
            new MainMenuScreen(lblUsernameDB.getText().trim(), Integer.parseInt(
                    lblUserLevelDB.getText())).setVisible(true);//returns to the main menu screen
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnMainMenuActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHelpActionPerformed
    {//GEN-HEADEREND:event_btnHelpActionPerformed
        try
        {
            new HelpScreen("HelpScreenUsers.txt", lblUsernameDB.getText().trim(), Integer.parseInt(
                    lblUserLevelDB.getText().trim())).setVisible(true);//opens up the help screen and the help screen 
            //text document
        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_btnHelpActionPerformed

    public static void main(String args[]) throws SQLException
    {
        new UsersScreen("KDanvers4", 3).setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JCheckBox cbActive;
    private javax.swing.JCheckBox cbShowPassword;
    private javax.swing.JLabel lblPasswordDetails;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblUserLevelDB;
    private javax.swing.JLabel lblUserLevelDetails;
    private javax.swing.JLabel lblUserlevel;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsernameDB;
    private javax.swing.JLabel lblUsernameDetails;
    private javax.swing.JLabel lblUsers;
    private javax.swing.JLayeredPane lpUsers;
    private javax.swing.JPanel pnlDetails;
    private javax.swing.JPanel pnlNavigation;
    private javax.swing.JPanel pnlSave;
    private javax.swing.JPanel pnlSaveOptions;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JRadioButton rbAll;
    private javax.swing.JRadioButton rbUserLevel;
    private javax.swing.JRadioButton rbUserStatus;
    private javax.swing.JRadioButton rbUsername;
    private javax.swing.ButtonGroup rgbSearch;
    private javax.swing.JScrollPane spNavigation;
    private javax.swing.JSpinner spnUserLevels;
    private javax.swing.JTable tblUsers;
    private javax.swing.JPasswordField txfPasswordDetails;
    private javax.swing.JTextField txfSearch;
    private javax.swing.JTextField txfUsernameDetails;
    // End of variables declaration//GEN-END:variables
}
