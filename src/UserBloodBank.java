
//import com.sun.istack.internal.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UserBloodBank extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst;
    ResultSet rs;
    Vector datacol = new Vector();
    Vector datarow = new Vector();
    JTable datatable;
    JScrollPane viewdata;
    private int i;
    private int j;
    private int DonorId;

    public UserBloodBank() {
        initComponents();
       // this.setSize(1500, 600);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labeBloodBankId = new javax.swing.JLabel();
        txtBloodBankId = new javax.swing.JTextField();
        labelBranchName = new javax.swing.JLabel();
        txtBranchName = new javax.swing.JTextField();
        labelBranchMobileNo = new javax.swing.JLabel();
        txtBranchMobileNo = new javax.swing.JTextField();
        labelApositiveBags = new javax.swing.JLabel();
        txtApositiveBags = new javax.swing.JTextField();
        txtBpostiveBags = new javax.swing.JTextField();
        btnview = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        myTable = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        labelBpositiveBags = new javax.swing.JLabel();
        labelAnegativeBags = new javax.swing.JLabel();
        txtAnegativeBags = new javax.swing.JTextField();
        labelBnegativeBags = new javax.swing.JLabel();
        txtBnegativeBags = new javax.swing.JTextField();
        labelTotalBloodBags = new javax.swing.JLabel();
        txtTotalBloodBags = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 102));
        jPanel1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("         Donor   Info");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 120, 180, 22);

        labeBloodBankId.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labeBloodBankId.setForeground(new java.awt.Color(153, 0, 51));
        labeBloodBankId.setText("BloodBankId");
        jPanel1.add(labeBloodBankId);
        labeBloodBankId.setBounds(0, 170, 90, 20);

        txtBloodBankId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodBankIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtBloodBankId);
        txtBloodBankId.setBounds(150, 160, 180, 30);

        labelBranchName.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelBranchName.setForeground(new java.awt.Color(153, 0, 0));
        labelBranchName.setText("BranchName");
        jPanel1.add(labelBranchName);
        labelBranchName.setBounds(0, 220, 80, 20);

        txtBranchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBranchNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtBranchName);
        txtBranchName.setBounds(150, 210, 180, 30);

        labelBranchMobileNo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelBranchMobileNo.setForeground(new java.awt.Color(153, 0, 0));
        labelBranchMobileNo.setText("BranchMobileNo");
        jPanel1.add(labelBranchMobileNo);
        labelBranchMobileNo.setBounds(0, 270, 120, 15);
        jPanel1.add(txtBranchMobileNo);
        txtBranchMobileNo.setBounds(150, 260, 180, 30);

        labelApositiveBags.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelApositiveBags.setForeground(new java.awt.Color(153, 51, 0));
        labelApositiveBags.setText("ApositiveBags");
        jPanel1.add(labelApositiveBags);
        labelApositiveBags.setBounds(0, 320, 120, 15);
        jPanel1.add(txtApositiveBags);
        txtApositiveBags.setBounds(150, 310, 180, 30);
        jPanel1.add(txtBpostiveBags);
        txtBpostiveBags.setBounds(150, 360, 180, 30);

        btnview.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnview.setForeground(new java.awt.Color(102, 51, 0));
        btnview.setText("View");
        btnview.setToolTipText("View detail Information about BlooBank");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });
        jPanel1.add(btnview);
        btnview.setBounds(350, 190, 80, 23);

        myTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BloodBankId", "BranchName", "BranchMobileNo", "ApositiveBags", "BpostiveBags", "AnegativeBags", "BnegativeBags", "TotalBloodBags"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        myTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(myTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(460, 80, 790, 270);

        txtSearch.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(204, 0, 204));
        txtSearch.setToolTipText("Search\n");
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtSearch);
        txtSearch.setBounds(140, 40, 150, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Search Here");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(4, 50, 120, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("              DETAILS ABOUT  BLOOD BANK");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(500, 10, 370, 50);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 51));
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(350, 50, 70, 21);

        labelBpositiveBags.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelBpositiveBags.setForeground(new java.awt.Color(153, 0, 0));
        labelBpositiveBags.setText("BpositiveBags");
        jPanel1.add(labelBpositiveBags);
        labelBpositiveBags.setBounds(0, 370, 110, 20);

        labelAnegativeBags.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelAnegativeBags.setForeground(new java.awt.Color(153, 0, 0));
        labelAnegativeBags.setText("AnegativeBags");
        jPanel1.add(labelAnegativeBags);
        labelAnegativeBags.setBounds(0, 410, 110, 30);
        jPanel1.add(txtAnegativeBags);
        txtAnegativeBags.setBounds(150, 410, 180, 30);

        labelBnegativeBags.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelBnegativeBags.setForeground(new java.awt.Color(102, 0, 51));
        labelBnegativeBags.setText("BnegativeBags");
        jPanel1.add(labelBnegativeBags);
        labelBnegativeBags.setBounds(0, 470, 100, 20);
        jPanel1.add(txtBnegativeBags);
        txtBnegativeBags.setBounds(150, 460, 180, 30);

        labelTotalBloodBags.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelTotalBloodBags.setForeground(new java.awt.Color(102, 51, 0));
        labelTotalBloodBags.setText("TotalBloodBags");
        jPanel1.add(labelTotalBloodBags);
        labelTotalBloodBags.setBounds(0, 520, 110, 20);
        jPanel1.add(txtTotalBloodBags);
        txtTotalBloodBags.setBounds(150, 510, 180, 30);

        jButton2.setBackground(new java.awt.Color(255, 255, 102));
        jButton2.setText("Back");
        jButton2.setToolTipText("Back to UserForm Window");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1190, 0, 70, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1257, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBloodBankIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodBankIdActionPerformed
    }//GEN-LAST:event_txtBloodBankIdActionPerformed

    private void txtBranchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBranchNameActionPerformed
    }//GEN-LAST:event_txtBranchNameActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/BloodBank", "root", "");

            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery("SELECT * from BloodBank");

            ResultSetMetaData rsmetadata = rs.getMetaData();

            int columns = rsmetadata.getColumnCount();
            DefaultTableModel dtm = new DefaultTableModel();
            Vector columns_name = new Vector();
            Vector data_rows = new Vector();

            //for(i=1; i<columns; i++)
            for (i = 1; i < columns + 1; i++) {
                columns_name.addElement(rsmetadata.getColumnName(i));
            }
            dtm.setColumnIdentifiers(columns_name);

            while (rs.next()) {
                data_rows = new Vector();
                for (j = 1; j < columns + 1; j++) {
                    data_rows.addElement(rs.getString(j));
                }
                dtm.addRow(data_rows);
            }
            myTable.setModel(dtm);
        } catch (SQLException ex) {
            // Logger.getLogger(AnotherWindow.class.getName()).log(Level.SEVERE,null , ex);
            JOptionPane.showConfirmDialog(null, "Problem in Database connectivity or Data", "Result", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Donor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnviewActionPerformed

    private void myTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myTableMouseClicked

        DefaultTableModel model = (DefaultTableModel) myTable.getModel();

        txtBloodBankId.setText(model.getValueAt(myTable.getSelectedRow(), 0).toString());
        txtBranchName.setText(model.getValueAt(myTable.getSelectedRow(), 1).toString());
        txtBranchMobileNo.setText(model.getValueAt(myTable.getSelectedRow(), 2).toString());
        txtApositiveBags.setText(model.getValueAt(myTable.getSelectedRow(), 3).toString());
        txtBpostiveBags.setText(model.getValueAt(myTable.getSelectedRow(), 4).toString());
        txtAnegativeBags.setText(model.getValueAt(myTable.getSelectedRow(), 5).toString());
        txtBnegativeBags.setText(model.getValueAt(myTable.getSelectedRow(), 6).toString());
        txtTotalBloodBags.setText(model.getValueAt(myTable.getSelectedRow(), 7).toString());
    }//GEN-LAST:event_myTableMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased

        try {
            String sql = "select * from BloodBank where BloodBankId = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, txtSearch.getText());

            rs = pst.executeQuery();

            if (rs.next()) {
                String add1 = rs.getString("BloodBankId");
                txtBloodBankId.setText(add1);

                String add2 = rs.getString("BranchName");
                txtBranchName.setText(add2);

                String add3 = rs.getString("BranchMobileNo");
                txtBranchMobileNo.setText(add3);

                String add4 = rs.getString("ApositiveBags");
                txtApositiveBags.setText(add4);

                String add5 = rs.getString("BpostiveBags");
                txtBpostiveBags.setText(add5);

                String add6 = rs.getString("AnegativeBags");
                txtAnegativeBags.setText(add6);

                String add7 = rs.getString("BnegativeBags");
                txtBnegativeBags.setText(add7);

                String add8 = rs.getString("TotalBloodBags");
                txtTotalBloodBags.setText(add8);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_txtSearchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtSearch.setText("");
        txtBloodBankId.setText("");
        txtBranchName.setText("");
        txtBranchMobileNo.setText("");
        txtApositiveBags.setText("");
        txtBpostiveBags.setText("");
        txtAnegativeBags.setText("");
        txtBnegativeBags.setText("");
        txtTotalBloodBags.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        dispose();
        UserFrame adminobj3 = new UserFrame();
        adminobj3.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserBloodBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserBloodBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserBloodBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserBloodBank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserBloodBank().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnview;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labeBloodBankId;
    private javax.swing.JLabel labelAnegativeBags;
    private javax.swing.JLabel labelApositiveBags;
    private javax.swing.JLabel labelBnegativeBags;
    private javax.swing.JLabel labelBpositiveBags;
    private javax.swing.JLabel labelBranchMobileNo;
    private javax.swing.JLabel labelBranchName;
    private javax.swing.JLabel labelTotalBloodBags;
    private javax.swing.JTable myTable;
    private javax.swing.JTextField txtAnegativeBags;
    private javax.swing.JTextField txtApositiveBags;
    private javax.swing.JTextField txtBloodBankId;
    private javax.swing.JTextField txtBnegativeBags;
    private javax.swing.JTextField txtBpostiveBags;
    private javax.swing.JTextField txtBranchMobileNo;
    private javax.swing.JTextField txtBranchName;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTotalBloodBags;
    // End of variables declaration//GEN-END:variables
}
