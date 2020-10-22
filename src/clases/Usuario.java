package clases;

public class Usuario {

    //ATRIBUTOS DE LA CLASE USUARIO.
    //protected int idUsuario;
    protected String nombre;
    protected String apellidos;
    protected String correo;
    protected String telefono;
    protected String usuario;
    protected String password;

    //CONSTRUCTOR DE LA CLASE USUARIO.
    public Usuario(String nombre, String apellidos, String correo, String telefono, String usuario, String password) {
        //this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
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

}
