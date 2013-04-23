package ManejoInventario;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Creado por: Marcela Leandro
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
public class MueblesOficina extends Categoria implements IDescuento {

    public MueblesOficina() {
    }

    public MueblesOficina(String nombre, String descripcion, boolean estado) {
        super(nombre, descripcion, estado);
    }
    //Este metodo se encuentra fuera de uso debido a que tiene un error en el main y no llena la lista como es debido
 /*   public void agregarProducto(Producto producto) {
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
    }*/

    @Override
    public double implementarDescuento() {

        return 50.0;
    }

    public double implementarImpuesto() {

        return 10.0;

    }

   public void errorI() throws ErrorImpuesto{
        if (this.implementarImpuesto()> 10.0){
            throw new ErrorImpuesto("El impuesto se aumento . Verifique");
        }
    }
    
    public void errorD() throws ErrorDescuento{
         if (this.implementarDescuento()> 50.0){
            throw new ErrorDescuento("El descuento se redujo . Verifique");
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
