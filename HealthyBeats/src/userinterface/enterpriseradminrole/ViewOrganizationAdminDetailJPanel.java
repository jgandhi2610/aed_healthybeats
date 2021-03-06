/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.enterpriseradminrole;

import business.organization.Organization;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author JAHNVI
 */
public class ViewOrganizationAdminDetailJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization org;
    private UserAccount ua;
    private ManageOrganizationAdminJPanel manageOrgAdminPanel;
    
    /**
     * Creates new form ViewOrganizationAdminDetailJPanel
     */
    public ViewOrganizationAdminDetailJPanel() {
        initComponents();
    }

    public ViewOrganizationAdminDetailJPanel(JPanel userProcessContainer, Organization org, UserAccount ua, ManageOrganizationAdminJPanel manageOrgAdminPanel) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.org = org;
        this.ua = ua;
        this.manageOrgAdminPanel = manageOrgAdminPanel;
        displayDetails();
    }
    
    public void displayDetails() {
        orgNameLbl.setText(org.getOrganizationName());
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
        femaleRadioBtn = new javax.swing.JRadioButton();
        contactNoLbl = new javax.swing.JLabel();
        firstNameLbl = new javax.swing.JLabel();
        orgLbl = new javax.swing.JLabel();
        firstNameTxt = new javax.swing.JTextField();
        titleLbl = new javax.swing.JLabel();
        lastNameLbl = new javax.swing.JLabel();
        orgNameLbl = new javax.swing.JLabel();
        contactNoTxt = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        genderLbl = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        maleRadioBtn = new javax.swing.JRadioButton();
        backBtn = new javax.swing.JButton();
        lastNameTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(740, 670));

        buttonGroup1.add(femaleRadioBtn);
        femaleRadioBtn.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        femaleRadioBtn.setForeground(new java.awt.Color(0, 102, 102));
        femaleRadioBtn.setText("Female");
        femaleRadioBtn.setEnabled(false);

        contactNoLbl.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        contactNoLbl.setForeground(new java.awt.Color(0, 102, 102));
        contactNoLbl.setText("Contact No.:");

        firstNameLbl.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        firstNameLbl.setForeground(new java.awt.Color(0, 102, 102));
        firstNameLbl.setText("First Name:");

        orgLbl.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        orgLbl.setForeground(new java.awt.Color(0, 102, 102));
        orgLbl.setText("Organization:");

        firstNameTxt.setEditable(false);
        firstNameTxt.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        firstNameTxt.setForeground(new java.awt.Color(0, 102, 102));

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 102, 102));
        titleLbl.setText("Enterprise Admin - View Organization Admin Details");

        lastNameLbl.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lastNameLbl.setForeground(new java.awt.Color(0, 102, 102));
        lastNameLbl.setText("Last Name:");

        orgNameLbl.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        orgNameLbl.setForeground(new java.awt.Color(0, 102, 102));
        orgNameLbl.setText("<Organization>");
        orgNameLbl.setEnabled(false);

        contactNoTxt.setEditable(false);
        contactNoTxt.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        contactNoTxt.setForeground(new java.awt.Color(0, 102, 102));

        saveBtn.setBackground(new java.awt.Color(153, 153, 153));
        saveBtn.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(0, 102, 102));
        saveBtn.setText("Save");
        saveBtn.setEnabled(false);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        genderLbl.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        genderLbl.setForeground(new java.awt.Color(0, 102, 102));
        genderLbl.setText("Gender:");

        updateBtn.setBackground(new java.awt.Color(153, 153, 153));
        updateBtn.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(0, 102, 102));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(maleRadioBtn);
        maleRadioBtn.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        maleRadioBtn.setForeground(new java.awt.Color(0, 102, 102));
        maleRadioBtn.setText("Male");
        maleRadioBtn.setEnabled(false);

        backBtn.setBackground(new java.awt.Color(153, 153, 153));
        backBtn.setForeground(new java.awt.Color(0, 102, 102));
        backBtn.setText("<<  Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        lastNameTxt.setEditable(false);
        lastNameTxt.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lastNameTxt.setForeground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(orgLbl)
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
                                    .addComponent(orgNameLbl)))
                            .addComponent(titleLbl))))
                .addGap(174, 174, 174))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(saveBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateBtn)
                .addGap(276, 276, 276))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(titleLbl)
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orgLbl)
                    .addComponent(orgNameLbl))
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
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(updateBtn))
                .addGap(122, 122, 122)
                .addComponent(backBtn)
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

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

            JOptionPane.showMessageDialog(null, "Organization Admin details updated successfully!", "Information", JOptionPane.INFORMATION_MESSAGE);

            firstNameTxt.setEditable(false);
            lastNameTxt.setEditable(false);
            contactNoTxt.setEditable(false);
            maleRadioBtn.setEnabled(false);
            femaleRadioBtn.setEnabled(false);
            saveBtn.setEnabled(false);
            updateBtn.setEnabled(true);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

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
        manageOrgAdminPanel.populateOrgAdminTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

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
    private javax.swing.JLabel orgLbl;
    private javax.swing.JLabel orgNameLbl;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
