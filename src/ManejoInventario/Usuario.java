package ManejoInventario;

/*
 * Creado por: Jennifer Camacho
 * Fecha: 
 * -------------------------------------------------- 
 * Modificado por: Jennifer Camacho
 * Fecha: 14/abril/2013
 * --------------------------------------------------- 
 * Descripción:
 * Agregar, archivar, modificar, consultar, tipo, password.
 * Necesito una interface que es la que me le va a dar los distintos permisos que tiene cada usuario
 */
public abstract class Usuario {

    private String nombre;
    private String apellidos;
    private String telcasa;
    private String celular;
    private String email;
    private String cedula;
    private String direccion;
    private boolean genero;
    private String nickname;
    private String clave;
    private String cargo;

    public Usuario() {
    }

    public Usuario(String nombre, String apellidos, String telcasa, String celular, String email, String cedula, String direccion, boolean genero, String nickname, String clave, String cargo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telcasa = telcasa;
        this.celular = celular;
        this.email = email;
        this.cedula = cedula;
        this.direccion = direccion;
        this.genero = genero;
        this.nickname = nickname;
        this.clave = clave;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelcasa() {
        return telcasa;
    }

    public void setTelcasa(String telcasa) {
        this.telcasa = telcasa;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
