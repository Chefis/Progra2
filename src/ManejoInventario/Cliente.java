
package ManejoInventario;
/*
 * Creado por: Marcela Leandro
 * Fecha: 15/04/2013
 * -------------------------------------------------- 
 * Modificado por: Jennifer Camacho
 * Fecha: 19/04/2013
 * --------------------------------------------------- 
 * Descripción: Converti en abstracto y elimine toString innecesario
 * --------------------------------------------------- 
 * Descripción:
 * Necesito modificarlo (agregar, retirar), poder consultarlo. Tiene que tener un
 * punto minimo en que se deba comprar de nuevo a los distribuidores.
 */


public abstract class Cliente {
    
    private String nombre;
    private String direccion;
    private int telefono;

    public Cliente() {
    }

    public Cliente(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
  
    
}