package ManejoInventario;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Creado por: 
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
        return 13.0;
    }

    public void agregarProducto(Producto producto) {
        listaProducto.add(producto);
    }

    public ArrayList<Producto> productoPorCategoria(Ti ti) {
        ArrayList<Producto> listaPorCategoria = new ArrayList<Producto>();

        Iterator<Producto> it = listaProducto.iterator();
        while (it.hasNext()) {
            Producto producto = it.next();
            if (producto.getCategoria().equals(ti)) {
                listaPorCategoria.add(producto);
            }
        }
        return listaPorCategoria;
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
