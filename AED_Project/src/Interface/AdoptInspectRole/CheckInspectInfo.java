/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdoptInspectRole;

import Business.Adopt.AdoptRecord;
import Business.Adopt.AdopterDetail;
import Business.Animals.AnimalDetails;
import Business.Enterprises.RescueCenterEntDetails;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class CheckInspectInfo extends javax.swing.JPanel {

    /**
     * Creates new form CheckInspectInfo
     */
    
    private JPanel container;
    private AdoptRecord ar;
    private RescueCenterEntDetails enterprise;
    
    CheckInspectInfo(JPanel container, RescueCenterEntDetails enterprise, AdoptRecord ar) {
        initComponents();
        this.container = container;
        this.enterprise = enterprise;
        this.ar = ar;
        btnEval.setVisible(false);
        
        populateButton();
        populateValues();
    }
    
    public void populateButton() {
        if(ar.getStatus().equals(AdoptRecord.APPROVED_STATUS) 
                || ar.getStatus().equals(AdoptRecord.REJECTED_STATUS )
                || ar.getStatus().equals(AdoptRecord.INPROGRESS_STATUS)) {
            btnEval.setVisible(false);
        }
        else {
            btnEval.setVisible(true);
        }
    }
    
    public void populateValues() {
        AnimalDetails animal = ar.getAnimal();
        AdopterDetail adopter = ar.getAdoptorName();
        
        lblAnimalId.setText(String.valueOf(animal.getAnimalid()));
        lblType.setText(animal.getAnimaltype().getValue());
        lblColor.setText(animal.getAnimalcolor());
        
        lblSsn.setText(adopter.getSsnnumber());
        lblFirstName.setText(adopter.getFirstName());
        lblLastName.setText(adopter.getLastName());
        lblPhone.setText(adopter.getPhoneNumber());
        lblEmail.setText(adopter.getEmail());
        lblStreet.setText(adopter.getAddress().getStreetName());
        lblCity.setText(adopter.getAddress().getCityName());
        lblState.setText(adopter.getAddress().getStateName());
        
        int size = adopter.getHistoryDirectory().getHistoryList().size();
        if(size == 1) {
            lblHasHistory.setText("No");
        }
        else {
            lblHasHistory.setText("Yes");
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

        jPanel2 = new javax.swing.JPanel();
        lblAnimalDetails = new javax.swing.JLabel();
        btnPrevious = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblAnimalIdentity = new javax.swing.JLabel();
        lblAnimalId = new javax.swing.JLabel();
        lblAnimalType = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        lblColour = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        btnEval = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblSocialsec = new javax.swing.JLabel();
        lblFirstN = new javax.swing.JLabel();
        lblLastN = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblSsn = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        LblEmailadd = new javax.swing.JLabel();
        lblPhoneNo = new javax.swing.JLabel();
        lblStreet = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblHasHistory = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));

        lblAnimalDetails.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAnimalDetails.setForeground(new java.awt.Color(255, 0, 0));
        lblAnimalDetails.setText("INSPECTION DETAILS");

        btnPrevious.setBackground(new java.awt.Color(255, 255, 255));
        btnPrevious.setForeground(new java.awt.Color(255, 51, 51));
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Animal Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 15), new java.awt.Color(255, 51, 51))); // NOI18N

        lblAnimalIdentity.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblAnimalIdentity.setText("Animal ID:");

        lblAnimalId.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblAnimalId.setText("<value>");

        lblAnimalType.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblAnimalType.setText("Type of Animal:");

        lblType.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblType.setText("<value>");

        lblColour.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblColour.setText("Colour:");

        lblColor.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblColor.setText("<value>");

        btnEval.setBackground(new java.awt.Color(255, 255, 255));
        btnEval.setText("Evaluate");
        btnEval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAnimalType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAnimalIdentity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblColour, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAnimalId, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnEval)
                .addGap(87, 87, 87))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAnimalId)
                    .addComponent(lblAnimalIdentity, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEval, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAnimalType)
                            .addComponent(lblType))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblColor)
                            .addComponent(lblColour))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adopter Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 15), new java.awt.Color(255, 51, 51))); // NOI18N

        lblSocialsec.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblSocialsec.setText("Social Security:");

        lblFirstN.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblFirstN.setText("First Name:");

        lblLastN.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblLastN.setText("Last Name:");

        lblLastName.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblLastName.setText("<value>");

        lblFirstName.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblFirstName.setText("<value>");

        lblSsn.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblSsn.setText("<value>");

        lblAddress.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblAddress.setText("Address:");

        LblEmailadd.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        LblEmailadd.setText("Email:");

        lblPhoneNo.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblPhoneNo.setText("Phone Number:");

        lblStreet.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblStreet.setText("<value>");

        lblEmail.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblEmail.setText("<value>");

        lblPhone.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblPhone.setText("<value>");

        jLabel13.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel13.setText("Adoption History:");

        lblHasHistory.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblHasHistory.setText("<value>");

        lblCity.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblCity.setText("<value>");

        lblState.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblState.setText("<value>");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblLastN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFirstN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSocialsec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPhoneNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LblEmailadd, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSsn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblStreet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblState, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(lblHasHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(134, 134, 134))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSocialsec)
                    .addComponent(lblSsn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstN)
                    .addComponent(lblFirstName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(lblLastN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNo)
                    .addComponent(lblPhone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblEmailadd)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStreet)
                    .addComponent(lblAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblState)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHasHistory)
                    .addComponent(jLabel13))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPrevious)
                        .addGap(116, 116, 116)
                        .addComponent(lblAnimalDetails)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblAnimalDetails)
                        .addGap(28, 28, 28)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        MyInspectPanel mijp = (MyInspectPanel) component;
        mijp.populateTable();
        CardLayout layout = (CardLayout)container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnEvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvalActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) container.getLayout();
        container.add("EvaluateJPanel", new EvaluationPage(container, enterprise, ar));
        layout.next(container);
    }//GEN-LAST:event_btnEvalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblEmailadd;
    private javax.swing.JButton btnEval;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAnimalDetails;
    private javax.swing.JLabel lblAnimalId;
    private javax.swing.JLabel lblAnimalIdentity;
    private javax.swing.JLabel lblAnimalType;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblColour;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstN;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblHasHistory;
    private javax.swing.JLabel lblLastN;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPhoneNo;
    private javax.swing.JLabel lblSocialsec;
    private javax.swing.JLabel lblSsn;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblType;
    // End of variables declaration//GEN-END:variables
}
