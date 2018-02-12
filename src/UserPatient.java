
//import com.sun.istack.internal.logging.Logger;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UserPatient extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst;
    Statement stmt;
    ResultSet rs;
    Vector datacol = new Vector();
    Vector datarow = new Vector();
    JTable datatable;
    JScrollPane viewdata;
    private int i;
    private int j;
    private int DonorId;

    public UserPatient() {
        initComponents();
       // this.setSize(1100, 500);
        //OpenDatabase();
    }

    public void OpenDatabase() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Patient", "root", "");
        } catch (Exception e) {
            System.out.println(e);
        }
        /*
         Statement state = con.createStatement();
         ResultSet rs = state.executeQuery("SELECT * from Patient");


         rs.next();
         int id_col = rs.getInt("PatientId");
         String id = Integer.toString(id_col);
         String name = rs.getString("PatientName");
         String grp = rs.getString("PatientBloodGroup");
         int job_col = rs.getInt("PatientMobileNo");
         String job = Integer.toString(job_col);
         String adress = rs.getString("PatientAddress");

         //DISPLAY THE FIRST RECORD IN THE TEXT FIELDS
         txtPatientId.setText(id);
         txtPatientName.setText(name);
         txtPatientBloodGroup.setText(grp);
         txtPatientMobileNo.setText(job);
         txtPatientAddress.setText(adress);
         } catch (SQLException err) {
         System.out.println(err.getMessage());
         }  */

    }

    public void CloseDatabase() {
        try {
            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelDonorId = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        labelDonorName = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        labelDonorBloodGroup = new javax.swing.JLabel();
        txtPatientBloodGroup = new javax.swing.JTextField();
        labelDonorPhoneNo = new javax.swing.JLabel();
        txtPatientMobileNo = new javax.swing.JTextField();
        labelDonorAddress = new javax.swing.JLabel();
        txtPatientAddress = new javax.swing.JTextField();
        btnview = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        myTable = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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
        labelDonorId.setText("PatientId");
        jPanel1.add(labelDonorId);
        labelDonorId.setBounds(20, 160, 90, 30);

        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtPatientId);
        txtPatientId.setBounds(150, 160, 180, 30);

        labelDonorName.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelDonorName.setForeground(new java.awt.Color(153, 0, 0));
        labelDonorName.setText("PatientName");
        jPanel1.add(labelDonorName);
        labelDonorName.setBounds(20, 220, 80, 20);

        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtPatientName);
        txtPatientName.setBounds(150, 210, 180, 30);

        labelDonorBloodGroup.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelDonorBloodGroup.setForeground(new java.awt.Color(153, 0, 0));
        labelDonorBloodGroup.setText("PatientBloodGroup");
        jPanel1.add(labelDonorBloodGroup);
        labelDonorBloodGroup.setBounds(20, 270, 120, 15);
        jPanel1.add(txtPatientBloodGroup);
        txtPatientBloodGroup.setBounds(150, 260, 180, 30);

        labelDonorPhoneNo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelDonorPhoneNo.setForeground(new java.awt.Color(153, 51, 0));
        labelDonorPhoneNo.setText("PatientPhoneNo");
        jPanel1.add(labelDonorPhoneNo);
        labelDonorPhoneNo.setBounds(20, 320, 120, 15);
        jPanel1.add(txtPatientMobileNo);
        txtPatientMobileNo.setBounds(150, 310, 180, 30);

        labelDonorAddress.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelDonorAddress.setForeground(new java.awt.Color(153, 0, 0));
        labelDonorAddress.setText("PatientAddress");
        jPanel1.add(labelDonorAddress);
        labelDonorAddress.setBounds(20, 370, 110, 20);
        jPanel1.add(txtPatientAddress);
        txtPatientAddress.setBounds(150, 360, 180, 30);

        btnview.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnview.setForeground(new java.awt.Color(153, 0, 0));
        btnview.setText("View");
        btnview.setToolTipText("View informatioon about Patients");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });
        jPanel1.add(btnview);
        btnview.setBounds(360, 210, 80, 23);

        myTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "PatientId", "PatientName", "PatientBloodGroup", "PatientMobileNo", "PatientAddress"
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
        jScrollPane1.setBounds(480, 130, 590, 270);

        txtSearch.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(204, 0, 204));
        txtSearch.setToolTipText("Search\n");
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtSearch);
        txtSearch.setBounds(140, 40, 160, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Search Here");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(4, 50, 120, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("                  DETAILS ABOUT PATIENT");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(530, 40, 370, 50);

        btnClear.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnClear.setForeground(new java.awt.Color(153, 0, 51));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear);
        btnClear.setBounds(370, 50, 70, 21);

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setText("Back");
        jButton1.setToolTipText("Back to AdminPanel window");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1020, 0, 70, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1093, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
    }//GEN-LAST:event_txtPatientNameActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Patient", "root", "");

            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery("SELECT * from Patient");

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
            java.util.logging.Logger.getLogger(Donor.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        /* {
         rs.next();
         int id_col = rs.getInt("PatientId");
         String id = Integer.toString(id_col);
         String name = rs.getString("PatientName");
         String grp = rs.getString("PatientBloodGroup");
         int job_col = rs.getInt("PatientMobileNo");
         String job = Integer.toString(job_col);
         String adress = rs.getString("PatientAddress");

         //DISPLAY THE FIRST RECORD IN THE TEXT FIELDS

         txtPatientId.setText(id);
         txtPatientName.setText(name);
         txtPatientBloodGroup.setText(grp);
         txtPatientMobileNo.setText(job);
         txtPatientAddress.setText(adress);
         } catch (SQLException err) {
         System.out.println(err.getMessage());
         }

         */

    }//GEN-LAST:event_btnviewActionPerformed

    private void myTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myTableMouseClicked

        DefaultTableModel model = (DefaultTableModel) myTable.getModel();

        txtPatientId.setText(model.getValueAt(myTable.getSelectedRow(), 0).toString());
        txtPatientName.setText(model.getValueAt(myTable.getSelectedRow(), 1).toString());
        txtPatientBloodGroup.setText(model.getValueAt(myTable.getSelectedRow(), 2).toString());
        txtPatientMobileNo.setText(model.getValueAt(myTable.getSelectedRow(), 3).toString());
        txtPatientAddress.setText(model.getValueAt(myTable.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_myTableMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased

        try {
            String sql = "select * from Patient where PatientId = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, txtSearch.getText());

            rs = pst.executeQuery();

            if (rs.next()) {
                String add1 = rs.getString("PatientId");
                txtPatientId.setText(add1);

                String add2 = rs.getString("PatientName");
                txtPatientName.setText(add2);

                String add3 = rs.getString("PatientBloodGroup");
                txtPatientBloodGroup.setText(add3);

                String add4 = rs.getString("PatientMobileNo");
                txtPatientMobileNo.setText(add4);

                String add5 = rs.getString("PatientAddress");
                txtPatientAddress.setText(add5);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        try {
            String sql = "select * from Patient where PatientBloodGroup = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, txtSearch.getText());

            rs = pst.executeQuery();

            if (rs.next()) {
                String add1 = rs.getString("PatientId");
                txtPatientId.setText(add1);

                String add2 = rs.getString("PatientName");
                txtPatientName.setText(add2);

                String add3 = rs.getString("PatientBloodGroup");
                txtPatientBloodGroup.setText(add3);

                String add4 = rs.getString("PatientMobileNo");
                txtPatientMobileNo.setText(add4);

                String add5 = rs.getString("PatientAddress");
                txtPatientAddress.setText(add5);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        txtSearch.setText("");
        txtPatientId.setText("");
        txtPatientName.setText("");
        txtPatientBloodGroup.setText("");
        txtPatientMobileNo.setText("");
        txtPatientAddress.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        UserFrame adminobj1 = new UserFrame();
        adminobj1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void readData() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Patient", "root", "");

            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery("SELECT * from Patient");
            
            int id_col = rs.getInt("PatientId");
            //String id = Integer.toString(id_col);
            String name = rs.getString("PatientName");
            String grp = rs.getString("PatientBloodGroup");
            int job_col = rs.getInt("PatientMobileNo");
            // String job = Integer.toString(job_col);
            String adress = rs.getString("PatientAddress");


            //DISPLAY THE FIRST RECORD IN THE TEXT FIELDS

            txtPatientId.setText(String.valueOf(id_col));
            txtPatientName.setText(name);
            txtPatientBloodGroup.setText(grp);
            txtPatientMobileNo.setText(String.valueOf(job_col));
            txtPatientAddress.setText(adress);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*for next button
     try {
     if (rs.next()) {
                
     int id_col = rs.getInt("PatientId");
     String id = Integer.toString(id_col);
     String name = rs.getString("PatientName");
     String grp = rs.getString("PatientBloodGroup");
     int job_col = rs.getInt("PatientMobileNo");
     String job = Integer.toString(job_col);
     String adress = rs.getString("PatientAddress");

     //DISPLAY THE FIRST RECORD IN THE TEXT FIELDS

     txtPatientId.setText(id);
     txtPatientName.setText(name);
     txtPatientBloodGroup.setText(grp);
     txtPatientMobileNo.setText(job);
     txtPatientAddress.setText(adress);


     } else {
     rs.previous();
     JOptionPane.showMessageDialog(UserPatient.this, "End of File");
     }
     } catch (SQLException err) {
     JOptionPane.showMessageDialog(UserPatient.this, err.getMessage());

     }
     */

    /*   for first button
     try {
     rs.first();
     int id_col = rs.getInt("PatientId");
     String id = Integer.toString(id_col);
     String name = rs.getString("PatientName");
     String grp = rs.getString("PatientBloodGroup");
     int job_col = rs.getInt("PatientMobileNo");
     String job = Integer.toString(job_col);
     String adress = rs.getString("PatientAddress");

     //DISPLAY THE FIRST RECORD IN THE TEXT FIELDS
     txtPatientId.setText(id);
     txtPatientName.setText(name);
     txtPatientBloodGroup.setText(grp);

     txtPatientMobileNo.setText(job);
     txtPatientAddress.setText(adress);

     } catch (SQLException err) {
     JOptionPane.showMessageDialog(UserPatient.this, err.getMessage());
     }
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
            java.util.logging.Logger.getLogger(UserPatient.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserPatient.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserPatient.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserPatient.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserPatient().setVisible(true);
                
                
                
                //er por theke coding shuru
              // JFrame frame = new JFrame();
              // frame.setLocation(10,10);
              // frame.setSize(200, 200);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnview;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JTextField txtPatientAddress;
    private javax.swing.JTextField txtPatientBloodGroup;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientMobileNo;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
