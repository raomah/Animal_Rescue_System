/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.VetAssistRole;

import Business.Adopt.AdoptionOffered;
import Business.Animals.AnimalDetails;
import static Business.Animals.AnimalDetails.AnimalType.Cat;
import Business.Animals.AnimalStatusDetails;
import Business.Animals.CatDetails;
import Business.Animals.DogDetails;
import Business.Cages.CageDetail;
import Business.Date.Date;
import Business.Enterprises.EnterpriseDetails;
import Business.Enterprises.RescueCenterEntDetails;
import Business.ShelterCell.ShelterCellDetails;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ReviewAnimalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReviewAnimalJPanel
     */
    
    private CageDetail cage;
    private JPanel container;
    private RescueCenterEntDetails enterprise;
    
    ReviewAnimalJPanel(JPanel container, EnterpriseDetails enterprise, CageDetail cage) {
        initComponents();
        this.container = container;
        this.cage = cage;
        this.enterprise = (RescueCenterEntDetails)enterprise;

        
        rbtnGood.setSelected(true);
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel)tblCage.getModel();
        model.setRowCount(0);
        Object[] row = new Object[4];
        row[0] = cage.getCellno();
        row[1] = cage.getCagelocation();
        row[2] = cage.getAnimal().getAnimaltype();
        row[3] = cage.getAnimal().getAnimalcolor();

        model.addRow(row);
    }
    
    public Date getDateAfterNDays(Date d, int n) {
       Date after = new Date();
        //runnian Febrary
        if( ( (d.getYear()%400 != 0 && d.getYear()%4 == 0) || (d.getYear()%400 == 0)) && d.getMonth() == 2) {
            if(d.getDate() < 29-n) {
                after.setYear(d.getYear());
                after.setMonth(d.getMonth());
                after.setDate(d.getDate() + n);
            }
            else {
                after.setYear(d.getYear());
                after.setMonth(d.getMonth() + 1);
                after.setDate(d.getDate() + n - 29);
            }
        }
        //pingnian febrary
        else if(d.getYear()%4 != 0 && d.getMonth() == 2) {
            if(d.getDate() < 28-n) {
                after.setYear(d.getYear());
                after.setMonth(d.getMonth());
                after.setDate(d.getDate() + n);
            }
            else {
                after.setYear(d.getYear());
                after.setMonth(d.getMonth() + 1);
                after.setDate(d.getDate() + n - 28);
            }
        }
        //pingnian 30tian
        else if(d.getMonth() == 4 || d.getMonth() == 6 || d.getMonth() == 9 || d.getMonth() == 11) {
            if(d.getDate() <= 30-n) {
                after.setYear(d.getYear());
                after.setMonth(d.getMonth());
                after.setDate(d.getDate() + n);
            }
            else {
                after.setYear(d.getYear());
                after.setMonth(d.getMonth() + 1);
                after.setDate(d.getDate() + n -30);
            }
        }
        //pingnian 31tian
        else {
            if(d.getDate() <= 31-n) {
                after.setYear(d.getYear());
                after.setMonth(d.getMonth());
                after.setDate(d.getDate() + n);
            }
            else {
                if(d.getMonth()<=11) {
                    after.setYear(d.getYear());
                    after.setMonth(d.getMonth() + 1);
                    after.setDate(d.getDate() + n - 31);
                }
                else {
                    after.setYear(d.getYear() + 1);
                    after.setMonth(1);
                    after.setDate(d.getDate() + n - 31);
                }
            }
        }
        return after;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblreviewani = new javax.swing.JLabel();
        btnFinish = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCage = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        rbtnGood = new javax.swing.JRadioButton();
        txtWeight = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rbtnBad = new javax.swing.JRadioButton();
        rbtnReserved = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        btnBack.setForeground(new java.awt.Color(255, 0, 51));
        btnBack.setText(" Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblreviewani.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblreviewani.setForeground(new java.awt.Color(255, 51, 51));
        lblreviewani.setText("Review Animal");

        btnFinish.setForeground(new java.awt.Color(255, 0, 51));
        btnFinish.setText("Finish");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        tblCage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cage", "Location", "Animal Type", "Color"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCage.setSelectionBackground(new java.awt.Color(255, 204, 204));
        tblCage.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblCage);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        rbtnGood.setText("Good");
        rbtnGood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnGoodActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel3.setText("Weight:");

        jLabel4.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel4.setText("Status:");

        rbtnBad.setText("Bad");
        rbtnBad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnBadActionPerformed(evt);
            }
        });

        rbtnReserved.setText("Reserved");
        rbtnReserved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnReservedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(rbtnBad))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbtnReserved)
                        .addGap(37, 37, 37)
                        .addComponent(rbtnGood))
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rbtnBad)
                    .addComponent(rbtnReserved)
                    .addComponent(rbtnGood))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(lblreviewani))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(btnFinish)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblreviewani)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFinish)
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        VeteAssistantWorkAreaJPanel vajp = (VeteAssistantWorkAreaJPanel) component;
        vajp.populateTable();
        CardLayout layout = (CardLayout)container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void rbtnBadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnBadActionPerformed
        // TODO add your handling code here:
        rbtnReserved.setSelected(false);
        rbtnGood.setSelected(false);
    }//GEN-LAST:event_rbtnBadActionPerformed

    private void rbtnReservedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnReservedActionPerformed
        // TODO add your handling code here:
        rbtnBad.setSelected(false);
        rbtnGood.setSelected(false);
    }//GEN-LAST:event_rbtnReservedActionPerformed

    private void rbtnGoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnGoodActionPerformed
        // TODO add your handling code here:
        rbtnBad.setSelected(false);
        rbtnReserved.setSelected(false);
    }//GEN-LAST:event_rbtnGoodActionPerformed

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
        // TODO add your handling code here:
        if(!txtWeight.getText().matches("\\d+(\\.\\d+)?")) {
            JOptionPane.showMessageDialog(null, "Weight is invalid.");
            return;
        }
        
        AnimalStatusDetails statusRecord = new AnimalStatusDetails();
        
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR); 
        int month = c.get(Calendar.MONTH); 
        int date = c.get(Calendar.DATE); 
        statusRecord.getDate().setYear(year);
        statusRecord.getDate().setMonth(month);
        statusRecord.getDate().setDate(date);
        
        double weight = Double.parseDouble(txtWeight.getText());
        statusRecord.setAnimalweight(weight);
        
        if(rbtnBad.isSelected() == true) {
            statusRecord.setAnimalstatus(AnimalStatusDetails.BAD_STATUS);
            Date d = getDateAfterNDays(statusRecord.getDate(),7);
            cage.getAnimal().setNextcheck(d);
            cage.getAnimal().getStatusDirectory().addAnimalStatus(statusRecord);
        }
        else if(rbtnReserved.isSelected() == true) {
            statusRecord.setAnimalstatus(AnimalStatusDetails.RESERVED_STATUS);
            Date d = getDateAfterNDays(statusRecord.getDate(),7);
            cage.getAnimal().setNextcheck(d);
            cage.getAnimal().getStatusDirectory().addAnimalStatus(statusRecord);
        }
        else if(rbtnGood.isSelected() == true) {
            statusRecord.setAnimalstatus(AnimalStatusDetails.GOOD_STATUS);
            cage.getAnimal().setAnimalstatus(AnimalDetails.READY_STATUS);
            
            if(cage.getAnimal() instanceof CatDetails || cage.getAnimal() instanceof DogDetails) {
                AdoptionOffered ao = new AdoptionOffered();
                ao.setAnimal(cage.getAnimal());
                ao.setPublishDate(statusRecord.getDate());
                enterprise.getAdoptionList().addAdoptionOffering(ao);
            }
            
            for(ShelterCellDetails sc: enterprise.getShelterCellDirectory().getShelterCellList()) {
                if(sc.getShelterstatus().equals(ShelterCellDetails.AVAIL_STATUS)) {
                    sc.setAnimal(cage.getAnimal());
                    sc.setShelterstatus(ShelterCellDetails.OCCUPIED_STATUS);
                    break;
                }
            }
            cage.setCagestatus(CageDetail.AVAIL_STATUS);
            cage.getAnimal().getStatusDirectory().addAnimalStatus(statusRecord);
            cage.setAnimal(null);
            
            for(AdoptionOffered ao: enterprise.getAdoptionList().getAdoptionOfferingList()) {
                System.out.println(ao.getAnimal().getAnimalid());
                System.out.println(ao.getPublishDate());
                System.out.println(ao.getStatus());
            }
        }
        String message = "Review has been recorded.";
        if(rbtnGood.isSelected() == true) {
            message += "\nThe Animal has been sent to shelter.";
        }
        else {
            message += "\nThe date of next review has been updated.";
        }
        btnFinish.setEnabled(false);
        JOptionPane.showMessageDialog(null, message);
        
    }//GEN-LAST:event_btnFinishActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFinish;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblreviewani;
    private javax.swing.JRadioButton rbtnBad;
    private javax.swing.JRadioButton rbtnGood;
    private javax.swing.JRadioButton rbtnReserved;
    private javax.swing.JTable tblCage;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
