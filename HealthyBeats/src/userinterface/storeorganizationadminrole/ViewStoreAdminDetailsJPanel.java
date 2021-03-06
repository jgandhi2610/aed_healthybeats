/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.storeorganizationadminrole;

import business.store.Store;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author JAHNVI
 */
public class ViewStoreAdminDetailsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount ua;
    private Store store;
    private ManageStoreAdminJPanel manageStoreAdminPanel;
    /**
     * Creates new form ViewStoreAdminDetailsJPanel
     */
    public ViewStoreAdminDetailsJPanel() {
        initComponents();
    }

    public ViewStoreAdminDetailsJPanel(JPanel userProcesscontainer, Store store, UserAccount ua, ManageStoreAdminJPanel manageStoreAdminPanel) {
        initComponents();
        this.userProcessContainer = userProcesscontainer;
        this.ua = ua;
        this.store = store;
        this.manageStoreAdminPanel = manageStoreAdminPanel;
        
        displayDetails();
    }
    
    public void displayDetails() {
        storeNameLbl.setText(store.getStoreName());
        firstNameTxt.setText(ua.getPerson().getFirstName());
        lastNameTxt.setText(ua.getPerson().getLastName());
        contactNoTxt.setText(ua.getPerson().getContactNo());
        
        if (ua.getPerson().getGender().equals("Male")) {
            maleRadioBtn.setSelected(true);
        }
        else {
            femaleRadioBtn.setSelected(true);
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
        genderLbl = new javax.swing.JLabel();
        femaleRadioBtn = new javax.swing.JRadioButton();
        updateBtn = new javax.swing.JButton();
        contactNoLbl = new javax.swing.JLabel();
        maleRadioBtn = new javax.swing.JRadioButton();
        firstNameLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        storeLbl = new javax.swing.JLabel();
        lastNameTxt = new javax.swing.JTextField();
        firstNameTxt = new javax.swing.JTextField();
        lastNameLbl = new javax.swing.JLabel();
        storeNameLbl = new javax.swing.JLabel();
        contactNoTxt = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 102, 102));
        titleLbl.setText("Store Organization Admin - View Store Admin Details");

        genderLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        genderLbl.setForeground(new java.awt.Color(0, 102, 102));
        genderLbl.setText("Gender:");

        buttonGroup1.add(femaleRadioBtn);
        femaleRadioBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        femaleRadioBtn.setForeground(new java.awt.Color(0, 102, 102));
        femaleRadioBtn.setText("Female");
        femaleRadioBtn.setEnabled(false);

        updateBtn.setBackground(new java.awt.Color(153, 153, 153));
        updateBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(0, 102, 102));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        contactNoLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        contactNoLbl.setForeground(new java.awt.Color(0, 102, 102));
        contactNoLbl.setText("Contact No.:");

        buttonGroup1.add(maleRadioBtn);
        maleRadioBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        maleRadioBtn.setForeground(new java.awt.Color(0, 102, 102));
        maleRadioBtn.setText("Male");
        maleRadioBtn.setEnabled(false);

        firstNameLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        firstNameLbl.setForeground(new java.awt.Color(0, 102, 102));
        firstNameLbl.setText("First Name:");

        backBtn.setBackground(new java.awt.Color(153, 153, 153));
        backBtn.setForeground(new java.awt.Color(0, 102, 102));
        backBtn.setText("<<  Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        storeLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        storeLbl.setForeground(new java.awt.Color(0, 102, 102));
        storeLbl.setText("Store:");

        lastNameTxt.setEditable(false);
        lastNameTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lastNameTxt.setForeground(new java.awt.Color(0, 102, 102));

        firstNameTxt.setEditable(false);
        firstNameTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        firstNameTxt.setForeground(new java.awt.Color(0, 102, 102));

        lastNameLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lastNameLbl.setForeground(new java.awt.Color(0, 102, 102));
        lastNameLbl.setText("Last Name:");

        storeNameLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        storeNameLbl.setForeground(new java.awt.Color(0, 102, 102));
        storeNameLbl.setText("<Store>");
        storeNameLbl.setEnabled(false);

        contactNoTxt.setEditable(false);
        contactNoTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        contactNoTxt.setForeground(new java.awt.Color(0, 102, 102));

        saveBtn.setBackground(new java.awt.Color(153, 153, 153));
        saveBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(0, 102, 102));
        saveBtn.setText("Save");
        saveBtn.setEnabled(false);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(titleLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(backBtn)))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(storeLbl)
                            .addComponent(genderLbl)
                            .addComponent(contactNoLbl)
                            .addComponent(lastNameLbl)
                            .addComponent(firstNameLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maleRadioBtn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(contactNoTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lastNameTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(firstNameTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(femaleRadioBtn)
                            .addComponent(storeNameLbl)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(saveBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateBtn)
                        .addGap(27, 27, 27)))
                .addGap(185, 185, 185))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(titleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storeLbl)
                    .addComponent(storeNameLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLbl)
                    .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLbl)
                    .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactNoLbl)
                    .addComponent(contactNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLbl)
                    .addComponent(maleRadioBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(femaleRadioBtn)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(updateBtn))
                .addGap(140, 140, 140)
                .addComponent(backBtn)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        firstNameTxt.setEditable(true);
        lastNameTxt.setEditable(true);
        contactNoTxt.setEditable(true);
        maleRadioBtn.setEnabled(true);
        femaleRadioBtn.setEnabled(true);

        saveBtn.setEnabled(true);
        updateBtn.setEnabled(false);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        manageStoreAdminPanel.populateStoreAdminTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        if (validateInput()) {
            ua.getPerson().setFirstName(firstNameTxt.getText());
            ua.getPerson().setLastName(lastNameTxt.getText());
            ua.getPerson().setContactNo(contactNoTxt.getText());

            if(maleRadioBtn.isSelected()) {
                ua.getPerson().setGender("Male");
            }
            else {
                ua.getPerson().setGender("Female");
            }

            JOptionPane.showMessageDialog(null, "Store Admin details updated successfully!", "Information", JOptionPane.INFORMATION_MESSAGE);

            firstNameTxt.setEditable(false);
            lastNameTxt.setEditable(false);
            contactNoTxt.setEditable(false);
            maleRadioBtn.setEnabled(false);
            femaleRadioBtn.setEnabled(false);
            saveBtn.setEnabled(false);
            updateBtn.setEnabled(true);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    public boolean validateInput() {
        String fname = firstNameTxt.getText().trim();
        String lname = lastNameTxt.getText().trim();
        String cnum = contactNoTxt.getText().trim();
        
        if (fname.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter First Name!", "Error", JOptionPane.ERROR_MESSAGE);
            firstNameTxt.requestFocus();
            return false;
        }
        else if (lname.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter Last Name!", "Error", JOptionPane.ERROR_MESSAGE);
            lastNameTxt.requestFocus();
            return false;
        }
        else if (cnum.isEmpty() || !(cnum.matches("^[0-9]{10}"))) {
            JOptionPane.showMessageDialog(null, "Please enter 10 digits in Contact No.!", "Error", JOptionPane.ERROR_MESSAGE);
            contactNoTxt.requestFocus();
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
    private javax.swing.JLabel contactNoLbl;
    private javax.swing.JTextField contactNoTxt;
    private javax.swing.JRadioButton femaleRadioBtn;
    private javax.swing.JLabel firstNameLbl;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JLabel genderLbl;
    private javax.swing.JLabel lastNameLbl;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JRadioButton maleRadioBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel storeLbl;
    private javax.swing.JLabel storeNameLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
