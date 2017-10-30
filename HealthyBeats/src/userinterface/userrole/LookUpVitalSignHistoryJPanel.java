/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.userrole;

import business.HelperMethods;
import business.data.VitalSign;
import business.person.FamilyMember;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JAHNVI
 */
public class LookUpVitalSignHistoryJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private FamilyMember member;
    /**
     * Creates new form LookUpVitalSignHistoryJPanel
     */
    public LookUpVitalSignHistoryJPanel() {
        initComponents();
    }

    public LookUpVitalSignHistoryJPanel(JPanel userProcessContainer, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.member = (FamilyMember) userAccount.getPerson();
        welcomeNameLbl.setText(welcomeNameLbl.getText().replace("<Name>", userAccount.getPerson().getFirstName() + " " + userAccount.getPerson().getLastName()));
        bindDateCombo();
    }
    
    public void populateVitalSignTable(String date) {
        DefaultTableModel dtm = (DefaultTableModel) vitalSignsTable.getModel();
        dtm.setRowCount(0);
        
        for (VitalSign vs : member.getVitalSignHistory().getVitalSignsForDate(date)) {
            Object row[] = new Object[10];
            row[0] = vs;
            row[1] = vs.getTemperature();
            row[2] = vs.getSystolicBp();
            row[3] = vs.getDiastolicBp();
            row[4] = vs.getPulse();
            row[5] = vs.getRespiratoryRate();
            row[6] = vs.getCholesterol();
            row[7] = vs.getBloodSugar();
            row[8] = vs.getBmi();
            row[9] = vs.getSensorName();
            
            dtm.addRow(row);
        }
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLbl = new javax.swing.JLabel();
        dateLbl = new javax.swing.JLabel();
        dateCombo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        vitalSignsTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        welcomeNameLbl = new javax.swing.JLabel();
        welcomeLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 102, 102));
        titleLbl.setText("User - Look Up Vital Sign History");

        dateLbl.setForeground(new java.awt.Color(0, 102, 102));
        dateLbl.setText("Date:");

        dateCombo.setForeground(new java.awt.Color(0, 102, 102));
        dateCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        dateCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateComboActionPerformed(evt);
            }
        });

        jScrollPane1.setForeground(new java.awt.Color(0, 102, 102));

        vitalSignsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Time", "Temp.", "Sys. BP", "Dia. BP", "Pulse", "Resp. Rate", "Cholesterol", "BloodSugar", "BMI", "Sensor Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
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
            vitalSignsTable.getColumnModel().getColumn(7).setResizable(false);
            vitalSignsTable.getColumnModel().getColumn(8).setResizable(false);
            vitalSignsTable.getColumnModel().getColumn(9).setResizable(false);
        }

        backBtn.setBackground(new java.awt.Color(153, 153, 153));
        backBtn.setForeground(new java.awt.Color(0, 102, 102));
        backBtn.setText("<<  Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        welcomeNameLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        welcomeNameLbl.setForeground(new java.awt.Color(0, 102, 102));
        welcomeNameLbl.setText("<Name>!");

        welcomeLbl.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        welcomeLbl.setForeground(new java.awt.Color(0, 102, 102));
        welcomeLbl.setText("Welcome,");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(dateLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(titleLbl)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(welcomeLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcomeNameLbl)
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titleLbl)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcomeLbl)
                    .addComponent(welcomeNameLbl))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLbl)
                    .addComponent(dateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139)
                .addComponent(backBtn)
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dateComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateComboActionPerformed
        // TODO add your handling code here:
        String date = (String) dateCombo.getSelectedItem();
        
        if (date != null) {
            populateVitalSignTable(date);
        }
    }//GEN-LAST:event_dateComboActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox dateCombo;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JTable vitalSignsTable;
    private javax.swing.JLabel welcomeLbl;
    private javax.swing.JLabel welcomeNameLbl;
    // End of variables declaration//GEN-END:variables
}