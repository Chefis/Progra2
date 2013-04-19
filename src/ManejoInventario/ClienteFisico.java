
package ManejoInventario;
/*
 * Creado por: Daniela Bolivar
 * Fecha: 
 * -------------------------------------------------- 
 * Modificado por: Jennifer Camacho 
 * Fecha: 
 * --------------------------------------------------- 
 * Descripción:
 * Agregue toString
 */
public class ClienteFisico extends Cliente {

    public ClienteFisico() {
    }

    public ClienteFisico(String nombre, String direccion, int telefono) {
        super(nombre, direccion, telefono);
    }

    @Override
    public String toString(){
        return "Nombre de la empresa: " +this.getNombre()+ "\n Dirección: " +this.getDireccion()+ "\n Teléfono: " +this.getTelefono();
    }
    
    
    
}
