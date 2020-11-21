package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import ventanas.InicioDeSesion;

public class Usuario {
    
    //ATRIBUTOS DE LA CLASE USUARIO.
    //protected int idUsuario;
    protected String nombre;
    protected String apellidos;
    protected String correo;
    protected String telefono;
    protected String usuario;
    protected String password;
    protected String genero;
    private String cierreSesion;
    
    //VARIABLE PARA IDENTIFICAR EL USUARIO QUE INICIO SESION.
    String user = InicioDeSesion.usuario;

    //CONSTRUCTOR DE LA CLASE USUARIO.
    public Usuario(String nombre, String apellidos, String correo, String telefono, String genero, String usuario, String password) {
        //this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.genero = genero;
        this.usuario = usuario;
        this.password = password;
    }

    //CONSTRUCTOR PARA EL INICIO DE SESION.
    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    //CONSTRUCTOR PARA EL FIN DE SESION.
    public Usuario(String cierreSesion) {
        this.cierreSesion = cierreSesion;
    }

    //METODOS GETTERS AND SETTERS.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCierreSesion() {
        return cierreSesion;
    }

    public void setCierreSesion(String cierreSesion) {
        this.cierreSesion = cierreSesion;
    }

    //METODO PARA REGISTRAR USUARIOS.
    public void registraUsuarios() {
        if (!nombre.equals("") && !apellidos.equals("") && !correo.equals("") && !telefono.equals("") && !genero.equals("") && !usuario.equals("") && !password.equals("")) {
            try {
                //instanciamos la clase Connection
                Connection conexion = Conexion.getConnection();
                PreparedStatement pst = conexion.prepareStatement("INSERT INTO usuario(nombre_us,apellidos_us,correo_us,telefono_us,gen_us,user_us,password_us) VALUES (?,?,?,?,?,?,?)");
                pst.setString(1, nombre);
                pst.setString(2, apellidos);
                pst.setString(3, correo);
                pst.setString(4, telefono);
                pst.setString(5, genero);
                pst.setString(6, usuario);
                pst.setString(7, password);
                pst.executeUpdate();
                //Una vez terminado todo el proceso mandamos mensaje de registro exitoso.
                JOptionPane.showMessageDialog(null, "Registro Exitoso!!!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error en el metodo Guardar." + ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe de llenar todos los campos!");
        }
    }

    //METODO PARA CERRAR SESION DE USUARIO.
    public void cerrarSesionUsuario() {
        //CON ESTA LINEA DE CODIGO, LE ESTAMOS DICIENDO QUE NOS ABRA LA CONEXION A LA BASE DE DATOS.
        Connection conexion = Conexion.getConnection();
        try {
            //PREPARAMOS SENTENCIA PARA MANDAR A CONSULTAR A NUESTRA BASE DE DATOS.
            PreparedStatement pst = conexion.prepareStatement("SELECT * FROM usuario WHERE user_us = ?");
            pst.setString(1, user);
            //CREAMOS VARIABLE TIPO RESULSET QUE ALMACENARA TODO LOS QUERY ALMACENADOS.
            ResultSet rs = pst.executeQuery();

            //IF QUE RECORRERA TODO NUESTROS REGISTROS BUSCANDO LOS VALORES DE LA LINEA 44 Y 45.
            if (rs.next()) {
                pst = conexion.prepareStatement("UPDATE usuario SET ultimaSesion_us =? WHERE user_us=?");
                pst.setString(1, cierreSesion);
                pst.setString(2, user);
                pst.executeUpdate();
            }

        } catch (SQLException errorSql) {
            //SI DA ERROR AL DAR CLIC EN EL BOTON INGRESAR, SERA POR ALGO DE LA BASE DE DATOS.
            JOptionPane.showMessageDialog(null, "Error al iniciar sesion!" + errorSql);
        }
    }

}
