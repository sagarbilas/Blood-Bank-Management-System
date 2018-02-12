
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.SwingConstants; // common constants used with Swing
import javax.swing.Icon; // interface used to manipulate images
import javax.swing.ImageIcon; // loads images
import javax.swing.JPanel;

public class WelcomeWindow2 extends javax.swing.JFrame {

    private final Color colorValues[] = {Color.BLACK, Color.BLUE, Color.RED, Color.GREEN};
    private JLabel displayJLabel; // displays sample text
    private int style; // used to create style for font

    public WelcomeWindow2() {
        initComponents();
        this.setSize(850, 550);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userButton = new javax.swing.JButton();
        adminBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("            WELCOME TO BLOOD BANK MANAGEMENT SYSTEM ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 890, 90);

        userButton.setBackground(new java.awt.Color(0, 102, 0));
        userButton.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        userButton.setForeground(new java.awt.Color(255, 51, 0));
        userButton.setText("USER MODE");
        userButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userButtonActionPerformed(evt);
            }
        });
        jPanel1.add(userButton);
        userButton.setBounds(650, 220, 170, 25);

        adminBtn.setBackground(new java.awt.Color(0, 102, 51));
        adminBtn.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        adminBtn.setForeground(new java.awt.Color(255, 51, 51));
        adminBtn.setText("LOG IN AS ADMIN");
        adminBtn.setToolTipText("");
        adminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBtnActionPerformed(evt);
            }
        });
        jPanel1.add(adminBtn);
        adminBtn.setBounds(650, 330, 170, 25);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/welcome window 2.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 90, 644, 440);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 890, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBtnActionPerformed
        dispose();
        AdministratorLogIn ob = new AdministratorLogIn();
        ob.setVisible(true);
        ob.setSize(850, 550);
    }//GEN-LAST:event_adminBtnActionPerformed

    private void userButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userButtonActionPerformed
        // TODO add your handling code here:
         dispose();
        UserFrame ob = new UserFrame();
        ob.setVisible(true);
        ob.setSize(850, 550);
        
    }//GEN-LAST:event_userButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeWindow2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton userButton;
    // End of variables declaration//GEN-END:variables
}
