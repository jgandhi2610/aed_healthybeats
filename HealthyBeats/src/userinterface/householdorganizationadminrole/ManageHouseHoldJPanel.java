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
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JAHNVI
 */
public class ManageHouseHoldJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private Organization organization;
    private HouseHoldOrganization houseOrg;
    private HouseHoldOrganizationWorkAreaJPanel houseHoldWorkAreaPanel;
    /**
     * Creates new form ManageHouseHoldJPanel
     */
    public ManageHouseHoldJPanel() {
        initComponents();
    }
    
    public ManageHouseHoldJPanel(JPanel userProcessContainer, EcoSystem system, Organization organization, HouseHoldOrganizationWorkAreaJPanel houseHoldWorkAreaPanel) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.organization = organization;
        this.houseOrg = (HouseHoldOrganization) this.organization;
        this.houseHoldWorkAreaPanel = houseHoldWorkAreaPanel;
        populateHouseHoldTable(houseOrg.getHouseHoldDirectory().getHouseHoldDirectory());
    }

    public void populateHouseHoldTable(ArrayList<HouseHold> houseHoldList) {
        DefaultTableModel dtm = (DefaultTableModel) houseHoldTable.getModel();
        dtm.setRowCount(0);
        
        for (HouseHold hh : houseHoldList) {
            Object row[] = new Object[4];
            row[0] = hh.getHouseHoldId();
            row[1] = hh;
            row[2] = hh.getHeadOfTheFamily() == 0 ? "" : HelperMethods.getNameForHeadOfTheFamily(hh.getHeadOfTheFamily(), hh);
            row[3] = hh.getAddress();
            
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

        titleLbl = new javax.swing.JLabel();
        houseHoldListLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        houseHoldTable = new javax.swing.JTable();
        searchLbl = new javax.swing.JLabel();
        searchTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        deleteHouseHoldBtn = new javax.swing.JButton();
        viewDetailsBtn = new javax.swing.JButton();
        houseHoldNameLbl = new javax.swing.JLabel();
        houseHoldNameTxt = new javax.swing.JTextField();
        addressLbl = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        addHouseHoldBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(740, 670));

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 102, 102));
        titleLbl.setText("House Hold Organization Admin - Manage House Hold");

        houseHoldListLbl.setForeground(new java.awt.Color(0, 102, 102));
        houseHoldListLbl.setText("House Hold List:");

        jScrollPane1.setForeground(new java.awt.Color(0, 102, 102));

        houseHoldTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "House Hold Id", "House Hold Name", "Head of The Family", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(houseHoldTable);
        if (houseHoldTable.getColumnModel().getColumnCount() > 0) {
            houseHoldTable.getColumnModel().getColumn(0).setResizable(false);
            houseHoldTable.getColumnModel().getColumn(1).setResizable(false);
            houseHoldTable.getColumnModel().getColumn(2).setResizable(false);
            houseHoldTable.getColumnModel().getColumn(3).setResizable(false);
        }

        searchLbl.setForeground(new java.awt.Color(0, 102, 102));
        searchLbl.setText("Enter House Hold Name to Search:");

        searchTxt.setForeground(new java.awt.Color(0, 102, 102));

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

        deleteHouseHoldBtn.setBackground(new java.awt.Color(153, 153, 153));
        deleteHouseHoldBtn.setForeground(new java.awt.Color(0, 102, 102));
        deleteHouseHoldBtn.setText("Delete House Hold");
        deleteHouseHoldBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteHouseHoldBtnActionPerformed(evt);
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

        houseHoldNameLbl.setForeground(new java.awt.Color(0, 102, 102));
        houseHoldNameLbl.setText("House Hold Name:");

        houseHoldNameTxt.setForeground(new java.awt.Color(0, 102, 102));

        addressLbl.setForeground(new java.awt.Color(0, 102, 102));
        addressLbl.setText("Address:");

        addressTxt.setForeground(new java.awt.Color(0, 102, 102));

        addHouseHoldBtn.setBackground(new java.awt.Color(153, 153, 153));
        addHouseHoldBtn.setForeground(new java.awt.Color(0, 102, 102));
        addHouseHoldBtn.setText("Add House Hold");
        addHouseHoldBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHouseHoldBtnActionPerformed(evt);
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
                .addGap(153, 153, 153)
                .addComponent(titleLbl)
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(houseHoldListLbl)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewDetailsBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteHouseHoldBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addressLbl)
                            .addComponent(houseHoldNameLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(houseHoldNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(addHouseHoldBtn)))
                .addGap(178, 178, 178))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(backBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(titleLbl)
                .addGap(79, 79, 79)
                .addComponent(houseHoldListLbl)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchLbl)
                    .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn)
                    .addComponent(clearBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteHouseHoldBtn)
                    .addComponent(viewDetailsBtn))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(houseHoldNameLbl)
                    .addComponent(houseHoldNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLbl)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addHouseHoldBtn)
                .addGap(126, 126, 126)
                .addComponent(backBtn)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        String searchInput = searchTxt.getText().trim();

        if (!searchInput.isEmpty()) {
            ArrayList<HouseHold> houseHolds = houseOrg.getHouseHoldDirectory().searchHouseHold(searchInput);

            if (houseHolds.size() > 0) {
                populateHouseHoldTable(houseHolds);
            }
            else {
                JOptionPane.showMessageDialog(null, "No such house hold exists!", "Error", JOptionPane.ERROR_MESSAGE);
                refresh(houseOrg.getHouseHoldDirectory().getHouseHoldDirectory());
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please enter House Hold Name to perform Search!", "Warning", JOptionPane.WARNING_MESSAGE);
            searchTxt.requestFocus();
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        refresh(houseOrg.getHouseHoldDirectory().getHouseHoldDirectory());
    }//GEN-LAST:event_clearBtnActionPerformed

    private void deleteHouseHoldBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteHouseHoldBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = houseHoldTable.getSelectedRow();

        if(selectedRow >= 0) {
            int confirmButton = JOptionPane.YES_NO_OPTION;

            int confirmDelete = JOptionPane.showConfirmDialog(null, "Would you like to delete selected house hold?", "Warning", confirmButton);

            if (confirmDelete == JOptionPane.YES_OPTION) {
                HouseHold house = (HouseHold) houseHoldTable.getValueAt(selectedRow, 1);
               
                if (house.getFamilyMembers().getPersonList().size() > 0) {
                    ArrayList<FamilyMember> members = (ArrayList) house.getFamilyMembers().getPersonList();
                    for (FamilyMember person : members) {
                        houseOrg.getPersonDirectory().removePerson(person);
                    }
                }
                
                houseOrg.getHouseHoldDirectory().removeHouseHold(house);
               
                refresh(houseOrg.getHouseHoldDirectory().getHouseHoldDirectory());
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete store!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deleteHouseHoldBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        houseHoldWorkAreaPanel.displayDetails();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void addHouseHoldBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHouseHoldBtnActionPerformed
        // TODO add your handling code here:
        if (validateInput()) {
            HouseHold house = houseOrg.getHouseHoldDirectory().createHouseHold();
            house.setHouseHoldName(houseHoldNameTxt.getText().trim());
            house.setAddress(addressTxt.getText().trim());
            
            JOptionPane.showMessageDialog(null, "House Hold created successfully!", "Information", JOptionPane.INFORMATION_MESSAGE);
            refresh(houseOrg.getHouseHoldDirectory().getHouseHoldDirectory());
        }
    }//GEN-LAST:event_addHouseHoldBtnActionPerformed

    private void viewDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = houseHoldTable.getSelectedRow();
        
        if (selectedRow >= 0) {
            HouseHold house = (HouseHold) houseHoldTable.getValueAt(selectedRow, 1);
            
            ViewHouseHoldDetailsJPanel viewHouseDetailsPanel = new ViewHouseHoldDetailsJPanel(userProcessContainer, system, houseOrg, house, this);
            userProcessContainer.add("viewHouseDetailsPanel", viewHouseDetailsPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row to view details!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_viewDetailsBtnActionPerformed

    public void refresh(ArrayList<HouseHold> houseHoldList) {
        houseHoldNameTxt.setText("");
        addressTxt.setText("");
        searchTxt.setText("");
        
        populateHouseHoldTable(houseHoldList);
    }
    
    public boolean validateInput() {
        String houseHoldName = houseHoldNameTxt.getText().trim();
        String address = addressTxt.getText().trim();
        
        if (houseHoldName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter House Hold Name!", "Error", JOptionPane.ERROR_MESSAGE);
            houseHoldNameTxt.requestFocus();
            return false;
        }
        else if (HelperMethods.isHouseNameExisting(houseHoldName, houseOrg.getHouseHoldDirectory())) {
            JOptionPane.showMessageDialog(null, "House hold with the same name already exists!", "Error", JOptionPane.ERROR_MESSAGE);
            houseHoldNameTxt.requestFocus();
            return false;
        }
        else if (address.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter House Hold Address!", "Error", JOptionPane.ERROR_MESSAGE);
            addressTxt.requestFocus();
            return false;
        }
        else {
            return true;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addHouseHoldBtn;
    private javax.swing.JLabel addressLbl;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton deleteHouseHoldBtn;
    private javax.swing.JLabel houseHoldListLbl;
    private javax.swing.JLabel houseHoldNameLbl;
    private javax.swing.JTextField houseHoldNameTxt;
    private javax.swing.JTable houseHoldTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel searchLbl;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JButton viewDetailsBtn;
    // End of variables declaration//GEN-END:variables
}
