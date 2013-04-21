package ManejoInventario;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;

/*
 * Creado por: Jennifer Camacho
 * Fecha: 
 * -------------------------------------------------- 
 * Modificado por: Jennifer Camacho
 * Fecha: 14/abril/2013
 * --------------------------------------------------- 
 * Descripción:
 * Colocar el producto dentro de una categoria. 
 * Obtener el impuesto y el descuento por medio de la categoria. 
 * Enviar un mensaje cuando la cantidad minima. 
 * Enviar un mensaje para la cantidad max. 
 * Agregar producto
 */
public class Producto {

    private String codigo;
    private String nombre;
    private String decripcion;
    private int cantInicial; //esta se hace manual
    private int cantMin = 0; //tiene q tener un mensaje quedan solo xx
    private int cantMax; //tiene q tener un mensaje 
    private int existencias; //esta es la inicial mas si se le mete mas o se le quita
    private double costoCompra;
    private double costoVenta;
    private Proveedor proveedor;
    private Categoria categoria;
    private Date fechaIngreso;
    private boolean estado;

    public Producto() {
    }

    public Producto(String codigo, String nombre, String decripcion, int cantInicial, int cantMin, int cantMax, int existencias, double costoCompra, double costoVenta, Proveedor proveedor, Categoria categoria, boolean estado, Date fechaIngreso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.decripcion = decripcion;
        this.cantInicial = cantInicial;
        this.cantMin = cantMin;
        this.cantMax = cantMax;
        this.existencias = existencias;
        this.costoCompra = costoCompra;
        this.costoVenta = costoVenta;
        this.proveedor = proveedor;
        this.categoria = categoria;
        this.estado = estado;
        this.fechaIngreso = fechaIngreso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDecripcion() {
        return decripcion;
    }

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }

    public int getCantInicial() {
        return cantInicial;
    }

    public void setCantInicial(int cantInicial) {
        this.cantInicial = cantInicial;
    }

    public int getCantMin() {
        return cantMin;
    }

    public void setCantMin(int cantMin) {
        this.cantMin = cantMin;
    }

    public int getCantMax() {
        return cantMax;
    }

    public void setCantMax(int cantMax) {
        this.cantMax = cantMax;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExsitencias(int existencias) {
        this.existencias = cantInicial;
    }

    public double getCostoCompra() {
        return costoCompra;
    }

    public void setCostoCompra(double costoCompra) {
        this.costoCompra = costoCompra;
    }

    public double getCostoVenta() {
        return costoVenta;
    }

    public void setCostoVenta(double costoVenta) {
        this.costoVenta = costoVenta;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double obtenerImpuesto() {

        if (getCategoria() instanceof Electrodomesticos) {
            return ((Electrodomesticos) getCategoria()).implementarImpuesto();
        } else if (getCategoria() instanceof MueblesOficina) {
            return ((MueblesOficina) getCategoria()).implementarImpuesto();
        } else {
            return ((TecnologiaInfo) getCategoria()).implementarImpuesto();
        }
    }

    public double obtenerDescuento() {

        if (getCategoria() instanceof Electrodomesticos) {
            return ((Electrodomesticos) getCategoria()).implementarDescuento();
        } else if (getCategoria() instanceof MueblesOficina) {
            return ((MueblesOficina) getCategoria()).implementarDescuento();
        } else {
            return ((TecnologiaInfo) getCategoria()).implementarDescuento();
        }

    }

    public void agregarProducto(int ingresoProducto) {

        this.existencias += ingresoProducto;
    }

    public void sacarProducto(int productoVendido) {

        if (productoVendido <= this.existencias) {
            this.existencias -= productoVendido;
        } else {
            System.out.println("No se puede realizar la compra.");
        }
    }

    public String consultarProducto() {

        return this.toString();
    }

    public String mensajeCantMin() {

        String mensaje = "";

        if (this.getExistencias() == (this.getCantMin() + 3)) {
            mensaje = "Se encuentra a 3 productos del límite mínimo de existencias.";
        }

        if (this.getExistencias() <= this.getCantMin()) {
            mensaje = "Ha llegado al límite mínimo de existencias.\n"
                    + "POR FAVOR INGRESE NUEVO PRODUCTO.";
        }
        return mensaje;
    }

    public String mensajeCantMax() {

        String mensaje = "";

        if (this.getExistencias() == (this.getCantMax() - 3)) {
            mensaje = "Se encuentra a 3 productos del límite maximo de existencias.";
        }

        if (this.getExistencias() >= this.getCantMax()) {
            mensaje = "HA LLEGADO AL MAXIMO PERMITIDO DE EXISTENCIAS.\n"
                    + "Por favor, recuerde no superar la cantidad maxima permitida";
        }
        return mensaje;
    }

    public void exportarProducto() {
        FileWriter fichero = null;
        PrintWriter pw = null;

        try {
            fichero = new FileWriter("F://Prueba.TXT");
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

    @Override
    public String toString() {
        String cadena = "";
        int anno = this.getFechaIngreso().getYear() + 1900;
        int mes = this.getFechaIngreso().getMonth() + 1;
        int dia = this.getFechaIngreso().getDay();
        String fechaformato = dia + "/" + mes + "/" + anno;


        cadena += "Detalles Generales\n";
        cadena += "Código: " + this.getCodigo() + "\n";
        cadena += "Nombre: " + this.getNombre() + "\n";
        cadena += "Descripción: " + this.getDecripcion() + "\n";
        cadena += "Fecha ingreso: " + fechaformato + "\n";
        cadena += "Estado: " + this.isEstado() + "\n\n";

        cadena += "Valores del Articulo\n";
        cadena += "Cantidad inicial: " + this.getCantInicial() + "\n";
        cadena += "Cantidad minima: " + this.getCantMin() + "\n";
        cadena += "Cantidad maxima: " + this.getCantMax() + "\n";
        cadena += "Cantidad en existencias: " + this.getExistencias() + "\n";
        cadena += "Costo de compra: " + this.getCostoCompra() + "\n";
        cadena += "Costo de venta: " + this.getCostoVenta() + "\n";
        cadena += "Impuesto:" + obtenerImpuesto() + "\n";
        cadena += "Descuento:" + obtenerDescuento() + "\n\n";

        cadena += "Propiedades\n";
        cadena += "Categoria: " + this.getCategoria() + "\n";
        cadena += "Proveerdor: " + this.getProveedor() + "\n\n";

        cadena += "NOTAS:\n";
        cadena += mensajeCantMax() + mensajeCantMin() + "\n";


        return cadena;
    }
}
