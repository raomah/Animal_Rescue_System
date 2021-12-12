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
        previousJButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblPercentage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblAdoptions = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblAdopters = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTypes = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Analyse Adoptions");

        previousJButton.setBackground(new java.awt.Color(255, 255, 255));
        previousJButton.setForeground(new java.awt.Color(255, 51, 51));
        previousJButton.setText("Previous");
        previousJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousJButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel4.setText("Percentage of Animal Adopted:");

        lblPercentage.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        lblPercentage.setText("<Value>");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel2.setText("Total Adoptions Applied:");

        lblAdoptions.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        lblAdoptions.setText("<Value>");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel3.setText("Quantity of Adopters:");

        lblAdopters.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        lblAdopters.setText("<Value>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblAdoptions, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblAdopters, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(lblPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(133, 133, 133))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblAdoptions))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdopters)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblPercentage))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Animal Status", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(255, 51, 51))); // NOI18N

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
        tblTypes.setSelectionBackground(new java.awt.Color(255, 204, 204));
        tblTypes.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setViewportView(tblTypes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(previousJButton)
                        .addContainerGap(502, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previousJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void previousJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_previousJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAdopters;
    private javax.swing.JLabel lblAdoptions;
    private javax.swing.JLabel lblPercentage;
    private javax.swing.JButton previousJButton;
    private javax.swing.JTable tblTypes;
    // End of variables declaration//GEN-END:variables
}
