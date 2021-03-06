/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.enterpriseradminrole;

import business.EcoSystem;
import business.HelperMethods;
import business.enterprise.Enterprise;
import business.organization.HealthCareOrganization;
import business.organization.HouseHoldOrganization;
import business.organization.Organization;
import business.organization.StoreOrganization;
import business.person.Person;
import business.role.HealthCareOrganizationAdminRole;
import business.role.HouseHoldOrganizationAdminRole;
import business.role.StoreOrganizationAdminRole;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JAHNVI
 */
public class ManageOrganizationAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private Enterprise enterprise;
    
    /**
     * Creates new form ManageOrganizationAdminJPanel
     */
    public ManageOrganizationAdminJPanel() {
        initComponents();
    }
    
    public ManageOrganizationAdminJPanel(JPanel userProcessContainer, EcoSystem system, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.enterprise = enterprise;
        enterpriseNameLbl.setText(this.enterprise.getOrganizationName());
        populateOrgAdminTable();
        bindOrgCombo();
    }

    public void populateOrgAdminTable() {
        DefaultTableModel dtm = (DefaultTableModel) orgAdminTable.getModel();
        dtm.setRowCount(0);
        
        for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            
            if (org.getUserAccountDirectory().getUserAccountDirectory().size() > 0) {
                Object row[] = new Object[4];
                row[0] = org.getOrganizationId();
                row[1] = org;
                row[2] = org.getUserAccountDirectory().getUserAccountDirectory().get(0).getPerson().getFirstName();
                row[3] = org.getUserAccountDirectory().getUserAccountDirectory().get(0);
                
                dtm.addRow(row);
            }
        }
    }
    
    public void bindOrgCombo() {
        orgCombo.removeAllItems();
        
        for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (org.getUserAccountDirectory().getUserAccountDirectory().isEmpty()) {
                orgCombo.addItem(org);
            }
        }
        
        if (orgCombo.getItemCount() == 0) {
            addOrgBtn.setEnabled(false);
            errorMsgLbl.setText("All Organizations are assigned an Organization Admin!");
            errorMsgLbl.setVisible(true);
        }
        else {
            addOrgBtn.setEnabled(true);
            errorMsgLbl.setVisible(false);
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
        enterpriseLbl = new javax.swing.JLabel();
        enterpriseNameLbl = new javax.swing.JLabel();
        orgAdminListLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orgAdminTable = new javax.swing.JTable();
        deleteOrgAdminBtn = new javax.swing.JButton();
        viewDetailsBtn = new javax.swing.JButton();
        selectOrgLbl = new javax.swing.JLabel();
        orgCombo = new javax.swing.JComboBox();
        lastNameTxt = new javax.swing.JTextField();
        usernameTxt = new javax.swing.JTextField();
        contactNoLbl = new javax.swing.JLabel();
        pwdLbl = new javax.swing.JLabel();
        contactNoTxt = new javax.swing.JTextField();
        maleRadioBtn = new javax.swing.JRadioButton();
        pwdTxt = new javax.swing.JPasswordField();
        genderLbl = new javax.swing.JLabel();
        firstNameLbl = new javax.swing.JLabel();
        firstNameTxt = new javax.swing.JTextField();
        lastNameLbl = new javax.swing.JLabel();
        usernameLbl = new javax.swing.JLabel();
        femaleRadioBtn = new javax.swing.JRadioButton();
        addOrgBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        errorMsgLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(740, 670));

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 102, 102));
        titleLbl.setText("Enterprise Admin - Manage Organization Admin");

        enterpriseLbl.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        enterpriseLbl.setForeground(new java.awt.Color(0, 102, 102));
        enterpriseLbl.setText("Enterprise:");

        enterpriseNameLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enterpriseNameLbl.setForeground(new java.awt.Color(0, 102, 102));
        enterpriseNameLbl.setText("<Enterprise>");

        orgAdminListLbl.setForeground(new java.awt.Color(0, 102, 102));
        orgAdminListLbl.setText("Organization Admin List:");

        jScrollPane1.setForeground(new java.awt.Color(0, 102, 102));

        orgAdminTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Organization Id", "Organization Name", "Admin Name", "User Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orgAdminTable);
        if (orgAdminTable.getColumnModel().getColumnCount() > 0) {
            orgAdminTable.getColumnModel().getColumn(0).setResizable(false);
            orgAdminTable.getColumnModel().getColumn(1).setResizable(false);
            orgAdminTable.getColumnModel().getColumn(2).setResizable(false);
            orgAdminTable.getColumnModel().getColumn(3).setResizable(false);
        }

        deleteOrgAdminBtn.setBackground(new java.awt.Color(153, 153, 153));
        deleteOrgAdminBtn.setForeground(new java.awt.Color(0, 102, 102));
        deleteOrgAdminBtn.setText("Delete Organization Admin");
        deleteOrgAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOrgAdminBtnActionPerformed(evt);
            }
        });

        viewDetailsBtn.setBackground(new java.awt.Color(153, 153, 153));
        viewDetailsBtn.setForeground(new java.awt.Color(0, 102, 102));
        viewDetailsBtn.setText("View Details");
        viewDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsBtnActionPerformed(evt);
            }
        });

        selectOrgLbl.setForeground(new java.awt.Color(0, 102, 102));
        selectOrgLbl.setText("Select Organization:");

        orgCombo.setForeground(new java.awt.Color(0, 102, 102));
        orgCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lastNameTxt.setForeground(new java.awt.Color(0, 102, 102));

        usernameTxt.setForeground(new java.awt.Color(0, 102, 102));

        contactNoLbl.setForeground(new java.awt.Color(0, 102, 102));
        contactNoLbl.setText("Contact No.:");

        pwdLbl.setForeground(new java.awt.Color(0, 102, 102));
        pwdLbl.setText("Password:");

        contactNoTxt.setForeground(new java.awt.Color(0, 102, 102));

        buttonGroup1.add(maleRadioBtn);
        maleRadioBtn.setForeground(new java.awt.Color(0, 102, 102));
        maleRadioBtn.setText("Male");

        pwdTxt.setForeground(new java.awt.Color(0, 102, 102));

        genderLbl.setForeground(new java.awt.Color(0, 102, 102));
        genderLbl.setText("Gender:");

        firstNameLbl.setForeground(new java.awt.Color(0, 102, 102));
        firstNameLbl.setText("First Name:");

        firstNameTxt.setForeground(new java.awt.Color(0, 102, 102));

        lastNameLbl.setForeground(new java.awt.Color(0, 102, 102));
        lastNameLbl.setText("Last Name:");

        usernameLbl.setForeground(new java.awt.Color(0, 102, 102));
        usernameLbl.setText("User Name:");

        buttonGroup1.add(femaleRadioBtn);
        femaleRadioBtn.setForeground(new java.awt.Color(0, 102, 102));
        femaleRadioBtn.setText("Female");

        addOrgBtn.setBackground(new java.awt.Color(153, 153, 153));
        addOrgBtn.setForeground(new java.awt.Color(0, 102, 102));
        addOrgBtn.setText("Add Organization Admin");
        addOrgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrgBtnActionPerformed(evt);
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

        errorMsgLbl.setForeground(new java.awt.Color(255, 102, 102));
        errorMsgLbl.setText("<Error Message>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(titleLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(enterpriseLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(enterpriseNameLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(orgAdminListLbl))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(viewDetailsBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(deleteOrgAdminBtn)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(genderLbl)
                                            .addComponent(contactNoLbl)
                                            .addComponent(lastNameLbl)
                                            .addComponent(firstNameLbl))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(maleRadioBtn)
                                            .addComponent(contactNoTxt)
                                            .addComponent(lastNameTxt)
                                            .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(femaleRadioBtn))
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(usernameLbl)
                                            .addComponent(pwdLbl))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(usernameTxt)
                                            .addComponent(pwdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(selectOrgLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(orgCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(154, 154, 154))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(addOrgBtn)
                                .addGap(55, 55, 55))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(errorMsgLbl)))
                .addGap(152, 152, 152))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLbl)
                    .addComponent(enterpriseNameLbl))
                .addGap(55, 55, 55)
                .addComponent(orgAdminListLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteOrgAdminBtn)
                    .addComponent(viewDetailsBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectOrgLbl)
                    .addComponent(orgCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(usernameLbl)
                                .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(38, 38, 38))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pwdLbl)
                            .addComponent(pwdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
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
                        .addComponent(femaleRadioBtn)))
                .addGap(11, 11, 11)
                .addComponent(addOrgBtn)
                .addGap(21, 21, 21)
                .addComponent(errorMsgLbl)
                .addGap(33, 33, 33)
                .addComponent(backBtn)
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addOrgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrgBtnActionPerformed
        // TODO add your handling code here:
        if (validateInput()) {
            Organization organization = (Organization) orgCombo.getSelectedItem();
            
            if (organization != null) {
                Person person = new Person();                
                person.setFirstName(firstNameTxt.getText().trim());
                person.setLastName(lastNameTxt.getText().trim());
                person.setContactNo(contactNoTxt.getText().trim());
                
                organization.getPersonDirectory().addPerson(person);
                
                if(maleRadioBtn.isSelected()) {
                    person.setGender("Male");
                }
                else {
                    person.setGender("Female");
                }
                
                UserAccount ua = null;
       
                if (organization instanceof StoreOrganization) {
                    ua = organization.getUserAccountDirectory().createUserAccount(usernameTxt.getText().trim(), String.valueOf(pwdTxt.getPassword()), person, new StoreOrganizationAdminRole());
                }
                else if (organization instanceof HouseHoldOrganization) {
                    ua = organization.getUserAccountDirectory().createUserAccount(usernameTxt.getText().trim(), String.valueOf(pwdTxt.getPassword()), person, new HouseHoldOrganizationAdminRole());
                }
                else if (organization instanceof HealthCareOrganization) {
                    ua = organization.getUserAccountDirectory().createUserAccount(usernameTxt.getText().trim(), String.valueOf(pwdTxt.getPassword()), person, new HealthCareOrganizationAdminRole());
                }
                
                if (ua != null) {
                    JOptionPane.showMessageDialog(null, "Organization Admin Account created successfully!", "information", JOptionPane.INFORMATION_MESSAGE);
                    refresh();
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Please select an organization to add Admin!", "Warning", JOptionPane.WARNING_MESSAGE);
                orgCombo.requestFocus();
            }
        }
    }//GEN-LAST:event_addOrgBtnActionPerformed

    private void viewDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = orgAdminTable.getSelectedRow();
        
        if (selectedRow >= 0) {
            UserAccount ua = (UserAccount) orgAdminTable.getValueAt(selectedRow, 3);
            Organization organization = (Organization) orgAdminTable.getValueAt(selectedRow, 1);
            
            ViewOrganizationAdminDetailJPanel viewOrgAdminDetailPanel = new ViewOrganizationAdminDetailJPanel(userProcessContainer, organization, ua, this);
            userProcessContainer.add("viewOrgAdminDetailPanel", viewOrgAdminDetailPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row to view details!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_viewDetailsBtnActionPerformed

    private void deleteOrgAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOrgAdminBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = orgAdminTable.getSelectedRow();
        
        if (selectedRow >= 0) {
            int confirmButton = JOptionPane.YES_NO_OPTION;
            
            int confirmDelete = JOptionPane.showConfirmDialog(null, "Would you like to delete selected organization admin?", "Warning", confirmButton);
            
            if (confirmDelete == JOptionPane.YES_OPTION) {
                UserAccount ua = (UserAccount) orgAdminTable.getValueAt(selectedRow, 4);
                Organization organization = (Organization) orgAdminTable.getValueAt(selectedRow, 1);
                
                organization.getUserAccountDirectory().removeUserAccount(ua);
                organization.getPersonDirectory().removePerson(ua.getPerson());
                
                refresh();
            }  
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete Organization Admin!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deleteOrgAdminBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    public boolean validateInput() {
        String fname = firstNameTxt.getText().trim();
        String lname = lastNameTxt.getText().trim();
        String cnum = contactNoTxt.getText().trim();
        String uname = usernameTxt.getText().trim();
        String pwd = String.valueOf(pwdTxt.getPassword());
        
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
        else if (uname.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter User Name!", "Error", JOptionPane.ERROR_MESSAGE);
            usernameTxt.requestFocus();
            return false;
        }
        else if (HelperMethods.checkIfUserNameExists(uname, system)) {
            JOptionPane.showMessageDialog(null, "Username already exists!", "Error", JOptionPane.ERROR_MESSAGE);
            usernameTxt.requestFocus();
            return false;
        }
        else if (pwd.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter Password!", "Error", JOptionPane.ERROR_MESSAGE);
            firstNameTxt.requestFocus();
            return false;
        }
        else {
            return true;
        }
    }
    
    public void refresh() {
        firstNameTxt.setText("");
        lastNameTxt.setText("");
        contactNoTxt.setText("");
        maleRadioBtn.setSelected(false);
        femaleRadioBtn.setSelected(false);
        usernameTxt.setText("");
        pwdTxt.setText("");
        
        populateOrgAdminTable();
        bindOrgCombo();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrgBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel contactNoLbl;
    private javax.swing.JTextField contactNoTxt;
    private javax.swing.JButton deleteOrgAdminBtn;
    private javax.swing.JLabel enterpriseLbl;
    private javax.swing.JLabel enterpriseNameLbl;
    private javax.swing.JLabel errorMsgLbl;
    private javax.swing.JRadioButton femaleRadioBtn;
    private javax.swing.JLabel firstNameLbl;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JLabel genderLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameLbl;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JRadioButton maleRadioBtn;
    private javax.swing.JLabel orgAdminListLbl;
    private javax.swing.JTable orgAdminTable;
    private javax.swing.JComboBox orgCombo;
    private javax.swing.JLabel pwdLbl;
    private javax.swing.JPasswordField pwdTxt;
    private javax.swing.JLabel selectOrgLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel usernameLbl;
    private javax.swing.JTextField usernameTxt;
    private javax.swing.JButton viewDetailsBtn;
    // End of variables declaration//GEN-END:variables
}
