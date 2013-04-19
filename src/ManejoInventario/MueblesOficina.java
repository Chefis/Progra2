
package ManejoInventario;

/*
 * Creado por: Daniela Bolivar
 * Fecha: 
 * -------------------------------------------------- 
 * Modificado por: Jennifer Camacho
 * Fecha: 
 * --------------------------------------------------- 
 * Descripción:
 * 
 */
public class MueblesOficina extends Categoria implements IDescuento {

    public MueblesOficina() {
    }

    public MueblesOficina(String nombre, String descripcion, boolean estado) {
        super(nombre, descripcion, estado);
    }

    @Override
    public double implementarDescuento() {

        return 50.0;
    }
    
    @Override
    public String toString() {
        String cadena= "";
        
        cadena += "Nombre: " +this.getNombre()+ "\n";
        cadena += "Descripción: " +this.getDescripcion()+ "\n";
        cadena += "Estado: " +this.isEstado()+ "\n";
        cadena += "Descuento: " +implementarDescuento()+ "%";
        
        return cadena;
    }
}
