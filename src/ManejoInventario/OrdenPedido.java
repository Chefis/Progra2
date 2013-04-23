package ManejoInventario;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
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
    
    private String aprobacion = "";
    private String detalle = "";
    private ArrayList<Item> listaItem = new ArrayList<Item>();
    private Proveedor proveedor;
    private long numero;
    private Date fecha;
    
    public OrdenPedido() {
    }
    
    public OrdenPedido(Date fecha, long numero, Proveedor proveedor, String detalle) {
        this.proveedor = proveedor;
        this.numero = numero;
        this.fecha = fecha;
        this.detalle = detalle;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
    public ArrayList<Item> getListaItem() {
        return listaItem;
    }
    
    public void setListaItem(ArrayList<Item> listaItem) {
        this.listaItem = listaItem;
    }
    
    public String getAprobacion() {
        return aprobacion;
    }
    
    public void setAprobacion(String aprobacion) {
        this.aprobacion = aprobacion;
    }
    
    public Proveedor getProveedor() {
        return proveedor;
        
    }
    
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    
    public long getNumero() {
        return numero;
    }
    
    public void setNumero(long numero) {
        this.numero = numero;
    }
    
    public Date getFecha() {
        return fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    //Valida si la orden esta Aprobada o rechazada

    public String validacion() {
        if (aprobacion.equalsIgnoreCase("Aprobado")) {
            return "Orden Aprobada";
        } else {
            return "Orden Rechazada";
        }
    }
    //Muestra el contenido de una orden pedido

    public String consulta() {
        return this.toString();
    }
    //Asigna la cantidad que se va aumentar las existencias en stock de un producto

    public void aumCant() {
        Item itemOrden = new Item();
        itemOrden.getProducto().agregarProducto(itemOrden.getCant());
    }
    //Le da formato a la fecha

    public String fechaformato() {
        int anno = this.getFecha().getYear() + 1900;
        int mes = this.getFecha().getMonth() + 1;
        int dia = this.getFecha().getDay();
        String fechaformato = dia + "/" + mes + "/" + anno;
        
        return fechaformato;
    }
    
    public void agregarItem(Item i){
        i.calcularSubtotal();
        listaItem.add(i);
    }
    
     public void exportarOrdenPedido() {
        FileWriter fichero = null;
        PrintWriter pw = null;

        try {
            fichero = new FileWriter("C:\\Users\\Oscar\\Desktop\\Orden Pedido.TXT");
            pw = new PrintWriter(fichero);
            pw.println(this.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
     public void listaVacia() throws ArreglosException{
         if(this.listaItem==null&& this.listaItem.size()<=0){
             throw new ArreglosException("lista de facturacion orden pedido vacia");
         }
     }
     
     @Override
    public String toString() {
        Iterator<Item> it = this.getListaItem().iterator();
        String cadena = "";
        double montofinal = 0.0;
        
        
        cadena += "Orden Pedido:\n\n"
                + "Detalle: " + getDetalle()
                + "Fecha: " + fechaformato() + "\n"
                + "Proveedor: " + getProveedor() + "\n"
                + "Numero de orden: " + getNumero() + "\n"
                + "____________________________________________________________\n"
                + "No.Linea\tCant.\tDescripcion\tPrecio Unitario\tSubTotal\n"
                + "------------------------------------------------------------\n";
        
        while (it.hasNext()) {
            Item itemOrden = (Item) it.next();
            
            cadena += itemOrden.getNumLinea() + "\t\t" + itemOrden.getCant() + "\t" + itemOrden.getProducto().getNombre() + "\t\t"
                    + itemOrden.getProducto().getCostoCompra() + "\t\t" + itemOrden.getSubtotal() + "\n";
            montofinal += itemOrden.getSubtotal() + itemOrden.getSubtotal();
        }
        
        cadena += "----------------------------------------------------------------------------------------------\n"
                + "TOTAL DE LA ORDEN : " + montofinal;
        
        return cadena += "\t\t" + validacion();
    }
}
