package ManejoInventario;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Creado por: Oscar Mendoza López
 * Fecha: 
 * -------------------------------------------------- 
 * Modificado por: 
 * Fecha: 
 * --------------------------------------------------- 
 * Descripción:
 *  Marcela dice que es para que el cliente se responsibilice de su pago sobre lo que me pidio.
 * Mando una copia a bodega para que me aparte y de el producto que solicito
 */
public class OrdenCompra {

    private ArrayList<Factura> listaFOC = new ArrayList<Factura>();
    private String aprobacion = "";

    public OrdenCompra() {
    }

    public OrdenCompra(String aprobacion) {

        this.aprobacion = aprobacion;

    }

    public String isAprobacion() {
        return aprobacion;
    }

    public void setAprobacion(String aprobacion) {
        this.aprobacion = aprobacion;
    }

    public ArrayList<Factura> getListaFOC() {
        return listaFOC;
    }

    public void setListaFOC(ArrayList<Factura> listaFOC) {
        this.listaFOC = listaFOC;
    }

    public void agregarFactura(Factura f) {
        listaFOC.add(f);
    }

    public String verFactura() {


        String listaP = "";
        int i = 0;
        Iterator<Factura> it = listaFOC.iterator();
        while (it.hasNext()) {
            i++;
            listaP += i + "." + it.next().toString() + "\n";
        }
        return "Factura(s): \n"
                + listaP;

    }

    public String validacion() {
        if (aprobacion.equalsIgnoreCase("Aprobado")) {
            return "Orden Aprobada";
        } else {
            return "Orden Rechazada";
        }
    }

    @Override
    public String toString() {
        return verFactura() + "________________________________________________________________________________________________________________"
                + "\n\n\t\t\t\t" + validacion();
    }
}
