
package ManejoInventario;
/*
 * Creado por: Jennifer Camacho
 * Fecha: 
 * -------------------------------------------------- 
 * Modificado por: Jennifer Camacho
 * Fecha: 14/abril/2013
 * --------------------------------------------------- 
 * Descripción:
 *  El producto, CREO, tiene que llevar Archivar, agregar, modificar, consultar
 */

public class Producto {
    
    private String codigo;
    private String nombre;
    private String decripcion;
    private Integer cantInicial;
    private Integer cantMin;
    private Integer canttotal;
    private double costoUnid;
    private Distribuidor distribuidor;
    private Categoria categoria; //este se puede quitar si no existen mas de una categoria

    public Producto() {
    }

    public Producto(String codigo, String nombre, String decripcion, Integer cantInicial, Integer cantMin, Integer canttotal, double costoUnid, Distribuidor distribuidor, Categoria categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.decripcion = decripcion;
        this.cantInicial = cantInicial;
        this.cantMin = cantMin;
        this.canttotal = canttotal;
        this.costoUnid = costoUnid;
        this.distribuidor = distribuidor;
        this.categoria = categoria;
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

    public Integer getCanttotal() {
        return canttotal;
    }

    public void setCanttotal(Integer canttotal) {
        this.canttotal = canttotal;
    }

    public double getCostoUnid() {
        return costoUnid;
    }

    public void setCostoUnid(double costoUnid) {
        this.costoUnid = costoUnid;
    }

    public Distribuidor getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(Distribuidor distribuidor) {
        this.distribuidor = distribuidor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        String cadena = "";
        
        cadena += "Detalles Generales\n";
        cadena += "Código: " +this.getCodigo()+ "\n";
        cadena += "Nombre: " +this.getNombre()+ "\n";
        cadena += "Descripción: " +this.getDecripcion()+ "\n\n";
        
        cadena += "Valores del Articulo\n";
        cadena += "Cantidad inicial: " +this.getCantInicial()+ "\n";
        cadena += "Cantidad minima: " +this.getCantMin()+ "\n";
        cadena += "Cantidad total: " +this.getCanttotal()+ "\n";
        cadena += "Costo unitario: " +this.getCostoUnid()+ "\n\n";
        
        cadena += "Propiedades\n";
        cadena += "Categoria: " +this.getCategoria()+ "\n";
        cadena += "Proveerdor: " +this.getDistribuidor()+ "\n";
                
        return cadena;
    }
        
}
