package ventanas;

import clases.TextPrompt;
import clases.Usuario;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class RegistroUsuarios extends javax.swing.JFrame {

    public RegistroUsuarios() {
        initComponents();
        setTitle("Registro de Usuarios");
        setLocationRelativeTo(null);
        setResizable(false);
        
        //AGREGAMOS A NUESTRAS CAJAS DE TEXTO TEXTO TRANSPARENTE.
        TextPrompt usuarioTransparente = new TextPrompt("Usuario", txtUsuario);
        TextPrompt telefonoTransparente = new TextPrompt("Telefono", txtTelefono);
        TextPrompt correoTransparente = new TextPrompt("Correo", txtCorreo);
        TextPrompt nombreTransparente = new TextPrompt("Nombre", txtNombre);
        TextPrompt apellidosTransparente = new TextPrompt("Apellidos", txtApellidos);
        TextPrompt contraseñaTransparente = new TextPrompt("Contraseña", txtPassword);
        TextPrompt confContraTransparente = new TextPrompt("Confirma tu contraseña", txtPasswordConf);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Genero = new javax.swing.ButtonGroup();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        F = new javax.swing.JRadioButton();
        M = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnRegistrar = new javax.swing.JButton();
        txtPasswordConf = new javax.swing.JPasswordField();
        FondoReg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setBorder(null);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 184, 331, 19));

        txtApellidos.setBorder(null);
        getContentPane().add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 214, 331, 19));

        txtCorreo.setBorder(null);
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 245, 331, 19));
        txtCorreo.getAccessibleContext().setAccessibleName("");

        txtTelefono.setBorder(null);
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 275, 331, 19));

        jPanel2.setBackground(new java.awt.Color(255, 196, 59));

        F.setBackground(new java.awt.Color(255, 196, 59));
        Genero.add(F);
        F.setFont(new java.awt.Font("AR CENA", 0, 18)); // NOI18N
        F.setText("Mujer");
        F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FMouseClicked(evt);
            }
        });

        M.setBackground(new java.awt.Color(255, 196, 59));
        Genero.add(M);
        M.setFont(new java.awt.Font("AR CENA", 0, 18)); // NOI18N
        M.setText("Hombre");
        M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MMouseClicked(evt);
            }
        });
        M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("AR CENA", 0, 18)); // NOI18N
        jLabel5.setText("Género");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(44, 44, 44)
                .addComponent(M, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(M)
                    .addComponent(jLabel5)
                    .addComponent(F))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 310, 30));

        txtUsuario.setBorder(null);
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 355, 331, 19));

        txtPassword.setBorder(null);
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 385, 331, 19));

        btnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, 140, 30));

        txtPasswordConf.setBorder(null);
        getContentPane().add(txtPasswordConf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 415, 331, 19));

        FondoReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registro.png"))); // NOI18N
        getContentPane().add(FondoReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //CREAMOS METODO SOBREESCRITO PARA ESTABLECER EL ICONO DE NUESTRO SISTEMA.
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/logo.png"));
        return retValue;
    }
     
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nombre, apellidos, telefono, correo, genero = "", usuario, password;
        nombre = txtNombre.getText(); 
        apellidos = txtApellidos.getText(); 
        telefono = txtTelefono.getText(); 
        correo = txtCorreo.getText();
        
        //CODIGO PARA PASAR EN TEXTO LO QUE SE SELECCIONA DE LOS RADIO BOTONES.
        if(M.isSelected()){
            genero = "M";
        }else if(F.isSelected()){
            genero = "F";
        }
        
        //IF PARA CONFIRMAR SI LA CONTRASEÑA LA ESCRIBIO BIEN.
        usuario = txtUsuario.getText(); 
        password = txtPassword.getText(); 
        if(usuario.equals(password)){
            //CREAMOS OBJETO DE LA CLASE USUARIO
            Usuario u = new Usuario(nombre, apellidos, correo, telefono, genero, usuario, password);
            u.registraUsuarios();
        } else {
            JOptionPane.showMessageDialog(null, "Contraseña NO confirmada.");
            txtPassword.setText("");
            txtPasswordConf.setText("");
        }    
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MActionPerformed

    private void MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MMouseClicked
        //codigo de el radio hombre
    }//GEN-LAST:event_MMouseClicked

    private void FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FMouseClicked
        // codigo de el radio mujer
    }//GEN-LAST:event_FMouseClicked

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
            java.util.logging.Logger.getLogger(RegistroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegistroUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton F;
    private javax.swing.JLabel FondoReg;
    public static javax.swing.ButtonGroup Genero;
    private javax.swing.JRadioButton M;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPasswordConf;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
