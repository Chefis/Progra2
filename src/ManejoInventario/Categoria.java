package ManejoInventario;

import java.util.ArrayList;

/*
 * Creado por: Jennifer Camacho
 * Fecha: 14/abril/2013
 * -------------------------------------------------- 
 * Modificado por: Daniela Bolivar (exception)
 * Fecha: 21/04/2013
 * --------------------------------------------------- 
 * Descripción:
 * 
 */
public abstract class Categoria {

    private String nombre;
    private String descripcion;
    private boolean estado;
    public ArrayList<Producto> listaProducto = new ArrayList<Producto>();

    public Categoria() {
    }

    public Categoria(String nombre, String descripcion, boolean estado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
//Crea una lista en la que se colocaran los productos existentes, no se encuentra funcionando
    public ArrayList<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(ArrayList<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }
    
    public void listaVacia() throws ArreglosException {
        if (this.listaProducto == null && this.listaProducto.size() <= 0) {
            throw new ArreglosException("lista Productos vacia");
        }
    }
    
}
