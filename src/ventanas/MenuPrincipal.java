package ventanas;

import java.awt.Image;
import java.awt.Toolkit;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        //PARA QUE EL USUARIO NO PUEDA HACER GRANDE LA PANTALLA DEL LOGIN.
        setResizable(false);
        //PARA QUE LA PANTALLA APAREZCA EN EL MEDIO.
        setLocationRelativeTo(null);
    }

    //CREAMOS METODO SOBREESCRITO PARA ESTABLECER EL ICONO DE NUESTRO SISTEMA.
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/logo.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGAyuda = new javax.swing.JButton();
        btnGLecciones = new javax.swing.JButton();
        btnGPerfil = new javax.swing.JButton();
        btnGAbout = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        btnLecciones = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();
        fondoMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGAyuda.setBorder(null);
        btnGAyuda.setBorderPainted(false);
        btnGAyuda.setContentAreaFilled(false);
        btnGAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGAyuda.setFocusPainted(false);
        getContentPane().add(btnGAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 152, 145, 148));

        btnGLecciones.setBorder(null);
        btnGLecciones.setBorderPainted(false);
        btnGLecciones.setContentAreaFilled(false);
        btnGLecciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGLecciones.setFocusPainted(false);
        getContentPane().add(btnGLecciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 153, 145, 148));

        btnGPerfil.setBorder(null);
        btnGPerfil.setBorderPainted(false);
        btnGPerfil.setContentAreaFilled(false);
        btnGPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGPerfil.setFocusPainted(false);
        getContentPane().add(btnGPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 150, 145, 150));

        btnGAbout.setBorder(null);
        btnGAbout.setBorderPainted(false);
        btnGAbout.setContentAreaFilled(false);
        btnGAbout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGAbout.setFocusable(false);
        getContentPane().add(btnGAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 152, 145, 147));

        btnRegresar.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.setAlignmentY(0.0F);
        btnRegresar.setBorder(null);
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.setFocusPainted(false);
        btnRegresar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegresar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 358, 56, 50));

        btnPerfil.setBorderPainted(false);
        btnPerfil.setContentAreaFilled(false);
        btnPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(btnPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 284, 134, 25));

        btnLecciones.setBorderPainted(false);
        btnLecciones.setContentAreaFilled(false);
        btnLecciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeccionesActionPerformed(evt);
            }
        });
        getContentPane().add(btnLecciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 285, 134, 25));

        btnAyuda.setBorder(null);
        btnAyuda.setBorderPainted(false);
        btnAyuda.setContentAreaFilled(false);
        btnAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 285, 132, 26));

        btnAbout.setBorder(null);
        btnAbout.setBorderPainted(false);
        btnAbout.setContentAreaFilled(false);
        btnAbout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbout.setFocusPainted(false);
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });
        getContentPane().add(btnAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 283, 132, 26));

        fondoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu_principal.png"))); // NOI18N
        getContentPane().add(fondoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnLeccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeccionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLeccionesActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAboutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnGAbout;
    private javax.swing.JButton btnGAyuda;
    private javax.swing.JButton btnGLecciones;
    private javax.swing.JButton btnGPerfil;
    private javax.swing.JButton btnLecciones;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel fondoMenu;
    // End of variables declaration//GEN-END:variables
}
