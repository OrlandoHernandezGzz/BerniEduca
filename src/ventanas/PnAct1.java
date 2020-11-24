/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import javax.swing.ImageIcon;

/**
 *
 * @author PROPIETARIO
 */
public class PnAct1 extends javax.swing.JPanel {

    /**
     * Creates new form PnAct1
     */
    public PnAct1() {
        initComponents();
        
         //PARA AGREGAR IMAGENES A LOS BOTONES.
        //ImageIcon act1_ejerc1 = new ImageIcon("src/img/act1_ejerc1.png");
        //lblej1.setIcon(act1_ejerc1);
        ImageIcon act1_ejerc1 = new ImageIcon("src/img/act1_ejerc1_1.png");
        //Adaptamos la imagen al tamaño del JLabel con la clase ICON.
       // Icon wallpaperScaled = new ImageIcon(act1_ejerc1.getImage().getScaledInstance(lblej1.getWidth(),
        //        lblej1.getHeight(), Image.SCALE_DEFAULT));
        //Agregamos la imagen ya escalable al JLabel.
        lblej1.setIcon(act1_ejerc1);
        //this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblej1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(lblej1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblej1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(195, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblej1;
    // End of variables declaration//GEN-END:variables
}
