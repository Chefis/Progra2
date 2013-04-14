
package ManejoInventario;

/*
 * Creado por: Jennifer Camacho
 * Fecha: 14/abril/2013
 * -------------------------------------------------- 
 * Modificado por: 
 * Fecha: 
 * --------------------------------------------------- 
 * Descripción:
 * Esto se puede borrar en caso de no existir mas categorias
 */
public class Categoria {
    
    private String nombre;
    private String descripcion;
    private boolean estado;

    public Categoria() {
    }

    public Categoria(String nombre, String descripcion, boolean estado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        String cadena= "";
        
        cadena += "Nombre: " +this.getNombre()+ "\n";
        cadena += "Descripción: " +this.getDescripcion()+ "\n";
        cadena += "Estado: " +this.isEstado()+ "\n";
        
        return cadena;
    }
    
    
}
