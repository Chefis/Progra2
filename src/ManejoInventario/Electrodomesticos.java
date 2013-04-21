package ManejoInventario;

/*
 * Creado por: 
 * Fecha: 
 * -------------------------------------------------- 
 * Modificado por: Jennifer Camacho 
 * Fecha: 19/4/2013
 * --------------------------------------------------- 
 * Descripción:
 *  Modificado por: Oscar Mendoza
 * Fecha: 19/04/2013
 * --------------------------------------------------- 
 * Descripción: Le agregue el descuento
 */
public class Electrodomesticos extends Categoria implements ITaxable {

    public Electrodomesticos() {
    }

    public Electrodomesticos(String nombre, String descripcion, boolean estado) {
        super(nombre, descripcion, estado);
    }

    @Override
    public double implementarImpuesto() {
        return 10.0;
    }
    

    public double implementarDescuesto() {
        return 0.0;
    }
    

    public double implementarDescuento() {
        return 5.0;
    }


    @Override
    public String toString() {
        String cadena = "";

        cadena += "Nombre: " + this.getNombre() + "\n";
        cadena += "Descripción: " + this.getDescripcion() + "\n";
        cadena += "Estado: " + this.isEstado() + "\n";
        cadena += "Impuesto: " + implementarImpuesto() + "%";
        cadena += "Descuento: " + implementarDescuento()+ "%";

        return cadena;
    }
}
