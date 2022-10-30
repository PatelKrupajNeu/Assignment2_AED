/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.SystemAdmin;

import Model.Doctor.DoctorDirectory;
import Model.Encounter.EncounterDirectory;
import Model.Hospital.HospitalDirectory;
import Model.Patient.PatientDirectory;
import Model.SignUp.SignUp;
import Model.SignUp.SignUpDirectory;
import Model.Vitals.VitalsDirectory;
import javax.swing.JOptionPane;
/**
 *
 * @author sarth
 */

public class MainJFrame extends javax.swing.JFrame {


    /**
     * Creates new form TestSplit
     */
    SignUpDirectory SignUpDirectory;
    HospitalDirectory HospitalDirectory;
    DoctorDirectory DoctorDirectory;
    PatientDirectory PatientDirectory;
    EncounterDirectory EncounterDirectory;
    VitalsDirectory VitalsDirectory;
    
    //final int PersonID = 1;
    public MainJFrame() {
        initComponents();
        SignUpDirectory = new SignUpDirectory();
        HospitalDirectory = new HospitalDirectory();
        DoctorDirectory = new DoctorDirectory();
        PatientDirectory = new PatientDirectory();
        EncounterDirectory = new EncounterDirectory();
        VitalsDirectory = new VitalsDirectory();

 
    }
    
    public MainJFrame(SignUpDirectory SignUpDirectory1, HospitalDirectory HospitalDirectory, DoctorDirectory DoctorDirectory, PatientDirectory PatientDirectory, EncounterDirectory EncounterDirectory, VitalsDirectory VitalsDirectory) {
        initComponents();
        this.SignUpDirectory = SignUpDirectory1;
        this.HospitalDirectory = HospitalDirectory;
        this.DoctorDirectory = DoctorDirectory;
        this.PatientDirectory = PatientDirectory;
        this.EncounterDirectory = EncounterDirectory;
        this.VitalsDirectory = VitalsDirectory;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPaneMain = new javax.swing.JSplitPane();
        controlPanelMain = new javax.swing.JPanel();
        btnAdmin = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();
        lblHospitalManagementSystem = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        workAreaMain = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitPaneMain.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        controlPanelMain.setBackground(new java.awt.Color(153, 153, 255));

        btnAdmin.setBackground(new java.awt.Color(204, 204, 204));
        btnAdmin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdmin.setText("ADMIN LOGIN");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnCustomer.setBackground(new java.awt.Color(204, 204, 204));
        btnCustomer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCustomer.setText("USERS");
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });

        lblHospitalManagementSystem.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        lblHospitalManagementSystem.setText("CURE HOSPITAL");

        btnSignUp.setBackground(new java.awt.Color(204, 204, 204));
        btnSignUp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSignUp.setText("SIGN UP");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelMainLayout = new javax.swing.GroupLayout(controlPanelMain);
        controlPanelMain.setLayout(controlPanelMainLayout);
        controlPanelMainLayout.setHorizontalGroup(
            controlPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelMainLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(controlPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHospitalManagementSystem)
                    .addGroup(controlPanelMainLayout.createSequentialGroup()
                        .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        controlPanelMainLayout.setVerticalGroup(
            controlPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelMainLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(lblHospitalManagementSystem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(controlPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdmin)
                    .addComponent(btnCustomer)
                    .addComponent(btnSignUp))
                .addGap(30, 30, 30))
        );

        splitPaneMain.setTopComponent(controlPanelMain);

        workAreaMain.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/SystemAdmin/aa.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("WELCOME TO HOSPITAL MANAGEMENT SYSTEM");

        javax.swing.GroupLayout workAreaMainLayout = new javax.swing.GroupLayout(workAreaMain);
        workAreaMain.setLayout(workAreaMainLayout);
        workAreaMainLayout.setHorizontalGroup(
            workAreaMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workAreaMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workAreaMainLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(99, 99, 99))
        );
        workAreaMainLayout.setVerticalGroup(
            workAreaMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaMainLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(246, 246, 246))
        );

        splitPaneMain.setRightComponent(workAreaMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPaneMain, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(splitPaneMain)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        
        LoginAdminJPanel loginadminpanel = new LoginAdminJPanel(SignUpDirectory, HospitalDirectory, DoctorDirectory, PatientDirectory, EncounterDirectory, VitalsDirectory);
        splitPaneMain.setRightComponent(loginadminpanel);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        
        LoginUserJPanel loginuserpanel = new LoginUserJPanel(SignUpDirectory, HospitalDirectory, DoctorDirectory, PatientDirectory, EncounterDirectory, VitalsDirectory);
        splitPaneMain.setRightComponent(loginuserpanel);
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        //new SignUpJFrame().show();
        //dispose();
        SignUpJPanel signuppanel = new SignUpJPanel(SignUpDirectory, HospitalDirectory, DoctorDirectory, PatientDirectory, EncounterDirectory, VitalsDirectory);
        splitPaneMain.setRightComponent(signuppanel);
    }//GEN-LAST:event_btnSignUpActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JPanel controlPanelMain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblHospitalManagementSystem;
    private javax.swing.JSplitPane splitPaneMain;
    private javax.swing.JPanel workAreaMain;
    // End of variables declaration//GEN-END:variables
}
