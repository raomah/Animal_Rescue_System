/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SysAdminRole;

import Business.EcoSystem.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class AnalysisJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AnalysisJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem system;
    
    public AnalysisJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton1 = new javax.swing.JButton();
        lblanalysisadoptions = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnAnimals = new javax.swing.JButton();
        btnAdoptions = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        backJButton1.setForeground(new java.awt.Color(255, 51, 51));
        backJButton1.setText("Previous");
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });

        lblanalysisadoptions.setBackground(new java.awt.Color(255, 255, 255));
        lblanalysisadoptions.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblanalysisadoptions.setForeground(new java.awt.Color(255, 51, 51));
        lblanalysisadoptions.setText("ANALYSIS FIGURES");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAnimals.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnAnimals.setText("ANIMALS");
        btnAnimals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimalsActionPerformed(evt);
            }
        });

        btnAdoptions.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnAdoptions.setText(" ADOPTIONS");
        btnAdoptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdoptionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdoptions, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnimals, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnAnimals, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnAdoptions, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblanalysisadoptions)
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJButton1)
                .addGap(7, 7, 7)
                .addComponent(lblanalysisadoptions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnimalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimalsActionPerformed
        // TODO add your handling code here:
        AnalyseAnimalsJPanel analyseAnimalsJPanel = new AnalyseAnimalsJPanel(userProcessContainer,system);
        userProcessContainer.add("analyseAnimalsJPanel",analyseAnimalsJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAnimalsActionPerformed

    private void btnAdoptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdoptionsActionPerformed
        // TODO add your handling code here:
        AnalyseAdoptionsJPanel analyseAdoptionsJPanel=new AnalyseAdoptionsJPanel(userProcessContainer,system);
        userProcessContainer.add("analyseAdoptionsJPanel",analyseAdoptionsJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAdoptionsActionPerformed

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton1;
    private javax.swing.JButton btnAdoptions;
    private javax.swing.JButton btnAnimals;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblanalysisadoptions;
    // End of variables declaration//GEN-END:variables
}
