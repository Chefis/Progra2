
package ManejoInventario;

import java.util.ArrayList;

/*
 * Creado por: Marcela Leandro
 * Fecha: 15/04/2013
 * -------------------------------------------------- 
 * Modificado por: 
 * Fecha: 
 * --------------------------------------------------- 
 * Descripción:
 *  Necesita una lista de distribuidores
 */


public class Empresa {
    
    private String nombre;
    private String direccion;
    private ArrayList<Proveedor> listaDist = new ArrayList<Proveedor>();
    private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>(); 
   
    public Empresa(){
    
    }
    
    public Empresa(String nombre, String direccion, ArrayList listDist) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaDist = listDist;
    }
    
    public Empresa(String nombre, String direccion, ArrayList listDist, ArrayList listaClientes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaDist = listDist;
        this.listaClientes = listaClientes;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Proveedor> getListaDist() {
        return listaDist;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setListaDist(ArrayList<Proveedor> listaDist) {
        this.listaDist = listaDist;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    
      
     public void agregarDistribuidor(Proveedor d){
        listaDist.add(d);
    }

     
     public void agregarCliente(Cliente c){
        listaClientes.add(c);
    }
     
     
     
     
    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", direccion=" + direccion + ", listaDist=" + listaDist + ", listaClientes=" + listaClientes + '}';
    }

     
     
    
    
    
}
