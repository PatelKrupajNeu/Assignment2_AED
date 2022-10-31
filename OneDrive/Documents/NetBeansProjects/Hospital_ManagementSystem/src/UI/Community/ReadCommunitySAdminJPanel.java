/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Community;

import Model.Community.Community;
import Model.Community.CommunityDirectory;
import Model.Doctor.DoctorDirectory;
import Model.Encounter.EncounterDirectory;
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
public class ReadCommunitySAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReadCommunitySAdminJPanel
     */
    SignUpDirectory SignUpDirectory;
    HospitalDirectory HospitalDirectory;
    DoctorDirectory DoctorDirectory;
    PatientDirectory PatientDirectory;
    EncounterDirectory EncounterDirectory;
    VitalsDirectory VitalsDirectory;
    CommunityDirectory CommunityDirectory;
    
    public ReadCommunitySAdminJPanel(SignUpDirectory SignUpDirectory, HospitalDirectory HospitalDirectory, DoctorDirectory DoctorDirectory, PatientDirectory PatientDirectory, EncounterDirectory EncounterDirectory, VitalsDirectory VitalsDirectory, CommunityDirectory CommunityDirectory) {
        initComponents();
        this.SignUpDirectory = SignUpDirectory;
        this.HospitalDirectory = HospitalDirectory;
        this.DoctorDirectory = DoctorDirectory;
        this.PatientDirectory = PatientDirectory;
        this.EncounterDirectory = EncounterDirectory;
        this.VitalsDirectory = VitalsDirectory;
        this.CommunityDirectory = CommunityDirectory;
        
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

        txtCommunityName = new javax.swing.JTextField();
        txtCommunityID = new javax.swing.JTextField();
        btnPersonView = new javax.swing.JButton();
        btnPersonDelete = new javax.swing.JButton();
        btnUpdateSignUp = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSearchPerson = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCommunityDirectory = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        txtPinCode = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCreatePassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        txtAddress = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();

        txtCommunityName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCommunityName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommunityNameActionPerformed(evt);
            }
        });

        txtCommunityID.setEditable(false);
        txtCommunityID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCommunityID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommunityIDActionPerformed(evt);
            }
        });

        btnPersonView.setText("View");
        btnPersonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonViewActionPerformed(evt);
            }
        });

        btnPersonDelete.setText("Delete");
        btnPersonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonDeleteActionPerformed(evt);
            }
        });

        btnUpdateSignUp.setText("Update");
        btnUpdateSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSignUpActionPerformed(evt);
            }
        });
        btnUpdateSignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnUpdateSignUpKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        jLabel2.setText("Communtiy Records");

        jLabel3.setText("Search Community:");

        txtSearchPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchPersonActionPerformed(evt);
            }
        });
        txtSearchPerson.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchPersonKeyPressed(evt);
            }
        });

        tblCommunityDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Community Name", "Community ID", "Address", "City", "State", "Pin Code", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCommunityDirectory);

        jLabel4.setText("Communtity Name:");

        jLabel5.setText("Community ID:");

        jLabel7.setText("Create Password:");

        jLabel6.setText("City:");

        jLabel8.setText("Confirm Password:");

        jLabel9.setText("State:");

        jLabel10.setText("PinCode:");

        jLabel11.setText("Address:");

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearchPerson))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPersonView)
                                .addGap(18, 18, 18)
                                .addComponent(btnPersonDelete)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdateSignUp))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCreatePassword)
                                    .addComponent(txtPinCode, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtState, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCity, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtConfirmPassword)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCommunityID, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                    .addComponent(txtCommunityName)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSearchPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPersonView)
                    .addComponent(btnPersonDelete)
                    .addComponent(btnUpdateSignUp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCommunityID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPinCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCreatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCommunityNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommunityNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommunityNameActionPerformed

    private void txtCommunityIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommunityIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommunityIDActionPerformed

    private void btnPersonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblCommunityDirectory.getSelectedRow();

        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblCommunityDirectory.getModel();
        Community selectedSignUp = (Community) model.getValueAt(selectedRowIndex,0);

        txtCommunityID.setText(String.valueOf(selectedSignUp.getCommunityID()));
        txtCommunityName.setText(String.valueOf(selectedSignUp.getCommunityName()));
        txtAddress.setText(String.valueOf(selectedSignUp.getAddress()));
        txtCity.setText(String.valueOf(selectedSignUp.getCity()));
        txtState.setText(String.valueOf(selectedSignUp.getState()));
        txtPinCode.setText(String.valueOf(selectedSignUp.getPinCode()));
        txtCreatePassword.setText(String.valueOf(selectedSignUp.getCreatePassword()));
        txtConfirmPassword.setText(String.valueOf(selectedSignUp.getConfirmPassword()));
    }//GEN-LAST:event_btnPersonViewActionPerformed

    private void btnPersonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonDeleteActionPerformed
        // TODO add your handling code here:

        txtCommunityID.setText("");
        txtCommunityName.setText("");
        txtAddress.setText("");
        txtCity.setText("");
        txtState.setText("");
        txtPinCode.setText("");
        txtCreatePassword.setText("");
        txtConfirmPassword.setText("");

        int selectedRowIndex = tblCommunityDirectory.getSelectedRow();

        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblCommunityDirectory.getModel();
        Community selectedSignUp = (Community) model.getValueAt(selectedRowIndex,0);

        CommunityDirectory.deleteEmployee(selectedSignUp);

        JOptionPane.showMessageDialog(this, "Community Details deleted.");

        populateTable();
    }//GEN-LAST:event_btnPersonDeleteActionPerformed

    private void btnUpdateSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSignUpActionPerformed

            if(tblCommunityDirectory.getSelectedRow()<0) {
                JOptionPane.showMessageDialog(this , "Please select a row to update.");
                return;
            }

            DefaultTableModel model = (DefaultTableModel) tblCommunityDirectory.getModel();
            Community c = (Community) model.getValueAt(tblCommunityDirectory.getSelectedRow(), 0);

            if (tblCommunityDirectory.getSelectedRowCount()==1) {

            String CommunityName = txtCommunityName.getText();
            String Address = txtAddress.getText();
            String City = txtCity.getText();
            String State = txtState.getText();
            int PinCode = Integer.parseInt(txtPinCode.getText());
            String CreatePassword = txtCreatePassword.getText();
            String ConfirmPassword = txtCreatePassword.getText();

            c.setCommunityName(CommunityName);
            c.setAddress(Address);
            c.setCity(City);
            c.setState(State);
            c.setPinCode(PinCode);
            c.setCreatePassword(CreatePassword);
            c.setConfirmPassword(ConfirmPassword);

            JOptionPane.showMessageDialog(this, "New Community Details Updated");

            model.setValueAt(CommunityName, tblCommunityDirectory.getSelectedRow(), 1);
            model.setValueAt(Address, tblCommunityDirectory.getSelectedRow(), 2);
            model.setValueAt(City, tblCommunityDirectory.getSelectedRow(), 3);
            model.setValueAt(State, tblCommunityDirectory.getSelectedRow(), 4);
            model.setValueAt(PinCode, tblCommunityDirectory.getSelectedRow(), 5);
            model.setValueAt(CreatePassword, tblCommunityDirectory.getSelectedRow(), 6);
            //model.setValueAt(ConfirmPassword, tblPersonDirectory.getSelectedRow(), 9);


            txtCommunityID.setText("");
            txtCommunityName.setText("");
            txtAddress.setText("");
            txtCity.setText("");
            txtState.setText("");
            txtPinCode.setText("");
            txtCreatePassword.setText("");
            txtConfirmPassword.setText("");

            populateTable();
        }
    }//GEN-LAST:event_btnUpdateSignUpActionPerformed

    private void btnUpdateSignUpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnUpdateSignUpKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateSignUpKeyPressed

    private void txtSearchPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchPersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchPersonActionPerformed

    private void txtSearchPersonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchPersonKeyPressed
        // TODO add your handling code here:
        DefaultTableModel tableModel = (DefaultTableModel)tblCommunityDirectory.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tableModel);
        tblCommunityDirectory.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearchPerson.getText().trim()));
    }//GEN-LAST:event_txtSearchPersonKeyPressed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPersonDelete;
    private javax.swing.JButton btnPersonView;
    private javax.swing.JButton btnUpdateSignUp;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCommunityDirectory;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunityID;
    private javax.swing.JTextField txtCommunityName;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JPasswordField txtCreatePassword;
    private javax.swing.JTextField txtPinCode;
    private javax.swing.JTextField txtSearchPerson;
    private javax.swing.JTextField txtState;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
         DefaultTableModel model = (DefaultTableModel) tblCommunityDirectory.getModel();
        model.setRowCount(0);
        
        for (Community su : CommunityDirectory.getCommunityDirectory()){
            
            Object[] row = new Object[8];
            row[0] = su;
            row[1] = su.getCommunityID();
            row[2] = su.getAddress();
            row[3] = su.getCity();
            row[4] = su.getState();
            row[5] = su.getPinCode();
            row[6] = su.getCreatePassword();
            //row[8] = su.getConfirmPassword();
            
            model.addRow(row);
            
        }
    }
}
