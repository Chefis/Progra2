package ManejoInventario;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Creado por: 
 * Fecha: 
 * -------------------------------------------------- 
 * Modificado por: Jennifer Camacho
 * Fecha: 
 * --------------------------------------------------- 
 * Descripción: 
 */
public class MueblesOficina extends Categoria implements IDescuento {

    public MueblesOficina() {
    }

    public MueblesOficina(String nombre, String descripcion, boolean estado) {
        super(nombre, descripcion, estado);
    }

    public void agregarProducto(Producto producto) {
        listaProducto.add(producto);
    }

    public ArrayList<Producto> productoPorCategoria(MueblesOficina mueblesOficina) {
        ArrayList<Producto> listaPorCategoria = new ArrayList<Producto>();

        Iterator<Producto> it = listaProducto.iterator();
        while (it.hasNext()) {
            Producto producto = it.next();
            if (producto.getCategoria().equals(mueblesOficina)) {
                listaPorCategoria.add(producto);
            }
        }

        return listaPorCategoria;
    }

    @Override
    public double implementarDescuento() {

        return 50.0;
    }

    public double implementarImpuesto() {

        return 20.0;

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
