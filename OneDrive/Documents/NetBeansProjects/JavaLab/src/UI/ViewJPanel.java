/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import java.awt.Image;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Employee;
import model.EmployeeHistory;

/**
 *
 * @author sarth
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    EmployeeHistory history;
    Employee employee;
    public ViewJPanel(EmployeeHistory history) {
        initComponents();
        this.history = history;
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

        lblGender = new javax.swing.JLabel();
        StartDate = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();
        lbtStartDate = new javax.swing.JLabel();
        Age = new javax.swing.JTextField();
        lbllvl = new javax.swing.JLabel();
        Gender = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblEmployeeID = new javax.swing.JLabel();
        Level = new javax.swing.JTextField();
        lbtAge = new javax.swing.JLabel();
        EmployeeID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmphis = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        lblphone = new javax.swing.JLabel();
        Photo = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        PositionTitle = new javax.swing.JTextField();
        lblTeamInfo = new javax.swing.JLabel();
        TeamInfo = new javax.swing.JTextField();
        CellPhone = new javax.swing.JTextField();
        lblPosTitle = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        Modify = new javax.swing.JButton();
        imagelbl = new javax.swing.JLabel();
        lblPosTitle1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(227, 227, 227));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(600, 500));

        lblGender.setText("Gender");

        StartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartDateActionPerformed(evt);
            }
        });

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        lbtStartDate.setText("Start Date");

        Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeActionPerformed(evt);
            }
        });

        lbllvl.setText("Level");

        Gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Employee");

        lblName.setText("Name");

        lblEmployeeID.setText("Employee ID");

        Level.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LevelActionPerformed(evt);
            }
        });

        lbtAge.setText("Age");

        EmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeIDActionPerformed(evt);
            }
        });

        tblEmphis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "EmpId", "age", "gender", "startdate", "level", "team_info", "position_title", "cell_number", "email_id", "photo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmphis);

        btnDelete.setText("Delete");
        btnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblphone.setText("Cell Phone");

        Photo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhotoActionPerformed(evt);
            }
        });

        lblemail.setText("Email");

        lblPhoto.setText("Photo");

        PositionTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PositionTitleActionPerformed(evt);
            }
        });

        lblTeamInfo.setText("Team Info");

        TeamInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeamInfoActionPerformed(evt);
            }
        });

        CellPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CellPhoneActionPerformed(evt);
            }
        });

        lblPosTitle.setText("Positon Title");

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });

        Modify.setText("Modify");
        Modify.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyActionPerformed(evt);
            }
        });

        lblPosTitle1.setText("Team Info");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(134, 134, 134)
                                .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEmployeeID))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTeamInfo)
                                    .addComponent(lblPosTitle))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(640, 640, 640)
                        .addComponent(Photo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Modify, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbllvl, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)
                                .addComponent(Level, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbtStartDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(StartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblGender)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblphone)
                            .addComponent(lblemail)
                            .addComponent(lblPhoto)
                            .addComponent(lblPosTitle1))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(imagelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblEmployeeID))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(EmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblTeamInfo)
                        .addGap(12, 12, 12)
                        .addComponent(lblPosTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(TeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(PositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Modify)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnView)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbtAge)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDelete)
                        .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPosTitle1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblGender)
                        .addGap(6, 6, 6))
                    .addComponent(Gender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblphone)
                        .addComponent(CellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lbtStartDate))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(StartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblemail))))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbllvl)
                            .addComponent(Level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPhoto)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imagelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(181, 181, 181)
                .addComponent(Photo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void StartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StartDateActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblEmphis.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;
        }
        
        DefaultTableModel model =  (DefaultTableModel)tblEmphis.getModel();
        Employee selectedEmp = (Employee)model.getValueAt(selectedRowIndex, 0);
        
        //EmployeeID.setEnabled(false);
        
        
        Name.setText(selectedEmp.getName());
        EmployeeID.setText(selectedEmp.getEmployee_ID());
        Age.setText(selectedEmp.getAge());
        Gender.setText(selectedEmp.getGender());
        StartDate.setText(selectedEmp.getStartDate());
        Level.setText(selectedEmp.getLevel());
        TeamInfo.setText(selectedEmp.getTeam_info());
        PositionTitle.setText(selectedEmp.getPositiontitle());
        CellPhone.setText(selectedEmp.getContact_cell_phone_number());
        Email.setText(selectedEmp.getEmail_address());
        lblPhoto.setIcon(resize_image(selectedEmp.getPhoto_path()));
        
    }//GEN-LAST:event_btnViewActionPerformed
    public ImageIcon resize_image(String image_path){
        ImageIcon image_icon = new ImageIcon(image_path);
        Image img = image_icon.getImage();
        Image new_image = img.getScaledInstance(300,144,Image.SCALE_SMOOTH);
        ImageIcon new_image_icon = new ImageIcon(new_image);
        return new_image_icon;
    }
    private void AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeActionPerformed

    private void GenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderActionPerformed

    private void LevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LevelActionPerformed

    private void EmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeeIDActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblEmphis.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        DefaultTableModel model =  (DefaultTableModel)tblEmphis.getModel();
        Employee selectedEmp = (Employee)model.getValueAt(selectedRowIndex, 0);
        history.deleteEmp(selectedEmp);
        JOptionPane.showMessageDialog(this,"Employee deleted");
        populateTable();
        
        Name.setText("");
        EmployeeID.setText("");
        Age.setText("");
        Gender.setText("");
        StartDate.setText("");
        Level.setText("");
        TeamInfo.setText("");
        PositionTitle.setText("");
        CellPhone.setText("");
        Email.setText("");
        imagelbl.setIcon(null);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void PhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhotoActionPerformed

    private void PositionTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PositionTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PositionTitleActionPerformed

    private void TeamInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeamInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TeamInfoActionPerformed

    private void CellPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CellPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CellPhoneActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void ModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblEmphis.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to modify");
            return;
        }
        
        DefaultTableModel model =  (DefaultTableModel)tblEmphis.getModel();
        Employee selectedEmp = (Employee)model.getValueAt(tblEmphis.getSelectedRow(), 0);
        
        /*if(tblEmphis.getSelectedRow()<0)
        {
            JOptionPane.showMessageDialog(this, "employee info selected");
            return;
        }*/
        
        if(tblEmphis.getSelectedRowCount()==1)
        {
        
        String name = Name.getText(); 
        String employeeID = EmployeeID.getText();
        String age = Age.getText();
        String gender = Gender.getText();
        String startDate = StartDate.getText();
        String level = Level.getText();
        String teaminfo = TeamInfo.getText();
        String positionTitle = PositionTitle.getText();
        String cellPhone = CellPhone.getText();
        String email = Email.getText();
        String photo = Photo.getText();
        
        if (!Pattern.matches("^(1[89]|2[0-9]|3[0-9]|4[0-9]|5[0-9]|6[0-5]\\d)$", Age.getText()))
        {
            JOptionPane.showMessageDialog(null, "Invalid Age Range 18 to 65", "Error", JOptionPane.ERROR_MESSAGE);
           
        }
        
        else if (!Pattern.matches("^^(?:m|M|male|Male|MALE|f|F|female|Female|FEMALE)$",Gender.getText()))
        {
          JOptionPane.showMessageDialog(null, "Gender has to be male or female", "Error", JOptionPane.ERROR_MESSAGE);
         
        }
        else if (!Pattern.matches("^[0,1]?\\d{1}\\/(([0-2]?\\d{1})|([3][0,1]{1}))\\/(([1]{1}[9]{1}[9]{1}\\d{1})|([2-9]{1}\\d{3}))$" , StartDate.getText()))
        {
            JOptionPane.showMessageDialog(null, "Incorrect Start Date", "Error", JOptionPane.ERROR_MESSAGE);
            
        }
         else if (!Pattern.matches("^(\\+1)?[0-9]{10}$", CellPhone.getText()))
        {
             JOptionPane.showMessageDialog(null, "Cell phone should be 10 digit", "Error", JOptionPane.ERROR_MESSAGE);
             
        }
        
        else if(!Pattern.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", Email.getText()))
        {
            JOptionPane.showMessageDialog(null, "Incorrect Email Address", "Error", JOptionPane.ERROR_MESSAGE);
           
        }
        
        else
        {
        
        
        selectedEmp.setName(name);
        selectedEmp.setEmployee_ID(employeeID);
        selectedEmp.setAge(age);
        selectedEmp.setGender(gender);
        selectedEmp.setStartDate(startDate);
        selectedEmp.setLevel(level);
        selectedEmp.setTeam_info(teaminfo);
        selectedEmp.setPositiontitle(positionTitle);        
        selectedEmp.setContact_cell_phone_number(cellPhone);        
        selectedEmp.setEmail_address(email);
        selectedEmp.setPhoto_path(photo);
        
        model.setValueAt(name,tblEmphis.getSelectedRow(),0);
         model.setValueAt(employeeID,tblEmphis.getSelectedRow(),1);
        model.setValueAt(age,tblEmphis.getSelectedRow(),2);
        model.setValueAt(gender,tblEmphis.getSelectedRow(),3);
        model.setValueAt(startDate,tblEmphis.getSelectedRow(),4);
        model.setValueAt(level,tblEmphis.getSelectedRow(),5);
        model.setValueAt(teaminfo,tblEmphis.getSelectedRow(),6);
        model.setValueAt(positionTitle,tblEmphis.getSelectedRow(),7);
        model.setValueAt(cellPhone,tblEmphis.getSelectedRow(),8);
        model.setValueAt(email,tblEmphis.getSelectedRow(),9);  
        model.setValueAt(photo,tblEmphis.getSelectedRow(),10);
        
        
        JOptionPane.showMessageDialog(this, "employee info updated");
        
        populateTable();
        
        Name.setText("");
        EmployeeID.setText("");
        Age.setText("");
        Gender.setText("");
        StartDate.setText("");
        Level.setText("");
        TeamInfo.setText("");
        PositionTitle.setText("");
        CellPhone.setText("");
        Email.setText("");
        imagelbl.setIcon(null);   
        }
        
    }//GEN-LAST:event_ModifyActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Age;
    private javax.swing.JTextField CellPhone;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField EmployeeID;
    private javax.swing.JTextField Gender;
    private javax.swing.JTextField Level;
    private javax.swing.JButton Modify;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Photo;
    private javax.swing.JTextField PositionTitle;
    private javax.swing.JTextField StartDate;
    private javax.swing.JTextField TeamInfo;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel imagelbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPosTitle;
    private javax.swing.JLabel lblPosTitle1;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lbllvl;
    private javax.swing.JLabel lblphone;
    private javax.swing.JLabel lbtAge;
    private javax.swing.JLabel lbtStartDate;
    private javax.swing.JTable tblEmphis;
    // End of variables declaration//GEN-END:variables
private void populateTable(){
//throw new UnsupportedOperationException("Not supported yet.");
DefaultTableModel model =  (DefaultTableModel)tblEmphis.getModel();
model.setRowCount(0);
for (Employee vs : history.getHistory()){
    
    Object[] row = new Object[11];
    row[0] = vs;
    row[1] = vs.getEmployee_ID();
    row[2] = vs.getAge(); 
    row[3]= vs.getGender();
    row[4]=vs.getStartDate();
    row[5]=vs.getLevel();
    row[6]=vs.getTeam_info();
    row[7]=vs.getPositiontitle();
    row[8]=vs.getContact_cell_phone_number();
    row[9]=vs.getEmail_address();
    row[10]=vs.getPhoto_path();
    model.addRow(row);
            

}
}

    
}
