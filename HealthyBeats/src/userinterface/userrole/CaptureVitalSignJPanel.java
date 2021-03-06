/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.userrole;

import business.HelperMethods;
import business.data.VitalSign;
import business.person.FamilyMember;
import business.sensor.Sensor;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author JAHNVI
 */
public class CaptureVitalSignJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private FamilyMember member;
    
    /**
     * Creates new form CaptureVitalSignJPanel
     */
    public CaptureVitalSignJPanel() {
        initComponents();
    }
    
    public CaptureVitalSignJPanel(JPanel userProcessContainer, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.member = (FamilyMember) this.userAccount.getPerson();
        welcomeNameLbl.setText(welcomeNameLbl.getText().replace("<Name>", member.getFirstName() + " " + member.getLastName()));
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
        welcomeNameLbl = new javax.swing.JLabel();
        welcomeLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        tempLbl = new javax.swing.JLabel();
        tempTxt = new javax.swing.JTextField();
        sysBpLbl = new javax.swing.JLabel();
        sysBptxt = new javax.swing.JTextField();
        diaBpLbl = new javax.swing.JLabel();
        diaBpTxt = new javax.swing.JTextField();
        respRateLbl = new javax.swing.JLabel();
        respRateTxt = new javax.swing.JTextField();
        pulseLbl = new javax.swing.JLabel();
        pulseTxt = new javax.swing.JTextField();
        sugarLbl = new javax.swing.JLabel();
        sugarTxt = new javax.swing.JTextField();
        cholesterolLbl = new javax.swing.JLabel();
        cholesterolTxt = new javax.swing.JTextField();
        bmiLbl = new javax.swing.JLabel();
        bmiTxt = new javax.swing.JTextField();
        captureVsBtn = new javax.swing.JButton();
        tempUnitLbl = new javax.swing.JLabel();
        sysBpUnitLbl = new javax.swing.JLabel();
        diaBpUnitLbl = new javax.swing.JLabel();
        sugarUnitLbl = new javax.swing.JLabel();
        pulseUnitLbl = new javax.swing.JLabel();
        respiRateUnitLbl = new javax.swing.JLabel();
        cholesterolUnitLbl = new javax.swing.JLabel();
        bmiUnitLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(204, 204, 204));

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 102, 102));
        titleLbl.setText("User - Capture Vital Sign");

        welcomeNameLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        welcomeNameLbl.setForeground(new java.awt.Color(0, 102, 102));
        welcomeNameLbl.setText("<Name>!");

        welcomeLbl.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        welcomeLbl.setForeground(new java.awt.Color(0, 102, 102));
        welcomeLbl.setText("Welcome,");

        backBtn.setBackground(new java.awt.Color(153, 153, 153));
        backBtn.setForeground(new java.awt.Color(0, 102, 102));
        backBtn.setText("<<  Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        tempLbl.setForeground(new java.awt.Color(0, 102, 102));
        tempLbl.setText("Temperature:");

        tempTxt.setForeground(new java.awt.Color(0, 102, 102));

        sysBpLbl.setForeground(new java.awt.Color(0, 102, 102));
        sysBpLbl.setText("Systolic Blood Pressure:");

        sysBptxt.setForeground(new java.awt.Color(0, 102, 102));

        diaBpLbl.setForeground(new java.awt.Color(0, 102, 102));
        diaBpLbl.setText("Diastolic Blood Pressure:");

        diaBpTxt.setForeground(new java.awt.Color(0, 102, 102));

        respRateLbl.setForeground(new java.awt.Color(0, 102, 102));
        respRateLbl.setText("Respiratory Rate:");

        respRateTxt.setForeground(new java.awt.Color(0, 102, 102));

        pulseLbl.setForeground(new java.awt.Color(0, 102, 102));
        pulseLbl.setText("Pulse:");

        pulseTxt.setForeground(new java.awt.Color(0, 102, 102));

        sugarLbl.setForeground(new java.awt.Color(0, 102, 102));
        sugarLbl.setText("Blood Sugar:");

        sugarTxt.setForeground(new java.awt.Color(0, 102, 102));

        cholesterolLbl.setForeground(new java.awt.Color(0, 102, 102));
        cholesterolLbl.setText("Cholesterol:");

        cholesterolTxt.setForeground(new java.awt.Color(0, 102, 102));

        bmiLbl.setForeground(new java.awt.Color(0, 102, 102));
        bmiLbl.setText("Bmi:");

        bmiTxt.setForeground(new java.awt.Color(0, 102, 102));

        captureVsBtn.setBackground(new java.awt.Color(153, 153, 153));
        captureVsBtn.setForeground(new java.awt.Color(0, 102, 102));
        captureVsBtn.setText("Capture Vital Sign");
        captureVsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                captureVsBtnActionPerformed(evt);
            }
        });

        tempUnitLbl.setForeground(new java.awt.Color(0, 102, 102));
        tempUnitLbl.setText("C");

        sysBpUnitLbl.setForeground(new java.awt.Color(0, 102, 102));
        sysBpUnitLbl.setText("mm Hg");

        diaBpUnitLbl.setForeground(new java.awt.Color(0, 102, 102));
        diaBpUnitLbl.setText("mm Hg");

        sugarUnitLbl.setForeground(new java.awt.Color(0, 102, 102));
        sugarUnitLbl.setText("mg/dL");

        pulseUnitLbl.setForeground(new java.awt.Color(0, 102, 102));
        pulseUnitLbl.setText("HR");

        respiRateUnitLbl.setForeground(new java.awt.Color(0, 102, 102));
        respiRateUnitLbl.setText("breaths/minute");

        cholesterolUnitLbl.setForeground(new java.awt.Color(0, 102, 102));
        cholesterolUnitLbl.setText("mg/dL");

        bmiUnitLbl.setForeground(new java.awt.Color(0, 102, 102));
        bmiUnitLbl.setText("kg/m2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(welcomeLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(welcomeNameLbl)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(captureVsBtn)
                        .addGap(129, 129, 129))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(titleLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sysBpLbl)
                            .addComponent(tempLbl)
                            .addComponent(diaBpLbl)
                            .addComponent(respRateLbl)
                            .addComponent(pulseLbl)
                            .addComponent(sugarLbl)
                            .addComponent(cholesterolLbl)
                            .addComponent(bmiLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tempTxt)
                            .addComponent(sysBptxt)
                            .addComponent(diaBpTxt)
                            .addComponent(respRateTxt)
                            .addComponent(pulseTxt)
                            .addComponent(sugarTxt)
                            .addComponent(cholesterolTxt)
                            .addComponent(bmiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tempUnitLbl)
                            .addComponent(sysBpUnitLbl)
                            .addComponent(diaBpUnitLbl)
                            .addComponent(sugarUnitLbl)
                            .addComponent(pulseUnitLbl)
                            .addComponent(respiRateUnitLbl)
                            .addComponent(cholesterolUnitLbl)
                            .addComponent(bmiUnitLbl))))
                .addGap(188, 188, 188))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(titleLbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcomeLbl)
                    .addComponent(welcomeNameLbl))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempLbl)
                    .addComponent(tempTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempUnitLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sysBpLbl)
                    .addComponent(sysBptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sysBpUnitLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaBpLbl)
                    .addComponent(diaBpTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaBpUnitLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(respRateLbl)
                    .addComponent(respRateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(respiRateUnitLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pulseLbl)
                    .addComponent(pulseTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pulseUnitLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sugarLbl)
                    .addComponent(sugarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sugarUnitLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cholesterolLbl)
                    .addComponent(cholesterolTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cholesterolUnitLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bmiLbl)
                    .addComponent(bmiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bmiUnitLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(captureVsBtn)
                .addGap(41, 41, 41)
                .addComponent(backBtn)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void captureVsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_captureVsBtnActionPerformed
        // TODO add your handling code here:
        if (validateInput()) {
            float temp = Float.parseFloat(tempTxt.getText().trim());
            int sysBp = Integer.parseInt(sysBptxt.getText().trim());
            int diaBp = Integer.parseInt(diaBpTxt.getText().trim());
            int respRate = Integer.parseInt(respRateTxt.getText().trim());
            int pulse = Integer.parseInt(pulseTxt.getText().trim());
            float sugar = Float.parseFloat(sugarTxt.getText().trim());
            float cholesterol = Float.parseFloat(cholesterolTxt.getText().trim());
            float bmi = Float.parseFloat(bmiTxt.getText().trim());
            
            VitalSign vitalSign = member.getVitalSignHistory().addVitalSign();
            
            vitalSign.setTemperature(temp);
            vitalSign.setIsTempNormal(HelperMethods.checkIfTempNormal(temp));
            
            vitalSign.setSystolicBp(sysBp);
            vitalSign.setDiastolicBp(diaBp);
            vitalSign.setIsBpNormal(HelperMethods.checkIfBpNormal(member.getAge(), sysBp, diaBp));
            
            vitalSign.setRespiratoryRate(respRate);
            vitalSign.setIsRespiRateNormal(HelperMethods.checkIfRespiRateNormal(member.getAge(), respRate));
            
            vitalSign.setPulse(pulse);
            vitalSign.setIsPulseNormal(HelperMethods.checkIfPulseNormal(member.getAge(), pulse));
            
            vitalSign.setBloodSugar(sugar);
            vitalSign.setIsBloodSugarNormal(HelperMethods.checkIfSugarNormal(sugar));
            
            vitalSign.setCholesterol(cholesterol);
            vitalSign.setIsCholesterolNormal(HelperMethods.checkIfCholesterolNormal(cholesterol));
            
            vitalSign.setBmi(bmi);
            vitalSign.setIsBmiNormal(HelperMethods.checkIfBmiNormal(bmi));
            
            vitalSign.setTimestamp(HelperMethods.getTimeStamp());
            
            if (vitalSign.isIsTempNormal() && vitalSign.isIsBpNormal() && vitalSign.isIsRespiRateNormal() && vitalSign.isIsPulseNormal() && vitalSign.isIsBloodSugarNormal() && vitalSign.isIsBmiNormal() && vitalSign.isIsCholesterolNormal()) {
                vitalSign.setIsVitalSignNormal(true);
            }
            else {
                vitalSign.setIsVitalSignNormal(false);
            }
            
            for (Sensor s : member.getSensorDirectory().getSensorList()) {
                if (s.getType() == Sensor.SensorType.VitalSign) {
                    vitalSign.setSensorName(s.getSensorName());
                }
            }
            
            JOptionPane.showMessageDialog(null, "Vital Sign captured successfully!", "Information", JOptionPane.INFORMATION_MESSAGE);
            clearFields();
        }
    }//GEN-LAST:event_captureVsBtnActionPerformed

    public boolean validateInput() {
        if (tempTxt.getText().trim().isEmpty() || !(tempTxt.getText().trim().matches("^[0-9]+") || tempTxt.getText().trim().matches("^[0-9]*\\.[0-9]*$"))) {
            JOptionPane.showMessageDialog(null, "Please enter valid value for Temperature!", "Error", JOptionPane.ERROR_MESSAGE);
            tempTxt.requestFocus();
            return false;
        }
        else if (sysBptxt.getText().trim().isEmpty() || !sysBptxt.getText().trim().matches("^[0-9]+")) {
            JOptionPane.showMessageDialog(null, "Please enter integer value for Systolic Blood Pressure!", "Error", JOptionPane.ERROR_MESSAGE);
            sysBptxt.requestFocus();
            return false;
        }
        else if (diaBpTxt.getText().trim().isEmpty() || !diaBpTxt.getText().trim().matches("^[0-9]+")) {
            JOptionPane.showMessageDialog(null, "Please enter integer value for Diastolic Blood Pressure!", "Error", JOptionPane.ERROR_MESSAGE);
            diaBpTxt.requestFocus();
            return false;
        }
        else if (respRateTxt.getText().trim().isEmpty() || !respRateTxt.getText().trim().matches("^[0-9]+")) {
            JOptionPane.showMessageDialog(null, "Please enter integer value for Respiratory Rate!", "Error", JOptionPane.ERROR_MESSAGE);
            respRateTxt.requestFocus();
            return false;
        }
        else if (pulseTxt.getText().trim().isEmpty() || !pulseTxt.getText().trim().matches("^[0-9]+")) {
            JOptionPane.showMessageDialog(null, "Please enter integer value for Pulse!", "Error", JOptionPane.ERROR_MESSAGE);
            pulseTxt.requestFocus();
            return false;
        }
        else if (sugarTxt.getText().trim().isEmpty() || !sugarTxt.getText().trim().matches("^[0-9]+")) {
            JOptionPane.showMessageDialog(null, "Please enter integer value for Blood Sugar!", "Error", JOptionPane.ERROR_MESSAGE);
            sugarTxt.requestFocus();
            return false;
        }
        else if (cholesterolTxt.getText().trim().isEmpty() || !(cholesterolTxt.getText().trim().matches("^[0-9]+") || cholesterolTxt.getText().trim().matches("^[0-9]*\\.[0-9]*$"))) {
            JOptionPane.showMessageDialog(null, "Please enter valid value for Cholesterol!", "Error", JOptionPane.ERROR_MESSAGE);
            cholesterolTxt.requestFocus();
            return false;
        }
        else if (bmiTxt.getText().trim().isEmpty() || !(bmiTxt.getText().trim().matches("^[0-9]+") || bmiTxt.getText().trim().matches("^[0-9]*\\.[0-9]*$"))) {
            JOptionPane.showMessageDialog(null, "Please enter valid value for BMI!", "Error", JOptionPane.ERROR_MESSAGE);
            bmiTxt.requestFocus();
            return false;
        }
        else {
            return true;
        }
    }
    
    public void clearFields() {
        tempTxt.setText("");
        sysBptxt.setText("");
        diaBpTxt.setText("");
        respRateTxt.setText("");
        pulseTxt.setText("");
        sugarTxt.setText("");
        cholesterolTxt.setText("");
        bmiTxt.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel bmiLbl;
    private javax.swing.JTextField bmiTxt;
    private javax.swing.JLabel bmiUnitLbl;
    private javax.swing.JButton captureVsBtn;
    private javax.swing.JLabel cholesterolLbl;
    private javax.swing.JTextField cholesterolTxt;
    private javax.swing.JLabel cholesterolUnitLbl;
    private javax.swing.JLabel diaBpLbl;
    private javax.swing.JTextField diaBpTxt;
    private javax.swing.JLabel diaBpUnitLbl;
    private javax.swing.JLabel pulseLbl;
    private javax.swing.JTextField pulseTxt;
    private javax.swing.JLabel pulseUnitLbl;
    private javax.swing.JLabel respRateLbl;
    private javax.swing.JTextField respRateTxt;
    private javax.swing.JLabel respiRateUnitLbl;
    private javax.swing.JLabel sugarLbl;
    private javax.swing.JTextField sugarTxt;
    private javax.swing.JLabel sugarUnitLbl;
    private javax.swing.JLabel sysBpLbl;
    private javax.swing.JLabel sysBpUnitLbl;
    private javax.swing.JTextField sysBptxt;
    private javax.swing.JLabel tempLbl;
    private javax.swing.JTextField tempTxt;
    private javax.swing.JLabel tempUnitLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel welcomeLbl;
    private javax.swing.JLabel welcomeNameLbl;
    // End of variables declaration//GEN-END:variables
}
