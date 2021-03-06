/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.storeorganizationadminrole;

import business.EcoSystem;
import business.HelperMethods;
import business.organization.Organization;
import business.organization.StoreOrganization;
import business.person.Person;
import business.role.StoreAdminRole;
import business.store.Store;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JAHNVI
 */
public class ManageStoreAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private Organization organization;
    private StoreOrganization storeOrg; 
    /**
     * Creates new form ManageStoreAdminJPanel
     */
    public ManageStoreAdminJPanel() {
        initComponents();
    }
    
    public ManageStoreAdminJPanel(JPanel userProcessContainer, EcoSystem system, Organization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.organization = organization;
        this.storeOrg = (StoreOrganization) this.organization;
        
        populateStoreAdminTable();
        bindStoreCombo();
    }

    public void populateStoreAdminTable() {
        DefaultTableModel dtm = (DefaultTableModel) storeAdminTable.getModel();
        dtm.setRowCount(0);
        
        for (Store store : storeOrg.getStoreDirectory().getStoreList()) {
            ArrayList<UserAccount> uaList = store.getUserAccountDirectory().getUserAccountDirectory();
            
            if (uaList.size() > 0) {
                for (UserAccount ua : uaList) {
                    Object row[] = new Object[4];
                    row[0] = store.getStoreId();
                    row[1] = store;
                    row[2] = ua.getPerson().getFirstName();
                    row[3] = ua;
                    
                    dtm.addRow(row);
                }
            }
        }
    }
    
    public void bindStoreCombo() {
        storeCombo.removeAllItems();
        
        for (Store store : storeOrg.getStoreDirectory().getStoreList()) {
            storeCombo.addItem(store);
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
        storeAdminListLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        storeAdminTable = new javax.swing.JTable();
        deleteStoreAdminBtn = new javax.swing.JButton();
        viewDetailsBtn = new javax.swing.JButton();
        selectStoreLbl = new javax.swing.JLabel();
        storeCombo = new javax.swing.JComboBox();
        pwdTxt = new javax.swing.JPasswordField();
        genderLbl = new javax.swing.JLabel();
        firstNameLbl = new javax.swing.JLabel();
        firstNameTxt = new javax.swing.JTextField();
        lastNameLbl = new javax.swing.JLabel();
        lastNameTxt = new javax.swing.JTextField();
        usernameLbl = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        femaleRadioBtn = new javax.swing.JRadioButton();
        contactNoLbl = new javax.swing.JLabel();
        pwdLbl = new javax.swing.JLabel();
        contactNoTxt = new javax.swing.JTextField();
        maleRadioBtn = new javax.swing.JRadioButton();
        addStoreAdminBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 102, 102));
        titleLbl.setText("Store Organization Admin - Manage Store Admin");

        storeAdminListLbl.setForeground(new java.awt.Color(0, 102, 102));
        storeAdminListLbl.setText("Store Admin List:");

        jScrollPane1.setForeground(new java.awt.Color(0, 102, 102));

        storeAdminTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Store Id", "Store Name", "Admin Name", "User Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(storeAdminTable);
        if (storeAdminTable.getColumnModel().getColumnCount() > 0) {
            storeAdminTable.getColumnModel().getColumn(0).setResizable(false);
            storeAdminTable.getColumnModel().getColumn(1).setResizable(false);
            storeAdminTable.getColumnModel().getColumn(2).setResizable(false);
            storeAdminTable.getColumnModel().getColumn(3).setResizable(false);
        }

        deleteStoreAdminBtn.setBackground(new java.awt.Color(153, 153, 153));
        deleteStoreAdminBtn.setForeground(new java.awt.Color(0, 102, 102));
        deleteStoreAdminBtn.setText("Delete Store Admin");
        deleteStoreAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStoreAdminBtnActionPerformed(evt);
            }
        });

        viewDetailsBtn.setForeground(new java.awt.Color(0, 102, 102));
        viewDetailsBtn.setText("View Details");
        viewDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsBtnActionPerformed(evt);
            }
        });

        selectStoreLbl.setForeground(new java.awt.Color(0, 102, 102));
        selectStoreLbl.setText("Select Store:");

        storeCombo.setForeground(new java.awt.Color(0, 102, 102));
        storeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        pwdTxt.setForeground(new java.awt.Color(0, 102, 102));

        genderLbl.setForeground(new java.awt.Color(0, 102, 102));
        genderLbl.setText("Gender:");

        firstNameLbl.setForeground(new java.awt.Color(0, 102, 102));
        firstNameLbl.setText("First Name:");

        firstNameTxt.setForeground(new java.awt.Color(0, 102, 102));

        lastNameLbl.setForeground(new java.awt.Color(0, 102, 102));
        lastNameLbl.setText("Last Name:");

        lastNameTxt.setForeground(new java.awt.Color(0, 102, 102));

        usernameLbl.setForeground(new java.awt.Color(0, 102, 102));
        usernameLbl.setText("User Name:");

        usernameTxt.setForeground(new java.awt.Color(0, 102, 102));

        buttonGroup1.add(femaleRadioBtn);
        femaleRadioBtn.setForeground(new java.awt.Color(0, 102, 102));
        femaleRadioBtn.setText("Female");

        contactNoLbl.setForeground(new java.awt.Color(0, 102, 102));
        contactNoLbl.setText("Contact No.:");

        pwdLbl.setForeground(new java.awt.Color(0, 102, 102));
        pwdLbl.setText("Password:");

        contactNoTxt.setForeground(new java.awt.Color(0, 102, 102));

        buttonGroup1.add(maleRadioBtn);
        maleRadioBtn.setForeground(new java.awt.Color(0, 102, 102));
        maleRadioBtn.setText("Male");

        addStoreAdminBtn.setBackground(new java.awt.Color(153, 153, 153));
        addStoreAdminBtn.setForeground(new java.awt.Color(0, 102, 102));
        addStoreAdminBtn.setText("Add Store Admin");
        addStoreAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStoreAdminBtnActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(titleLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(viewDetailsBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteStoreAdminBtn))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(storeAdminListLbl))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(selectStoreLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(storeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(usernameLbl)
                                    .addComponent(pwdLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(usernameTxt)
                                    .addComponent(pwdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(addStoreAdminBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(backBtn)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(titleLbl)
                .addGap(36, 36, 36)
                .addComponent(storeAdminListLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteStoreAdminBtn)
                    .addComponent(viewDetailsBtn))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectStoreLbl)
                    .addComponent(storeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(usernameLbl)
                                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(pwdLbl)
                                .addComponent(pwdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addStoreAdminBtn)
                        .addGap(66, 66, 66))
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
                        .addComponent(femaleRadioBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(backBtn)
                        .addGap(25, 25, 25))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addStoreAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStoreAdminBtnActionPerformed
        // TODO add your handling code here:
        if (validateInput()) {
            Store store = (Store) storeCombo.getSelectedItem();

            if (store != null) {
                Person person = new Person();
                person.setFirstName(firstNameTxt.getText().trim());
                person.setLastName(lastNameTxt.getText().trim());
                person.setContactNo(contactNoTxt.getText().trim());
                
                store.getPersonDirectory().addPerson(person);

                if(maleRadioBtn.isSelected()) {
                    person.setGender("Male");
                }
                else {
                    person.setGender("Female");
                }

                UserAccount ua = store.getUserAccountDirectory().createUserAccount(usernameTxt.getText().trim(), String.valueOf(pwdTxt.getPassword()), person, new StoreAdminRole());
                

                if (ua != null) {
                    JOptionPane.showMessageDialog(null, "Store Admin Account created successfully!", "information", JOptionPane.INFORMATION_MESSAGE);
                    refresh();
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Please select a store to add Admin!", "Warning", JOptionPane.WARNING_MESSAGE);
                storeCombo.requestFocus();
            }
        }
    }//GEN-LAST:event_addStoreAdminBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void deleteStoreAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStoreAdminBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = storeAdminTable.getSelectedRow();
        
        if (selectedRow >= 0) {
            int confirmButton = JOptionPane.YES_NO_OPTION;
            
            int confirmDelete = JOptionPane.showConfirmDialog(null, "Would you like to delete selected store admin?", "Warning", confirmButton);
            
            if (confirmDelete == JOptionPane.YES_OPTION) {
                UserAccount ua = (UserAccount) storeAdminTable.getValueAt(selectedRow, 4);
                Store store = (Store) storeAdminTable.getValueAt(selectedRow, 1);
                
                store.getUserAccountDirectory().removeUserAccount(ua);
                store.getPersonDirectory().removePerson(ua.getPerson());
                
                refresh();
            }  
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete Store Admin!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deleteStoreAdminBtnActionPerformed

    private void viewDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = storeAdminTable.getSelectedRow();
        
        if (selectedRow >= 0) {
            UserAccount ua = (UserAccount) storeAdminTable.getValueAt(selectedRow, 3);
            Store store = (Store) storeAdminTable.getValueAt(selectedRow, 1);
            
            ViewStoreAdminDetailsJPanel viewStoreAdminDetailPanel = new ViewStoreAdminDetailsJPanel(userProcessContainer, store, ua, this);
            userProcessContainer.add("viewStoreAdminDetailPanel", viewStoreAdminDetailPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row to view details!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_viewDetailsBtnActionPerformed

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
            pwdTxt.requestFocus();
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
        
        populateStoreAdminTable();
        bindStoreCombo();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStoreAdminBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel contactNoLbl;
    private javax.swing.JTextField contactNoTxt;
    private javax.swing.JButton deleteStoreAdminBtn;
    private javax.swing.JRadioButton femaleRadioBtn;
    private javax.swing.JLabel firstNameLbl;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JLabel genderLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameLbl;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JRadioButton maleRadioBtn;
    private javax.swing.JLabel pwdLbl;
    private javax.swing.JPasswordField pwdTxt;
    private javax.swing.JLabel selectStoreLbl;
    private javax.swing.JLabel storeAdminListLbl;
    private javax.swing.JTable storeAdminTable;
    private javax.swing.JComboBox storeCombo;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel usernameLbl;
    private javax.swing.JTextField usernameTxt;
    private javax.swing.JButton viewDetailsBtn;
    // End of variables declaration//GEN-END:variables
}
