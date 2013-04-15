
package ManejoInventario;

import java.util.ArrayList;
import sun.util.calendar.BaseCalendar.Date;

/*
 * Creado por: Marcela Leandro
 * Fecha: 15/04/2013
 * -------------------------------------------------- 
 * Modificado por: 
 * Fecha: 
 * --------------------------------------------------- 
 * Descripción:
 * Esta se usa hasta el final cuando ya se hace la venta. Bodega tiene que tener una copia
 */

public class Factura {
    
     private long numero;
     private Date fecha;
     private String Cliente;
     private String Detalle;
     private ArrayList<Item> listaItem = new ArrayList<Item>();

    public Factura() {
    }

    public Factura(long numero, Date fecha, String Cliente, ArrayList listaItem ) {
        this.numero = numero;
        this.fecha = fecha;
        this.Cliente = Cliente;
        this.listaItem = listaItem;
    }

    public String getCliente() {
        return Cliente;
    }

    public String getDetalle() {
        return Detalle;
    }

    public Date getFecha() {
        return fecha;
    }

    public ArrayList<Item> getListaItem() {
        return listaItem;
    }

    public long getNumero() {
        return numero;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public void setDetalle(String Detalle) {
        this.Detalle = Detalle;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setListaItem(ArrayList<Item> listaItem) {
        this.listaItem = listaItem;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

   
     public void agregarItem(Item i){
        listaItem.add(i);
    }

    @Override
    public String toString() {
        
        
        
        return "Factura{" + "numero=" + numero + ", fecha=" + fecha + ", Cliente=" + Cliente + ", Detalle=" + Detalle + ", listaItem=" + listaItem + '}';
    }

    
     
     
}
