
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class AdminPanel extends javax.swing.JFrame {

    
    // AdminPanel adminObj = new AdminPanel();
    public AdminPanel() {
        initComponents();
    }

  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnDonor = new javax.swing.JButton();
        btnPatient = new javax.swing.JButton();
        btnBloodBank = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 51));

        jPanel1.setLayout(null);

        btnDonor.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnDonor.setForeground(new java.awt.Color(153, 0, 0));
        btnDonor.setText("Donor");
        btnDonor.setToolTipText("Click here to see or edit data in Donor Database");
        btnDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonorActionPerformed(evt);
            }
        });

        btnPatient.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnPatient.setForeground(new java.awt.Color(204, 0, 0));
        btnPatient.setText("Patient");
        btnPatient.setToolTipText("Click here to see or edit data in Patient Database");
        btnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActionPerformed(evt);
            }
        });

        btnBloodBank.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnBloodBank.setForeground(new java.awt.Color(204, 0, 0));
        btnBloodBank.setText("Blood Bank");
        btnBloodBank.setToolTipText("Click here to see or edit data in BloodBank Database");
        btnBloodBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBloodBankActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.setToolTipText("Back to Welcome Window");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setText("               Admin Panel Form");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin panel.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBloodBank)
                            .addComponent(btnDonor, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)))
                .addGap(92, 92, 92)
                .addComponent(btnDonor)
                .addGap(44, 44, 44)
                .addComponent(btnBloodBank)
                .addGap(36, 36, 36)
                .addComponent(btnPatient)
                .addGap(0, 145, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonorActionPerformed
        dispose();
        Donor DonorObj = new Donor();
        DonorObj.setVisible(true);
        
    }//GEN-LAST:event_btnDonorActionPerformed

    private void btnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActionPerformed
        dispose();
        Patient PatientObj = new Patient();
        PatientObj.setVisible(true);
        
        
    }//GEN-LAST:event_btnPatientActionPerformed

    private void btnBloodBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBloodBankActionPerformed
        dispose();
        BloodBank BloodBankObj = new BloodBank();
        BloodBankObj.setVisible(true);



        /*
         new BloodBank().addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent e) {
         // adminObj.setVisible(true);
         new AdminPanel().setVisible(true);
         }
         });   */



    }//GEN-LAST:event_btnBloodBankActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
         dispose();
        WelcomeWindow2 wlcmobj2 = new WelcomeWindow2();
        wlcmobj2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);

                //AdminPanel adminObj = new AdminPanel();
                //  adminObj.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBloodBank;
    private javax.swing.JButton btnDonor;
    private javax.swing.JButton btnPatient;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
