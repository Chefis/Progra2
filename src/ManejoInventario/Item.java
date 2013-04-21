
package ManejoInventario;
/*
 * Creado por: Marcela Leandro
 * Fecha: 15/04/2013
 * -------------------------------------------------- 
 * Modificado por: Oscar Mendoza López
 * Fecha: 
 * --------------------------------------------------- 
 * Modificado por: Jennifer Camacho Zamora
 * Fecha: 21/04/2013
 * --------------------------------------------------- 
 * Descripción:
 * 
 */


public class Item {
    
    
    private int numLinea;
    private Producto producto;
    private int cant;
    private double subtotal;

    //Constructor
    public Item() {
    }
    //Constructor Sobrecargado
    public Item(int numLinea, Producto producto, int cant) {
        this.numLinea = numLinea;
        this.producto = producto;
        this.cant = cant;
       
    }
    
    public int getNumLinea() {
        return numLinea;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCant() {
        return cant;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setNumLinea(OrdenCompra factura) {
        this.numLinea = factura.getItem().size() + 1;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    //Hace el calculo para sacar el subtotal
    public void calcularSubtotal() {

        double descuento = 0.0;
        double impuesto = 0.0;
        double subtotal = 0.0;

        subtotal = this.cant * producto.getCostoVenta();
        impuesto = this.cant * producto.getCostoVenta() * producto.obtenerImpuesto() / 100;
        descuento = this.cant * producto.getCostoVenta() * producto.obtenerDescuento() / 100;
        
        setSubtotal(subtotal + impuesto-descuento);

    } 
    
    @Override
    public String toString() {
        return this.getNumLinea() + " " + this.getCant() + " " + this.getProducto() + " "
                + producto.getCostoVenta() + " " + this.getSubtotal();
    }
}

