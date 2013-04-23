package ManejoInventario;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Creado por: Daniela Bolivar
 * Fecha: 
 * -------------------------------------------------- 
 * Modificado por: Jennifer Camacho
 * Fecha: 19/04/2013
 * --------------------------------------------------- 
 * Modificado por: Daniela Bolivar Villegas (exception)
 * Fecha: 21/4/2013
 * --------------------------------------------------- 
 * Descripción:
 * 
 */
public class TecnologiaInfo extends Categoria implements IDescuento {

    public TecnologiaInfo() {
    }

    public TecnologiaInfo(String nombre, String descripcion, boolean estado) {
        super(nombre, descripcion, estado);
    }

    @Override
    public double implementarDescuento() {
        return 5.0;
    }

    public double implementarImpuesto() {
        return 10.0;
    }
//Este metodo se encuentra fuera de uso debido a que tiene un error en el main y no llena la lista como es debido
   /* public void agregarProducto(Producto producto) {
        listaProducto.add(producto);
    }

    public ArrayList<Producto> productoPorCategoria(TecnologiaInfo ti) {
        ArrayList<Producto> listaPorCategoria = new ArrayList<Producto>();

        Iterator<Producto> it = listaProducto.iterator();
        while (it.hasNext()) {
            Producto producto = it.next();
            if (producto.getCategoria().equals(ti)) {
                listaPorCategoria.add(producto);
            }
        }
        return listaPorCategoria;
    }*/

    public void errorI() throws ErrorImpuesto{
        if (this.implementarImpuesto()< 10.0){
            throw new ErrorImpuesto("El impuesto se redujo. Verifique");
        }
    }
     
     public void errorD() throws ErrorDescuento{
         if (this.implementarDescuento()> 5.0){
            throw new ErrorDescuento("El descuento se aumento. Verifique");
        }
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
