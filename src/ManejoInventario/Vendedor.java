/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejoInventario;

/**
 *  Creado por: Daniela Bolivar
 * Fecha: 14/abril/2013
 * -------------------------------------------------- 
 * Modificado por: 
 * Fecha: 
 * --------------------------------------------------- 
 * Descripción:
 * Atributos basicos del vendedor . 
 *
 *
 * @author M-01
 */
public class Vendedor {
    
    private String nombre;
    private String apellido;
    private String carnet;
    private String direccion;
    private String telefono;
    

    public Vendedor() {
    }

    public Vendedor(String nombre, String apellido, String carnet, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carnet = carnet;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    

    @Override
    public String toString() {
        String cadena="" ;
        cadena += "Nombre: " +this.getNombre()+ "\n";
        cadena += "Apellido: " +this.getApellido()+ "\n";
        cadena += "Carnet: " +this.getCarnet()+ "\n";
        cadena += "Direccion"+this.getDireccion()+"\n";
        cadena+= "Telefono"+ this.getTelefono()+"\n";
        
        return cadena;
    }
    
    
}
