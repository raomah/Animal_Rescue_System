/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SysAdminRole;

import Business.Animals.AnimalDetails;
import Business.Animals.CatDetails;
import Business.Animals.DogDetails;
import Business.EcoSystem.EcoSystem;
import Business.Enterprises.EnterpriseDetails;
import Business.Enterprises.RescueCenterEntDetails;
import Business.Network.NetworkDetails;
import Business.RescueRecord.RescueRecordDetails;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class AnalyseAnimalsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AnalyseAnimalsJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem system;
    
    public AnalyseAnimalsJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateTypeTable();
        populateRatioTable();
        lblTotal.setText(String.valueOf(getTotalValue()));
    }
     
    public void populateTypeTable() {
        DefaultTableModel model = (DefaultTableModel) tblTypes.getModel();
        model.setRowCount(0);
        Object[] row = new Object[3];
        row[0] = "Dogs";
        row[1] = (getDogCount() / getTotalValue()) * 100 + "%";
        model.addRow(row);
        
        row[0] = "Cats";
        row[1] = (getCatCount() / getTotalValue()) * 100 + "%";
        model.addRow(row);
        
        row[0] = "Others";
        row[1] = ((getTotalValue() - getDogCount() - getCatCount()) 
                / getTotalValue()) * 100 + "%";
        model.addRow(row);
    }
    
    public void populateRatioTable() {
        DefaultTableModel model = (DefaultTableModel) tblRatios.getModel();
        model.setRowCount(0);
        Object[] row = new Object[3];
        row[0] = "Female";
        row[1] = getFemaleRatio()*100 + "%";
        model.addRow(row);
        
        row[0] = "No Breed";
        row[1] = getNoBreedRatio()*100 + "%";
        model.addRow(row);
        
        row[0] = "Unhealthy Before Rescued";
        row[1] = getUnhealthyRatio()*100 + "%";
        model.addRow(row);
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
                    for(RescueRecordDetails rr: ((RescueCenterEntDetails) enterprise).getRecordDirectory().getRescueRecordList()) {
                        AnimalDetails a = rr.getRescuedanimal();
                        if(a.getAnimaltype().equals(AnimalDetails.AnimalType.Dog)) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
    
    public float getCatCount() {
        float count = 0;
        for (NetworkDetails network : system.getNetworkList()) {
            for (EnterpriseDetails enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if(enterprise instanceof RescueCenterEntDetails) {
                    for(RescueRecordDetails rr: ((RescueCenterEntDetails) enterprise).getRecordDirectory().getRescueRecordList()) {
                        AnimalDetails a = rr.getRescuedanimal();
                        System.out.println(a.getAnimaltype());
                        if(a.getAnimaltype().equals(AnimalDetails.AnimalType.Cat)) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
    
    public float getFemaleRatio() {
        float ratio;
        float fCount = 0;
        for (NetworkDetails network : system.getNetworkList()) {
            for (EnterpriseDetails enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if(enterprise instanceof RescueCenterEntDetails) {
                    for(RescueRecordDetails rr: ((RescueCenterEntDetails) enterprise).getRecordDirectory().getRescueRecordList()) {
                        if(rr.getRescuedanimal().getAnimalgender() != null) {
                            if(rr.getRescuedanimal().getAnimalgender().equals("F")) {
                                fCount++;
                            }
                        }
                    }
                }
            }
        }
        ratio = fCount / getTotalValue();
        return ratio;     
    }
    
    public float getNoBreedRatio() {
        float ratio;
        float count = 0;
        for (NetworkDetails network : system.getNetworkList()) {
            for (EnterpriseDetails enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if(enterprise instanceof RescueCenterEntDetails) {
                    if(((RescueCenterEntDetails) enterprise).getRecordDirectory().getRescueRecordList() != null) {
                        for(RescueRecordDetails rr: ((RescueCenterEntDetails) enterprise).getRecordDirectory().getRescueRecordList()) {
                            AnimalDetails a = rr.getRescuedanimal();
                            if(a.getAnimaltype().equals(AnimalDetails.AnimalType.Cat)
                                    ||  a.getAnimaltype().equals(AnimalDetails.AnimalType.Dog)) {
                                if(a.getAnimaltype().equals(AnimalDetails.AnimalType.Cat)) {
                                    if(((CatDetails)a).getCatbreed() != null) {
                                        if( ((CatDetails)a).getCatbreed().equals("None")) {
                                            count++;
                                        }
                                    }
                                }
                                else if(a.getAnimaltype().equals(AnimalDetails.AnimalType.Dog)) {
                                    if(((DogDetails)a).getDogbreed()!=null) {
                                        if( ((DogDetails)a).getDogbreed().equals("None")) {
                                            count++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    else {
                        return 0;
                    }
                }
            }
        }
        ratio = count / getTotalValue();
        return ratio;     
    }
    
    public float getUnhealthyRatio() {
        float ratio;
        float count = 0;
        for (NetworkDetails network : system.getNetworkList()) {
            for (EnterpriseDetails enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if(enterprise instanceof RescueCenterEntDetails) {
                    for(RescueRecordDetails rr: ((RescueCenterEntDetails) enterprise).getRecordDirectory().getRescueRecordList()) {
                        if(rr.isHealth() == false) {
                            count++;
                        }
                    }
                }
            }
        }
        ratio = count / getTotalValue();
        return ratio;    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        lblanalysisani = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTypes = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRatios = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        backJButton.setForeground(new java.awt.Color(255, 51, 51));
        backJButton.setText("Previous");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        lblanalysisani.setBackground(new java.awt.Color(255, 255, 255));
        lblanalysisani.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblanalysisani.setForeground(new java.awt.Color(255, 51, 51));
        lblanalysisani.setText("ANALYSIS OF ANIMALS");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel2.setText("Total Rescued Numbers:");

        lblTotal.setBackground(new java.awt.Color(255, 255, 255));
        lblTotal.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        lblTotal.setText("<Value>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblTotal))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TYPES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 15))); // NOI18N

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
        tblTypes.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(tblTypes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RATIOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 15))); // NOI18N

        tblRatios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Percentage"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRatios.setSelectionBackground(new java.awt.Color(255, 204, 204));
        tblRatios.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblRatios);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJButton)
                .addGap(63, 63, 63)
                .addComponent(lblanalysisani)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backJButton)
                    .addComponent(lblanalysisani))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblanalysisani;
    private javax.swing.JTable tblRatios;
    private javax.swing.JTable tblTypes;
    // End of variables declaration//GEN-END:variables
}
