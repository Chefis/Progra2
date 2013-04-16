package ManejoInventario;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/*
 * Creado por: Oscar Mendoza López
 * Fecha: 15/04/2013
 * -------------------------------------------------- 
 * Modificado por: 
 * Fecha: 
 * --------------------------------------------------- 
 * Descripción:
 * 
 */
public class Bodega {

    private String nombre = "";
    private String ubicacion = "";
    private ArrayList<ProductoInv> lP = new ArrayList<ProductoInv>();
    
    
    public Bodega() {
    }

    public Bodega(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }
    
    public ArrayList<ProductoInv> getlP() {
        return lP;
    }

    public void setlP(ArrayList<ProductoInv> lP) {
        this.lP = lP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void agregarProducot(ProductoInv p) {
        lP.add(p);

    }

    public String verProductos() {
        String listaP = "";
        int cont = 0;
        Iterator<ProductoInv> it = lP.iterator();
        while (it.hasNext()) {
            cont++;
            listaP += cont + "." + it.next().toString() + "\n";
        }
        return getNombre() + "Productos:\n" + listaP;
    }
    
    @Override
    public String toString() {
        return getNombre() +" "+ getUbicacion();
    }
}
