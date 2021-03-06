/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.householdorganizationadminrole;

import business.EcoSystem;
import business.HelperMethods;
import business.household.HouseHold;
import business.organization.HouseHoldOrganization;
import business.organization.Organization;
import business.person.FamilyMember;
import business.person.Person;
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
public class ManageFamilyMembersJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private Organization organization;
    private HouseHoldOrganization houseHoldOrg;
    private HouseHold house;
            
    /**
     * Creates new form ManageFamilyMembersJPanel
     */
    public ManageFamilyMembersJPanel() {
        initComponents();
    }

    public ManageFamilyMembersJPanel(JPanel userProcessContainer, EcoSystem system, Organization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.organization = organization;
        houseHoldOrg = (HouseHoldOrganization) this.organization;
        
        displayDetails();
        
        this.house = (HouseHold) houseHoldCombo.getSelectedItem();
    }
    
    public void displayDetails() {
        bindHouseHoldCombo();
    }
    
    public void populateFamilyMemberTable(HouseHold house) {
        DefaultTableModel dtm = (DefaultTableModel) familyMembersTable.getModel();
        dtm.setRowCount(0);
        
        ArrayList<FamilyMember> members = (ArrayList) house.getFamilyMembers().getPersonList();
        
        for (FamilyMember person : members) {
            Object row[] = new Object[5];
            row[0] = person;
            row[1] = person.getLastName();
            row[2] = person.getDob();
            row[3] = person.getPersonId() == house.getHeadOfTheFamily() ? "Yes" : "No";
            row[4] = HelperMethods.getUserAccountForPerson(person, houseHoldOrg.getUserAccountDirectory());
            
            dtm.addRow(row);
        }
    }
    
    public void populateFamilyMemberTable(ArrayList<FamilyMember> members) {
        DefaultTableModel dtm = (DefaultTableModel) familyMembersTable.getModel();
        dtm.setRowCount(0);
        
        for (FamilyMember person : members) {
            Object row[] = new Object[5];
            row[0] = person;
            row[1] = person.getLastName();
            row[2] = person.getDob();
            row[3] = person.getPersonId() == house.getHeadOfTheFamily() ? "Yes" : "No";
            row[4] = HelperMethods.getUserAccountForPerson(person, houseHoldOrg.getUserAccountDirectory());
            
            dtm.addRow(row);
        }
    }
    
    public void bindHouseHoldCombo() {
        houseHoldCombo.removeAllItems();
        
        for (HouseHold house : houseHoldOrg.getHouseHoldDirectory().getHouseHoldDirectory()) {
            houseHoldCombo.addItem(house);
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

        titleLbl = new javax.swing.JLabel();
        selectHouseHoldLbl = new javax.swing.JLabel();
        houseHoldCombo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        familyMembersTable = new javax.swing.JTable();
        searchTxt = new javax.swing.JTextField();
        searchLbl = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        viewDetailsBtn = new javax.swing.JButton();
        addMemberBtn = new javax.swing.JButton();
        addressLbl = new javax.swing.JLabel();
        addressDisplayLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(740, 640));

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 102, 102));
        titleLbl.setText("House Hold Organization Admin - Manage Family Members");

        selectHouseHoldLbl.setForeground(new java.awt.Color(0, 102, 102));
        selectHouseHoldLbl.setText("Select House Hold:");

        houseHoldCombo.setForeground(new java.awt.Color(0, 102, 102));
        houseHoldCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        houseHoldCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseHoldComboActionPerformed(evt);
            }
        });

        jScrollPane1.setForeground(new java.awt.Color(0, 102, 102));

        familyMembersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Date Of Birth", "Is Head of The Family", "User Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(familyMembersTable);
        if (familyMembersTable.getColumnModel().getColumnCount() > 0) {
            familyMembersTable.getColumnModel().getColumn(0).setResizable(false);
            familyMembersTable.getColumnModel().getColumn(1).setResizable(false);
            familyMembersTable.getColumnModel().getColumn(2).setResizable(false);
            familyMembersTable.getColumnModel().getColumn(3).setResizable(false);
            familyMembersTable.getColumnModel().getColumn(4).setResizable(false);
        }

        searchTxt.setForeground(new java.awt.Color(0, 102, 102));

        searchLbl.setForeground(new java.awt.Color(0, 102, 102));
        searchLbl.setText("Enter First Name to Search for Member:");

        searchBtn.setBackground(new java.awt.Color(153, 153, 153));
        searchBtn.setForeground(new java.awt.Color(0, 102, 102));
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        clearBtn.setBackground(new java.awt.Color(153, 153, 153));
        clearBtn.setForeground(new java.awt.Color(0, 102, 102));
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(153, 153, 153));
        deleteBtn.setForeground(new java.awt.Color(0, 102, 102));
        deleteBtn.setText("Delete Family Member");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
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

        addMemberBtn.setBackground(new java.awt.Color(153, 153, 153));
        addMemberBtn.setForeground(new java.awt.Color(0, 102, 102));
        addMemberBtn.setText("Add Family Member");
        addMemberBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMemberBtnActionPerformed(evt);
            }
        });

        addressLbl.setForeground(new java.awt.Color(0, 102, 102));
        addressLbl.setText("Address:");

        addressDisplayLbl.setForeground(new java.awt.Color(0, 102, 102));
        addressDisplayLbl.setText("<Address>");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addressLbl)
                            .addComponent(selectHouseHoldLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(houseHoldCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressDisplayLbl))
                        .addGap(229, 229, 229))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(addMemberBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(viewDetailsBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(deleteBtn))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(searchLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(searchBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(clearBtn))))
                        .addGap(127, 127, 127))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(titleLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(backBtn)))
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(titleLbl)
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectHouseHoldLbl)
                    .addComponent(houseHoldCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLbl)
                    .addComponent(addressDisplayLbl))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchLbl)
                    .addComponent(searchBtn)
                    .addComponent(clearBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn)
                    .addComponent(viewDetailsBtn)
                    .addComponent(addMemberBtn))
                .addGap(158, 158, 158)
                .addComponent(backBtn)
                .addGap(56, 56, 56))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void addMemberBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMemberBtnActionPerformed
        // TODO add your handling code here:
        house = (HouseHold) houseHoldCombo.getSelectedItem();
        
        AddFamilyMemberJPanel addMemberToPanel = new AddFamilyMemberJPanel(userProcessContainer, system, houseHoldOrg, house, null, this);
        userProcessContainer.add("addMemberToFamily", addMemberToPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addMemberBtnActionPerformed

    private void houseHoldComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houseHoldComboActionPerformed
        // TODO add your handling code here:
        
        house = (HouseHold) houseHoldCombo.getSelectedItem();
        
        if (house != null) {
            addressDisplayLbl.setText(house.getAddress());
        
            populateFamilyMemberTable(house);
        }
    }//GEN-LAST:event_houseHoldComboActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = familyMembersTable.getSelectedRow();
        
        if (selectedRow >= 0) {
            int confirmButton = JOptionPane.YES_NO_OPTION;
            
            int confirmDelete = JOptionPane.showConfirmDialog(null, "Would you like to delete selected family member?", "Warning", confirmButton);
            
            if (confirmDelete == JOptionPane.YES_OPTION) {
                UserAccount ua = (UserAccount) familyMembersTable.getValueAt(selectedRow, 4);
                FamilyMember person = (FamilyMember) familyMembersTable.getValueAt(selectedRow, 0);
                
                houseHoldOrg.getUserAccountDirectory().removeUserAccount(ua);
                houseHoldOrg.getPersonDirectory().removePerson(person);
                house.getFamilyMembers().removePerson(ua.getPerson());
                
                populateFamilyMemberTable(house);
            }  
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete family member!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void viewDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = familyMembersTable.getSelectedRow();
        
        if (selectedRow >= 0) {
            FamilyMember member = (FamilyMember) familyMembersTable.getValueAt(selectedRow, 0);
            
            ViewFamilyMemberDetailsJPanel viewFamilyMemberDetailPanel = new ViewFamilyMemberDetailsJPanel(userProcessContainer, house, member, this);
            userProcessContainer.add("viewFamilyMemberDetailPanel", viewFamilyMemberDetailPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row to view details!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_viewDetailsBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        populateFamilyMemberTable(house);
        searchTxt.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        String searchInput = searchTxt.getText().trim();
        
        if (!searchInput.isEmpty()) {
            ArrayList<FamilyMember> members = (ArrayList) house.getFamilyMembers().searchPerson(searchInput);
            
            if (!members.isEmpty()) {
                populateFamilyMemberTable(members);
            }
            else {
                JOptionPane.showMessageDialog(null, "No such member present in the family!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please enter first name to searh for member!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_searchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMemberBtn;
    private javax.swing.JLabel addressDisplayLbl;
    private javax.swing.JLabel addressLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTable familyMembersTable;
    private javax.swing.JComboBox houseHoldCombo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel searchLbl;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JLabel selectHouseHoldLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JButton viewDetailsBtn;
    // End of variables declaration//GEN-END:variables
}
