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

    private long numero;
    private Date fecha;
    private Cliente Cliente;
    private Proveedor proveedor;
    private String Detalle;
    private ArrayList<Item> listaItem = new ArrayList<Item>();

    public Factura() {
    }

    public Factura(long numero, Date fecha, Cliente Cliente, ArrayList listaItem, Proveedor proveedor) {
        this.numero = numero;
        this.fecha = fecha;
        this.Cliente = Cliente;
        this.listaItem = listaItem;
        this.proveedor = proveedor;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedro(Proveedor proveedor) {
        this.proveedor = proveedor;
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

    public long getNumero() {
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

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public void agregarItem(Item i) {
        listaItem.add(i);
    }

    @Override
    public String toString() {

        int anno = this.getFecha().getYear() + 1900;
        int mes = this.getFecha().getMonth() + 1;
        int dia = this.getFecha().getDay();
        String fechaformato = dia + "/" + mes + "/" + anno;
        String cadena = "";
        double montofinal = 0.0;
        double impuesto = 0.0;
        double descuento = 0.0;

        cadena += getDetalle() + "\n"
                + "Fecha: " + fechaformato + "\n"
                + "Numero Orden: " + this.getNumero() + "\n";
        //Esto lo estoy poniendo para ver si se puede que en caso de que sea una orden pedido solo despliegue el proveedor, o si es orden compra solo despliegue el cliente
        if (getCliente() != null) {
            cadena += "Cliente: " + getCliente() + "\n";
        } else {
            if (getProveedor() != null) {
                cadena += "Proveedor: " + getProveedor() + "\n";
            }
        }
        cadena += "___________________________________________________________________________________________\n"
                + "No.Linea\tCant.\tDescripcion\tPrecio Unitario\tImpuesto\tDescuento\tSubTotal\n"
                + "-------------------------------------------------------------------------------------------\n";

        Iterator<Item> it = this.getListaItem().iterator();
        while (it.hasNext()) {
            Item itemOrden = (Item) it.next();

            if (itemOrden.getProducto().getCategoria() instanceof Electrodomesticos) {
                impuesto = ((Electrodomesticos) itemOrden.getProducto().getCategoria()).implementarImpuesto();

            } else if (itemOrden.getProducto().getCategoria() instanceof MueblesOficina) {
                impuesto = ((MueblesOficina) itemOrden.getProducto().getCategoria()).implementarImpuesto();
            } else {
                impuesto = ((TecnologiaInfo) itemOrden.getProducto().getCategoria()).implementarImpuesto();
            }

            if (itemOrden.getProducto().getCategoria() instanceof Electrodomesticos) {
                descuento = ((Electrodomesticos) itemOrden.getProducto().getCategoria()).implementarDescuento();

            } else if (itemOrden.getProducto().getCategoria() instanceof MueblesOficina) {
                descuento = ((MueblesOficina) itemOrden.getProducto().getCategoria()).implementarDescuento();
            } else {
                descuento = ((TecnologiaInfo) itemOrden.getProducto().getCategoria()).implementarDescuento();
            }




            cadena += itemOrden.getNumLinea() + "\t\t" + itemOrden.getCant() + "\t" + itemOrden.getProducto().getNombre() + "\t\t"
                    + itemOrden.getProducto().getCostoVenta() + "\t\t" + impuesto + "\t\t" + descuento + "\t\t" + ((itemOrden.getSubtotal() + (itemOrden.getSubtotal() * impuesto / 100)) / descuento) + "\n";

            montofinal += ((itemOrden.getSubtotal() + (itemOrden.getSubtotal() * impuesto / 100)) / descuento);

        }

        cadena += "----------------------------------------------------------------------------------------------\n"
                + "TOTAL DE LA ORDEN : " + montofinal;

        return cadena;
    }
}
