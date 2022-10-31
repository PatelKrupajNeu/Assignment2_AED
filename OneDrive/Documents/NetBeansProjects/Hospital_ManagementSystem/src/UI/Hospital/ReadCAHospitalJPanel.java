/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Hospital;

import Model.Community.Community;
import Model.Community.CommunityDirectory;
import Model.Doctor.DoctorDirectory;
import Model.Encounter.EncounterDirectory;
import Model.Hospital.Hospital;
import Model.Hospital.HospitalDirectory;
import Model.Patient.PatientDirectory;
import Model.SignUp.SignUpDirectory;
import Model.Vitals.VitalsDirectory;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author sarth
 */
public class ReadCAHospitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReadCAHospitalJPanel
     */
    SignUpDirectory SignUpDirectory;
    HospitalDirectory HospitalDirectory;
    DoctorDirectory DoctorDirectory;
    PatientDirectory PatientDirectory;
    EncounterDirectory EncounterDirectory;
    VitalsDirectory VitalsDirectory;
    CommunityDirectory CommunityDirectory;
    public ReadCAHospitalJPanel(SignUpDirectory SignUpDirectory, HospitalDirectory HospitalDirectory, DoctorDirectory DoctorDirectory, PatientDirectory PatientDirectory, EncounterDirectory EncounterDirectory, VitalsDirectory VitalsDirectory, CommunityDirectory CommunityDirectory, String CID) {
        initComponents();
        this.SignUpDirectory = SignUpDirectory;
        this.HospitalDirectory = HospitalDirectory;
        this.DoctorDirectory = DoctorDirectory;
        this.PatientDirectory = PatientDirectory;
        this.EncounterDirectory = EncounterDirectory;
        this.VitalsDirectory = VitalsDirectory;
        this.CommunityDirectory = CommunityDirectory;
        for(Community selectedSignUp : CommunityDirectory.getCommunityDirectory()){
            if (String.valueOf(selectedSignUp.getCommunityID()).equals(CID)){
            txtCommunityID.setText(String.valueOf(selectedSignUp.getCommunityID()));
            txtCommunityName.setText(String.valueOf(selectedSignUp.getCommunityName()));
            txtCity.setText(String.valueOf(selectedSignUp.getCity()));
            txtState.setText(String.valueOf(selectedSignUp.getAddress()));
            txtPinCode.setText(String.valueOf(selectedSignUp.getPinCode()));
            }
        }
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCity = new javax.swing.JLabel();
        txtCreatePassword = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JTextField();
        lblPinCode = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtPinCode = new javax.swing.JTextField();
        lblCreatePassword = new javax.swing.JLabel();
        btnUpdateHospital = new javax.swing.JButton();
        txtHospitalName = new javax.swing.JTextField();
        txtCommunityName = new javax.swing.JTextField();
        lblConfirmPassword = new javax.swing.JLabel();
        lblDoB = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSearchHospital = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHospitalDirectory = new javax.swing.JTable();
        btnHospitalView = new javax.swing.JButton();
        btnHospitalDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCommunityID = new javax.swing.JTextField();

        lblCity.setText("City:");

        txtCreatePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreatePasswordActionPerformed(evt);
            }
        });
        txtCreatePassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCreatePasswordKeyPressed(evt);
            }
        });

        lblState.setText("State:");

        txtConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmPasswordActionPerformed(evt);
            }
        });
        txtConfirmPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConfirmPasswordKeyPressed(evt);
            }
        });

        lblPinCode.setText("Pin Code:");

        txtCity.setEditable(false);
        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCityKeyPressed(evt);
            }
        });

        txtState.setEditable(false);
        txtState.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtStateKeyPressed(evt);
            }
        });

        txtPinCode.setEditable(false);
        txtPinCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPinCodeActionPerformed(evt);
            }
        });
        txtPinCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPinCodeKeyPressed(evt);
            }
        });

        lblCreatePassword.setText("Update Password:");

        btnUpdateHospital.setText("Update");
        btnUpdateHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateHospitalActionPerformed(evt);
            }
        });
        btnUpdateHospital.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnUpdateHospitalKeyPressed(evt);
            }
        });

        txtHospitalName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalNameActionPerformed(evt);
            }
        });
        txtHospitalName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHospitalNameKeyPressed(evt);
            }
        });

        txtCommunityName.setEditable(false);
        txtCommunityName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommunityNameActionPerformed(evt);
            }
        });
        txtCommunityName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCommunityNameKeyPressed(evt);
            }
        });

        lblConfirmPassword.setText("Confirm Password:");

        lblDoB.setText("Community:");

        lblName.setText("Name of the Hospital:");

        jLabel1.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        jLabel1.setText("Hospital Records");

        jLabel2.setText("Search Hospital:");

        txtSearchHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchHospitalActionPerformed(evt);
            }
        });
        txtSearchHospital.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchHospitalKeyPressed(evt);
            }
        });

        tblHospitalDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "HospitalID", "Hospital Name", "Community", "City", "State", "Pin Code", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHospitalDirectory);

        btnHospitalView.setText("View");
        btnHospitalView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalViewActionPerformed(evt);
            }
        });

        btnHospitalDelete.setText("Delete");
        btnHospitalDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalDeleteActionPerformed(evt);
            }
        });

        jLabel3.setText("Community ID:");

        txtCommunityID.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnUpdateHospital)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCity)
                                .addComponent(lblState)
                                .addComponent(lblPinCode)
                                .addComponent(lblCreatePassword)
                                .addComponent(lblConfirmPassword))
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCreatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPinCode, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblName)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHospitalView)
                        .addGap(18, 18, 18)
                        .addComponent(btnHospitalDelete))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCommunityID, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblDoB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSearchHospital))))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoB)
                    .addComponent(jLabel3)
                    .addComponent(txtCommunityID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSearchHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHospitalView)
                    .addComponent(btnHospitalDelete))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPinCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPinCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCreatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCreatePassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConfirmPassword))
                .addGap(18, 18, 18)
                .addComponent(btnUpdateHospital)
                .addContainerGap(175, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCreatePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreatePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreatePasswordActionPerformed

    private void txtCreatePasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreatePasswordKeyPressed
        // TODO add your handling code here:
        btnUpdateHospital.setEnabled(true);
    }//GEN-LAST:event_txtCreatePasswordKeyPressed

    private void txtConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmPasswordActionPerformed

    private void txtConfirmPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmPasswordKeyPressed
        // TODO add your handling code here:
        btnUpdateHospital.setEnabled(true);
    }//GEN-LAST:event_txtConfirmPasswordKeyPressed

    private void txtCityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyPressed
        // TODO add your handling code here:
        btnUpdateHospital.setEnabled(true);
    }//GEN-LAST:event_txtCityKeyPressed

    private void txtStateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStateKeyPressed
        // TODO add your handling code here:
        btnUpdateHospital.setEnabled(true);
    }//GEN-LAST:event_txtStateKeyPressed

    private void txtPinCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPinCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPinCodeActionPerformed

    private void txtPinCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPinCodeKeyPressed
        // TODO add your handling code here:
        btnUpdateHospital.setEnabled(true);
    }//GEN-LAST:event_txtPinCodeKeyPressed

    private void btnUpdateHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateHospitalActionPerformed

        if(tblHospitalDirectory.getSelectedRow()<0) {
            JOptionPane.showMessageDialog(this , "Please select a row to update.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblHospitalDirectory.getModel();
        Hospital h = (Hospital) model.getValueAt(tblHospitalDirectory.getSelectedRow(), 0);

        if (tblHospitalDirectory.getSelectedRowCount()==1) {

            String HospitalName = txtHospitalName.getText();
            String Community = txtCommunityName.getText();
            String City = txtCity.getText();
            String State = txtState.getText();
            int PinCode = Integer.parseInt(txtPinCode.getText());
            String CreatePassword = txtCreatePassword.getText();
            String ConfirmPassword = txtConfirmPassword.getText();

            h.setHospitalName(HospitalName);
            h.setCommunity(Community);
            h.setCity(City);
            h.setState(State);
            h.setPinCode(PinCode);
            h.setCreatePassword(CreatePassword);
            h.setConfirmPassword(ConfirmPassword);

            model.setValueAt(HospitalName, tblHospitalDirectory.getSelectedRow(), 1);
            model.setValueAt(Community, tblHospitalDirectory.getSelectedRow(), 2);
            model.setValueAt(City, tblHospitalDirectory.getSelectedRow(), 3);
            model.setValueAt(State, tblHospitalDirectory.getSelectedRow(), 4);
            model.setValueAt(PinCode, tblHospitalDirectory.getSelectedRow(), 5);
            model.setValueAt(CreatePassword, tblHospitalDirectory.getSelectedRow(), 6);
            //model.setValueAt(ConfirmPassword, tblPersonDirectory.getSelectedRow(), 8);

            JOptionPane.showMessageDialog(this, "Person Details Updated");

            txtHospitalName.setText("");
            txtCommunityName.setText("");
            txtCreatePassword.setText("");
            txtConfirmPassword.setText("");

            populateTable();
    }//GEN-LAST:event_btnUpdateHospitalActionPerformed
}
    private void btnUpdateHospitalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnUpdateHospitalKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateHospitalKeyPressed

    private void txtHospitalNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalNameActionPerformed

    private void txtHospitalNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHospitalNameKeyPressed
        // TODO add your handling code here:
        btnUpdateHospital.setEnabled(true);
    }//GEN-LAST:event_txtHospitalNameKeyPressed

    private void txtCommunityNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommunityNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommunityNameActionPerformed

    private void txtCommunityNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCommunityNameKeyPressed
        // TODO add your handling code here:
        btnUpdateHospital.setEnabled(true);
    }//GEN-LAST:event_txtCommunityNameKeyPressed

    private void txtSearchHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchHospitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchHospitalActionPerformed

    private void txtSearchHospitalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchHospitalKeyPressed
        // TODO add your handling code here:
        DefaultTableModel tableModel = (DefaultTableModel)tblHospitalDirectory.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tableModel);
        tblHospitalDirectory.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearchHospital.getText().trim()));
    }//GEN-LAST:event_txtSearchHospitalKeyPressed

    private void btnHospitalViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblHospitalDirectory.getSelectedRow();

        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblHospitalDirectory.getModel();
        Hospital selectedSignUp = (Hospital) model.getValueAt(selectedRowIndex,1);

        txtHospitalName.setText(String.valueOf(selectedSignUp.getHospitalName()));
        txtCommunityName.setText(String.valueOf(selectedSignUp.getCommunity()));
        txtCity.setText(String.valueOf(selectedSignUp.getCity()));
        txtState.setText(String.valueOf(selectedSignUp.getState()));
        txtPinCode.setText(String.valueOf(selectedSignUp.getPinCode()));
        txtCreatePassword.setText(String.valueOf(selectedSignUp.getCreatePassword()));
        txtConfirmPassword.setText(String.valueOf(selectedSignUp.getConfirmPassword()));
    }//GEN-LAST:event_btnHospitalViewActionPerformed

    private void btnHospitalDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalDeleteActionPerformed
        // TODO add your handling code here:

        txtHospitalName.setText("");
        txtCommunityName.setText("");
        txtCity.setText("");
        txtState.setText("");
        txtPinCode.setText("");
        txtCreatePassword.setText("");
        txtConfirmPassword.setText("");

        int selectedRowIndex = tblHospitalDirectory.getSelectedRow();

        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblHospitalDirectory.getModel();
        Hospital selectedSignUp = (Hospital) model.getValueAt(selectedRowIndex,0);

        HospitalDirectory.deleteEmployee(selectedSignUp);

        JOptionPane.showMessageDialog(this, "Person Details deleted.");

        populateTable();
    }//GEN-LAST:event_btnHospitalDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHospitalDelete;
    private javax.swing.JButton btnHospitalView;
    private javax.swing.JButton btnUpdateHospital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblCreatePassword;
    private javax.swing.JLabel lblDoB;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPinCode;
    private javax.swing.JLabel lblState;
    private javax.swing.JTable tblHospitalDirectory;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunityID;
    private javax.swing.JTextField txtCommunityName;
    private javax.swing.JTextField txtConfirmPassword;
    private javax.swing.JTextField txtCreatePassword;
    private javax.swing.JTextField txtHospitalName;
    private javax.swing.JTextField txtPinCode;
    private javax.swing.JTextField txtSearchHospital;
    private javax.swing.JTextField txtState;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblHospitalDirectory.getModel();
        model.setRowCount(0);
        
        
        for (Hospital h : HospitalDirectory.getHospitalDirectory()){
            if (String.valueOf(h.getCommunity()).equals(txtCommunityName.getText())){
            Object[] row = new Object[8];
            row[0] = h.getHospitalID();
            row[1] = h;
            row[2] = h.getCommunity();
            row[3] = h.getCity();
            row[4] = h.getState();
            row[5] = h.getPinCode();
            row[6] = h.getCreatePassword();
            //row[7] = su.getConfirmPassword();
            
            
            model.addRow(row);
        }
        }
        
    }
}
