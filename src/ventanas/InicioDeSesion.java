package ventanas;

import clases.InicioSesion;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InicioDeSesion extends javax.swing.JFrame {

    //ATRIBUTO ESTATICO DE LA GUI INICIOSESION PARA PASAR SU VALOR AL MENU PRINCIPAL.
    public static String usuario;
    
    public InicioDeSesion() {
        initComponents();
        //PARA QUE EL USUARIO NO PUEDA HACER GRANDE LA PANTALLA DEL LOGIN.
        setResizable(false);
        //PARA QUE LA PANTALLA APAREZCA EN EL MEDIO.
        setLocationRelativeTo(null);
        setTitle("BerniEduca - Iniciar Sesión");

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

        jPanel1 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        fondoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtUsuario.setToolTipText("");
        txtUsuario.setBorder(null);
        txtUsuario.setMaximumSize(new java.awt.Dimension(20, 50));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 235, 171, 34));
        txtUsuario.getAccessibleContext().setAccessibleName("");

        txtContraseña.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtContraseña.setBorder(null);
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 325, 171, 34));

        btnIngresar.setBackground(new java.awt.Color(124, 0, 124));
        btnIngresar.setToolTipText("");
        btnIngresar.setAutoscrolls(true);
        btnIngresar.setBorder(null);
        btnIngresar.setBorderPainted(false);
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.setFocusPainted(false);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 280, 138, 41));

        btnRegistrar.setBorder(null);
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setFocusable(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 387, 136, 30));

        fondoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login.png"))); // NOI18N
        jPanel1.add(fondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        //CREAMOS VARIABLES QUE GUARDARA LO QUE DIGITE NUESTRO USUARIO EN LAS CAJAS DE TEXTO
        usuario = txtUsuario.getText().trim();
        String contraseña = txtContraseña.getText().trim();
        //CREAMOS UNA VARIABLE QUE CAPTURE LA FECHA Y HORA DE LA COMPUTADORA.
        Date date = new Date();
        DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //INSTANCIAMOS NUESTRA CLASE INICIOSESION PARA PASARLE POR PARAMETROS LO QUE DIJITE EL USUARIO. 
        InicioSesion iniciosesion = new InicioSesion(usuario, contraseña, fechaHora.format(date));

        //LLAMAMOS EL METODO INGRESAR.
        iniciosesion.ingresar();
        
        //SI LLEGA A ENTRAR CON SU CUENTA, VA CERRAR LA INTERFAZ DE LOGIN.
        if(InicioSesion.cerrarLogin){
            dispose();
        }
        
        //PARA BORRAR LAS CASILLAS CADA VEZ QUE DE CLIC ESE BOTON.
        txtUsuario.setText("");
        txtContraseña.setText("");
        txtUsuario.requestFocus();  //para que el cursor aparezca en la caja de usuario.
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        RegistroUsuarios ru = new RegistroUsuarios();
        ru.setVisible(true);
    }//GEN-LAST:event_btnRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(InicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InicioDeSesion().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel fondoLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
