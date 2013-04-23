
package ManejoInventario;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/*
 * Creado por: Oscar Mendoza López 
 * Fecha: 15/04/2013
 * -------------------------------------------------- 
 * Modificado por: Marcela Leandro
 * Fecha: 
 * --------------------------------------------------- 
 * Descripción:
 *  
 */


public class Proveedor {
    
    private String empresa = "";
    private String telefono = "";
    private Date fechaEntrega;
    private ArrayList<Producto> lDP = new ArrayList<Producto>();

    public Proveedor() {
    }

    public Proveedor(String empresa, String telefono, Date fechaEntrega) {
        this.empresa = empresa;
        this.telefono = telefono;
        this.fechaEntrega = fechaEntrega;
        
    }
    
    public Proveedor(String empresa, String telefono, Date fechaEntrega, ArrayList lDP) {
        this.empresa = empresa;
        this.telefono = telefono;
        this.fechaEntrega = fechaEntrega;
        this.lDP = lDP;
    }
    

     public ArrayList<Producto> getlDP() {
        return lDP;
    }

    public void setlDP(ArrayList<Producto> lDP) {
        this.lDP = lDP;
    }
    
    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

     public void agregarProducto(Producto p) {
        lDP.add(p);

    }

     public String ImprimirProductos() {
        
         String listaP = "";

        Iterator<Producto> it = lDP.iterator();
        while (it.hasNext()) {
            listaP += it.next().toString() + "\n";
        }
        return "\nProductos: " + listaP;
    }
    
    public void listaVacia() throws ArreglosException{
        if (this.lDP==null && this.lDP.size()<=0){
            throw new ArreglosException("lista vacia");
        }
    }

   
        
        @Override
    public String toString(){
       
            
        int anno = this.getFechaEntrega().getYear() + 1900;
        int mes = this.getFechaEntrega().getMonth() + 1;
        int dia = this.getFechaEntrega().getDay();
        String fecha = dia + "/" + mes + "/" + anno;
        
        return "Empresa:" + this.getEmpresa() + "\ntelefono:" + this.getTelefono() + ", fechaEntrega:" +fecha;
    }

    
    
    
    
    
   
}