/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package co.unicauca.openmarket.client.presentation;

import co.unicauca.openmarket.client.domain.User;
import co.unicauca.openmarket.client.domain.services.UserService;
import co.unicauca.openmarket.client.infra.Messages;
import java.awt.Window;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;

/**
 *
 * @author Personal
 */
public class JDialogScore extends javax.swing.JDialog {
    
    private UserService userService;
    private Long userSellerId;
    /**
     * Creates new form JDialogScore
     */
    public JDialogScore(java.awt.Dialog parent, boolean modal, UserService userService , Long userSellerId) {
        super(parent, modal);
        this.userService = userService;
        this.userSellerId = userSellerId;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSliderScore = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        jButtonScore = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 157, 243));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CALIFICACIÓN DEL SERVICIO");

        jSliderScore.setMajorTickSpacing(1);
        jSliderScore.setMaximum(5);
        jSliderScore.setMinimum(1);
        jSliderScore.setMinorTickSpacing(1);
        jSliderScore.setPaintLabels(true);
        jSliderScore.setPaintTicks(true);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Califica al vendedor:");

        jButtonScore.setBackground(new java.awt.Color(0, 70, 144));
        jButtonScore.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonScore.setForeground(new java.awt.Color(255, 255, 255));
        jButtonScore.setText("Enviar Calificacion");
        jButtonScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonScoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonScore, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSliderScore, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addGap(71, 71, 71)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSliderScore, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonScore, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonScoreActionPerformed
        try {
            getScore();
        } catch (Exception ex) {
            Logger.getLogger(JDialogScore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonScoreActionPerformed
    
    private void getScore() throws Exception{
        
        User userSeller = this.userService.findById(userSellerId);
        if(userSeller!=null){
            int score = this.jSliderScore.getValue();
            userSeller.setScore((userSeller.getScore() + score)/2);
            boolean bandera = this.userService.edit(userSeller);
            if(bandera){
                Messages.showMessageDialog("La compra y calificación realizadas exitosamente", "Compra producto");
//                this.dispose();
                Window window = SwingUtilities.getWindowAncestor(this);
                if (window instanceof JDialog) {
                    JDialog dialogPadre = (JDialog) window;
                    dialogPadre.dispose();
                }
            }else{
                Messages.errorMessage("Ocurrio un error inesperado", "Calificación Servicio");
            }
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonScore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSliderScore;
    // End of variables declaration//GEN-END:variables
}
