
package ManejoInventario;
/*
 * Creado por: Marcela Leandro
 * Fecha: 15/04/2013
 * -------------------------------------------------- 
 * Modificado por: Oscar Mendoza López
 * Fecha: 
 * --------------------------------------------------- 
 * Descripción:
 * 
 */


public class Item {
    
    
    private int numLinea;
    private Producto producto;
    private int cant;
    private double subtotal;

    public Item() {
    }

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

    public void setNumLinea(Factura factura) {
        this.numLinea = factura.getListaItem().size() + 1;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public void setSubtotal(double total) {
        this.subtotal = total;
    }

    
    public void calcularSubtotal() {

        setSubtotal(this.cant * producto.getCostoVenta());
    } 
 
<<<<<<< HEAD
=======
     public void numConsecutivo(Factura factura) {
      
            setNumLinea(factura.getListaItem().size()+1);
    }

>>>>>>> f58d860c03c1adc0f34420593fe0f6bc0905ba0d
    @Override
    public String toString() {
        return this.getNumLinea() + " " + this.getCant() + " " + this.getProducto() + " "
                + producto.getCostoVenta() + " " + this.getSubtotal();
    }
}

