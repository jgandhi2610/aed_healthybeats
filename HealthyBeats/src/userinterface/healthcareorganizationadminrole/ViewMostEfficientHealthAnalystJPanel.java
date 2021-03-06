/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.healthcareorganizationadminrole;

import business.HelperMethods;
import business.organization.HealthCareOrganization;
import business.organization.Organization;
import business.person.Person;
import business.role.HealthAnalystRole;
import business.useraccount.UserAccount;
import business.workqueue.HealthCheckRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JAHNVI
 */
public class ViewMostEfficientHealthAnalystJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private HealthCareOrganization healthOrg;
    private UserAccount userAccount;
    private UserAccount mostEfficientAnalyst;
    
    /**
     * Creates new form ViewMostEfficientHealthAnalystJPanel
     */
    
    public ViewMostEfficientHealthAnalystJPanel() {
        initComponents();
    }

    public ViewMostEfficientHealthAnalystJPanel(JPanel userProcessContainer, Organization organization, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.userAccount = userAccount;
        this.healthOrg = (HealthCareOrganization) this.organization;
        
        displayDetails();
    }
    
    public void displayDetails() {
        welcomeMsgLbl.setText(welcomeMsgLbl.getText().replace("<Name>", userAccount.getPerson().getFirstName() + " " + userAccount.getPerson().getLastName()));
        
        findMostEfficientAnalyst();
        
        if (mostEfficientAnalyst != null) {
            analystName.setText(mostEfficientAnalyst.getPerson().getFirstName() + " " + mostEfficientAnalyst.getPerson().getLastName());
            
            ArrayList<HealthCheckRequest> completedRequests = (ArrayList) mostEfficientAnalyst.getWorkQueue().getCompletedRequests();
            
            noOfRequests.setText(String.valueOf(completedRequests.size()));
            
            populateCompletedRequest(completedRequests);
        }
        
    }
    
    public void findMostEfficientAnalyst() {
        int noOfRequestsHandled = 0;
        int oldNoOfRequestsHandled = 0;
        
        for (UserAccount ua : healthOrg.getUserAccountDirectory().getUserAccountDirectory()) {
            if (ua.getRole() instanceof HealthAnalystRole) {
                noOfRequestsHandled = ua.getWorkQueue().getCompletedRequests().size();
            }
            
            if (noOfRequestsHandled > oldNoOfRequestsHandled) {
                mostEfficientAnalyst = ua;
            }
            
            oldNoOfRequestsHandled = noOfRequestsHandled;
        }
    }

    public void populateCompletedRequest(ArrayList<HealthCheckRequest> requests) {
        DefaultTableModel dtm = (DefaultTableModel) completedRequestTable.getModel();
        dtm.setRowCount(0);
        
        for (HealthCheckRequest request : requests) {
            Object row[] = new Object[5];
            row[0] = HelperMethods.getFormattedDate(request.getRequestDate());
            row[1] = request;
            row[2] = request.getSender().getPerson().getFirstName() + " " + request.getSender().getPerson().getLastName();
            row[3] = HelperMethods.getFormattedDate(request.getResponseDate());
            row[4] = request.getResult();
            
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
        welcomeMsgLbl = new javax.swing.JLabel();
        analystNameLbl = new javax.swing.JLabel();
        analystName = new javax.swing.JLabel();
        noReqLbl = new javax.swing.JLabel();
        noOfRequests = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        completedRequestTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(740, 670));

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 102, 102));
        titleLbl.setText("Health Care Organization Admin - View Most Efficient Analyst");

        welcomeMsgLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        welcomeMsgLbl.setForeground(new java.awt.Color(0, 102, 102));
        welcomeMsgLbl.setText("Welcome, <Name>!");

        analystNameLbl.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        analystNameLbl.setForeground(new java.awt.Color(0, 102, 102));
        analystNameLbl.setText("Analyst Name:");

        analystName.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        analystName.setForeground(new java.awt.Color(0, 102, 102));
        analystName.setText("<Name>");
        analystName.setEnabled(false);

        noReqLbl.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        noReqLbl.setForeground(new java.awt.Color(0, 102, 102));
        noReqLbl.setText("No of. Requests responded:");

        noOfRequests.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        noOfRequests.setForeground(new java.awt.Color(0, 102, 102));
        noOfRequests.setText("<No of Requests>");
        noOfRequests.setEnabled(false);

        jScrollPane1.setForeground(new java.awt.Color(0, 102, 102));

        completedRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request Date", "Message", "Sender", "Response Date", "Result"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(completedRequestTable);

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
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(noReqLbl)
                            .addComponent(analystNameLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(analystName)
                            .addComponent(noOfRequests)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(backBtn)))
                .addGap(161, 314, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(titleLbl)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(welcomeMsgLbl)
                                .addGap(17, 17, 17)))
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(titleLbl)
                .addGap(29, 29, 29)
                .addComponent(welcomeMsgLbl)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(analystNameLbl)
                    .addComponent(analystName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noReqLbl)
                    .addComponent(noOfRequests))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addComponent(backBtn)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel analystName;
    private javax.swing.JLabel analystNameLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JTable completedRequestTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel noOfRequests;
    private javax.swing.JLabel noReqLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel welcomeMsgLbl;
    // End of variables declaration//GEN-END:variables
}
