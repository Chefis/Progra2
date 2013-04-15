
package ManejoInventario;
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


public class Item {
    
    
    private int numLinea;
    private ProductoInv producto;
    private int cant;
    private double subtotal;

    public Item() {
    }

    public Item(int numLinea, ProductoInv producto, int cant) {
        this.numLinea = numLinea;
        this.producto = producto;
        this.cant = cant;
       
    }

    public int getNumLinea() {
        return numLinea;
    }

    public ProductoInv getProducto() {
        return producto;
    }

    public int getCant() {
        return cant;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setNumLinea(int numLinea) {
        this.numLinea = numLinea;
    }

    public void setProducto(ProductoInv producto) {
        this.producto = producto;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public void setSubtotal(double total) {
        this.subtotal = total;
    }

    
    public void calcularSubtotal() {

        setSubtotal(this.cant * producto.getCostoUnid());
    } 
 
//     public void numConsecutivo(Factura orden) {
//      
//         setNumLinea(Factura().size()+1);
//    }

    @Override
    public String toString() {
        return this.getNumLinea() + " " + this.getCant() + " " + this.getProducto() + " "
                + producto.getCostoUnid() + " " + this.getSubtotal();
    }
}

