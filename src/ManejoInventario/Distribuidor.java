
package ManejoInventario;

import java.util.ArrayList;
import java.util.Date;

/*
 * Creado por: Oscar Mendoza López 
 * Fecha: 15/04/2013
 * -------------------------------------------------- 
 * Modificado por: 
 * Fecha: 
 * --------------------------------------------------- 
 * Descripción:
 *  Necesita una lista de Productos distribuidor
 */


public class Distribuidor {
    
    private String nombre = "";
    private String empresa = "";
    private String telefonos = "";
    private Date fechaEntrega;
   
    private Categoria tipoProductos;
    private ArrayList<ProductoInv> lDP = new ArrayList<ProductoInv>();

    public Distribuidor() {
    }

    public Distribuidor(String nombre, String empresa, String telefonos, Categoria tipoProductos, Date fechaEntrega) {
        
        this.nombre = nombre;
        this.empresa = empresa;
        this.telefonos = telefonos;
        this.fechaEntrega = fechaEntrega;
        this.tipoProductos = tipoProductos;
    }

     public ArrayList<ProductoInv> getlDP() {
        return lDP;
    }

    public void setlDP(ArrayList<ProductoInv> lDP) {
        this.lDP = lDP;
    }
    
    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public Categoria getTipoProductos() {
        return tipoProductos;
    }

    public void setTipoProductos(Categoria tipoProductos) {
        this.tipoProductos = tipoProductos;
    }
    
}
