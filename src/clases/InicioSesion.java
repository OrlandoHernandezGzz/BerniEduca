package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class InicioSesion {

    //DECLARAMOS NUESTROS ATRIBUTOS.
    private String usuario;
    private String contraseña;
    private String ultimaSesion;
    
    //METODO CONSTRUCTOR QUE INICIALIZARA LOS ATRIBUTOS DE NUESTRA CLASE DEPENDIENDO LOS PARAMETROS QUE DE EL USUARIO.
    public InicioSesion(String usuario, String contraseña, String ultimaSesion) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.ultimaSesion = ultimaSesion;
    }

    //METODOS GETTERS AND SETTERS.
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUltimaSesion() {
        return ultimaSesion;
    }

    public void setUltimaSesion(String ultimaSesion) {
        this.ultimaSesion = ultimaSesion;
    }
    

    //METODO PARA INGRESAR AL MENU PRINCIPAL, DEPENDIENDO SU USUARIO Y CONTRASEÑA.
    public void ingresar() {
        //Si USUARIO Y CONTRASEÑA NO ESTAN VACIOS, ENTONCES SE CUMPLIRA EL IF PARA HACER LA CONSULTA.
        if (!usuario.equals("") && !contraseña.equals("")) {
            //CON ESTA LINEA DE CODIGO, LE ESTAMOS DICIENDO QUE NOS ABRA LA CONEXION A LA BASE DE DATOS.
            Connection conexion = Conexion.getConnection();
            //VARIABLE QUE GUARDARA EL QUERY PARA QUE LO BUSQUE EN NUESTRA BASE DE DATOS.
            String getUserPass = "SELECT user_us, password_us FROM usuario WHERE user_us = ? and password_us = ?";
            try {
                //PREPARAMOS SENTENCIA PARA MANDAR A CONSULTAR A NUESTRA BASE DE DATOS.
                PreparedStatement pst = conexion.prepareStatement(getUserPass);
                //LINEA 49 Y 50 QUIERE DECIR QUE LO QUE NOS INTRODUZCA EL USUARIO ESO LO BUSQUE EN NUESTRA BASE DE DATOS.
                pst.setString(1, usuario);
                pst.setString(2, contraseña);
                //CREAMOS VARIABLE TIPO RESULSET QUE ALMACENARA TODO LOS QUERY ALMACENADOS.
                ResultSet rs = pst.executeQuery();

                //IF QUE RECORRERA TODO NUESTROS REGISTROS BUSCANDO LOS VALORES DE LA LINEA 49 Y 50.
                if (rs.next()) {
                    pst = conexion.prepareStatement("UPDATE usuario SET ultimaSesion_us =? WHERE user_us=?");
                    pst.setString(1, ultimaSesion);
                    pst.setString(2, usuario);  //Marcara posible error.
                    pst.executeUpdate();
                    
                    //SI LOS ENCUENTRA ARROJARA EL SIGUIENTE MENSAJE POR EL MOMENTO, HABRA MODIFICACIONES DESPUES.
                    JOptionPane.showMessageDialog(null, "Bienvenido " + usuario);
                    
                } else {
                    //SI NO LOS ENCUENTRA PONDRA CONTRASEÑA INCORRECTA.
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta!!");
                }

            } catch (SQLException errorSql) {
                //SI DA ERROR AL DAR CLIC EN EL BOTON INGRESAR, SERA POR ALGO DE LA BASE DE DATOS.
                JOptionPane.showMessageDialog(null, "Error al iniciar sesion!" + errorSql);
            }
            //SI NO SE CUMPLE EL IF, NOS DIRA QUE DEBE DE LLENAR TODOS LOS CAMPOS PARA HACER LA CONSULTA.    
        } else {
            JOptionPane.showMessageDialog(null, "Debe de llenar todos los campos!");
        }
    }   //fin del metodo ingresar.
}
