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
 * Modificado por: Jennifer Camacho Zamora
 * Fecha: 21/04/2013
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

    public OrdenCompra(int numero, Date fecha, Cliente cliente, String detalle, String aprobacion) {

        this.aprobacion = aprobacion;
        this.cliente = cliente;
        this.detalle = detalle;
        this.fecha = fecha;
        this.numero = numero;


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

    public void agregarItem(Item i) {
        i.calcularSubtotal();
        item.add(i);
    }

    public void exportarOrdenCompra() {
        FileWriter fichero = null;
        PrintWriter pw = null;

        try {
            fichero = new FileWriter("F://Orden Compra.TXT");
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

    public String imprimir() {
        String ret = "";
        double montofinal = 0.0;
        
        ret += "Detalle: " + getDetalle() + "\n"
                + "Cliente: " + getCliente() + "\n"
                + "________________________________________________________________________________________________\n"
                + "No.Linea\tCant.\tDescripcion\tPrecio Unitario\tImpuesto\tDescuento\tSubTotal\n"
                + "------------------------------------------------------------------------------------------------\n";

        Iterator<Item> it = this.getItem().iterator();
        while (it.hasNext()) {
            Item itemOrden = (Item) it.next();


            ret += itemOrden.getNumLinea() + "\t\t" + itemOrden.getCant() + "\t" + itemOrden.getProducto().getNombre() + "\t\t"
                    + itemOrden.getProducto().getCostoVenta() + "\t\t" + itemOrden.getProducto().obtenerImpuesto()+ "\t\t" 
                    + itemOrden.getProducto().obtenerDescuento()+ "\t\t"
                    + itemOrden.getSubtotal() + "\n";

            montofinal += itemOrden.getSubtotal();

        }

        ret += "------------------------------------------------------------------------------------------------\n"
                + "TOTAL DE LA ORDEN : " + montofinal;

        return ret;
    }

    @Override
    public String toString() {
        String cadena = "";


        cadena += "Orden de Compra: \n\n"
                + "Numero Orden: " + this.getNumero() + "\n"
                + "Fecha: " + fechaformato() + "\n"
                + imprimir();

        return cadena + "\t\t" + validacion();
    }
}
