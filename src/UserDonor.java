
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

public class UserDonor extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst;
    ResultSet rs;
    Vector datacol = new Vector();
    Vector datarow = new Vector();
    //  JTable datatable;
    JScrollPane viewdata;
    private int i;
    private int j;
    private int DonorId;
    //  private Object myTable;

    public UserDonor() {
        initComponents();
        this.setSize(1000, 500);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelDonorId = new javax.swing.JLabel();
        txtDonorId = new javax.swing.JTextField();
        labelDonorName = new javax.swing.JLabel();
        txtDonorName = new javax.swing.JTextField();
        labelDonorBloodGroup = new javax.swing.JLabel();
        txtDonorBloodGroup = new javax.swing.JTextField();
        labelDonorPhoneNo = new javax.swing.JLabel();
        txtDonorMobileNo = new javax.swing.JTextField();
        labelDonorAddress = new javax.swing.JLabel();
        txtDonorAddress = new javax.swing.JTextField();
        btnview = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        myTable = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
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

        labelDonorId.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelDonorId.setForeground(new java.awt.Color(153, 0, 51));
        labelDonorId.setText("DonorId");
        jPanel1.add(labelDonorId);
        labelDonorId.setBounds(0, 160, 90, 30);

        txtDonorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDonorIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtDonorId);
        txtDonorId.setBounds(150, 160, 180, 30);

        labelDonorName.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelDonorName.setForeground(new java.awt.Color(153, 0, 0));
        labelDonorName.setText("DonorName");
        jPanel1.add(labelDonorName);
        labelDonorName.setBounds(0, 210, 80, 20);

        txtDonorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDonorNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtDonorName);
        txtDonorName.setBounds(150, 210, 180, 30);

        labelDonorBloodGroup.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelDonorBloodGroup.setForeground(new java.awt.Color(153, 0, 0));
        labelDonorBloodGroup.setText("DonorBloodGroup");
        jPanel1.add(labelDonorBloodGroup);
        labelDonorBloodGroup.setBounds(0, 270, 120, 15);
        jPanel1.add(txtDonorBloodGroup);
        txtDonorBloodGroup.setBounds(150, 260, 180, 30);

        labelDonorPhoneNo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelDonorPhoneNo.setForeground(new java.awt.Color(153, 51, 0));
        labelDonorPhoneNo.setText("DonorPhoneNo");
        jPanel1.add(labelDonorPhoneNo);
        labelDonorPhoneNo.setBounds(0, 320, 120, 15);
        jPanel1.add(txtDonorMobileNo);
        txtDonorMobileNo.setBounds(150, 310, 180, 30);

        labelDonorAddress.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelDonorAddress.setForeground(new java.awt.Color(153, 0, 0));
        labelDonorAddress.setText("DonorAddress");
        jPanel1.add(labelDonorAddress);
        labelDonorAddress.setBounds(0, 370, 90, 20);
        jPanel1.add(txtDonorAddress);
        txtDonorAddress.setBounds(150, 360, 180, 30);

        btnview.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnview.setForeground(new java.awt.Color(102, 51, 0));
        btnview.setText("View");
        btnview.setToolTipText("View detail information about Donors");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });
        jPanel1.add(btnview);
        btnview.setBounds(350, 190, 80, 23);

        myTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DonorId", "DonorName", "DonorBloodGroup", "DonorPhoneNo", "DonorAddress"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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
        jScrollPane1.setBounds(450, 70, 480, 270);

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
        jLabel3.setText("                  DETAILS ABOUT DONOR");
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

        jButton2.setBackground(new java.awt.Color(255, 255, 153));
        jButton2.setText("Back");
        jButton2.setToolTipText("Back to UserForm Window");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(890, 0, 70, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDonorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDonorIdActionPerformed
    }//GEN-LAST:event_txtDonorIdActionPerformed

    private void txtDonorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDonorNameActionPerformed
    }//GEN-LAST:event_txtDonorNameActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/donor", "root", "");

            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery("SELECT * from donor");

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
        }
        
        
        catch (SQLException ex) {
            // Logger.getLogger(AnotherWindow.class.getName()).log(Level.SEVERE,null , ex);
            JOptionPane.showConfirmDialog(null, "Problem in Database connectivity or Data", "Result", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Donor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnviewActionPerformed

    private void myTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myTableMouseClicked

        DefaultTableModel model = (DefaultTableModel) myTable.getModel();

        txtDonorId.setText(model.getValueAt(myTable.getSelectedRow(), 0).toString());
        txtDonorName.setText(model.getValueAt(myTable.getSelectedRow(), 1).toString());
        txtDonorBloodGroup.setText(model.getValueAt(myTable.getSelectedRow(), 2).toString());
        txtDonorMobileNo.setText(model.getValueAt(myTable.getSelectedRow(), 3).toString());
        txtDonorAddress.setText(model.getValueAt(myTable.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_myTableMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased

        try {
            String sql = "select * from donor where DonorId = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, txtSearch.getText());

            rs = pst.executeQuery();

            if (rs.next()) {
                String add1 = rs.getString("DonorId");
                txtDonorId.setText(add1);

                String add2 = rs.getString("DonorName");
                txtDonorName.setText(add2);

                String add3 = rs.getString("DonorBloodGroup");
                txtDonorBloodGroup.setText(add3);

                String add4 = rs.getString("DonorMobileNo");
                txtDonorMobileNo.setText(add4);

                String add5 = rs.getString("DonorAddress");
                txtDonorAddress.setText(add5);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        try {
            String sql = "select * from donor where DonorBloodGroup = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, txtSearch.getText());

            rs = pst.executeQuery();

            if (rs.next()) {
                String add1 = rs.getString("DonorId");
                txtDonorId.setText(add1);

                String add2 = rs.getString("DonorName");
                txtDonorName.setText(add2);

                String add3 = rs.getString("DonorBloodGroup");
                txtDonorBloodGroup.setText(add3);

                String add4 = rs.getString("DonorMobileNo");
                txtDonorMobileNo.setText(add4);

                String add5 = rs.getString("DonorAddress");
                txtDonorAddress.setText(add5);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_txtSearchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtSearch.setText("");
        txtDonorId.setText("");
        txtDonorName.setText("");
        txtDonorBloodGroup.setText("");
        txtDonorMobileNo.setText("");
        txtDonorAddress.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        dispose();
        UserFrame adminobj2 = new UserFrame();
        adminobj2.setVisible(true);
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
            java.util.logging.Logger.getLogger(UserDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDonor().setVisible(true);
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
    private javax.swing.JLabel labelDonorAddress;
    private javax.swing.JLabel labelDonorBloodGroup;
    private javax.swing.JLabel labelDonorId;
    private javax.swing.JLabel labelDonorName;
    private javax.swing.JLabel labelDonorPhoneNo;
    private javax.swing.JTable myTable;
    private javax.swing.JTextField txtDonorAddress;
    private javax.swing.JTextField txtDonorBloodGroup;
    private javax.swing.JTextField txtDonorId;
    private javax.swing.JTextField txtDonorMobileNo;
    private javax.swing.JTextField txtDonorName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
