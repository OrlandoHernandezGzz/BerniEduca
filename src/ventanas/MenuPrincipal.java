package ventanas;

import clases.Usuario;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame {

    //VARIABLE PARA IDENTIFICAR EL USUARIO QUE INICIO SESION.
    String user = InicioDeSesion.usuario;
    
    //VARIABLES DE BARRA
    JMenuBar barra;
    JMenu menu_perfil;
    JMenu menu_ayuda;
    JMenu menu_cerrar_sesion;
    JMenuItem menuItem_ver_actividad;
    JMenuItem menuItem_tutorial;
    JMenuItem menuItem_about;

    private void crearMenu() {
        barra = new JMenuBar();
        menu_perfil = new JMenu("Perfil");
        menu_ayuda = new JMenu("Ayuda");
        menu_cerrar_sesion = new JMenu("Cerrar Sesión");
        menuItem_ver_actividad = new JMenuItem("Ver Actividad");
        menuItem_tutorial = new JMenuItem("Tutorial");
        menuItem_about = new JMenuItem("Acerca de Nosotros");
        menu_perfil.add(menuItem_ver_actividad);
        menu_ayuda.add(menuItem_tutorial);
        menu_ayuda.add(menuItem_about);
        barra.add(menu_perfil);
        barra.add(menu_ayuda);
        barra.add(menu_cerrar_sesion);
        setJMenuBar(barra);

        //EVENTOS DEL MENU
        menuItem_about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                JOptionPane.showMessageDialog(MenuPrincipal.this, "Desarrollado por Estudiantes de la FIME", "Acerca de nosotros", JOptionPane.INFORMATION_MESSAGE);
                AboutTeam a = new AboutTeam();
                a.setVisible(true);
            }
        });
        //EVENTOS DEL MENU
        menuItem_tutorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                //CODIGO PARA ABRIR EL PDF DE NUESTRO MANUAL USUARIO.
                try {
                    Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + "src\\ManualUser\\resumenEQ4.pdf");
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Error en el archivo pdf" + e);
                }
            }
        });
    }

    public MenuPrincipal() {
        crearMenu();
        initComponents();
        //PARA QUE EL USUARIO NO PUEDA HACER GRANDE LA PANTALLA DEL LOGIN.
        setResizable(false);
        //PARA QUE LA PANTALLA APAREZCA EN EL MEDIO.
        setLocationRelativeTo(null);
        setTitle("BerniEduca - Bienvenido a Menú Principal " + user);
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
        btnSalir = new javax.swing.JButton();
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
        btnGAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGAyudaActionPerformed(evt);
            }
        });
        getContentPane().add(btnGAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 152, 145, 148));

        btnGLecciones.setBorder(null);
        btnGLecciones.setBorderPainted(false);
        btnGLecciones.setContentAreaFilled(false);
        btnGLecciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGLecciones.setFocusPainted(false);
        btnGLecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGLeccionesActionPerformed(evt);
            }
        });
        getContentPane().add(btnGLecciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 153, 145, 148));

        btnGPerfil.setBorder(null);
        btnGPerfil.setBorderPainted(false);
        btnGPerfil.setContentAreaFilled(false);
        btnGPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGPerfil.setFocusPainted(false);
        btnGPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(btnGPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 150, 145, 150));

        btnGAbout.setBorder(null);
        btnGAbout.setBorderPainted(false);
        btnGAbout.setContentAreaFilled(false);
        btnGAbout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGAbout.setFocusable(false);
        btnGAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGAboutActionPerformed(evt);
            }
        });
        getContentPane().add(btnGAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 152, 145, 147));

        btnSalir.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setAlignmentY(0.0F);
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setFocusPainted(false);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 358, 60, 50));

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

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       //CREAMOS UNA VARIABLE QUE CAPTURE LA FECHA Y HORA DE LA COMPUTADORA.
        Date date = new Date();
        DateFormat fechaHora2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //INSTANCIAMOS NUESTRA CLASE INICIOSESION PARA PASARLE POR PARAMETROS LO QUE DIJITE EL USUARIO. 
        Usuario cerrarSesion = new Usuario(fechaHora2.format(date));
       
        //LLAMAMOS EL METODO CERRAR SESION.
        cerrarSesion.cerrarSesionUsuario();
        
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnLeccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeccionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLeccionesActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        //CODIGO PARA ABRIR EL PDF DE NUESTRO MANUAL USUARIO.
        try {
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + "src\\ManualUser\\resumenEQ4.pdf");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error en el archivo pdf" + e);
        }
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAboutActionPerformed

    private void btnGAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGAboutActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(MenuPrincipal.this, "Desarrollado por Estudiantes de la FIME", "Acerca de nosotros", JOptionPane.INFORMATION_MESSAGE);
        AboutTeam a = new AboutTeam();
        a.setVisible(true);
    }//GEN-LAST:event_btnGAboutActionPerformed

    private void btnGAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGAyudaActionPerformed
        //CODIGO PARA ABRIR EL PDF DE NUESTRO MANUAL USUARIO.
        try {
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + "src\\ManualUser\\resumenEQ4.pdf");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error en el archivo pdf" + e);
        }
    }//GEN-LAST:event_btnGAyudaActionPerformed

    private void btnGPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGPerfilActionPerformed
        PerfilUsuario perfil = new PerfilUsuario();
        perfil.setVisible(true);
    }//GEN-LAST:event_btnGPerfilActionPerformed

    private void btnGLeccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGLeccionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGLeccionesActionPerformed

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
            @Override
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
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel fondoMenu;
    // End of variables declaration//GEN-END:variables
}
