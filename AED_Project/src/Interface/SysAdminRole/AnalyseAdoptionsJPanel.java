/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SysAdminRole;

import Business.Adopt.AdopterDetail;
import Business.Adopt.AdopterDir;
import Business.Adopt.AdoptRecord;
import Business.Animals.AnimalDetails;
import Business.Animals.CatDetails;
import Business.Animals.DogDetails;
import Business.EcoSystem.EcoSystem;
import Business.Enterprises.EnterpriseDetails;
import Business.Enterprises.RescueCenterEntDetails;
import Business.Network.NetworkDetails;
import Business.Organisation.AdoptionOrganisation;
import Business.Organisation.OrganisationMain;
import Business.UserAccount.VisitorAccountDetails;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class AnalyseAdoptionsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AnalyseAdoptionsJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem system;
    
    public AnalyseAdoptionsJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateTypeTable();
        populateValues();
    }
    
    public void populateValues() {
        lblAdoptions.setText(String.valueOf(getTotalAdoptions()));
        lblAdopters.setText(String.valueOf(getAdoptersCount()));
        lblPercentage.setText(String.valueOf((getAdoptedCount() / getTotalValue()) * 100) + "%");
    }
    
    public void populateTypeTable() {
        DefaultTableModel model = (DefaultTableModel) tblTypes.getModel();
        model.setRowCount(0);
        Object[] row = new Object[3];
        row[0] = "Dogs";
        row[1] = (getDogCount() / getTotalAdoptions()) * 100 + "%";
        model.addRow(row);
        
        row[0] = "Male";
        row[1] = (getMaleCount() / getTotalAdoptions()) * 100 + "%";
        model.addRow(row);
        
        row[0] = "Has Breed";
        row[1] = (getBreedCount() / getTotalAdoptions()) * 100 + "%";
        model.addRow(row);
    }
    
    public int getTotalAdoptions() {
        int count = 0;
        for (NetworkDetails network : system.getNetworkList()) {
            for (EnterpriseDetails enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if(enterprise instanceof RescueCenterEntDetails) {
                    for(OrganisationMain org: enterprise.getOrganisationDirectory().getOrganisationList()) {
                        if(org instanceof AdoptionOrganisation) {
                            for(AdoptRecord ar: ((AdoptionOrganisation) org).getAdoptionRecordDirectory().getAdoptionRecordList()) {
                                count++;
                            }
                        }
                    }
                    
                }
            }
        }
        return count;
    }
    
    public int getAdoptersCount() {
        int count = 0;
        for(VisitorAccountDetails va: system.getVisitorAccountDir().getVisitorAccountList()) {
            count++;
        }
        /*
        for (NetworkDetails network : system.getNetworkList()) {
            for (EnterpriseDetails enterprise : network.getEnterpriseDir().getEnterpriseList()) {
                if(enterprise instanceof RescueCenterEntDetails) {
                    for(OrganisationMain org: enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if(org instanceof AdoptionOrganisation) {
                            for(AdopterDetail a: ((AdoptionOrganisation) org).getAdopterDir().getAdoptorList()) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        */
        return count;
    }
    
    public float getAdoptedCount() {
        float count = 0;
        for (NetworkDetails network : system.getNetworkList()) {
            for (EnterpriseDetails enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if(enterprise instanceof RescueCenterEntDetails) {
                    for(AnimalDetails a: ((RescueCenterEntDetails) enterprise).getAnimalDirectory().getAnimalList()) {
                        if(a.getAnimalstatus().equals(AnimalDetails.ADOPTED_STATUS)) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
    
    public int getTotalValue() {
        int sum = 0;
        for (NetworkDetails network : system.getNetworkList()) {
            for (EnterpriseDetails enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if(enterprise instanceof RescueCenterEntDetails) {
                    sum += ((RescueCenterEntDetails) enterprise).getRecordDirectory().getRescueRecordList().size();
                }
            }
        }
        return sum;
    }
    
    
    public float getDogCount() {
        float count = 0;
        for (NetworkDetails network : system.getNetworkList()) {
            for (EnterpriseDetails enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if(enterprise instanceof RescueCenterEntDetails) {
                    for(OrganisationMain org: enterprise.getOrganisationDirectory().getOrganisationList()) {
                        if(org instanceof AdoptionOrganisation) {
                            for(AdoptRecord ar: ((AdoptionOrganisation) org).getAdoptionRecordDirectory().getAdoptionRecordList()) {
                                if(ar.getAnimal().getAnimaltype().equals(AnimalDetails.AnimalType.Dog)) {
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
    
    public float getMaleCount() {
        float count = 0;
        for (NetworkDetails network : system.getNetworkList()) {
            for (EnterpriseDetails enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if(enterprise instanceof RescueCenterEntDetails) {
                    for(OrganisationMain org: enterprise.getOrganisationDirectory().getOrganisationList()) {
                        if(org instanceof AdoptionOrganisation) {
                            for(AdoptRecord ar: ((AdoptionOrganisation) org).getAdoptionRecordDirectory().getAdoptionRecordList()) {
                                if(ar.getAnimal().getAnimalgender() != null) {
                                    System.out.println(ar.getAnimal().getAnimalgender());
                                    if(ar.getAnimal().getAnimalgender().equals("M")) {
                                        count++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
    
    public float getBreedCount() {
        float count = 0;
        for (NetworkDetails network : system.getNetworkList()) {
            for (EnterpriseDetails enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if(enterprise instanceof RescueCenterEntDetails) {
                    for(OrganisationMain org: enterprise.getOrganisationDirectory().getOrganisationList()) {
                        if(org instanceof AdoptionOrganisation) {
                            for(AdoptRecord ar: ((AdoptionOrganisation) org).getAdoptionRecordDirectory().getAdoptionRecordList()) {
                                AnimalDetails a = ar.getAnimal();
                                if(a.getAnimaltype().equals(AnimalDetails.AnimalType.Dog)) {
                                    if(!((DogDetails)a).getDogbreed().equals("None")) {
                                        count++;
                                    }
                                }
                                else if(a.getAnimaltype().equals(AnimalDetails.AnimalType.Cat)) {
                                    if(!((CatDetails)a).getCatbreed().equals("None")) {
                                        count++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblAdoptions = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblAdopters = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTypes = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblPercentage = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Analyse Adoptions");

        jLabel2.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel2.setText("Total Adoptions Applied:");

        lblAdoptions.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        lblAdoptions.setText("<Value>");

        jLabel3.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel3.setText("Quantity of Adopters:");

        lblAdopters.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        lblAdopters.setText("<Value>");

        tblTypes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type", "Percentage"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblTypes);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Animal");

        jLabel4.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel4.setText("Percentage of Animal Adopted:");

        lblPercentage.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        lblPercentage.setText("<Value>");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Status");

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblPercentage))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAdoptions)
                                    .addComponent(lblAdopters)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton)
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addComponent(jLabel1))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblAdoptions))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblAdopters))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblPercentage))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAdopters;
    private javax.swing.JLabel lblAdoptions;
    private javax.swing.JLabel lblPercentage;
    private javax.swing.JTable tblTypes;
    // End of variables declaration//GEN-END:variables
}
