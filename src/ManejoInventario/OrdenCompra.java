package ManejoInventario;

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
 * Para que el cliente se responsibilice de su pago sobre lo que me pidio.
 * Mando una copia a bodega para que me aparte y de el producto que solicito
 */
public class OrdenCompra {

    private String aprobacion = "";
    private Date fecha;
    private Cliente cliente;
    private int numero = 0;
    private String detalle = "";
    private ArrayList<Item> item = new ArrayList<Item>();

    public OrdenCompra() {
    }

    public OrdenCompra(Date fecha, Cliente cliente, String detalle, String aprobacion, ArrayList item) {

        this.aprobacion = aprobacion;
        this.cliente = cliente;
        this.detalle = detalle;
        this.fecha = fecha;
        this.item = item;

    }

    public String getAprobacion() {
        return aprobacion;
    }

    public void setAprobacion(String aprobacion) {
        this.aprobacion = aprobacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public ArrayList<Item> getItem() {
        return item;
    }

    public void setItem(ArrayList<Item> item) {
        this.item = item;
    }
    //Este metodo comprueba si la orden esta aprovada o rechazada
    public String validacion() {
        if (aprobacion.equalsIgnoreCase("Aprobado")) {
            return "Orden Aprobada";
        } else {
            return "Orden Rechazada";
        }
    }

    //Le da formato a la fecha
    public String fechaformato() {
        int anno = this.getFecha().getYear() + 1900;
        int mes = this.getFecha().getMonth() + 1;
        int dia = this.getFecha().getDay();
        String fechaformato = dia + "/" + mes + "/" + anno;

        return fechaformato;
    }
    //Este metodo asigna a ingresoProducto la cantida que se debe de disminuir del stock en bodega

    public void disminuirCant() {
    
        Item itemOrden = new Item();
       
            itemOrden.getProducto().sacarProducto(itemOrden.getCant());

    }

    //Muestra el contenido de una orden pedido
    public String consulta() {
        return this.toString();
    }

    @Override
    public String toString() {
        String cadena = "";
        double montofinal = 0.0;
        double impuesto = 0.0;
        double descuento = 0.0;
        
        cadena += getDetalle() + "\n"
                + "Fecha: " + fechaformato() + "\n"
                + "Numero Orden: " + this.getNumero() + "\n"
                + "Cliente: " + getCliente() 
                + "___________________________________________________________________________________________\n"
                + "No.Linea\tCant.\tDescripcion\tPrecio Unitario\tImpuesto\tDescuento\tSubTotal\n"
                + "-------------------------------------------------------------------------------------------\n";

        Iterator<Item> it = this.getItem().iterator();
        while (it.hasNext()) {
            Item itemOrden = (Item) it.next();

            impuesto += itemOrden.getProducto().obtenerImpuesto();
            descuento += itemOrden.getProducto().obtenerDescuento();


            cadena += itemOrden.getNumLinea() + "\t\t" + itemOrden.getCant() + "\t" + itemOrden.getProducto().getNombre() + "\t\t"
                    + itemOrden.getProducto().getCostoVenta() + "\t\t" + impuesto + "\t\t" + descuento + "\t\t" + ((itemOrden.getSubtotal() + (itemOrden.getSubtotal() * impuesto / 100)) / descuento) + "\n";

            montofinal += ((itemOrden.getSubtotal() + (itemOrden.getSubtotal() * impuesto / 100)) / descuento);

        }

        cadena += "----------------------------------------------------------------------------------------------\n"
                + "TOTAL DE LA ORDEN : " + montofinal;

        return cadena + "\t\t" + validacion();
    }
}
