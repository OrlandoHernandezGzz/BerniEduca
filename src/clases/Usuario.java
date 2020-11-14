package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

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

    //METODO PARA REGISTRAR USUARIOS.
    public void registraUsuarios(){
        if(!nombre.equals("") && !apellidos.equals("") && !correo.equals("") && !telefono.equals("") && !genero.equals("") && !usuario.equals("") && !password.equals("")){
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
                    JOptionPane.showMessageDialog(null, "Error en el metodo Guardar."+ex);
                }
        }else{
            JOptionPane.showMessageDialog(null, "Debe de llenar todos los campos!");
        }
    }
    
    //METODO PARA MODIFICAR USUARIOS.
    public void modificarUsuarios(){
        
    }
    
}
