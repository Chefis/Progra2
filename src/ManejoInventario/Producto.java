package ManejoInventario;
/*
 * Creado por: Jennifer Camacho
 * Fecha: 
 * -------------------------------------------------- 
 * Modificado por: Jennifer Camacho
 * Fecha: 14/abril/2013
 * --------------------------------------------------- 
 * Descripción:
 * Colocar el producto dentro de una categoria. xx
 * Obtener el impuesto y el descuento por medio de la categoria. xx
 * Enviar un mensaje cuando la cantidad minima. xx
 * Enviar un mensaje para la cantidad max. xx
 * Agregar producto
 */

public class Producto {

    private String codigo;
    private String nombre;
    private String decripcion;
    private Integer cantInicial; //esta se hace manual
    private Integer cantMin = 0; //tiene q tener un mensaje quedan solo xx
    private Integer cantMax; //tiene q tener un mensaje 
    private Integer existencias; //esta es la inicial mas si se le mete mas o se le quita
    private double costoCompra;
    private double costoVenta;
    private Proveedor proveedor;
    private Categoria categoria;
    private String fechaIngreso;
    private boolean estado;

    public Producto() {
    }

    public Producto(String codigo, String nombre, String decripcion, Integer cantInicial, Integer cantMin, Integer cantMax, Integer existencias, double costoCompra, double costoVenta, Proveedor proveedor, Categoria categoria, boolean estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.decripcion = decripcion;
        this.cantInicial = cantInicial;
        this.cantMin = cantMin;
        this.cantMax = cantMin;
        this.existencias = existencias;
        this.costoCompra = costoCompra;
        this.costoVenta = costoVenta;
        this.proveedor = proveedor;
        this.categoria = categoria;
        this.estado = estado;
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

    public Integer getCantInicial() {
        return cantInicial;
    }

    public void setCantInicial(Integer cantInicial) {
        this.cantInicial = cantInicial;
    }

    public Integer getCantMin() {
        return cantMin;
    }

    public void setCantMin(Integer cantMin) {
        this.cantMin = cantMin;
    }

    public Integer getCantMax() {
        return cantMax;
    }

    public void setCantMax(Integer cantMax) {
        this.cantMax = cantMax;
    }

    public Integer getExistencias() {
        return existencias;
    }

    public void setExsitencias(Integer existencias) {
        this.existencias = existencias;
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

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
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
            return ((Ti) getCategoria()).implementarImpuesto();
        }
    }

    public double obtenerDescuento() {

        if (getCategoria() instanceof Electrodomesticos) {
            return ((Electrodomesticos) getCategoria()).implementarDescuesto();
        } else if (getCategoria() instanceof MueblesOficina) {
            return ((MueblesOficina) getCategoria()).implementarDescuento();
        } else {
            return ((Ti) getCategoria()).implementarDescuento();
        }
    }

   /* public String agregarProducto() {

        Integer  

                
        return mensaje;
    }*/
    public String mensajeCantMin() {

        String mensaje = "";

        if (getExistencias() == getCantMin() + 3) {
            mensaje = "Se encuentra a 3 productos del límite mínimo de existencias.";
        }

        if (getExistencias() == getCantMin()) {
            mensaje = "Ha llegado al límite mínimo de existencias.\n"
                    + "POR FAVOR INGRESE NUEVO PRODUCTO.";
        }
        return mensaje;
    }

    public String mensajeCantMax() {

        String mensaje = "";

        if (getExistencias() == getCantMax() - 3) {
            mensaje = "Se encuentra a 3 productos del límite maximo de existencias.";
        }

        if (getExistencias() == getCantMax()) {
            mensaje = "HA LLEGADO AL MAXIMO PERMITIDO DE EXISTENCIAS.\n"
                    + "Por favor, recuerde no superar la cantidad maxima permitida";
        }
        return mensaje;
    }
        
    @Override
    public String toString() {
        String cadena = "";

        cadena += "Detalles Generales\n";
        cadena += "Código: " + this.getCodigo() + "\n";
        cadena += "Nombre: " + this.getNombre() + "\n";
        cadena += "Descripción: " + this.getDecripcion() + "\n";
        cadena += "Fecha ingreso: " + this.getFechaIngreso() + "\n";
        cadena += "Estado: " + this.isEstado() + "\n\n";

        cadena += "Valores del Articulo\n";
        cadena += "Cantidad inicial: " + this.getCantInicial() + "\n";
        cadena += "Cantidad minima: " + this.getCantMin() + "\n";
        cadena += "Cantidad maxima: " + this.getCantMax() + "\n";
        cadena += "Cantidad total: " + this.getExistencias() + "\n";
        cadena += "Costo de compra: " + this.getCostoCompra() + "\n";
        cadena += "Costo de venta: " + this.getCostoVenta() + "\n";
        cadena += "Impuesto:" + obtenerImpuesto() + "\n";
        cadena += "Descuento:" + obtenerDescuento() + "\n\n";

        cadena += "Propiedades\n";
        cadena += "Categoria: " + this.getCategoria() + "\n";
        cadena += "Proveerdor: " + this.getProveedor() + "\n";

        return cadena;
    }
}
