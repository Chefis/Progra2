package ManejoInventario;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Creado por: Marcela Leandro
 * Fecha: 15/04/2013
 * -------------------------------------------------- 
 * Modificado por: Marcela Leandro
 * Fecha: 
 *--------------------------------------------------- 
 * Modificado por: Daniela Bolivar (exception)
 * Fecha: 21/04/2013
 * --------------------------------------------------- 
 * Descripción:
 *  
 */
public class Empresa {

    private String nombre;
    private String direccion;
    private ArrayList<Proveedor> listaProv = new ArrayList<Proveedor>();
    private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

    public Empresa() {
    }

    public Empresa(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;

    }

    public Empresa(String nombre, String direccion, ArrayList listProv, ArrayList listaClientes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaProv = listaProv;
        this.listaClientes = listaClientes;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Proveedor> getlistaProv() {
        return listaProv;
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

    public void setlistaProv(ArrayList<Proveedor> listaProv) {
        this.listaProv = listaProv;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public void agregarProveedor(Proveedor p) {
        listaProv.add(p);
    }

    public String ImprimirProveedor() {

        String listaP = "";

        Iterator<Proveedor> it = listaProv.iterator();
        while (it.hasNext()) {
            listaP += it.next().toString() + "\n";
        }
        return "\n" + listaP;
    }

    public void agregarCliente(Cliente c) {
        listaClientes.add(c);
    }

    public String ImprimirCliente() {

        String listaC = "";

        Iterator<Cliente> it = listaClientes.iterator();
        while (it.hasNext()) {
            listaC += it.next().toString() + "\n";
        }
        return "\n" + listaC;
    }
   
    public void listasVacias() throws ArreglosException{
         if(this.listaClientes ==null && this.listaClientes.size() <=0){
             throw new ArreglosException("Lista de clientes vacias");
         }else if (this.listaProv ==null && this.listaProv.size() <=0){
             throw new ArreglosException("Lista de distribuidores vacia");
         }
     }
    
     @Override
    public String toString() {
       
      return "Nombre Empresa: "+ this.getNombre() + "\nDirección: " + this.getDireccion() + "\n";
    
     }


}
