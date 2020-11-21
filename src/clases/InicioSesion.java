package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import ventanas.MenuPrincipal;

public class InicioSesion extends Usuario {

    //DECLARAMOS NUESTROS ATRIBUTOS.
    private String inicioSesion;
    public static boolean cerrarLogin = false;  //atributo estatico para cerrar la interfaz inicio de sesion. 
    
    
    //METODO CONSTRUCTOR QUE INICIALIZARA LOS ATRIBUTOS DE NUESTRA CLASE DEPENDIENDO LOS PARAMETROS QUE DE EL USUARIO.
    //Que nos pasara tambien la fecha de inicio de sesion.
    public InicioSesion(String usuario, String password, String inicioSesion) {
        super(usuario, password);
        this.inicioSesion = inicioSesion;
    }
   
    //METODOS GETTERS AND SETTERS.
    public String getInicioSesion() {
        return inicioSesion;
    }

    public void setInicioSesion(String inicioSesion) {
        this.inicioSesion = inicioSesion;
    }

    //METODO PARA INGRESAR AL MENU PRINCIPAL, DEPENDIENDO SU USUARIO Y CONTRASEÑA.
    public void ingresar() {
        //Si USUARIO Y CONTRASEÑA NO ESTAN VACIOS, ENTONCES SE CUMPLIRA EL IF PARA HACER LA CONSULTA.
        if (!usuario.equals("") && !password.equals("")) {
            //CON ESTA LINEA DE CODIGO, LE ESTAMOS DICIENDO QUE NOS ABRA LA CONEXION A LA BASE DE DATOS.
            Connection conexion = Conexion.getConnection();
            //VARIABLE QUE GUARDARA EL QUERY PARA QUE LO BUSQUE EN NUESTRA BASE DE DATOS.
            String getUserPass = "SELECT user_us, password_us FROM usuario WHERE user_us = ? and password_us = ?";
            try {
                //PREPARAMOS SENTENCIA PARA MANDAR A CONSULTAR A NUESTRA BASE DE DATOS.
                PreparedStatement pst = conexion.prepareStatement(getUserPass);
                //LINEA 44 Y 45 QUIERE DECIR QUE LO QUE NOS INTRODUZCA EL USUARIO ESO LO BUSQUE EN NUESTRA BASE DE DATOS.
                pst.setString(1, usuario);
                pst.setString(2, password);
                //CREAMOS VARIABLE TIPO RESULSET QUE ALMACENARA TODO LOS QUERY ALMACENADOS.
                ResultSet rs = pst.executeQuery();

                //IF QUE RECORRERA TODO NUESTROS REGISTROS BUSCANDO LOS VALORES DE LA LINEA 44 Y 45.
                if (rs.next()) {
                    pst = conexion.prepareStatement("UPDATE usuario SET inicioSesion_us =? WHERE user_us=?");
                    pst.setString(1, inicioSesion);
                    pst.setString(2, usuario);
                    pst.executeUpdate();

                    //SI LOS ENCUENTRA ARROJARA EL SIGUIENTE MENSAJE POR EL MOMENTO, HABRA MODIFICACIONES DESPUES.
                    JOptionPane.showMessageDialog(null, "Bienvenido " + usuario);

                    //PARA QUE ENTRE A LA GUI MENU PRINCIPAL.
                    cerrarLogin = true; //si entra cerrar login conviertelo a verdadero para cerrarla
                    MenuPrincipal menuprincipal = new MenuPrincipal();
                    menuprincipal.setVisible(true); //mandamos a llamar nuestra interfaz menu principal.

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
