/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdoptorRole;

import Business.Adopt.AdopterDetail;
import Business.EcoSystem.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class AdoptorPage extends javax.swing.JPanel {

    /**
     * Creates new form AdoptorPage
     */
    private JPanel container;
    private EcoSystem business;
    private AdopterDetail adoptor;
    
    public AdoptorPage(JPanel container, EcoSystem business, AdopterDetail adoptor) {
        initComponents();
        this.container  = container;
        this.business = business;
        this.adoptor = adoptor;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAnimal = new javax.swing.JLabel();
        btnMyAdoptionlist = new javax.swing.JButton();
        btnAdoptList = new javax.swing.JButton();
        btnEditInfo = new javax.swing.JButton();

        lblAnimal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAnimal.setText("Animal Rescue Center");

        btnMyAdoptionlist.setText("My Adoption list");
        btnMyAdoptionlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyAdoptionlistActionPerformed(evt);
            }
        });

        btnAdoptList.setText("Adoption details");
        btnAdoptList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdoptListActionPerformed(evt);
            }
        });

        btnEditInfo.setText("Edit Details");
        btnEditInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMyAdoptionlist, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdoptList, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addComponent(lblAnimal)
                .addGap(163, 163, 163))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblAnimal)
                .addGap(34, 34, 34)
                .addComponent(btnAdoptList, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnMyAdoptionlist, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnEditInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMyAdoptionlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyAdoptionlistActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) container.getLayout();
        container.add("MyAdoptionsJPanel", new MyAdoptPage(container, business, adoptor));
        layout.next(container);
    }//GEN-LAST:event_btnMyAdoptionlistActionPerformed

    private void btnAdoptListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdoptListActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) container.getLayout();
        container.add("AdoptorListJPanel", new AdoptlistPage(container, business, adoptor));
        layout.next(container);
    }//GEN-LAST:event_btnAdoptListActionPerformed

    private void btnEditInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditInfoActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) container.getLayout();
        container.add("AdoptorInformationJPanel", new AdoptInfoPage(container, adoptor));
        layout.next(container);
    }//GEN-LAST:event_btnEditInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdoptList;
    private javax.swing.JButton btnEditInfo;
    private javax.swing.JButton btnMyAdoptionlist;
    private javax.swing.JLabel lblAnimal;
    // End of variables declaration//GEN-END:variables
}
