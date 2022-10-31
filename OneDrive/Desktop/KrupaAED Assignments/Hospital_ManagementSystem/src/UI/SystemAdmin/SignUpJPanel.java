/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdmin;

import Model.Doctor.DoctorDirectory;
import Model.Encounter.EncounterDirectory;
import Model.Hospital.HospitalDirectory;
import Model.Patient.PatientDirectory;
import Model.SignUp.SignUp;
import Model.SignUp.SignUpDirectory;
import Model.Vitals.VitalsDirectory;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author sohamdeshpande
 */
public class SignUpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SignUpJPanel
     */
    
    SignUpDirectory SignUpDirectory;
    HospitalDirectory HospitalDirectory;
    DoctorDirectory DoctorDirectory;
    PatientDirectory PatientDirectory;
    EncounterDirectory EncounterDirectory;
    VitalsDirectory VitalsDirectory;
    SignUp SignUp;
    
    public SignUpJPanel(SignUpDirectory SignUpDirectory, HospitalDirectory HospitalDirectory, DoctorDirectory DoctorDirectory, PatientDirectory PatientDirectory, EncounterDirectory EncounterDirectory, VitalsDirectory VitalsDirectory) {
        initComponents();
        this.SignUpDirectory = SignUpDirectory;
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

        lblCreatePassword = new javax.swing.JLabel();
        lblConfirmPassword = new javax.swing.JLabel();
        txtNameSignUp = new javax.swing.JTextField();
        btnSignUp = new javax.swing.JButton();
        txtDoBSignUp = new javax.swing.JTextField();
        txtAgeSignUp = new javax.swing.JTextField();
        txtAddressSignUp = new javax.swing.JTextField();
        txtCitySignUp = new javax.swing.JTextField();
        txtStateSignUp = new javax.swing.JTextField();
        txtPinCodeSignUp = new javax.swing.JTextField();
        txtConfirmPasswordSignUp = new javax.swing.JPasswordField();
        lblName = new javax.swing.JLabel();
        lblDoB = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblPinCode = new javax.swing.JLabel();
        txtCreatePasswordSignUp = new javax.swing.JPasswordField();

        lblCreatePassword.setText("Create Password:");

        lblConfirmPassword.setText("Confirm Password:");

        txtNameSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameSignUpActionPerformed(evt);
            }
        });
        txtNameSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameSignUpKeyPressed(evt);
            }
        });

        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        btnSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSignUpKeyPressed(evt);
            }
        });

        txtDoBSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoBSignUpActionPerformed(evt);
            }
        });
        txtDoBSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDoBSignUpKeyPressed(evt);
            }
        });

        txtAgeSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAgeSignUpKeyPressed(evt);
            }
        });

        txtAddressSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddressSignUpKeyPressed(evt);
            }
        });

        txtCitySignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCitySignUpKeyPressed(evt);
            }
        });

        txtStateSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtStateSignUpKeyPressed(evt);
            }
        });

        txtPinCodeSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPinCodeSignUpActionPerformed(evt);
            }
        });
        txtPinCodeSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPinCodeSignUpKeyPressed(evt);
            }
        });

        txtConfirmPasswordSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConfirmPasswordSignUpKeyPressed(evt);
            }
        });

        lblName.setText("Name:");

        lblDoB.setText("DoB:");

        lblAge.setText("Age:");

        lblAddress.setText("Address:");

        lblCity.setText("City:");

        lblState.setText("State:");

        lblPinCode.setText("Pin Code:");

        txtCreatePasswordSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCreatePasswordSignUpKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblCreatePassword)
                                .addComponent(lblConfirmPassword))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCreatePasswordSignUp)
                                .addComponent(txtConfirmPasswordSignUp)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSignUp)
                            .addGap(9, 9, 9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPinCode)
                            .addComponent(lblAddress)
                            .addComponent(lblAge)
                            .addComponent(lblDoB)
                            .addComponent(lblName)
                            .addComponent(lblCity)
                            .addComponent(lblState))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNameSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(txtDoBSignUp)
                            .addComponent(txtAgeSignUp)
                            .addComponent(txtAddressSignUp)
                            .addComponent(txtCitySignUp)
                            .addComponent(txtStateSignUp)
                            .addComponent(txtPinCodeSignUp))))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtNameSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoB)
                    .addComponent(txtDoBSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAgeSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddressSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCitySignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblState)
                    .addComponent(txtStateSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPinCode)
                    .addComponent(txtPinCodeSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreatePassword)
                    .addComponent(txtCreatePasswordSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConfirmPasswordSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConfirmPassword))
                .addGap(18, 18, 18)
                .addComponent(btnSignUp)
                .addContainerGap(371, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameSignUpActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        
        if (!Pattern.matches("^\\d+$", txtAgeSignUp.getText())) 
         {
             JOptionPane.showMessageDialog(null, "Age cannot be Negative!", "Error", JOptionPane.ERROR_MESSAGE);
             btnSignUp.setEnabled(false);
         }
        else if (!Pattern.matches("^(1[0-9]|2[0-9]|3[0-9]|4[0-9]|5[0-9]|6[0-9]|7[0-9]|8[0-9]|9[0-9])$", txtAgeSignUp.getText())) 
         {
             JOptionPane.showMessageDialog(null, "Age should be between 1 to 99!", "Error", JOptionPane.ERROR_MESSAGE);
             btnSignUp.setEnabled(false);
         }
        
        else if (!(Pattern.matches("^[0,1]?\\d{1}\\/(([0-2]?\\d{1})|([3][0,1]{1}))\\/(([1]{1}[9]{1}[9]{1}\\d{1})|([2-9]{1}\\d{3}))$", txtDoBSignUp.getText())))
        {
          JOptionPane.showMessageDialog(null, "Please enter date in mm/dd/yyyy format!", "Error", JOptionPane.ERROR_MESSAGE);
          btnSignUp.setEnabled(false);
        }
        else if (!(Pattern.matches("^([0-9]{5})$", txtPinCodeSignUp.getText())))
        {
          JOptionPane.showMessageDialog(null, "Pin Code should be 5 digits only!", "Error", JOptionPane.ERROR_MESSAGE);
          btnSignUp.setEnabled(false);
        }
        else if (!Pattern.matches("^(([a-z]|[0-9]|[A-Z]){5})$", txtCreatePasswordSignUp.getText())) 
         {
             JOptionPane.showMessageDialog(null, "The password should be a combination of characters and digits of length 5!", "Error", JOptionPane.ERROR_MESSAGE);
             btnSignUp.setEnabled(false);
         }
        else if (!txtCreatePasswordSignUp.getText().equals(txtConfirmPasswordSignUp.getText()))
        {
                    
             JOptionPane.showMessageDialog(null, "Your Password should match!", "Error", JOptionPane.ERROR_MESSAGE);
             btnSignUp.setEnabled(false);
        }
        else if (Pattern.matches("^$", txtNameSignUp.getText())) 
         {
             JOptionPane.showMessageDialog(null, "Name cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
             btnSignUp.setEnabled(false);
         }
        else if (Pattern.matches("^$", txtDoBSignUp.getText())) 
         {
             JOptionPane.showMessageDialog(null, "Date of Birth cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
             btnSignUp.setEnabled(false);
         }
        else if (Pattern.matches("^$", txtAgeSignUp.getText())) 
         {
             JOptionPane.showMessageDialog(null, "Age cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
             btnSignUp.setEnabled(false);
         }
        else if (Pattern.matches("^$", txtAddressSignUp.getText())) 
         {
             JOptionPane.showMessageDialog(null, "Address cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
             btnSignUp.setEnabled(false);
         }
        else if (Pattern.matches("^$", txtCitySignUp.getText())) 
         {
             JOptionPane.showMessageDialog(null, "City cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
             btnSignUp.setEnabled(false);
         }
        else if (Pattern.matches("^$", txtStateSignUp.getText())) 
         {
             JOptionPane.showMessageDialog(null, "State cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
             btnSignUp.setEnabled(false);
         }
        else if (Pattern.matches("^$", txtPinCodeSignUp.getText())) 
         {
             JOptionPane.showMessageDialog(null, "Pin Code cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
             btnSignUp.setEnabled(false);
         }
        else if (Pattern.matches("^$", txtCreatePasswordSignUp.getText())) 
         {
             JOptionPane.showMessageDialog(null, "Password cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
             btnSignUp.setEnabled(false);
         }
        else {
        
        String Name = txtNameSignUp.getText();
        String DoB = txtDoBSignUp.getText();
        int Age = Integer.parseInt(txtAgeSignUp.getText());
        String Address = txtAddressSignUp.getText();
        String City = txtCitySignUp.getText();
        String State = txtStateSignUp.getText();
        int PinCode = Integer.parseInt(txtPinCodeSignUp.getText());
        String CreatePassword = txtCreatePasswordSignUp.getText();
        String ConfirmPassword = txtConfirmPasswordSignUp.getText();
                
        SignUp su = SignUpDirectory.addNewSignUp();

        su.setName(Name);
        su.setDoB(DoB);
        su.setAge(Age);
        su.setAddress(Address);
        su.setCity(City);
        su.setState(State);
        su.setPinCode(PinCode);
        su.setCreatePassword(CreatePassword);
        su.setConfirmPassword(ConfirmPassword);

        JOptionPane.showMessageDialog(this, "New Person Details Created and your Person ID is: " + su.getPersonID());

        txtNameSignUp.setText("");
        txtDoBSignUp.setText("");
        txtAgeSignUp.setText("");
        txtAddressSignUp.setText("");
        txtCitySignUp.setText("");
        txtStateSignUp.setText("");
        txtPinCodeSignUp.setText("");
        txtCreatePasswordSignUp.setText("");
        txtConfirmPasswordSignUp.setText("");
        }
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void txtDoBSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoBSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoBSignUpActionPerformed

    private void txtPinCodeSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPinCodeSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPinCodeSignUpActionPerformed

    private void btnSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSignUpKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSignUpKeyPressed

    private void txtDoBSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDoBSignUpKeyPressed
        btnSignUp.setEnabled(true);
    }//GEN-LAST:event_txtDoBSignUpKeyPressed

    private void txtAgeSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeSignUpKeyPressed
        btnSignUp.setEnabled(true);
    }//GEN-LAST:event_txtAgeSignUpKeyPressed

    private void txtPinCodeSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPinCodeSignUpKeyPressed
        btnSignUp.setEnabled(true);
    }//GEN-LAST:event_txtPinCodeSignUpKeyPressed

    private void txtCreatePasswordSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreatePasswordSignUpKeyPressed
        btnSignUp.setEnabled(true);
    }//GEN-LAST:event_txtCreatePasswordSignUpKeyPressed

    private void txtNameSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameSignUpKeyPressed
        // TODO add your handling code here:
        btnSignUp.setEnabled(true);
    }//GEN-LAST:event_txtNameSignUpKeyPressed

    private void txtAddressSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressSignUpKeyPressed
        // TODO add your handling code here:
        btnSignUp.setEnabled(true);
    }//GEN-LAST:event_txtAddressSignUpKeyPressed

    private void txtCitySignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCitySignUpKeyPressed
        // TODO add your handling code here:
        btnSignUp.setEnabled(true);
    }//GEN-LAST:event_txtCitySignUpKeyPressed

    private void txtStateSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStateSignUpKeyPressed
        // TODO add your handling code here:
        btnSignUp.setEnabled(true);
    }//GEN-LAST:event_txtStateSignUpKeyPressed

    private void txtConfirmPasswordSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmPasswordSignUpKeyPressed
        // TODO add your handling code here:
        btnSignUp.setEnabled(true);
    }//GEN-LAST:event_txtConfirmPasswordSignUpKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblCreatePassword;
    private javax.swing.JLabel lblDoB;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPinCode;
    private javax.swing.JLabel lblState;
    private javax.swing.JTextField txtAddressSignUp;
    private javax.swing.JTextField txtAgeSignUp;
    private javax.swing.JTextField txtCitySignUp;
    private javax.swing.JPasswordField txtConfirmPasswordSignUp;
    private javax.swing.JPasswordField txtCreatePasswordSignUp;
    private javax.swing.JTextField txtDoBSignUp;
    private javax.swing.JTextField txtNameSignUp;
    private javax.swing.JTextField txtPinCodeSignUp;
    private javax.swing.JTextField txtStateSignUp;
    // End of variables declaration//GEN-END:variables
}