
package ManejoInventario;
/*
 * Creado por: Daniela Bolivar Villegas
 * -------------------------------------------------- 
 * Modificado por: Jennifer Camacho
 * Fecha: 
 * --------------------------------------------------- 
 * Descripción:
 * 
 */
public class ClienteFisico extends Cliente {

    public ClienteFisico() {
    }

    public ClienteFisico(String nombre, String direccion, int telefono) {
        super(nombre, direccion, telefono);
    }

    @Override
    public String toString(){
        return "Nombre: " +this.getNombre()+ "\nDirección: " +this.getDireccion()+ "\nTeléfono: " +this.getTelefono() + "\n\n";
    }
    
    
    
}
