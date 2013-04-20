
package ManejoInventario;

/*
 * Creado por: 
 * Fecha: 
 * -------------------------------------------------- 
 * Modificado por: Jennifer Camacho
 * Fecha: 
 * --------------------------------------------------- 
 * Descripción:
 * Modificado por: Oscar Mendoza
 * Fecha: 19/04/2013
 * --------------------------------------------------- 
 * Descripción: Le agregue el impuesto
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
    
    public double implementarImpuesto() {
<<<<<<< HEAD
        return 0.0;
=======

        return 20.0;
>>>>>>> f58d860c03c1adc0f34420593fe0f6bc0905ba0d
    }
    
    @Override
    public String toString() {
        String cadena= "";
        
        cadena += "Nombre: " +this.getNombre()+ "\n";
        cadena += "Descripción: " +this.getDescripcion()+ "\n";
        cadena += "Estado: " +this.isEstado()+ "\n";
        cadena += "Impuesto: " + implementarImpuesto() + "\n";
        cadena += "Descuento: " +implementarDescuento()+ "%";
        
        return cadena;
    }
}
