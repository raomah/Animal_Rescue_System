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
        jLabel1 = new javax.swing.JLabel();
        btnDetail = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMyInspections = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setForeground(new java.awt.Color(255, 51, 51));
        btnBack.setText("Previous");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("INSPECTION DETAIL");

        btnDetail.setBackground(new java.awt.Color(255, 255, 255));
        btnDetail.setForeground(new java.awt.Color(255, 51, 51));
        btnDetail.setText("View Details");
        btnDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 221, 221));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
        tblMyInspections.setSelectionBackground(new java.awt.Color(255, 204, 204));
        tblMyInspections.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblMyInspections);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDetail)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)))
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMyInspections;
    // End of variables declaration//GEN-END:variables
}
