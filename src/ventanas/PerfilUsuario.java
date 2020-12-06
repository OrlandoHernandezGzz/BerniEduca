package ventanas;

import java.awt.Image;
import java.sql.Connection;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import clases.Conexion;
import java.awt.Toolkit;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class PerfilUsuario extends javax.swing.JFrame {

    //VARIABLE PARA IDENTIFICAR EL GENERO Y EL USUARIO DEL USUARIO QUE INICIO SESION.
    String gen = "";
    //String user1 = "miguel";
    String user1 = InicioDeSesion.usuario;
    Statement stmt =null;
    String iduser = "";
    String titulos[] = {"Numero de Actividad","Nombre de Actividad","Intentos"};
    String fila[] = new String[3];
    DefaultTableModel modelo;
    
    public PerfilUsuario() {
        initComponents();
        setTitle("Perfil De " + user1);
        setLocationRelativeTo(null);
        setResizable(false);
        ObtenerId();
        colocaImgPerfil();
        ConsultaDatos();
        ImageIcon fondo = new ImageIcon("src/img/FondoPerfil.png");
        //Adaptamos la imagen al tamaño del JLabel con la clase ICON.
        Icon wallpaperScaled = new ImageIcon(fondo.getImage().getScaledInstance(FondoPerfil.getWidth(),
                FondoPerfil.getHeight(), Image.SCALE_DEFAULT));
        //Agregamos la imagen ya escalable al JLabel.
        FondoPerfil.setIcon(wallpaperScaled);
        Connection conexion = Conexion.getConnection();
        try {
                if(conexion!=null)
                    System.out.println("Se ha establecido una conexion con la base de datos"+"\n"+"BerniEduca");
                stmt = conexion.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT a.num_act,a.nom_act,p.intento_act FROM prog_act p Join actividad a where idUsuario_fk='"+iduser+"'");
        modelo = new DefaultTableModel(null,titulos);
                while(rs.next()){
                    fila[0]=rs.getString("num_act");
                    fila[1]=rs.getString("nom_act");
                    fila[2]=rs.getString("intento_act");
                    
                    modelo.addRow(fila);
                    
                }
                tbl_progreso.setModel(modelo);
                TableColumn cm = tbl_progreso.getColumn("Numero de Actividad");
                TableColumn cn = tbl_progreso.getColumn("Nombre de Actividad");
                TableColumn cd = tbl_progreso.getColumn("Intentos");
        }catch(SQLException e) {
            System.out.println(e);
        }
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

        imgPerfil = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        cbGenero = new javax.swing.JComboBox<>();
        txtCorreo = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_progreso = new javax.swing.JTable();
        FondoPerfil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgPerfil.setMaximumSize(new java.awt.Dimension(128, 128));
        imgPerfil.setMinimumSize(new java.awt.Dimension(128, 128));
        getContentPane().add(imgPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 128, 128));

        txtNombre.setText("nombre");
        txtNombre.setEnabled(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 173, 161, 35));

        txtUsuario.setText("usuario");
        txtUsuario.setEnabled(false);
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 251, 161, 35));

        txtApellidos.setText("apellidos");
        txtApellidos.setEnabled(false);
        getContentPane().add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 173, 161, 35));

        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));
        cbGenero.setEnabled(false);
        getContentPane().add(cbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 251, 161, 34));

        txtCorreo.setText("correo");
        txtCorreo.setEnabled(false);
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(812, 173, 161, 35));

        txtPassword.setText("contraseña");
        txtPassword.setEnabled(false);
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 251, 161, 35));

        txtTelefono.setText("telefono");
        txtTelefono.setEnabled(false);
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 173, 161, 35));

        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(807, 315, 161, 35));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 315, 161, 35));

        tbl_progreso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Introducción a la Multiplicación", "2"}
            },
            new String [] {
                "Numero de Actividad", "Nombre de Actividad", "Intentos"
            }
        ));
        tbl_progreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_progresoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbl_progresoKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_progreso);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 630, 290));

        FondoPerfil.setMaximumSize(new java.awt.Dimension(1016, 709));
        FondoPerfil.setMinimumSize(new java.awt.Dimension(1016, 709));
        FondoPerfil.setPreferredSize(new java.awt.Dimension(1016, 709));
        getContentPane().add(FondoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1016, 709));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        txtNombre.setEnabled(true);
        txtApellidos.setEnabled(true);
        txtCorreo.setEnabled(true);
        txtTelefono.setEnabled(true);
        cbGenero.setEnabled(true);
        txtUsuario.setEnabled(true);
        txtPassword.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnModificar.setEnabled(false);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        txtNombre.setEnabled(false);
        txtApellidos.setEnabled(false);
        txtCorreo.setEnabled(false);
        txtTelefono.setEnabled(false);
        cbGenero.setEnabled(false);
        txtUsuario.setEnabled(false);
        txtPassword.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnModificar.setEnabled(true);
        Guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void tbl_progresoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_progresoKeyPressed

    }//GEN-LAST:event_tbl_progresoKeyPressed

    private void tbl_progresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_progresoKeyTyped
        
    }//GEN-LAST:event_tbl_progresoKeyTyped

    public void ObtenerId(){
        Connection conexion = Conexion.getConnection();
        try {
            //PREPARAMOS SENTENCIA PARA MANDAR A CONSULTAR A NUESTRA BASE DE DATOS.
            PreparedStatement pst = conexion.prepareStatement("SELECT idUsuario FROM usuario where  user_us = ?");
            pst.setString(1, user1);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                iduser = rs.getString("idUsuario");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }          
    }
    
    public void ConsultaDatos(){
        Connection conexion = Conexion.getConnection();
        String sql2 = "Select nombre_us,apellidos_us,correo_us,telefono_us,gen_us,user_us,password_us FROM usuario where user_us = '"+user1+"'";
        try{
        stmt = conexion.createStatement();
        ResultSet rs = stmt.executeQuery(sql2);
        while(rs.next()){
                String nu = rs.getString("nombre_us");
                String au = rs.getString("apellidos_us");
                String cu = rs.getString("correo_us");
                String tu = rs.getString("telefono_us");
                String gu = rs.getString("gen_us");
                String uu = rs.getString("user_us");
                String pu = rs.getString("password_us");
                
        txtNombre.setText(nu);
        txtApellidos.setText(au);
        txtCorreo.setText(cu);
        txtTelefono.setText(tu);
        cbGenero.setSelectedItem(gu);   //Linea de codigo para mostrar el valor de la base de datos en el primer item del combo.
        txtUsuario.setText(uu);
        txtPassword.setText(pu);
        
        }
        } catch (SQLException error) {
            System.out.println("Error en la consulta de datos" + error);
        }
    }
        
    public void Guardar(){
        Connection conexion = Conexion.getConnection();
        String cadena1, cadena2, cadena3, cadena4,cadena5,cadena6,cadena7;    
        cadena1 = txtNombre.getText(); //Nombre 
        cadena2 = txtApellidos.getText();//Apellidos
        cadena3 = txtCorreo.getText();//Correo
        cadena4 = txtTelefono.getText();//Telefono
        cadena5 = txtUsuario.getText();//Usuario
        cadena6 = txtPassword.getText();//Password
        cadena7 = cbGenero.getSelectedItem().toString();//Genero
        
        if (txtNombre.getText().equals("")) {
           javax.swing.JOptionPane.showMessageDialog(this,"El campo no puede estar vacío\n Actualice el dato deseado en el campo correspondiente","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }else {
            try {
                stmt = conexion.createStatement();
                //ResultSet rs = stmt.executeQuery("select * from usuario where idUsuario = '"+iduser.getText()+"'");
                ResultSet rs = stmt.executeQuery("select * from usuario where user_us = '"+user1+"'");

                if(rs.next()==false){
                    javax.swing.JOptionPane.showMessageDialog(this,"No existe un registro con ese numero de empleado!","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                        //stmt.executeUpdate("update usuario set nombre_us = '"+cadena1+"',apellidos_us = '"+cadena2+"', correo_us = '"+cadena3+"', telefono_us = '"+cadena4+"', user_us = '"+cadena5+"', password_us = '"+cadena6+"' where idUsuario = '"+iduser.getText()+"' "); 
                        stmt.executeUpdate("update usuario set nombre_us = '"+cadena1+"',apellidos_us = '"+cadena2+"', correo_us = '"+cadena3+"', telefono_us = '"+cadena4+"', user_us = '"+cadena5+"', password_us = '"+cadena6+"', gen_us = '"+cadena7+"' where user_us = '"+user1+"'");
                        System.out.println("Los valores han sido Actualizados"); 
                        javax.swing.JOptionPane.showMessageDialog(this,"Actualizado correctamente!","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
               }
            }catch (SQLException error) {
                System.out.println("Error en el boton guardar" + error);
            }
        }
        
        //PARA CAMBIAR EL TITULO DE LA GUI AL MODIFICAR LOS DATOS DE LA BASE DE DATOS
        InicioDeSesion.usuario =cadena5;
        user1=cadena5;
        setTitle("Perfil De " + user1);
        
    }
        
    private void colocaImgPerfil() {
        //CON ESTA LINEA DE CODIGO, LE ESTAMOS DICIENDO QUE NOS ABRA LA CONEXION A LA BASE DE DATOS.
        Connection conexion = Conexion.getConnection();
        try {
            //PREPARAMOS SENTENCIA PARA MANDAR A CONSULTAR A NUESTRA BASE DE DATOS.
            PreparedStatement pst = conexion.prepareStatement("select gen_us from usuario where user_us = ?");
            pst.setString(1, user1);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
              gen = rs.getString("gen_us");
              if (gen.equals("F")) {
                    ImageIcon wallpaper = new ImageIcon("src/img/niña.png");
                    //Adaptamos la imagen al tamaño del JLabel con la clase ICON.
                    Icon wallpaperScaled = new ImageIcon(wallpaper.getImage().getScaledInstance(imgPerfil.getWidth(),
                            imgPerfil.getHeight(), Image.SCALE_DEFAULT));
                    //Agregamos la imagen ya escalable al JLabel.
                    imgPerfil.setIcon(wallpaperScaled);
                    this.repaint();
                } else {
                    ImageIcon wallpaper = new ImageIcon("src/img/niño.png");
                    //Adaptamos la imagen al tamaño del JLabel con la clase ICON.
                    Icon wallpaperScaled = new ImageIcon(wallpaper.getImage().getScaledInstance(imgPerfil.getWidth(),
                            imgPerfil.getHeight(), Image.SCALE_DEFAULT));
                    //Agregamos la imagen ya escalable al JLabel.
                    imgPerfil.setIcon(wallpaperScaled);
                    this.repaint();
                }
            }
            
        } catch (SQLException error) {
            System.out.println("Error en la imagen de perfil" + error);
        }
        

    }

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
            java.util.logging.Logger.getLogger(PerfilUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfilUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfilUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PerfilUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoPerfil;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbGenero;
    private javax.swing.JLabel imgPerfil;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_progreso;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
