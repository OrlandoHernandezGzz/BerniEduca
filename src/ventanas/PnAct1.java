/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author PROPIETARIO
 */
public class PnAct1 extends javax.swing.JPanel {
    
    //CONTADOR DE NUMERO DE INTENTOS.
    int intentos = 0;
    
    public PnAct1() {
        initComponents();
        
         //PARA AGREGAR IMAGENES A LOS BOTONES.
        //ImageIcon act1_ejerc1 = new ImageIcon("src/img/act1_ejerc1.png");
        //lblej1.setIcon(act1_ejerc1);
        ImageIcon act1_ejerc1 = new ImageIcon("src/img/tunas.png");
        //Adaptamos la imagen al tamaño del JLabel con la clase ICON.
       // Icon wallpaperScaled = new ImageIcon(act1_ejerc1.getImage().getScaledInstance(lblej1.getWidth(),
        //        lblej1.getHeight(), Image.SCALE_DEFAULT));
        //Agregamos la imagen ya escalable al JLabel.
        lblej1.setIcon(act1_ejerc1);
        //this.repaint();
        
        ImageIcon act_ejerc2 = new ImageIcon("src/img/melones.png");
        lblej2.setIcon(act_ejerc2);
        
        ImageIcon act_ejerc3 = new ImageIcon("src/img/uvas.png");
        lblej3.setIcon(act_ejerc3);
        
        ImageIcon act_ejerc4 = new ImageIcon("src/img/naranjas.png");
        lblej4.setIcon(act_ejerc4);
        
        ImageIcon verificar = new ImageIcon("src/img/verificar.png");
        btnResolver.setIcon(verificar);
        
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblej1 = new javax.swing.JLabel();
        lblej2 = new javax.swing.JLabel();
        lblej3 = new javax.swing.JLabel();
        lblej4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtResp3 = new javax.swing.JTextField();
        txtResp1 = new javax.swing.JTextField();
        txtResp2 = new javax.swing.JTextField();
        txtResp4 = new javax.swing.JTextField();
        btnResolver = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 102));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel1.setText("Si hay 5 bolsas iguales, ¿cuántas tunas hay en total?");

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel2.setText("Si hay 7 cajas iguales, ¿cuántos melones hay en total?");

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel3.setText("Si hay 6 racimos iguales, ¿cuántas uvas hay en total?");

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel4.setText("Si hay 8 montones iguales, ¿cuántas mandarinas hay en total?");

        txtResp3.setBackground(new java.awt.Color(255, 255, 255));
        txtResp3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtResp3.setForeground(new java.awt.Color(0, 0, 0));

        txtResp1.setBackground(new java.awt.Color(255, 255, 255));
        txtResp1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtResp1.setForeground(new java.awt.Color(0, 0, 0));

        txtResp2.setBackground(new java.awt.Color(255, 255, 255));
        txtResp2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtResp2.setForeground(new java.awt.Color(0, 0, 0));

        txtResp4.setBackground(new java.awt.Color(255, 255, 255));
        txtResp4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtResp4.setForeground(new java.awt.Color(0, 0, 0));

        btnResolver.setText("Verificar Respuestas");
        btnResolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResolver.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnResolver.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(lblej1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblej2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(319, 319, 319))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(txtResp3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(285, 285, 285)
                                .addComponent(txtResp4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addComponent(jLabel2)))
                        .addGap(231, 231, 231))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(txtResp1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtResp2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(lblej3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnResolver)
                        .addGap(107, 107, 107)
                        .addComponent(lblej4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(326, 326, 326))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblej1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(lblej2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblej3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblej4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnResolver, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtResp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResolverActionPerformed
       String resp1 = txtResp1.getText().trim();
       String resp2 = txtResp2.getText().trim();
       String resp3 = txtResp3.getText().trim();
       String resp4 = txtResp4.getText().trim();
  
       if(resp1.equals("30") && resp2.equals("56") && resp3.equals("54") && resp4.equals("80")){
           JOptionPane.showMessageDialog(null, "FELICIDADES LO HAS LOGRADO SIGUE ASI:)");
       } else {
           intentos++;
           JOptionPane.showMessageDialog(null, "ANIMO LO LOGRARAS RESOLVER." + "No Intentos: " + intentos);
       } 
       
       txtResp1.setText("");
       txtResp2.setText("");
       txtResp3.setText("");
       txtResp4.setText("");
    }//GEN-LAST:event_btnResolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblej1;
    private javax.swing.JLabel lblej2;
    private javax.swing.JLabel lblej3;
    private javax.swing.JLabel lblej4;
    private javax.swing.JTextField txtResp1;
    private javax.swing.JTextField txtResp2;
    private javax.swing.JTextField txtResp3;
    private javax.swing.JTextField txtResp4;
    // End of variables declaration//GEN-END:variables
}
