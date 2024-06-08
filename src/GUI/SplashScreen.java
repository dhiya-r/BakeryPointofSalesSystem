package GUI;

import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends javax.swing.JFrame
{
    static int k = 0;

    public SplashScreen()
    {
        initComponents();
        
        this.getContentPane().setBackground(new java.awt.Color(227, 242, 253));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        pBar = new javax.swing.JProgressBar();
        lblBakery = new javax.swing.JLabel();
        lblPic = new javax.swing.JLabel();
        lblProgress = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(15, 82, 186));
        setForeground(new java.awt.Color(15, 82, 186));
        setUndecorated(true);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pBar.setBackground(new java.awt.Color(19, 100, 173));
        pBar.setForeground(new java.awt.Color(0, 0, 0));
        pBar.setBorderPainted(false);

        lblBakery.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblBakery.setForeground(new java.awt.Color(19, 100, 173));
        lblBakery.setText("Bakery");

        lblPic.setBackground(new java.awt.Color(255, 255, 255));
        lblPic.setForeground(new java.awt.Color(255, 255, 255));
        lblPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/giphy.gif"))); // NOI18N
        lblPic.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.darkGray, java.awt.Color.black));

        lblProgress.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblProgress.setForeground(new java.awt.Color(19, 100, 173));
        lblProgress.setText("0%");

        jLayeredPane1.setLayer(pBar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblBakery, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblPic, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblProgress, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(lblBakery))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(lblProgress)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pBar, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPic))
                .addGap(21, 21, 21))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBakery, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lblPic, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pBar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lblProgress, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[])
    {
        final SplashScreen wf = new SplashScreen ();
        wf.setLocationRelativeTo(null);
        wf.setVisible(true);
        final Timer t = new Timer();
        TimerTask tt = new TimerTask()
        {
            @Override
            public void run()
            {
                k++;
                if (k < 101)
                {
                    wf.pBar.setValue(k);
                    wf.lblProgress.setText(k + "%");
                } else
                {
                    try
                    {
                        t.cancel();
                        wf.dispose();
                        new LoginScreen().setVisible(true);
                    } catch (SQLException e)
                    {
                        System.out.println(e.toString());
                    }
                }
            }        
        }; 
        t.scheduleAtFixedRate(tt, 0, 40);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lblBakery;
    private javax.swing.JLabel lblPic;
    private javax.swing.JLabel lblProgress;
    private javax.swing.JProgressBar pBar;
    // End of variables declaration//GEN-END:variables
}
