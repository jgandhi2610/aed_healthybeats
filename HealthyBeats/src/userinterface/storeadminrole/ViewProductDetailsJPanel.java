/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.storeadminrole;

import business.store.Product;
import business.store.Store;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author JAHNVI
 */
public class ViewProductDetailsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Store store;
    private Product product;
    private ManageProductCatalogJPanel manageProdPanel;
    
    /**
     * Creates new form ViewProductDetailsJPanel
     */
    public ViewProductDetailsJPanel() {
        initComponents();
    }

    public ViewProductDetailsJPanel(JPanel userProcessContainer, Store store, Product product, ManageProductCatalogJPanel manageProdPanel) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.store = store;
        this.product = product;
        this.manageProdPanel = manageProdPanel;
        displayDetails();
    }

    public void displayDetails () {
        storeNameDisplayLbl.setText(store.getStoreName());
        barcodeTxt.setText(String.valueOf(product.getBarcodeNumber()));
        prodNameTxt.setText(product.getProductName());
        weightTxt.setText(String.valueOf(product.getWeight()));
        qtyTxt.setText(String.valueOf(product.getQuantity()));
        priceTxt.setText(String.valueOf(product.getPrice()));
        
        energyTxt.setText(String.valueOf(product.getEnergy()));
        fatTxt.setText(String.valueOf(product.getFat()));
        carboTxt.setText(String.valueOf(product.getCarbohydrates()));
        protienTxt.setText(String.valueOf(product.getProtien()));
        iodineTxt.setText(String.valueOf(product.getIodine()));
        saltTxt.setText(String.valueOf(product.getSalt()));
        sugarTxt.setText(String.valueOf(product.getSugar()));
        fibersTxt.setText(String.valueOf(product.getFibers()));
        vitATxt.setText(String.valueOf(product.getVitaminA()));
        vitB12Txt.setText(String.valueOf(product.getVitaminB12()));
        vitCTxt.setText(String.valueOf(product.getVitaminC()));
        vitDTxt.setText(String.valueOf(product.getVitaminD()));
        vitETxt.setText(String.valueOf(product.getVitaminE()));
        vitKTxt.setText(String.valueOf(product.getVitaminK()));
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iodineTxt = new javax.swing.JTextField();
        saltLbl = new javax.swing.JLabel();
        saltTxt = new javax.swing.JTextField();
        sugarLbl = new javax.swing.JLabel();
        sugarTxt = new javax.swing.JTextField();
        fibersLbl = new javax.swing.JLabel();
        fibersTxt = new javax.swing.JTextField();
        vitALbl = new javax.swing.JLabel();
        vitATxt = new javax.swing.JTextField();
        vitB12Lbl = new javax.swing.JLabel();
        qtyTxt = new javax.swing.JTextField();
        vitB12Txt = new javax.swing.JTextField();
        priceLbl = new javax.swing.JLabel();
        vitCLbl = new javax.swing.JLabel();
        priceTxt = new javax.swing.JTextField();
        vitCTxt = new javax.swing.JTextField();
        energyLbl = new javax.swing.JLabel();
        vitDLbl = new javax.swing.JLabel();
        energyTxt = new javax.swing.JTextField();
        vitDTxt = new javax.swing.JTextField();
        carboLbl = new javax.swing.JLabel();
        vitELbl = new javax.swing.JLabel();
        carboTxt = new javax.swing.JTextField();
        vitETxt = new javax.swing.JTextField();
        protienLbl = new javax.swing.JLabel();
        vitKLbl = new javax.swing.JLabel();
        protienTxt = new javax.swing.JTextField();
        fatLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        storeNameLbl = new javax.swing.JLabel();
        storeNameDisplayLbl = new javax.swing.JLabel();
        prodNameLbl = new javax.swing.JLabel();
        prodNameTxt = new javax.swing.JTextField();
        weightLbl = new javax.swing.JLabel();
        weightTxt = new javax.swing.JTextField();
        qtyLbl = new javax.swing.JLabel();
        vitKTxt = new javax.swing.JTextField();
        fatTxt = new javax.swing.JTextField();
        iodineLbl = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        barcodeLbl = new javax.swing.JLabel();
        barcodeTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 204));

        iodineTxt.setForeground(new java.awt.Color(0, 102, 102));
        iodineTxt.setEnabled(false);

        saltLbl.setForeground(new java.awt.Color(0, 102, 102));
        saltLbl.setText("Salt:");

        saltTxt.setForeground(new java.awt.Color(0, 102, 102));
        saltTxt.setEnabled(false);

        sugarLbl.setForeground(new java.awt.Color(0, 102, 102));
        sugarLbl.setText("Sugar:");

        sugarTxt.setForeground(new java.awt.Color(0, 102, 102));
        sugarTxt.setEnabled(false);

        fibersLbl.setForeground(new java.awt.Color(0, 102, 102));
        fibersLbl.setText("Fibers:");

        fibersTxt.setForeground(new java.awt.Color(0, 102, 102));
        fibersTxt.setEnabled(false);

        vitALbl.setForeground(new java.awt.Color(0, 102, 102));
        vitALbl.setText("Vitamin A:");

        vitATxt.setForeground(new java.awt.Color(0, 102, 102));
        vitATxt.setEnabled(false);

        vitB12Lbl.setForeground(new java.awt.Color(0, 102, 102));
        vitB12Lbl.setText("Vitamin B12:");

        qtyTxt.setForeground(new java.awt.Color(0, 102, 102));
        qtyTxt.setEnabled(false);

        vitB12Txt.setForeground(new java.awt.Color(0, 102, 102));
        vitB12Txt.setEnabled(false);

        priceLbl.setForeground(new java.awt.Color(0, 102, 102));
        priceLbl.setText("Price:");

        vitCLbl.setForeground(new java.awt.Color(0, 102, 102));
        vitCLbl.setText("Vitamin C:");

        priceTxt.setForeground(new java.awt.Color(0, 102, 102));
        priceTxt.setEnabled(false);

        vitCTxt.setForeground(new java.awt.Color(0, 102, 102));
        vitCTxt.setEnabled(false);

        energyLbl.setForeground(new java.awt.Color(0, 102, 102));
        energyLbl.setText("Energy:");

        vitDLbl.setForeground(new java.awt.Color(0, 102, 102));
        vitDLbl.setText("Vitamin D:");

        energyTxt.setForeground(new java.awt.Color(0, 102, 102));
        energyTxt.setEnabled(false);

        vitDTxt.setForeground(new java.awt.Color(0, 102, 102));
        vitDTxt.setEnabled(false);

        carboLbl.setForeground(new java.awt.Color(0, 102, 102));
        carboLbl.setText("Carbohydrates:");

        vitELbl.setForeground(new java.awt.Color(0, 102, 102));
        vitELbl.setText("Vitamin E:");

        carboTxt.setForeground(new java.awt.Color(0, 102, 102));
        carboTxt.setEnabled(false);

        vitETxt.setForeground(new java.awt.Color(0, 102, 102));
        vitETxt.setEnabled(false);

        protienLbl.setForeground(new java.awt.Color(0, 102, 102));
        protienLbl.setText("Protien:");

        vitKLbl.setForeground(new java.awt.Color(0, 102, 102));
        vitKLbl.setText("Vitamin K:");

        protienTxt.setForeground(new java.awt.Color(0, 102, 102));
        protienTxt.setEnabled(false);

        fatLbl.setForeground(new java.awt.Color(0, 102, 102));
        fatLbl.setText("Fat:");

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 102, 102));
        titleLbl.setText("Store Admin - View Product Details");

        storeNameLbl.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        storeNameLbl.setForeground(new java.awt.Color(0, 102, 102));
        storeNameLbl.setText("Store Name:");

        storeNameDisplayLbl.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        storeNameDisplayLbl.setForeground(new java.awt.Color(0, 102, 102));
        storeNameDisplayLbl.setText("<Store Name>");

        prodNameLbl.setForeground(new java.awt.Color(0, 102, 102));
        prodNameLbl.setText("Product Name:");

        prodNameTxt.setForeground(new java.awt.Color(0, 102, 102));
        prodNameTxt.setEnabled(false);

        weightLbl.setForeground(new java.awt.Color(0, 102, 102));
        weightLbl.setText("Weight:");

        weightTxt.setForeground(new java.awt.Color(0, 102, 102));
        weightTxt.setEnabled(false);

        qtyLbl.setForeground(new java.awt.Color(0, 102, 102));
        qtyLbl.setText("Quantity:");

        vitKTxt.setForeground(new java.awt.Color(0, 102, 102));
        vitKTxt.setEnabled(false);

        fatTxt.setForeground(new java.awt.Color(0, 102, 102));
        fatTxt.setEnabled(false);

        iodineLbl.setForeground(new java.awt.Color(0, 102, 102));
        iodineLbl.setText("Iodine:");

        saveBtn.setBackground(new java.awt.Color(153, 153, 153));
        saveBtn.setForeground(new java.awt.Color(0, 102, 102));
        saveBtn.setText("Save");
        saveBtn.setEnabled(false);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(153, 153, 153));
        updateBtn.setForeground(new java.awt.Color(0, 102, 102));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
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

        barcodeLbl.setForeground(new java.awt.Color(0, 102, 102));
        barcodeLbl.setText("Barcode Numbe:");

        barcodeTxt.setForeground(new java.awt.Color(0, 102, 102));
        barcodeTxt.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLbl)
                .addGap(157, 157, 157))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(energyLbl)
                            .addComponent(protienLbl)
                            .addComponent(iodineLbl)
                            .addComponent(sugarLbl)
                            .addComponent(vitALbl)
                            .addComponent(vitCLbl)
                            .addComponent(vitELbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(vitETxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vitCTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vitATxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sugarTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iodineTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(protienTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(energyTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carboLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fatLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(saltLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fibersLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(vitB12Lbl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(vitDLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(vitKLbl, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(carboTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saltTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fibersTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vitB12Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vitDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vitKTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(barcodeLbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(barcodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(storeNameLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(storeNameDisplayLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addComponent(saveBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(updateBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(backBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(qtyLbl)
                            .addComponent(prodNameLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(prodNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(weightLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(weightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(qtyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addComponent(priceLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(titleLbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storeNameLbl)
                    .addComponent(storeNameDisplayLbl))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(barcodeLbl)
                    .addComponent(barcodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prodNameLbl)
                    .addComponent(prodNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weightLbl)
                    .addComponent(weightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtyLbl)
                    .addComponent(qtyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceLbl)
                    .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(energyLbl)
                    .addComponent(energyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carboLbl)
                    .addComponent(carboTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(protienLbl)
                    .addComponent(protienTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fatLbl)
                    .addComponent(fatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iodineLbl)
                    .addComponent(iodineTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saltLbl)
                    .addComponent(saltTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sugarLbl)
                    .addComponent(sugarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fibersLbl)
                    .addComponent(fibersTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vitALbl)
                    .addComponent(vitATxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vitB12Lbl)
                    .addComponent(vitB12Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vitCLbl)
                    .addComponent(vitCTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vitDLbl)
                    .addComponent(vitDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vitELbl)
                    .addComponent(vitETxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vitKLbl)
                    .addComponent(vitKTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(updateBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        prodNameTxt.setEnabled(true);
        weightTxt.setEnabled(true);
        qtyTxt.setEnabled(true);
        priceTxt.setEnabled(true);
        energyTxt.setEnabled(true);
        carboTxt.setEnabled(true);
        protienTxt.setEnabled(true);
        fatTxt.setEnabled(true);
        iodineTxt.setEnabled(true);
        saltTxt.setEnabled(true);
        sugarTxt.setEnabled(true);
        fibersTxt.setEnabled(true);
        vitATxt.setEnabled(true);
        vitB12Txt.setEnabled(true);
        vitCTxt.setEnabled(true);
        vitDTxt.setEnabled(true);
        vitETxt.setEnabled(true);
        vitKTxt.setEnabled(true);
        
        saveBtn.setEnabled(true);
        updateBtn.setEnabled(false);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        if (validateInput()) {
            product.setProductName(prodNameTxt.getText().trim());
            product.setWeight(Float.parseFloat(weightTxt.getText().trim()));
            product.setQuantity(Integer.parseInt(qtyTxt.getText().trim()));
            product.setPrice(Float.parseFloat(priceTxt.getText().trim()));
            product.setEnergy(Float.parseFloat(energyTxt.getText().trim()));
            product.setCarbohydrates(Float.parseFloat(carboTxt.getText().trim()));
            product.setFibers(Float.parseFloat(fibersTxt.getText().trim()));
            product.setProtien(Float.parseFloat(protienTxt.getText().trim()));
            product.setFat(Float.parseFloat(fatTxt.getText().trim()));
            product.setIodine(Float.parseFloat(iodineTxt.getText().trim()));
            product.setSalt(Float.parseFloat(saltTxt.getText().trim()));
            product.setSugar(Float.parseFloat(sugarTxt.getText().trim()));
            product.setVitaminA(Float.parseFloat(vitATxt.getText().trim()));
            product.setVitaminB12(Float.parseFloat(vitB12Txt.getText().trim()));
            product.setVitaminC(Float.parseFloat(vitCTxt.getText().trim()));
            product.setVitaminD(Float.parseFloat(vitDTxt.getText().trim()));
            product.setVitaminE(Float.parseFloat(vitETxt.getText().trim()));
            product.setVitaminK(Float.parseFloat(vitKTxt.getText().trim()));
            
            JOptionPane.showMessageDialog(null, "Product updated successfully!");
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        manageProdPanel.populateProdTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    public boolean validateInput() {
        if (prodNameTxt.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter Product Name!", "Error", JOptionPane.ERROR_MESSAGE);
            prodNameTxt.requestFocus();
            return false;
        }
        else if (weightTxt.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter Product Weight!", "Error", JOptionPane.ERROR_MESSAGE);
            weightTxt.requestFocus();
            return false;
        }
        else if (qtyTxt.getText().trim().isEmpty() || !qtyTxt.getText().trim().matches("^[0-9]*")) {
            JOptionPane.showMessageDialog(null, "Please enter valid Quantity!", "Error", JOptionPane.ERROR_MESSAGE);
            qtyTxt.requestFocus();
            return false;
        }
        else if (priceTxt.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter Product Price!", "Error", JOptionPane.ERROR_MESSAGE);
            priceTxt.requestFocus();
            return false;
        }
        else {
            return true;
        }
    }
    
    public void resetFields() {
        prodNameTxt.setEnabled(false);
        weightTxt.setEnabled(false);
        qtyTxt.setEnabled(false);
        priceTxt.setEnabled(false);
        energyTxt.setEnabled(false);
        carboTxt.setEnabled(false);
        protienTxt.setEnabled(false);
        fatTxt.setEnabled(false);
        iodineTxt.setEnabled(false);
        saltTxt.setEnabled(false);
        sugarTxt.setEnabled(false);
        fibersTxt.setEnabled(false);
        vitATxt.setEnabled(false);
        vitB12Txt.setEnabled(false);
        vitCTxt.setEnabled(false);
        vitDTxt.setEnabled(false);
        vitETxt.setEnabled(false);
        vitKTxt.setEnabled(false);
        
        saveBtn.setEnabled(false);
        updateBtn.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel barcodeLbl;
    private javax.swing.JTextField barcodeTxt;
    private javax.swing.JLabel carboLbl;
    private javax.swing.JTextField carboTxt;
    private javax.swing.JLabel energyLbl;
    private javax.swing.JTextField energyTxt;
    private javax.swing.JLabel fatLbl;
    private javax.swing.JTextField fatTxt;
    private javax.swing.JLabel fibersLbl;
    private javax.swing.JTextField fibersTxt;
    private javax.swing.JLabel iodineLbl;
    private javax.swing.JTextField iodineTxt;
    private javax.swing.JLabel priceLbl;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JLabel prodNameLbl;
    private javax.swing.JTextField prodNameTxt;
    private javax.swing.JLabel protienLbl;
    private javax.swing.JTextField protienTxt;
    private javax.swing.JLabel qtyLbl;
    private javax.swing.JTextField qtyTxt;
    private javax.swing.JLabel saltLbl;
    private javax.swing.JTextField saltTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel storeNameDisplayLbl;
    private javax.swing.JLabel storeNameLbl;
    private javax.swing.JLabel sugarLbl;
    private javax.swing.JTextField sugarTxt;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JButton updateBtn;
    private javax.swing.JLabel vitALbl;
    private javax.swing.JTextField vitATxt;
    private javax.swing.JLabel vitB12Lbl;
    private javax.swing.JTextField vitB12Txt;
    private javax.swing.JLabel vitCLbl;
    private javax.swing.JTextField vitCTxt;
    private javax.swing.JLabel vitDLbl;
    private javax.swing.JTextField vitDTxt;
    private javax.swing.JLabel vitELbl;
    private javax.swing.JTextField vitETxt;
    private javax.swing.JLabel vitKLbl;
    private javax.swing.JTextField vitKTxt;
    private javax.swing.JLabel weightLbl;
    private javax.swing.JTextField weightTxt;
    // End of variables declaration//GEN-END:variables
}
