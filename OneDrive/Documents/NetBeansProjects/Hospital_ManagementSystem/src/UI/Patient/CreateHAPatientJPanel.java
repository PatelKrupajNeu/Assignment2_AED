/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Patient;

import Model.Doctor.DoctorDirectory;
import Model.Hospital.Hospital;
import Model.Hospital.HospitalDirectory;
import Model.Patient.Patient;
import Model.Patient.PatientDirectory;
import Model.SignUp.SignUp;
import Model.SignUp.SignUpDirectory;
import javax.swing.JOptionPane;

/**
 *
 * @author sarth
 */
public class CreateHAPatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePatientJPanel
     */
    
    SignUpDirectory SignUpDirectory;
    HospitalDirectory HospitalDirectory;
    DoctorDirectory DoctorDirectory; 
    PatientDirectory PatientDirectory;
    
    
    public CreateHAPatientJPanel(SignUpDirectory SignUpDirectory, HospitalDirectory HospitalDirectory,String HID, DoctorDirectory DoctorDirectory, PatientDirectory PatientDirectory) {
        initComponents();
        this.SignUpDirectory = SignUpDirectory;
        this.HospitalDirectory = HospitalDirectory;
        this.DoctorDirectory = DoctorDirectory;
        this.PatientDirectory = PatientDirectory;
        for(Hospital selectedSignUp : HospitalDirectory.getHospitalDirectory()){
            if (String.valueOf(selectedSignUp.getHospitalID()).equals(HID)){
            txtHospitalID.setText(String.valueOf(selectedSignUp.getHospitalID()));
            txtHospitalName.setText(String.valueOf(selectedSignUp.getHospitalName())); 
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblPinCode = new javax.swing.JLabel();
        lblCreatePassword = new javax.swing.JLabel();
        lblConfirmPassword = new javax.swing.JLabel();
        txtConfirmPasswordDoctor = new javax.swing.JTextField();
        txtCreatePasswordDoctor = new javax.swing.JTextField();
        txtPinCodeSignUp = new javax.swing.JTextField();
        txtStateSignUp = new javax.swing.JTextField();
        txtCitySignUp = new javax.swing.JTextField();
        txtAddressSignUp = new javax.swing.JTextField();
        txtAgeSignUp = new javax.swing.JTextField();
        txtNameSignUp = new javax.swing.JTextField();
        btnFetch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        txtHospitalID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        txtHospitalName = new javax.swing.JTextField();
        txtPersonID = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel1.setText("Create Patient Records");

        lblAddress.setText("Address:");

        lblCity.setText("City:");

        lblState.setText("State:");

        lblPinCode.setText("Pin Code:");

        lblCreatePassword.setText("Create Password:");

        lblConfirmPassword.setText("Confirm Password:");

        txtConfirmPasswordDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmPasswordDoctorActionPerformed(evt);
            }
        });
        txtConfirmPasswordDoctor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConfirmPasswordDoctorKeyPressed(evt);
            }
        });

        txtCreatePasswordDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreatePasswordDoctorActionPerformed(evt);
            }
        });
        txtCreatePasswordDoctor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCreatePasswordDoctorKeyPressed(evt);
            }
        });

        txtPinCodeSignUp.setEditable(false);
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

        txtStateSignUp.setEditable(false);
        txtStateSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtStateSignUpKeyPressed(evt);
            }
        });

        txtCitySignUp.setEditable(false);
        txtCitySignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCitySignUpKeyPressed(evt);
            }
        });

        txtAddressSignUp.setEditable(false);
        txtAddressSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddressSignUpKeyPressed(evt);
            }
        });

        txtAgeSignUp.setEditable(false);
        txtAgeSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAgeSignUpKeyPressed(evt);
            }
        });

        txtNameSignUp.setEditable(false);
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

        btnFetch.setText("Fetch");
        btnFetch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFetchActionPerformed(evt);
            }
        });

        jLabel2.setText("Hospital ID:");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        txtHospitalID.setEditable(false);
        txtHospitalID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtHospitalID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalIDActionPerformed(evt);
            }
        });

        jLabel3.setText("Hospital Name:");

        lblName1.setText("Person ID:");

        txtHospitalName.setEditable(false);
        txtHospitalName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtHospitalName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalNameActionPerformed(evt);
            }
        });

        txtPersonID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPersonIDActionPerformed(evt);
            }
        });
        txtPersonID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPersonIDKeyPressed(evt);
            }
        });

        lblName.setText("Patient's Name:");

        lblAge.setText("Age:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(103, 465, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblName)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCreatePassword)
                                    .addComponent(lblConfirmPassword)
                                    .addComponent(lblAge)
                                    .addComponent(lblCity)
                                    .addComponent(lblAddress)
                                    .addComponent(lblState)
                                    .addComponent(lblPinCode))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNameSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtAgeSignUp)
                                        .addComponent(txtAddressSignUp)
                                        .addComponent(txtCitySignUp)
                                        .addComponent(txtStateSignUp)
                                        .addComponent(txtPinCodeSignUp)
                                        .addComponent(txtCreatePasswordDoctor)
                                        .addComponent(txtConfirmPasswordDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtPersonID, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHospitalID, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSubmit)))
                            .addComponent(lblName1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFetch)
                        .addGap(81, 81, 81))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHospitalID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPersonID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFetch)
                    .addComponent(lblName1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtNameSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAgeSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.TRAILING)
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
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreatePassword)
                    .addComponent(txtCreatePasswordDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmPassword)
                    .addComponent(txtConfirmPasswordDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addContainerGap(299, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtConfirmPasswordDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmPasswordDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmPasswordDoctorActionPerformed

    private void txtConfirmPasswordDoctorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmPasswordDoctorKeyPressed
        // TODO add your handling code here:
        btnSubmit.setEnabled(true);
    }//GEN-LAST:event_txtConfirmPasswordDoctorKeyPressed

    private void txtCreatePasswordDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreatePasswordDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreatePasswordDoctorActionPerformed

    private void txtCreatePasswordDoctorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreatePasswordDoctorKeyPressed
        // TODO add your handling code here:
        btnSubmit.setEnabled(true);
    }//GEN-LAST:event_txtCreatePasswordDoctorKeyPressed

    private void txtPinCodeSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPinCodeSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPinCodeSignUpActionPerformed

    private void txtPinCodeSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPinCodeSignUpKeyPressed
        // TODO add your handling code here:
        btnSubmit.setEnabled(true);
    }//GEN-LAST:event_txtPinCodeSignUpKeyPressed

    private void txtStateSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStateSignUpKeyPressed
        // TODO add your handling code here:
        btnSubmit.setEnabled(true);
    }//GEN-LAST:event_txtStateSignUpKeyPressed

    private void txtCitySignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCitySignUpKeyPressed
        // TODO add your handling code here:
        btnSubmit.setEnabled(true);
    }//GEN-LAST:event_txtCitySignUpKeyPressed

    private void txtAddressSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressSignUpKeyPressed
        // TODO add your handling code here:
        btnSubmit.setEnabled(true);
    }//GEN-LAST:event_txtAddressSignUpKeyPressed

    private void txtAgeSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeSignUpKeyPressed
        // TODO add your handling code here:
        btnSubmit.setEnabled(true);
    }//GEN-LAST:event_txtAgeSignUpKeyPressed

    private void txtNameSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameSignUpActionPerformed

    private void txtNameSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameSignUpKeyPressed
        // TODO add your handling code here:
        btnSubmit.setEnabled(true);
    }//GEN-LAST:event_txtNameSignUpKeyPressed

    private void btnFetchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFetchActionPerformed
        // TODO add your handling code here:
        boolean check = false;
        for(SignUp selectedSignUp : SignUpDirectory.getSignUpDirectory())
        {
            {{
                if (String.valueOf(selectedSignUp.getPersonID()).equals(txtPersonID.getText()))
                {
                    txtNameSignUp.setText(String.valueOf(selectedSignUp.getName()));
                    txtAgeSignUp.setText(String.valueOf(selectedSignUp.getAge()));
                    txtAddressSignUp.setText(String.valueOf(selectedSignUp.getAddress()));
                    txtCitySignUp.setText(String.valueOf(selectedSignUp.getCity()));
                    txtStateSignUp.setText(String.valueOf(selectedSignUp.getState()));
                    txtPinCodeSignUp.setText(String.valueOf(selectedSignUp.getPinCode()));
                    check = false;
                    break;
                }
                else
                {
                    check = true;
                }
            }}}
        if(check == true){
            JOptionPane.showMessageDialog(this, "This user doesn't exist");
            } 
    }//GEN-LAST:event_btnFetchActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:

        int HospitalID = Integer.parseInt(txtHospitalID.getText());
        String HospitalName = txtHospitalName.getText();
        int PersonID = Integer.parseInt(txtPersonID.getText());
        String PatientName = txtNameSignUp.getText();
        int Age = Integer.parseInt(txtAgeSignUp.getText());
        String Address = txtAddressSignUp.getText();
        String City = txtCitySignUp.getText();
        String State = txtStateSignUp.getText();
        int PinCode = Integer.parseInt(txtPinCodeSignUp.getText());
        String CreatePassword = txtCreatePasswordDoctor.getText();
        String ConfirmPassword = txtConfirmPasswordDoctor.getText();

        Patient p = PatientDirectory.addNewPatient();

        p.setHospitalID(HospitalID);
        p.setHospitalName(HospitalName);
        p.setPersonID(PersonID);
        p.setPatientName(PatientName);
        p.setAge(Age);
        p.setAddress(Address);
        p.setCity(City);
        p.setState(State);
        p.setPinCode(PinCode);
        p.setCreatePassword(CreatePassword);
        p.setConfirmPassword(ConfirmPassword);

        JOptionPane.showMessageDialog(this, "New Patient Details Created and the Patient ID is " + String.valueOf(p.getPatientID()));

        txtPersonID.setText("");
        txtNameSignUp.setText("");
        txtAgeSignUp.setText("");
        txtAddressSignUp.setText("");
        txtCitySignUp.setText("");
        txtStateSignUp.setText("");
        txtPinCodeSignUp.setText("");
        txtCreatePasswordDoctor.setText("");
        txtConfirmPasswordDoctor.setText("");
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtHospitalIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalIDActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtHospitalIDActionPerformed

    private void txtHospitalNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalNameActionPerformed

    private void txtPersonIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPersonIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersonIDActionPerformed

    private void txtPersonIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPersonIDKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersonIDKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFetch;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblCreatePassword;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblPinCode;
    private javax.swing.JLabel lblState;
    private javax.swing.JTextField txtAddressSignUp;
    private javax.swing.JTextField txtAgeSignUp;
    private javax.swing.JTextField txtCitySignUp;
    private javax.swing.JTextField txtConfirmPasswordDoctor;
    private javax.swing.JTextField txtCreatePasswordDoctor;
    private javax.swing.JTextField txtHospitalID;
    private javax.swing.JTextField txtHospitalName;
    private javax.swing.JTextField txtNameSignUp;
    private javax.swing.JTextField txtPersonID;
    private javax.swing.JTextField txtPinCodeSignUp;
    private javax.swing.JTextField txtStateSignUp;
    // End of variables declaration//GEN-END:variables
}
