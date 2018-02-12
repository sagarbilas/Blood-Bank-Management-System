
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
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Patient extends javax.swing.JFrame {

    //  private final AdminPanel ap;
    // public Patient( AdminPanel form)
    // {
    //    ap = form;
    // }
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
    //  private Object myTable;

    public Patient() {
        initComponents();
        //this.setSize(1000, 500);
    }

    public void OpenDatabase() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Patient", "root", "");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void CloseDatabase() {
        try {
            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void insertdata(int PatientId, String PatientName, String PatientBloodGroup, int PatientMobileNo, String PatientAddress) {
        try {
            Statement st = con.createStatement();
            st.executeUpdate("insert into Patient values(" + PatientId + ",'" + PatientName + "', '" + PatientBloodGroup + "', " + PatientMobileNo + ", '" + PatientAddress + "')");
            JOptionPane.showConfirmDialog(null, "Your Data Has been Inserted", "Result", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Problem in Database connectivity or Data", "Result", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
        }
    }

    public void deletedata(int PatientId) {
        try {
            Statement st = con.createStatement();
            st.executeUpdate("delete from Patient where PatientId=" + PatientId);
            JOptionPane.showConfirmDialog(null, "Your Data Has been Deleted", "Result", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Problem in Database connectivity or Data", "Result", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
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
        btnDelete = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnview = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        myTable = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
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
        labelDonorId.setBounds(0, 160, 90, 30);

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
        labelDonorName.setBounds(0, 220, 80, 20);

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
        labelDonorBloodGroup.setBounds(0, 270, 120, 15);
        jPanel1.add(txtPatientBloodGroup);
        txtPatientBloodGroup.setBounds(150, 260, 180, 30);

        labelDonorPhoneNo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelDonorPhoneNo.setForeground(new java.awt.Color(153, 51, 0));
        labelDonorPhoneNo.setText("PatientPhoneNo");
        jPanel1.add(labelDonorPhoneNo);
        labelDonorPhoneNo.setBounds(0, 320, 120, 15);
        jPanel1.add(txtPatientMobileNo);
        txtPatientMobileNo.setBounds(150, 310, 180, 30);

        labelDonorAddress.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelDonorAddress.setForeground(new java.awt.Color(153, 0, 0));
        labelDonorAddress.setText("PatientAddress");
        jPanel1.add(labelDonorAddress);
        labelDonorAddress.setBounds(0, 370, 110, 20);
        jPanel1.add(txtPatientAddress);
        txtPatientAddress.setBounds(150, 360, 180, 30);

        btnDelete.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(153, 0, 0));
        btnDelete.setText("Delete");
        btnDelete.setToolTipText("Delete data of Patients");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);
        btnDelete.setBounds(370, 290, 80, 23);

        btnInsert.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(102, 0, 0));
        btnInsert.setText("Insert");
        btnInsert.setToolTipText("Insert data of new Patients");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsert);
        btnInsert.setBounds(370, 230, 80, 23);

        btnUpdate.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(102, 0, 51));
        btnUpdate.setText("Update");
        btnUpdate.setToolTipText("Update data of Patients");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate);
        btnUpdate.setBounds(370, 340, 80, 23);

        btnview.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnview.setForeground(new java.awt.Color(102, 51, 0));
        btnview.setText("View");
        btnview.setToolTipText("View data about patients");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });
        jPanel1.add(btnview);
        btnview.setBounds(370, 180, 80, 23);

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
        jScrollPane1.setBounds(480, 130, 550, 270);

        txtSearch.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(204, 0, 204));
        txtSearch.setToolTipText("Searc any patient by Patient Id");
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

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setText("Back");
        jButton1.setToolTipText("Back to AdminPanel window");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(980, 0, 70, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
    }//GEN-LAST:event_txtPatientNameActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        int PatientId = Integer.parseInt(txtPatientId.getText());

        try {
            OpenDatabase();
            deletedata(PatientId);
            CloseDatabase();
            PatientId = 0;
        } catch (Exception e) {
            System.out.println(e);
        }

        if (evt.getSource() == txtPatientId) {
            // int DonorId = Integer.parseInt(txtDonorId.getText());
            try {
                OpenDatabase();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("Select * from Patient where PatientId=" + PatientId);
                if (rs.next()) {
                    txtPatientName.setText(rs.getString("PatientName"));
                    txtPatientBloodGroup.setText(rs.getString("PatientBloodGroup"));
                    txtPatientMobileNo.setText(String.valueOf(rs.getInt("PatientMobileNo")));
                    txtPatientAddress.setText(rs.getString("PatientAddress"));
                }
                CloseDatabase();

            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, "Problem in Database connectivity or Data", "Result", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
            }
        }

        txtPatientId.setText("");
        txtPatientName.setText("");
        txtPatientBloodGroup.setText("");
        txtPatientMobileNo.setText("");
        txtPatientAddress.setText("");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed

        int PatientId = Integer.parseInt(txtPatientId.getText());
        String PatientName = txtPatientName.getText();
        String PatientBloodGroup = txtPatientBloodGroup.getText();
        int PatientMobileNo = Integer.parseInt(txtPatientMobileNo.getText());
        String PatientAddress = txtPatientAddress.getText();

        try {
            OpenDatabase();
            insertdata(PatientId, PatientName, PatientBloodGroup, PatientMobileNo, PatientAddress);

            CloseDatabase();

        } catch (Exception e) {
            System.out.println(e);
        }
        txtPatientId.setText("");
        txtPatientName.setText("");
        txtPatientBloodGroup.setText("");
        txtPatientMobileNo.setText("");
        txtPatientAddress.setText("");
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        try {

            String value1 = txtPatientId.getText();
            String value2 = txtPatientName.getText();
            String value3 = txtPatientBloodGroup.getText();
            String value4 = txtPatientMobileNo.getText();
            String value5 = txtPatientAddress.getText();

            String sql = " update Patient set PatientId = '" + value1 + "' ,PatientName = '" + value2 + "' , PatientBloodGroup = '" + value3 + "' , PatientMobileNo = '" + value4 + "', PatientAddress = '" + value5 + "' where PatientId = '" + value1 + "'";

            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        //Update_table();
        txtPatientId.setText("");
        txtPatientName.setText("");
        txtPatientBloodGroup.setText("");
        txtPatientMobileNo.setText("");
        txtPatientAddress.setText("");
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(Donor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnviewActionPerformed

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

    private void myTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myTableMouseClicked

        DefaultTableModel model = (DefaultTableModel) myTable.getModel();

        txtPatientId.setText(model.getValueAt(myTable.getSelectedRow(), 0).toString());
        txtPatientName.setText(model.getValueAt(myTable.getSelectedRow(), 1).toString());
        txtPatientBloodGroup.setText(model.getValueAt(myTable.getSelectedRow(), 2).toString());
        txtPatientMobileNo.setText(model.getValueAt(myTable.getSelectedRow(), 3).toString());
        txtPatientAddress.setText(model.getValueAt(myTable.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_myTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        AdminPanel adminobj1 = new AdminPanel();
        adminobj1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient().setVisible(true);

            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
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
