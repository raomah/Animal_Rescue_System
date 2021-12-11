/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdoptInspectRole;

import Business.Adopt.AdoptRecord;
import Business.Employees.EmployeeDetails;
import Business.Enterprises.RescueCenterEntDetails;
import Business.Organisation.AdoptionOrganisation;
import Business.UserAccount.UserAccountDetails;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class MyInspectPanel extends javax.swing.JPanel {

    /**
     * Creates new form MyInspectPanel
     */
    private JPanel container;
    private RescueCenterEntDetails enterprise;
    private AdoptionOrganisation organization;
    private UserAccountDetails userAccount;
    
    MyInspectPanel(JPanel container, RescueCenterEntDetails enterprise, AdoptionOrganisation organization, UserAccountDetails userAccount) {
        initComponents();
        this.container = container;
        this.enterprise = (RescueCenterEntDetails)enterprise;
        this.organization = organization;
        this.userAccount = userAccount;
        
        populateTable();
    }
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel)tblMyInspections.getModel();
        model.setRowCount(0);
        EmployeeDetails me = userAccount.getEmployee();
        
        for(AdoptRecord ar: organization.getAdoptionRecordDirectory().getAdoptionRecordList()) {
            if(ar.getInspectorName() != null)  {
                if(ar.getStatus().equals(AdoptRecord.PROCESSING_STATUS) && ar.getInspectorName() == me) {
                    Object[] row = new Object[4];
                    row[0] = ar;
                    row[1] = ar.getAdoptorName().getFirstName() + " " + ar.getAdoptorName().getLastName();
                    row[2] = ar.getAnimal().getAnimalid();
                    row[3] = "Processing";
                    model.addRow(row);
                }
            }
        }
        for(AdoptRecord ar: organization.getAdoptionRecordDirectory().getAdoptionRecordList()) {
            if( (ar.getStatus().equals(AdoptRecord.APPROVED_STATUS) 
                    || ar.getStatus().equals(AdoptRecord.REJECTED_STATUS)) 
                    && ar.getInspectorName() == me ) {
                Object[] row = new Object[4];
                row[0] = ar;
                row[1] = ar.getAdoptorName().getFirstName() + " " + ar.getAdoptorName().getLastName();
                row[2] = ar.getAnimal().getAnimalid();
                if(ar.getStatus().equals(AdoptRecord.APPROVED_STATUS)) {
                    row[3] = "Approved";
                }
                else if(ar.getStatus().equals(AdoptRecord.REJECTED_STATUS)) {
                    row[3] = "Rejected";
                }
                else if(ar.getStatus().equals(AdoptRecord.INPROGRESS_STATUS)) {
                    row[3] = "Adopting";
                }
                model.addRow(row);
            }
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

        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMyInspections = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnDetail = new javax.swing.JButton();

        btnBack.setText("<< Previous");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblMyInspections.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Submitted Date", "Applicant Name", "Animal ID", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMyInspections);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Inspections");

        btnDetail.setText("Display Details");
        btnDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDetail)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnBack)
                            .addGap(91, 91, 91)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout)container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblMyInspections.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        AdoptRecord ar = (AdoptRecord)tblMyInspections.getValueAt(selectedRow, 0);
        CardLayout layout = (CardLayout) container.getLayout();
        container.add("SeeInspectionDetailJPanel", new CheckInspectInfo(container, enterprise, ar));
        layout.next(container);
    }//GEN-LAST:event_btnDetailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDetail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMyInspections;
    // End of variables declaration//GEN-END:variables
}
