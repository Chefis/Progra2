package ManejoInventario;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/*
 * Creado por: Marcela Leandro
 * Fecha: 15/04/2013
 * -------------------------------------------------- 
 * Modificado por: Oscar Mendoza López
 * Fecha: 
 * --------------------------------------------------- 
 * Descripción:
 * Esta se usa hasta el final cuando ya se hace la venta. Bodega tiene que tener una copia
 */
public class Factura {

    private int numero;
    private Date fecha;
    private Cliente Cliente;
    private String Detalle;
    private ArrayList<Item> listaItem = new ArrayList<Item>();

    public Factura() {
    }

    public Factura(int numero, Date fecha, Cliente Cliente, ArrayList listaItem, Proveedor proveedor) {
        this.numero = numero;
        this.fecha = fecha;
        this.Cliente = Cliente;
        this.listaItem = listaItem;
      
    }

    public Cliente getCliente() {
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

    public int getNumero() {
        return numero;
    }

    public void setCliente(Cliente Cliente) {
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

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void agregarItem(Item i) {
        listaItem.add(i);
    }
   
//    @Override
//    public String toString() {
//
//      
//        
//    }
}
