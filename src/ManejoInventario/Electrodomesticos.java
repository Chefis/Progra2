package ManejoInventario;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Creado por: Marcela Leandro Picado
 * Fecha: 15/04/2013
 * -------------------------------------------------- 
 * Modificado por: Jennifer Camacho 
 * Fecha: 19/4/2013
 * --------------------------------------------------- 
 * Modificado por: Daniela Bolivar Villegas (exception)
 * Fecha: 21/4/2013
 * --------------------------------------------------- 
 * Descripción: 
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

    public double implementarDescuento() {
        return 5.0;
    }
//Este metodo se encuentra fuera de uso debido a que tiene un error en el main y no llena la lista como es debido
    /*   public void agregarProducto(Producto producto) {
     listaProducto.add(producto);
     }
    public ArrayList<Producto> productoPorCategoria(Producto producto) {
        ArrayList<Producto> listaPorCategoria = new ArrayList<Producto>();

        listaProducto.add(producto);

        Iterator<Producto> it = listaProducto.iterator();
        while (it.hasNext()) {
            producto = it.next();
            if (producto.getCategoria().equals(electrodomesticos)) {
                listaPorCategoria.add(producto);
            }
        }

        return listaPorCategoria;
    }*/

    public void errorI() throws ErrorImpuesto {
        if (this.implementarImpuesto() > 10.0) {
            throw new ErrorImpuesto("El impuesto se aumento. Verifique");
        }
    }

    @Override
    public String toString() {
        String cadena = "";

        cadena += this.getNombre();
        /*  cadena += "Descripción: " + this.getDescripcion() + "\n";
         cadena += "Estado: " + this.isEstado() + "\n";
         cadena += "Impuesto: " + implementarImpuesto() + "%";
         cadena += "Descuento: " + implementarDescuento()+ "%";*/

        return cadena;
    }
}
