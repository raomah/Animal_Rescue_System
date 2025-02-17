/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.DeliverRole;

import Business.Adopt.AdoptRecord;
import Business.Deliver.DeliveryHistoryDetails;
import Business.EcoSystem.EcoSystem;
import Business.Enterprises.EnterpriseDetails;
import Business.Enterprises.RescueCenterEntDetails;
import Business.Organisation.DeliveryOrganisation;
import Business.UserAccount.UserAccountDetails;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class DeliveryWorkspace extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryWorkspace
     */
    
    private JPanel container;
    private RescueCenterEntDetails enterprise;
    private DeliveryOrganisation organization;
    private UserAccountDetails userAccount;
    

    public DeliveryWorkspace(JPanel container, EnterpriseDetails enterprise, DeliveryOrganisation deliveryOrg, UserAccountDetails userAccount) {
        initComponents();
        this.container = container;
        this.enterprise = (RescueCenterEntDetails)enterprise;
        this.organization = deliveryOrg;
        this.userAccount = userAccount;
        
        populateTable();
    }

    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel)tblDelivery.getModel();
        model.setRowCount(0);
        
        for(DeliveryHistoryDetails dh: enterprise.getDeliveryHistoryDirectory().getDeliveryHistoryList()) {
            if(dh.getStatus().equals(DeliveryHistoryDetails.WAITING_STATUS)) {
                Object[] row = new Object[4];
                row[0] = dh;
                row[1] = dh.getAnimal().getAnimaltype().getValue();
                row[3] = dh.getAdoptername().getAddress().getCityName();
                row[3] = dh.getAdoptername().getFirstName() + " " + dh.getAdoptername().getLastName();
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

        DeliveryServices = new javax.swing.JLabel();
        btnAssign = new javax.swing.JButton();
        btndeliveries = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDelivery = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        DeliveryServices.setBackground(new java.awt.Color(255, 255, 255));
        DeliveryServices.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DeliveryServices.setForeground(new java.awt.Color(255, 51, 51));
        DeliveryServices.setText("DELIVERY SERVICES");

        btnAssign.setBackground(new java.awt.Color(255, 255, 255));
        btnAssign.setForeground(new java.awt.Color(255, 51, 51));
        btnAssign.setText("Assign To Myself");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btndeliveries.setBackground(new java.awt.Color(255, 255, 255));
        btndeliveries.setForeground(new java.awt.Color(255, 51, 51));
        btndeliveries.setText("Previous Deliveries");
        btndeliveries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeliveriesActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        tblDelivery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Delivery Date", "Animal Type", "City", "Receiver Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDelivery.setSelectionBackground(new java.awt.Color(255, 204, 204));
        tblDelivery.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblDelivery);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(DeliveryServices))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btndeliveries)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAssign)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(DeliveryServices)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndeliveries, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDelivery.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        DeliveryHistoryDetails dh = (DeliveryHistoryDetails)tblDelivery.getValueAt(selectedRow, 0);
        UserAccountDetails ua = userAccount;
        dh.setCourierdetail(ua.getEmployee());
        dh.setStatus(DeliveryHistoryDetails.ASSIGNED_STATUS);

        populateTable();

        JOptionPane.showMessageDialog(null, "Work has been assigned to you. Please view it in My Deliveries panel.");
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btndeliveriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeliveriesActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) container.getLayout();
        container.add("MyDeliveriesJPanel", new MyDeliveriesJPanel(container, enterprise, organization, userAccount));
        layout.next(container);
    }//GEN-LAST:event_btndeliveriesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DeliveryServices;
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btndeliveries;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDelivery;
    // End of variables declaration//GEN-END:variables
}
