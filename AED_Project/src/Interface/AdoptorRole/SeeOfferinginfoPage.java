/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdoptorRole;

import Business.Adopt.AdoptHistory;
import Business.Adopt.AdoptionOffered;
import Business.Adopt.AdoptRecord;
import Business.Adopt.AdopterDetail;
import Business.Animals.AnimalDetails;
import Business.Animals.CatDetails;
import Business.Animals.DogDetails;
import Business.Date.Date;
import Business.EcoSystem.EcoSystem;
import Business.Enterprises.EnterpriseDetails;
import Business.Enterprises.RescueCenterEntDetails;
import Business.Network.NetworkDetails;
import Business.Organisation.AdoptionOrganisation;
import Business.Organisation.OrganisationMain;
import Business.RescueRecord.RescueRecordDetails;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class SeeOfferinginfoPage extends javax.swing.JPanel {

    /**
     * Creates new form SeeOfferinginfoPage
     */
    
    private JPanel container;
    private AdoptionOffered ao;
    private AdopterDetail adoptor;
    private EcoSystem business;
    
    public SeeOfferinginfoPage(JPanel container, EcoSystem business, AdopterDetail adoptor, AdoptionOffered ao) {
        initComponents();
        this.container = container;
        this.ao = ao;
        this.adoptor = adoptor;
        this.business = business;
        
        populateValues();
    }

    public void populateValues() {
        AnimalDetails a = ao.getAnimal();
        lblType.setText(a.getAnimaltype().getValue());
        lblColor.setText(a.getAnimalcolor());
        lblAge.setText(String.valueOf(a.getAnimalage()));
        if(a instanceof DogDetails) {
            lblBreed.setText(((DogDetails) a).getDogbreed());
        } 
        else if(a instanceof CatDetails) {
            lblBreed.setText(((CatDetails) a).getCatbreed());
        }
        else {
            lblBreed.setText("None");
        }
        
        int size = ao.getAnimal().getStatusDirectory().getStatusDir().size();
        double weight = ao.getAnimal().getStatusDirectory().getStatusDir().get(size-1).getAnimalweight();
        lblWeight.setText(String.valueOf(weight));
        
        String location = "Unknown";
        for(NetworkDetails n: business.getNetworkList()) {
            for(EnterpriseDetails e: n.getEnterpriseDirectory().getEnterpriseList()) {
                if(e instanceof RescueCenterEntDetails) {
                    for(RescueRecordDetails rr: ((RescueCenterEntDetails) e).getRecordDirectory().getRescueRecordList()) {
                        location = rr.getFoundlocation();
                    }
                }
            }
        }
        lblLocation.setText(location);
        /*
        if(a.isIsSterilized()) {
            lblSterilized.setText("Yes");
        }
        else {
            lblSterilized.setText("No");
        }
        */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAnimalDetails = new javax.swing.JLabel();
        btnPrevious = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblTyp = new javax.swing.JLabel();
        lblSterilized = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        lblsterilize = new javax.swing.JLabel();
        lblLocat = new javax.swing.JLabel();
        lblweight = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        lblAgee = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblBreed = new javax.swing.JLabel();
        lblColour = new javax.swing.JLabel();
        lblbreeed = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        btnAdoption = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblAnimalDetails.setBackground(new java.awt.Color(255, 255, 255));
        lblAnimalDetails.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAnimalDetails.setForeground(new java.awt.Color(255, 51, 51));
        lblAnimalDetails.setText("ADOPTING ANIMAL DETAILS");

        btnPrevious.setBackground(new java.awt.Color(255, 255, 255));
        btnPrevious.setForeground(new java.awt.Color(255, 51, 51));
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTyp.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblTyp.setText("Type:");

        lblSterilized.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblSterilized.setText("Yes");

        lblLocation.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblLocation.setText("<value>");

        lblsterilize.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblsterilize.setText("Sterilized or Not:");

        lblLocat.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblLocat.setText("Location Found:");

        lblweight.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblweight.setText("Weight:");

        lblWeight.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblWeight.setText("<value>");

        lblAgee.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblAgee.setText("Age:");

        lblAge.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblAge.setText("<value>");

        lblBreed.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblBreed.setText("<value>");

        lblColour.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblColour.setText("Color:");

        lblbreeed.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblbreeed.setText("Breed:");

        lblColor.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblColor.setText("<value>");

        lblType.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblType.setText("<value>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblsterilize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLocat, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSterilized, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblweight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblbreeed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBreed, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAgee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblColour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTyp, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblType, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTyp)
                    .addComponent(lblType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColour)
                    .addComponent(lblColor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgee)
                    .addComponent(lblAge))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbreeed)
                    .addComponent(lblBreed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblweight)
                    .addComponent(lblWeight))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocat)
                    .addComponent(lblLocation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsterilize)
                    .addComponent(lblSterilized))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        btnAdoption.setBackground(new java.awt.Color(255, 255, 255));
        btnAdoption.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        btnAdoption.setForeground(new java.awt.Color(255, 51, 51));
        btnAdoption.setText("Adopt");
        btnAdoption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdoptionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(btnAdoption, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(lblAnimalDetails)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAnimalDetails)
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnAdoption)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdoptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdoptionActionPerformed
        // TODO add your handling code here:
        AdoptHistory history = new AdoptHistory();
        history.setAnimalname(ao.getAnimal());
        history.setStatus(AdoptHistory.SUBMITTED_STATUS);
        
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR); 
        int month = c.get(Calendar.MONTH); 
        int date = c.get(Calendar.DATE); 
        Date hd = new Date();
        hd.setYear(year);
        hd.setMonth(month);
        hd.setDate(date);
        history.setDate(hd);
        
        adoptor.getHistoryDirectory().addAdoptionHistory(history);
        ao.setStatus(AdoptionOffered.CLOSE_STATUS);
        
        AdoptRecord adoptionRecord = new AdoptRecord();
        adoptionRecord.setAdoptorName(adoptor);
        adoptionRecord.setAnimal(ao.getAnimal());
        adoptionRecord.setDate(hd);
        adoptionRecord.setStatus(AdoptRecord.SUBMITTED_STATUS);
        
        for(NetworkDetails n: business.getNetworkList()) {
            for(EnterpriseDetails e: n.getEnterpriseDirectory().getEnterpriseList()) {
                if(e instanceof RescueCenterEntDetails) {
                    for(OrganisationMain o: e.getOrganisationDirectory().getOrganisationList()) {
                         if(o instanceof AdoptionOrganisation) {
                             ((AdoptionOrganisation) o).getAdoptionRecordDirectory().addAdoptionRecord(adoptionRecord);
                         }
                    }
                }
            }
        }
        btnAdoption.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Adoption application has been submitted.");
    }//GEN-LAST:event_btnAdoptionActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AdoptlistPage aljp = (AdoptlistPage) component;
        aljp.populateTable();
        CardLayout layout = (CardLayout)container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnPreviousActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdoption;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblAgee;
    private javax.swing.JLabel lblAnimalDetails;
    private javax.swing.JLabel lblBreed;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblColour;
    private javax.swing.JLabel lblLocat;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblSterilized;
    private javax.swing.JLabel lblTyp;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JLabel lblbreeed;
    private javax.swing.JLabel lblsterilize;
    private javax.swing.JLabel lblweight;
    // End of variables declaration//GEN-END:variables
}
