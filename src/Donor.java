
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

public class Donor extends javax.swing.JFrame {

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

    public Donor() {
        initComponents();
        //this.setSize(1000, 500);
    }

    public void OpenDatabase() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/donor", "root", "");

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

    public void insertdata(int DonorId, String DonorName, String DonorBloodGroup, int DonorMobileNo, String DonorAddress) {
        try {
            Statement st = con.createStatement();
            st.executeUpdate("insert into donor values(" + DonorId + ",'" + DonorName + "', '" + DonorBloodGroup + "', " + DonorMobileNo + ", '" + DonorAddress + "')");
            JOptionPane.showConfirmDialog(null, "Your Data Has been Inserted", "Result", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Problem in Database connectivity or Data", "Result", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
        }
    }

    public void deletedata(int DonorId) {
        try {
            Statement st = con.createStatement();
            st.executeUpdate("delete from donor where DonorId=" + DonorId);
            JOptionPane.showConfirmDialog(null, "Your Data Has been Deleted", "Result", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Problem in Database connectivity or Data", "Result", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
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
        btnDelete = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnview = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        myTable = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

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

        btnDelete.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(153, 0, 0));
        btnDelete.setText("Delete");
        btnDelete.setToolTipText("Delete data of Dnor");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);
        btnDelete.setBounds(350, 280, 80, 23);

        btnInsert.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(102, 0, 0));
        btnInsert.setText("Insert");
        btnInsert.setToolTipText("Insert new data about Donors");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsert);
        btnInsert.setBounds(350, 230, 80, 23);

        btnUpdate.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(102, 0, 51));
        btnUpdate.setText("Update");
        btnUpdate.setToolTipText("Updata data of Donors");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate);
        btnUpdate.setBounds(350, 330, 80, 23);

        btnview.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnview.setForeground(new java.awt.Color(102, 51, 0));
        btnview.setText("View");
        btnview.setToolTipText("Click here to view the Information about Donors");
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
        txtSearch.setToolTipText("Search by Donor id");
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
        jButton1.setToolTipText("Clear data from the fields");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(350, 50, 70, 21);

        jButton2.setBackground(new java.awt.Color(153, 255, 153));
        jButton2.setText("Back");
        jButton2.setToolTipText("Back to AdminPanel Window");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(883, 0, 70, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 952, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDonorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDonorIdActionPerformed
    }//GEN-LAST:event_txtDonorIdActionPerformed

    private void txtDonorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDonorNameActionPerformed
    }//GEN-LAST:event_txtDonorNameActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed

        int DonorId = Integer.parseInt(txtDonorId.getText());
        String DonorName = txtDonorName.getText();
        String DonorBloodGroup = txtDonorBloodGroup.getText();
        int DonorMobileNo = Integer.parseInt(txtDonorMobileNo.getText());
        String DonorAddress = txtDonorAddress.getText();

        try {
            OpenDatabase();
            insertdata(DonorId, DonorName, DonorBloodGroup, DonorMobileNo, DonorAddress);

            CloseDatabase();

        } catch (Exception e) {
            System.out.println(e);
        }
        txtDonorId.setText("");
        txtDonorName.setText("");
        txtDonorBloodGroup.setText("");
        txtDonorMobileNo.setText("");
        txtDonorAddress.setText("");
    }//GEN-LAST:event_btnInsertActionPerformed

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
        } catch (SQLException ex) {
            // Logger.getLogger(AnotherWindow.class.getName()).log(Level.SEVERE,null , ex);
            JOptionPane.showConfirmDialog(null, "Problem in Database connectivity or Data", "Result", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Donor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnviewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        int DonorId = Integer.parseInt(txtDonorId.getText());


        try {
            OpenDatabase();
            deletedata(DonorId);
            CloseDatabase();
            DonorId = 0;
        } catch (Exception e) {
            System.out.println(e);
        }






        if (evt.getSource() == txtDonorId) {
            // int DonorId = Integer.parseInt(txtDonorId.getText());
            try {
                OpenDatabase();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("Select * from donor where DonorId=" + DonorId);
                if (rs.next()) {
                    txtDonorName.setText(rs.getString("DonorName"));
                    txtDonorBloodGroup.setText(rs.getString("DonorBloodGroup"));
                    txtDonorMobileNo.setText(String.valueOf(rs.getInt("DonorMobileNo")));
                    txtDonorAddress.setText(rs.getString("DonorAddress"));
                }
                CloseDatabase();


            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, "Problem in Database connectivity or Data", "Result", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
            }
        }


        txtDonorId.setText("");
        txtDonorName.setText("");
        txtDonorBloodGroup.setText("");
        txtDonorMobileNo.setText("");
        txtDonorAddress.setText("");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        try {
            //  DefaultTableModel model = new DefaultTableModel();




            //  model.setValueAt(txtDonorId.getText() , myTable.getSelectedRow(), 0);
            //  model.setValueAt(txtDonorName.getText(), myTable.getSelectedRow(), 1);
            // model.setValueAt(txtDonorBloodGroup.getText(), myTable.getSelectedRow(), 2);
            //  model.setValueAt(txtDonorMobileNo.getText(), myTable.getSelectedRow(), 3);
            //  model.setValueAt(txtDonorAddress.getText(), myTable.getSelectedRow(), 4);


            String value1 = txtDonorId.getText();
            String value2 = txtDonorName.getText();
            String value3 = txtDonorBloodGroup.getText();
            String value4 = txtDonorMobileNo.getText();
            String value5 = txtDonorAddress.getText();

            String sql = " update donor set DonorId = '" + value1 + "' ,DonorName = '" + value2 + "' , DonorBloodGroup = '" + value3 + "' , DonorMobileNo = '" + value4 + "', DonorAddress = '" + value5 + "' where DonorId = '" + value1 + "'";

            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        //Update_table();
        txtDonorId.setText("");
        txtDonorName.setText("");
        txtDonorBloodGroup.setText("");
        txtDonorMobileNo.setText("");
        txtDonorAddress.setText("");

    }//GEN-LAST:event_btnUpdateActionPerformed

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

    private void myTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myTableMouseClicked

        DefaultTableModel model =  (DefaultTableModel) myTable.getModel();

        txtDonorId.setText(model.getValueAt(myTable.getSelectedRow(), 0).toString());
       txtDonorName.setText(model.getValueAt(myTable.getSelectedRow(), 1).toString());
       txtDonorBloodGroup.setText(model.getValueAt(myTable.getSelectedRow(), 2).toString());
        txtDonorMobileNo.setText(model.getValueAt(myTable.getSelectedRow(), 3).toString());
        txtDonorAddress.setText(model.getValueAt(myTable.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_myTableMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        dispose();
        AdminPanel adminobj2 = new AdminPanel();
        adminobj2.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Donor().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
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
