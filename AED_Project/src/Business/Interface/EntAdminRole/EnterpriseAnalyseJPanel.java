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
 * @author Neha
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
    
    //Public int 

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

        btnPrevious = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTypes = new javax.swing.JTable();
        lblRatio = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRatios = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });
        add(btnPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, 25));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 41, 41));
        jLabel1.setText("Enterprise Level Analysis");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel2.setText("Total Quantity Rescued:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        lblTotal.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        lblTotal.setText("<Value>");
        add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        lblType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblType.setText("Types");
        add(lblType, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        tblTypes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 15), new java.awt.Color(255, 41, 41))); // NOI18N
        tblTypes.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 409, 85));

        lblRatio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRatio.setText("Ratios");
        add(lblRatio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        tblRatios.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 409, 85));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnPreviousActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrevious;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblRatio;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblType;
    private javax.swing.JTable tblRatios;
    private javax.swing.JTable tblTypes;
    // End of variables declaration//GEN-END:variables
}
