/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.systemadminrole;

import business.EcoSystem;
import business.HelperMethods;
import business.network.Network;
import business.organization.AdminOrganization;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JAHNVI
 */
public class ManageNetworkJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private SystemAdminWorkAreaJPanel sysAdminWorkAreaPanel;
    
    /**
     * Creates new form ManageNetworkJPanel
     */
    public ManageNetworkJPanel() {
        initComponents();
    }

    public ManageNetworkJPanel(JPanel userProcessContaier, EcoSystem system, SystemAdminWorkAreaJPanel sysAdminWorkAreaPanel) {
        initComponents();
        this.userProcessContainer = userProcessContaier;
        this.system = system;
        this.sysAdminWorkAreaPanel = sysAdminWorkAreaPanel;
        populateNetworkTable(system.getNetworkList().getNetworkList());
    }
    
    public void populateNetworkTable(ArrayList<Network> networkList) {
        DefaultTableModel dtm = (DefaultTableModel) networkTable.getModel();
        dtm.setRowCount(0);
        
        for (Network network : networkList) {
            Object row[] = new Object[2];
            row[0] = network.getOrganizationId();
            row[1] = network;
            
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
        jScrollPane1 = new javax.swing.JScrollPane();
        networkTable = new javax.swing.JTable();
        networkLbl = new javax.swing.JLabel();
        deleteNetowrkBtn = new javax.swing.JButton();
        searchLbl = new javax.swing.JLabel();
        searchTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        networkNameLbl = new javax.swing.JLabel();
        networkNameTxt = new javax.swing.JTextField();
        addNetworkBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(740, 670));

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 102, 102));
        titleLbl.setText("System Admin - Manage Netowrks");

        networkTable.setForeground(new java.awt.Color(0, 102, 102));
        networkTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Network Id", "Network Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(networkTable);
        if (networkTable.getColumnModel().getColumnCount() > 0) {
            networkTable.getColumnModel().getColumn(0).setResizable(false);
            networkTable.getColumnModel().getColumn(1).setResizable(false);
        }

        networkLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        networkLbl.setForeground(new java.awt.Color(0, 102, 102));
        networkLbl.setText("Networks:");

        deleteNetowrkBtn.setBackground(new java.awt.Color(153, 153, 153));
        deleteNetowrkBtn.setForeground(new java.awt.Color(0, 102, 102));
        deleteNetowrkBtn.setText("Delete Network");
        deleteNetowrkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteNetowrkBtnActionPerformed(evt);
            }
        });

        searchLbl.setForeground(new java.awt.Color(0, 102, 102));
        searchLbl.setText("Enter Network Name To Search:");

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

        networkNameLbl.setForeground(new java.awt.Color(0, 102, 102));
        networkNameLbl.setText("Network Name:");

        addNetworkBtn.setBackground(new java.awt.Color(153, 153, 153));
        addNetworkBtn.setForeground(new java.awt.Color(0, 102, 102));
        addNetworkBtn.setText("Add Network");
        addNetworkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNetworkBtnActionPerformed(evt);
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
                        .addGap(165, 165, 165)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(networkLbl)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(deleteNetowrkBtn)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(searchLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(searchBtn)
                                        .addGap(10, 10, 10)
                                        .addComponent(clearBtn))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(backBtn)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(addNetworkBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(networkNameLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(networkNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(213, 213, 213))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titleLbl)
                        .addGap(216, 216, 216))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(titleLbl)
                .addGap(90, 90, 90)
                .addComponent(networkLbl)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchLbl)
                    .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn)
                    .addComponent(clearBtn))
                .addGap(18, 18, 18)
                .addComponent(deleteNetowrkBtn)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(networkNameLbl)
                    .addComponent(networkNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addNetworkBtn)
                .addGap(94, 94, 94)
                .addComponent(backBtn)
                .addContainerGap(84, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addNetworkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNetworkBtnActionPerformed
        // TODO add your handling code here:
        if(validateInput()) {
            Network newNetwork = system.getNetworkList().addNetwork(networkNameTxt.getText().trim());
            
            if (newNetwork != null) {
                JOptionPane.showMessageDialog(null, "Network added successfully!", "Information", JOptionPane.INFORMATION_MESSAGE);
                refresh(system.getNetworkList().getNetworkList());
            }
        }
    }//GEN-LAST:event_addNetworkBtnActionPerformed

    private void deleteNetowrkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteNetowrkBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = networkTable.getSelectedRow();
        
        if (selectedRow >= 0) {
            int confirmButton = JOptionPane.YES_NO_OPTION;
            
            int confirmDelete = JOptionPane.showConfirmDialog(null, "Would you like to delete selected network?", "Warning", confirmButton);
            
            if (confirmDelete == JOptionPane.YES_OPTION) {
                Network netowrk = (Network) networkTable.getValueAt(selectedRow, 1);
                system.getNetworkList().deleteNetwork(netowrk);
                
                populateNetworkTable(system.getNetworkList().getNetworkList());
            }           
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete network!", "Warning", JOptionPane.WARNING_MESSAGE);            
        }
    }//GEN-LAST:event_deleteNetowrkBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        String searchInput = searchTxt.getText().trim();
        
        if (!searchInput.isEmpty()) {
            ArrayList<Network> networks = system.getNetworkList().searchNetwork(searchInput);
            
            if (networks.size() > 0) {
                populateNetworkTable(networks);
            } 
            else {
                JOptionPane.showMessageDialog(null, "No such network exists!", "Error", JOptionPane.ERROR_MESSAGE);
                refresh(system.getNetworkList().getNetworkList());
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please enter Network Name to perform Search!", "Warning", JOptionPane.WARNING_MESSAGE);
            searchTxt.requestFocus();
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        refresh(system.getNetworkList().getNetworkList());
    }//GEN-LAST:event_clearBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        sysAdminWorkAreaPanel.displayDetails();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    public boolean validateInput() {
        if(networkNameTxt.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter valid Network Name!", "Error", JOptionPane.ERROR_MESSAGE);
            networkNameTxt.requestFocus();
            return false;
        }
        else if (HelperMethods.isNetworkExisting(networkNameTxt.getText().trim(), system.getNetworkList())) {
            JOptionPane.showMessageDialog(null, "Network with the same Name already exists!", "Error", JOptionPane.ERROR_MESSAGE);
            networkNameTxt.requestFocus();
            return false;
        }
        else {
            return true;
        }
    }
    
    public void refresh(ArrayList<Network> networkList) {
        searchTxt.setText("");
        networkNameTxt.setText("");
        populateNetworkTable(networkList);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNetworkBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton deleteNetowrkBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel networkLbl;
    private javax.swing.JLabel networkNameLbl;
    private javax.swing.JTextField networkNameTxt;
    private javax.swing.JTable networkTable;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel searchLbl;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
