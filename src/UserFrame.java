
public class UserFrame extends javax.swing.JFrame {

    public UserFrame() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AboutDonorButton = new javax.swing.JButton();
        AboutPatientButton = new javax.swing.JButton();
        AboutBloodBankButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(null);

        AboutDonorButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        AboutDonorButton.setForeground(new java.awt.Color(153, 51, 0));
        AboutDonorButton.setText("About Donor");
        AboutDonorButton.setToolTipText("Click here to view informatioon about Donors");
        AboutDonorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutDonorButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AboutDonorButton);
        AboutDonorButton.setBounds(530, 120, 150, 23);

        AboutPatientButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        AboutPatientButton.setForeground(new java.awt.Color(153, 0, 51));
        AboutPatientButton.setText("About Patient");
        AboutPatientButton.setToolTipText("Click here to view informatioon about Patients");
        AboutPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutPatientButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AboutPatientButton);
        AboutPatientButton.setBounds(530, 230, 150, 23);

        AboutBloodBankButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        AboutBloodBankButton.setForeground(new java.awt.Color(153, 0, 0));
        AboutBloodBankButton.setText("About Blood Bank");
        AboutBloodBankButton.setToolTipText("Click here to view informatioon about BloodBank");
        AboutBloodBankButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutBloodBankButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AboutBloodBankButton);
        AboutBloodBankButton.setBounds(530, 320, 150, 23);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText(" Welcome to the User Form");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 10, 310, 50);

        jButton1.setBackground(new java.awt.Color(255, 255, 153));
        jButton1.setText("Back");
        jButton1.setToolTipText("Back to the Welcome Window");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(630, 0, 80, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userframe.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 70, 460, 390);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AboutDonorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutDonorButtonActionPerformed
        
        dispose();
        UserDonor wlcmobj2 = new UserDonor();
        wlcmobj2.setVisible(true);
        
    }//GEN-LAST:event_AboutDonorButtonActionPerformed

    private void AboutPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutPatientButtonActionPerformed
        
        dispose();
        UserPatient wlcmobj2 = new UserPatient();
        wlcmobj2.setVisible(true);
    }//GEN-LAST:event_AboutPatientButtonActionPerformed

    private void AboutBloodBankButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutBloodBankButtonActionPerformed
        
        dispose();
        UserBloodBank wlcmobj2 = new UserBloodBank();
        wlcmobj2.setVisible(true);
        
    }//GEN-LAST:event_AboutBloodBankButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        WelcomeWindow2 wlcmobj2 = new WelcomeWindow2();
        wlcmobj2.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AboutBloodBankButton;
    private javax.swing.JButton AboutDonorButton;
    private javax.swing.JButton AboutPatientButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
