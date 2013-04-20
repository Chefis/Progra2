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
 * Aprobar, rechazar, modificar, consultar
 */
public class OrdenPedido {

    private ArrayList<Factura> listaFOP = new ArrayList<Factura>();
   private String aprobacion = "";

    public OrdenPedido() {
    }

    public OrdenPedido(String aprobacion) {

        this.aprobacion = aprobacion;

    }

    public ArrayList<Factura> getListaFOP() {
        return listaFOP;
    }

    public void setListaFOP(ArrayList<Factura> listaFOP) {
        this.listaFOP = listaFOP;
    }

    public String isAprobacion() {
        return aprobacion;
    }

    public void setAprobacion(String aprobacion) {
        this.aprobacion = aprobacion;
    }

    public void agregarFactura(Factura f) {
        listaFOP.add(f);
    }

    public String verFactura() {
        String listaP = "";
        int i = 0;
        Iterator<Factura> it = listaFOP.iterator();
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
