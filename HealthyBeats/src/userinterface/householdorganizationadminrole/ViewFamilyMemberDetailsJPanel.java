/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.householdorganizationadminrole;

import business.HelperMethods;
import business.data.FoodConsumptionDetail;
import business.data.VitalSign;
import business.household.HouseHold;
import business.person.FamilyMember;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JAHNVI
 */
public class ViewFamilyMemberDetailsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private HouseHold house;
    private FamilyMember member;
    private ManageFamilyMembersJPanel manageFamilyMemPanel;
    
    /**
     * Creates new form ViewFamilyMemberDetailsJPanel
     */
    public ViewFamilyMemberDetailsJPanel() {
        initComponents();
    }

    public ViewFamilyMemberDetailsJPanel(JPanel userProcessContainer, HouseHold house, FamilyMember member, ManageFamilyMembersJPanel manageFamilyMemPanel) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.house = house;
        this.member = member;
        this.manageFamilyMemPanel = manageFamilyMemPanel;
        displayDetails();
    }
    
    public void displayDetails() {
        houseHoldIdDisplayLbl.setText(String.valueOf(house.getHouseHoldId()));
        houseHoldNameDisplayLbl.setText(house.getHouseHoldName());
        fnameTxt.setText(member.getFirstName());
        lnameTxt.setText(member.getLastName());
        contactTxt.setText(member.getContactNo());
        dobTxt.setText(member.getDob());
        
        if (member.getGender().equals("Male")) {
            maleRadioBtn.setSelected(true);
        }
        else {
            femaleRadioBtn.setSelected(true);
        }
        
        if (member.getPersonId() == house.getHeadOfTheFamily()) {
            headCheckBox.setSelected(true);
        }
        else {
            headCheckBox.setSelected(false);
        }
        
        bindDateCombo();
    }
    
    public void bindDateCombo() {
        dateCombo.removeAllItems();
        
        ArrayList<String> timeStamps = HelperMethods.getListOfTimeStamp(member.getVitalSignHistory());
        ArrayList<String> dates = new ArrayList<>();
        for (String stamp : timeStamps) {
            String date = HelperMethods.getDateFromStamp(stamp);
            
            if (!dates.contains(date)) {
                dates.add(date);
            }
        }
        
        for (String date : dates) {
            dateCombo.addItem(date);
        }
    }
    
    public void populateVitalSignTable() {
        String date = (String) dateCombo.getSelectedItem();
        DefaultTableModel dtm = (DefaultTableModel) vitalSignsTable.getModel();
        dtm.setRowCount(0);
        
        for (VitalSign vs : member.getVitalSignHistory().getVitalSignsForDate(date)) {
            Object row[] = new Object[7];
            row[0] = vs;
            row[1] = vs.getTemperature();
            row[2] = vs.getSystolicBp();
            row[3] = vs.getPulse();
            row[4] = vs.getRespiratoryRate();
            row[5] = vs.getCholesterol();
            row[6] = vs.getBloodSugar();
            
            dtm.addRow(row);
        }
    }
    
    public void populateFoodConsumptionTable() {
        String date = (String) dateCombo.getSelectedItem();
        DefaultTableModel dtm = (DefaultTableModel) foodConsumptionDetailsTable.getModel();
        dtm.setRowCount(0);
        
        for (FoodConsumptionDetail fcd : member.getFoodConsumptionHistory().getFoodConsumptionForDate(date)) {
            Object row[] = new Object[8];
            row[0] = fcd;
            row[1] = fcd.getEnergy();
            row[2] = fcd.getProtien();
            row[3] = fcd.getCarbohydrates();
            row[4] = fcd.getFat();
            row[5] = fcd.getFibers();
            row[6] = fcd.getSugar();
            row[7] = fcd.getSalt();
            
            dtm.addRow(row);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        titleLbl = new javax.swing.JLabel();
        contactLbl = new javax.swing.JLabel();
        houseHoldNameDisplayLbl = new javax.swing.JLabel();
        contactTxt = new javax.swing.JTextField();
        genderLbl = new javax.swing.JLabel();
        maleRadioBtn = new javax.swing.JRadioButton();
        fnameLbl = new javax.swing.JLabel();
        femaleRadioBtn = new javax.swing.JRadioButton();
        fnameTxt = new javax.swing.JTextField();
        lnameLbl = new javax.swing.JLabel();
        lnameTxt = new javax.swing.JTextField();
        headCheckBox = new javax.swing.JCheckBox();
        dobLbl = new javax.swing.JLabel();
        houseHoldId = new javax.swing.JLabel();
        dobTxt = new javax.swing.JTextField();
        houseHoldIdDisplayLbl = new javax.swing.JLabel();
        dobFormatLbl = new javax.swing.JLabel();
        houseHoldNameLbl = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vitalSignsTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        foodConsumptionDetailsTable = new javax.swing.JTable();
        vsHistoryLbl = new javax.swing.JLabel();
        foodConsumptionLbl = new javax.swing.JLabel();
        dateLbl = new javax.swing.JLabel();
        dateCombo = new javax.swing.JComboBox();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(740, 670));

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 102, 102));
        titleLbl.setText("House Hold Organization Admin - View Family Member Details");

        contactLbl.setForeground(new java.awt.Color(0, 102, 102));
        contactLbl.setText("Contact No.:");

        houseHoldNameDisplayLbl.setText("<House Hold Name>");
        houseHoldNameDisplayLbl.setEnabled(false);

        contactTxt.setForeground(new java.awt.Color(0, 102, 102));
        contactTxt.setEnabled(false);

        genderLbl.setForeground(new java.awt.Color(0, 102, 102));
        genderLbl.setText("Gender:");

        buttonGroup1.add(maleRadioBtn);
        maleRadioBtn.setText("Male");
        maleRadioBtn.setEnabled(false);

        fnameLbl.setForeground(new java.awt.Color(0, 102, 102));
        fnameLbl.setText("First Name:");

        buttonGroup1.add(femaleRadioBtn);
        femaleRadioBtn.setText("Female");
        femaleRadioBtn.setEnabled(false);

        fnameTxt.setForeground(new java.awt.Color(0, 102, 102));
        fnameTxt.setEnabled(false);

        lnameLbl.setForeground(new java.awt.Color(0, 102, 102));
        lnameLbl.setText("Last Name:");

        lnameTxt.setEnabled(false);

        headCheckBox.setForeground(new java.awt.Color(0, 102, 102));
        headCheckBox.setText("Is Head of the Family?");
        headCheckBox.setEnabled(false);

        dobLbl.setForeground(new java.awt.Color(0, 102, 102));
        dobLbl.setText("Date of Birth:");

        houseHoldId.setForeground(new java.awt.Color(0, 102, 102));
        houseHoldId.setText("House Hold Id:");

        dobTxt.setForeground(new java.awt.Color(0, 102, 102));
        dobTxt.setEnabled(false);

        houseHoldIdDisplayLbl.setForeground(new java.awt.Color(0, 102, 102));
        houseHoldIdDisplayLbl.setText("<House Hold Id>");
        houseHoldIdDisplayLbl.setEnabled(false);

        dobFormatLbl.setForeground(new java.awt.Color(0, 102, 102));
        dobFormatLbl.setText("(MM/DD/YYYY)");

        houseHoldNameLbl.setForeground(new java.awt.Color(0, 102, 102));
        houseHoldNameLbl.setText("House Hold Name:");

        saveBtn.setBackground(new java.awt.Color(153, 153, 153));
        saveBtn.setForeground(new java.awt.Color(0, 102, 102));
        saveBtn.setText("Save");
        saveBtn.setEnabled(false);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(153, 153, 153));
        updateBtn.setForeground(new java.awt.Color(0, 102, 102));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        jScrollPane1.setForeground(new java.awt.Color(0, 102, 102));

        vitalSignsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Time", "Temp.", "Sys. BP", "Pulse", "Resp. Rate", "Cholesterol", "BloodSugar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vitalSignsTable);
        if (vitalSignsTable.getColumnModel().getColumnCount() > 0) {
            vitalSignsTable.getColumnModel().getColumn(0).setResizable(false);
            vitalSignsTable.getColumnModel().getColumn(1).setResizable(false);
            vitalSignsTable.getColumnModel().getColumn(2).setResizable(false);
            vitalSignsTable.getColumnModel().getColumn(3).setResizable(false);
            vitalSignsTable.getColumnModel().getColumn(4).setResizable(false);
            vitalSignsTable.getColumnModel().getColumn(5).setResizable(false);
            vitalSignsTable.getColumnModel().getColumn(6).setResizable(false);
        }

        jScrollPane2.setForeground(new java.awt.Color(0, 102, 102));

        foodConsumptionDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Time", "Energy", "Protein", "Carbo.", "Fat", "Fibers", "Sugar", "Salt"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(foodConsumptionDetailsTable);
        if (foodConsumptionDetailsTable.getColumnModel().getColumnCount() > 0) {
            foodConsumptionDetailsTable.getColumnModel().getColumn(0).setResizable(false);
            foodConsumptionDetailsTable.getColumnModel().getColumn(1).setResizable(false);
            foodConsumptionDetailsTable.getColumnModel().getColumn(2).setResizable(false);
            foodConsumptionDetailsTable.getColumnModel().getColumn(3).setResizable(false);
            foodConsumptionDetailsTable.getColumnModel().getColumn(4).setResizable(false);
            foodConsumptionDetailsTable.getColumnModel().getColumn(5).setResizable(false);
            foodConsumptionDetailsTable.getColumnModel().getColumn(6).setResizable(false);
            foodConsumptionDetailsTable.getColumnModel().getColumn(7).setResizable(false);
        }

        vsHistoryLbl.setForeground(new java.awt.Color(0, 102, 102));
        vsHistoryLbl.setText("Vital Sign History:");

        foodConsumptionLbl.setForeground(new java.awt.Color(0, 102, 102));
        foodConsumptionLbl.setText("Food Consumption History:");

        dateLbl.setForeground(new java.awt.Color(0, 102, 102));
        dateLbl.setText("Date:");

        dateCombo.setForeground(new java.awt.Color(0, 102, 102));
        dateCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        dateCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateComboActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(153, 153, 153));
        backBtn.setForeground(new java.awt.Color(0, 102, 102));
        backBtn.setText("<<  Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(foodConsumptionLbl)
                            .addComponent(vsHistoryLbl))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(backBtn)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(titleLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(dateLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(houseHoldId)
                                    .addComponent(dobLbl)
                                    .addComponent(contactLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dobTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dobFormatLbl))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fnameLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(contactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(genderLbl))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(houseHoldIdDisplayLbl)
                                                .addGap(35, 35, 35)
                                                .addComponent(houseHoldNameLbl))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(fnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lnameLbl))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(headCheckBox)
                                        .addGap(93, 93, 93)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(femaleRadioBtn)
                                    .addComponent(lnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(houseHoldNameDisplayLbl)
                                    .addComponent(maleRadioBtn))))
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(saveBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateBtn)
                        .addGap(300, 300, 300))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(houseHoldId)
                    .addComponent(houseHoldIdDisplayLbl)
                    .addComponent(houseHoldNameLbl)
                    .addComponent(houseHoldNameDisplayLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fnameLbl)
                    .addComponent(fnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnameLbl)
                    .addComponent(lnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobLbl)
                    .addComponent(dobTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobFormatLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactLbl)
                    .addComponent(contactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderLbl)
                    .addComponent(maleRadioBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(headCheckBox)
                    .addComponent(femaleRadioBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(updateBtn))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLbl)
                    .addComponent(dateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(vsHistoryLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(foodConsumptionLbl)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(backBtn)
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dateComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateComboActionPerformed
        // TODO add your handling code here:
        String date = (String) dateCombo.getSelectedItem();
        
        if (date != null) {
            populateVitalSignTable();
            populateFoodConsumptionTable();
        }
    }//GEN-LAST:event_dateComboActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        manageFamilyMemPanel.populateFamilyMemberTable(house);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        fnameTxt.setEnabled(true);
        lnameTxt.setEnabled(true);
        contactTxt.setEnabled(true);
        dobTxt.setEnabled(true);
       
        if (headCheckBox.isSelected()) {
            headCheckBox.setEnabled(true);
        }
        
        maleRadioBtn.setEnabled(true);
        femaleRadioBtn.setEnabled(true);
        
        saveBtn.setEnabled(true);
        updateBtn.setEnabled(false);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        if (validateInput()) {
            member.setFirstName(fnameTxt.getText().trim());
            member.setLastName(lnameTxt.getText().trim());
            member.setDob(dobTxt.getText().trim());
            member.setContactNo(contactTxt.getText().trim());
            
            if (maleRadioBtn.isSelected()) {
                member.setGender("Male");
            }
            else {
                member.setGender("Female");
            }
            
            if (house.getHeadOfTheFamily() == 0 && headCheckBox.isSelected()) {
                house.setHeadOfTheFamily(member.getPersonId());
            }
            else if (house.getHeadOfTheFamily() == member.getPersonId() && !headCheckBox.isSelected()) {
                house.setHeadOfTheFamily(0);
            }
                    
            JOptionPane.showMessageDialog(null, "Family Member details updated successfully!");
            fnameTxt.setEnabled(false);
            lnameTxt.setEnabled(false);
            contactTxt.setEnabled(false);
            dobTxt.setEnabled(false);
       
            headCheckBox.setEnabled(false);
        
            maleRadioBtn.setEnabled(false);
            femaleRadioBtn.setEnabled(false);
        
            saveBtn.setEnabled(false);
            updateBtn.setEnabled(true);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    public boolean validateInput() {
        String fname = fnameTxt.getText().trim();
        String lname = lnameTxt.getText().trim();
        String dob = dobTxt.getText().trim();
        String cnum = contactTxt.getText().trim();
        
        if (fname.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter First Name!", "Error", JOptionPane.ERROR_MESSAGE);
            fnameTxt.requestFocus();
            return false;
        }
        else if (lname.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter Last Name!", "Error", JOptionPane.ERROR_MESSAGE);
            lnameTxt.requestFocus();
            return false;
        }
        else if (dob.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter Date of Birth!", "Error", JOptionPane.ERROR_MESSAGE);
            dobTxt.requestFocus();
            return false;
        }
        else if (!HelperMethods.validateDate(dob)) {
            JOptionPane.showMessageDialog(null, "Please enter Date of Birth in MM/DD/YYYY format!", "Error", JOptionPane.ERROR_MESSAGE);
            dobTxt.requestFocus();
            return false;
        }
        else if (cnum.isEmpty() || !(cnum.matches("^[0-9]{10}"))) {
            JOptionPane.showMessageDialog(null, "Please enter 10 digits in Contact No.!", "Error", JOptionPane.ERROR_MESSAGE);
            contactTxt.requestFocus();
            return false;
        }
        else if (!maleRadioBtn.isSelected() && !femaleRadioBtn.isSelected()) {
            JOptionPane.showMessageDialog(null, "Please select Gender!", "Error", JOptionPane.ERROR_MESSAGE);
            maleRadioBtn.requestFocus();
            return false;
        }
        else {
            return true;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel contactLbl;
    private javax.swing.JTextField contactTxt;
    private javax.swing.JComboBox dateCombo;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JLabel dobFormatLbl;
    private javax.swing.JLabel dobLbl;
    private javax.swing.JTextField dobTxt;
    private javax.swing.JRadioButton femaleRadioBtn;
    private javax.swing.JLabel fnameLbl;
    private javax.swing.JTextField fnameTxt;
    private javax.swing.JTable foodConsumptionDetailsTable;
    private javax.swing.JLabel foodConsumptionLbl;
    private javax.swing.JLabel genderLbl;
    private javax.swing.JCheckBox headCheckBox;
    private javax.swing.JLabel houseHoldId;
    private javax.swing.JLabel houseHoldIdDisplayLbl;
    private javax.swing.JLabel houseHoldNameDisplayLbl;
    private javax.swing.JLabel houseHoldNameLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lnameLbl;
    private javax.swing.JTextField lnameTxt;
    private javax.swing.JRadioButton maleRadioBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTable vitalSignsTable;
    private javax.swing.JLabel vsHistoryLbl;
    // End of variables declaration//GEN-END:variables
}
