/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.EntAdminRole;

import Business.Animals.AnimalDetails;
import Business.Animals.CatDetails;
import Business.Animals.DogDetails;
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
public class EnterpriseAnalyseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AnalyseJPanel
     */
    
    private JPanel container;
    private RescueCenterEntDetails enterprise;
    
    public EnterpriseAnalyseJPanel(JPanel userProcessContainer, EnterpriseDetails enterprise) {
        initComponents();
        this.container = userProcessContainer;
        this.enterprise = (RescueCenterEntDetails)enterprise;
        lblTotal.setText(String.valueOf(getTotalValue()));
        populateTypeTable();
        populateRatioTable();
    }

    public int getTotalValue() {
        int sum;
        sum = enterprise.getRecordDirectory().getRescueRecordList().size();
        return sum;
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
        Object[] row = new Object[2];
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
    
    public float getDogCount() {
        float count = 0;
        for(RescueRecordDetails rr: enterprise.getRecordDirectory().getRescueRecordList()) {
            AnimalDetails a = rr.getRescuedanimal();
            if(a.getAnimaltype().equals(AnimalDetails.AnimalType.Dog)) {
                count++;
            }
        }
        return count;
    }
    
    public float getCatCount() {
        float count = 0;
        for(RescueRecordDetails rr: enterprise.getRecordDirectory().getRescueRecordList()) {
            AnimalDetails a = rr.getRescuedanimal();
            System.out.println(a.getAnimaltype());
            if(a.getAnimaltype().equals(AnimalDetails.AnimalType.Cat)) {
                count++;
            }
        }
        return count;
    }
    
    public float getFemaleRatio() {
        float ratio;
        float fCount = 0;
        for(RescueRecordDetails rr: enterprise.getRecordDirectory().getRescueRecordList()) {
            if(rr.getRescuedanimal().getAnimalgender() != null) {
                if(rr.getRescuedanimal().getAnimalgender().equals("F")) {
                    fCount++;
                }
            }
        }
        ratio = fCount / getTotalValue();
        return ratio;     
    }
    
    public float getNoBreedRatio() {
        float ratio;
        float count = 0;
        
        if(enterprise.getRecordDirectory().getRescueRecordList() != null) {
            return 0;
        }
        else{
            for(RescueRecordDetails rr: enterprise.getRecordDirectory().getRescueRecordList()) {
                AnimalDetails a = rr.getRescuedanimal();
                if(a.getAnimaltype().equals(AnimalDetails.AnimalType.Cat)
                        ||  a.getAnimaltype().equals(AnimalDetails.AnimalType.Dog)) {
                    if(a.getAnimaltype().equals(AnimalDetails.AnimalType.Cat)) {
                        if( ((CatDetails)a).getCatbreed().equals("None")) {
                            count++;
                        }
                    }
                    else if(a.getAnimaltype().equals(AnimalDetails.AnimalType.Dog)) {
                        if( ((DogDetails)a).getDogbreed().equals("None")) {
                            count++;
                        }
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
        for(RescueRecordDetails rr: enterprise.getRecordDirectory().getRescueRecordList()) {
            if(rr.isHealth() == false) {
                count++;
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

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTypes = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRatios = new javax.swing.JTable();

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Enterprise Level Analysis");

        jLabel2.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel2.setText("Total Quantity Rescued:");

        lblTotal.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        lblTotal.setText("<Value>");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Types");

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

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Ratios");

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
        jScrollPane1.setViewportView(tblRatios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34)
                        .addComponent(lblTotal))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblTotal))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblRatios;
    private javax.swing.JTable tblTypes;
    // End of variables declaration//GEN-END:variables
}
