
package ManejoInventario;
import java.util.ArrayList;

/*
 * Creado por: Daniela Bolivar 
 * Fecha: 14/4/2013
 * -------------------------------------------------- 
 * Modificado por: 
 * Fecha: 
 * --------------------------------------------------- 
 * Descripción:
 * Aqui manejo o reuno las proformas, facturas y ordenes de compra
 */

public class Venta {
    
    private String fecha;
    private String detalle;
    ArrayList<ProductoInv> ventaProductos= new ArrayList<>();
    ArrayList<Proforma> listaProforma= new ArrayList<>();

    public Venta() {
    }

    public Venta(String fecha, String detalle) {
        this.fecha = fecha;
        this.detalle = detalle;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public ArrayList<ProductoInv> getVenta() {
        return ventaProductos;
    }

    public void setVenta(ArrayList<ProductoInv> venta) {
        this.ventaProductos = venta;
    }

    public ArrayList<Proforma> getListaProforma() {
        return listaProforma;
    }

    public void setListaProforma(ArrayList<Proforma> listaProforma) {
        this.listaProforma = listaProforma;
    }
    
    
    
}
