package ManejoInventario;

import java.util.ArrayList;
import java.util.Date;

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
    private OrdenCompra orden = new OrdenCompra();

    public Factura() {
    }

    public Factura(int numero, Date fecha) {
        this.numero = numero;
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public OrdenCompra getOrden() {
        return orden;
    }

    public void setOrden(OrdenCompra orden) {
        this.orden = orden;
    }

    //Le da formato a la fecha
    public String fechaformato() {
        int anno = this.getFecha().getYear() + 1900;
        int mes = this.getFecha().getMonth() + 1;
        int dia = this.getFecha().getDay();
        String fechaformato = dia + "/" + mes + "/" + anno;

        return fechaformato;
    }

    @Override
    public String toString() {
            String cadena = "";
            cadena +="Factura:\n" 
                   + "Fecha: " + fechaformato() + "\n"
                   +  "Numero de Factura: " + getNumero() + "\n" 
                   + orden.imprimir();
                 


        return cadena;
    }
}
