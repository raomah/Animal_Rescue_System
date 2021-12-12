/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ReceptionistRole;

import Business.Animals.AnimalDetails;
import Business.Animals.CatDetails;
import Business.Animals.DogDetails;
import Business.Animals.OtherAnimalDetails;
import Business.Date.Date;
import Business.Employees.EmployeeDetails;
import Business.Enterprises.EnterpriseDetails;
import Business.Enterprises.RescueCenterEntDetails;
import Business.RescueRecord.RescueRecordDetails;
import Business.Place.PlaceDetails;
import Business.UserAccount.UserAccountDetails;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class RegisterAnimalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegisterAnimalJPanel
     */
    
    private JPanel container;
    private RescueCenterEntDetails enterprise;
    private UserAccountDetails userAccount;
    
    public RegisterAnimalJPanel(JPanel container, RescueCenterEntDetails enterprise, UserAccountDetails userAccount) {
        initComponents();
        this.container = container;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        rbtnM.setSelected(true);
        populateComboBox();
    }

    public void populateComboBox() {
        cboxType.removeAllItems();
        for (AnimalDetails.AnimalType type : AnimalDetails.AnimalType.values()) {
            cboxType.addItem(type);
        }
    }
    
    public void clearFields() {
        cboxType.setSelectedIndex(0);
        txtType.setEnabled(false);
        txtType.setText("");
        txtColor.setText("");
        rbtnM.setSelected(true);
        rbtnF.setSelected(false);
        txtLocationFound.setText("");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblregisteranimal = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboxType = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtType = new javax.swing.JTextField();
        txtLocationFound = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rbtnF = new javax.swing.JRadioButton();
        rbtnM = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lblregisteranimal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblregisteranimal.setForeground(new java.awt.Color(255, 0, 0));
        lblregisteranimal.setText("REGISTER NEW ANIMAL");

        btnRegister.setForeground(new java.awt.Color(255, 51, 51));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnClear.setForeground(new java.awt.Color(255, 0, 51));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnBack.setForeground(new java.awt.Color(255, 0, 0));
        btnBack.setText(" Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel1.setText("Animal Type:");

        cboxType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxTypeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel3.setText("Type:");

        txtType.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel5.setText("Gender:");

        jLabel4.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel4.setText("Color:");

        rbtnF.setText("F");
        rbtnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnFActionPerformed(evt);
            }
        });

        rbtnM.setText("M");
        rbtnM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel6.setText("Location Found:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtColor)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbtnM)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnF))
                    .addComponent(txtLocationFound)
                    .addComponent(txtType)
                    .addComponent(cboxType, 0, 114, Short.MAX_VALUE))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rbtnM)
                    .addComponent(rbtnF))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtLocationFound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(lblregisteranimal)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnRegister)
                .addContainerGap(202, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(36, Short.MAX_VALUE)
                        .addComponent(lblregisteranimal)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        if(txtColor.getText().equals("") || txtLocationFound.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "All fields are required!");
            return;
        }
        else if(cboxType.getSelectedItem() == AnimalDetails.AnimalType.Other
                && txtType.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Type is required!");
            return;
        }
        RescueRecordDetails r = new RescueRecordDetails();
        AnimalDetails a;
        if(cboxType.getSelectedItem() == AnimalDetails.AnimalType.Cat) {
            a = new CatDetails();
            a.setAnimalcolor(txtColor.getText());
            a.setAnimaltype(AnimalDetails.AnimalType.Cat);
            enterprise.getAnimalDirectory().addAnimal(a);
            r.setRescuedanimal(a);
        }
        else if(cboxType.getSelectedItem() == AnimalDetails.AnimalType.Dog) {
            a = new DogDetails();
            a.setAnimalcolor(txtColor.getText());
            a.setAnimaltype(AnimalDetails.AnimalType.Dog);
            enterprise.getAnimalDirectory().addAnimal(a);
            r.setRescuedanimal(a);
        }
        else if(cboxType.getSelectedItem() == AnimalDetails.AnimalType.Other) {
            a = new OtherAnimalDetails();
            a.setAnimalcolor(txtColor.getText());
            a.setAnimaltype(AnimalDetails.AnimalType.Other);
            enterprise.getAnimalDirectory().addAnimal(a);
            r.setRescuedanimal(a);
        }
        
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR); 
        int month = c.get(Calendar.MONTH); 
        int date = c.get(Calendar.DATE);
        Date d = new Date();
        d.setYear(year);
        d.setMonth(month+1);
        d.setDate(date);
        
        if(rbtnM.isSelected() == true) {
            r.getRescuedanimal().setAnimalgender("M");
        }
        else {
            r.getRescuedanimal().setAnimalgender("F");
        }
        
        r.setDate(d);
        r.setFoundlocation(txtLocationFound.getText());
        enterprise.getRecordDirectory().addRescueRecord(r);
        JOptionPane.showMessageDialog(null, "Registered Successfully!");
        clearFields();
        return;
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clearFields();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ReceptionistWorkAreaJPanel crwjp = (ReceptionistWorkAreaJPanel) component;
        crwjp.populateAnimalTable();
        CardLayout layout = (CardLayout)container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cboxTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxTypeActionPerformed
        // TODO add your handling code here:
        if(cboxType.getSelectedItem() == AnimalDetails.AnimalType.Other) {
            txtType.setEnabled(true);
        }
        else {
            txtType.setEnabled(false);
        }
    }//GEN-LAST:event_cboxTypeActionPerformed

    private void rbtnMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMActionPerformed
        // TODO add your handling code here:
        rbtnF.setSelected(false);
    }//GEN-LAST:event_rbtnMActionPerformed

    private void rbtnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnFActionPerformed
        // TODO add your handling code here:
        rbtnM.setSelected(false);
    }//GEN-LAST:event_rbtnFActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox cboxType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblregisteranimal;
    private javax.swing.JRadioButton rbtnF;
    private javax.swing.JRadioButton rbtnM;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtLocationFound;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables
}
