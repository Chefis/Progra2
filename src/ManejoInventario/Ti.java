package ManejoInventario;
/*
 * Creado por: Daniela Bolivar
 * Fecha: 
 * -------------------------------------------------- 
 * Modificado por: Oscar Mendoza
 * Fecha: 19/04/2013
 * --------------------------------------------------- 
 * Descripción:
 * 
 */

public class Ti extends Categoria implements IDescuento {

    public Ti() {
    }

    public Ti(String nombre, String descripcion, boolean estado) {
        super(nombre, descripcion, estado);
    }

    @Override
    public double implementarDescuento() {

        return 30.0;
    }
    
    public double implementarImpuesto() {

        return 15.0;
    }

    @Override
    public String toString() {
        String cadena = "";

        cadena += "Nombre: " + this.getNombre() + "\n";
        cadena += "Descripción: " + this.getDescripcion() + "\n";
        cadena += "Estado: " + this.isEstado() + "\n";
        cadena += "Impuesto: " + implementarImpuesto() + "\n";
        cadena += "Descuento: " + implementarDescuento() + "%";

        return cadena;
    }
}
