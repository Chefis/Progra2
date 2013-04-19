package ManejoInventario;
       

import ManejoInventario.Producto;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/*
 * Creado por: Daniela Bolivar Villegas
 * Fecha: 14/04/2013
 * -------------------------------------------------- 
 * Modificado por: 
 * Fecha: 
 * --------------------------------------------------- 
 * Descripción:
 * Necesito modificarlo (agregar, retirar), poder consultarlo. Tiene que tener un
 * punto minimo en que se deba comprar de nuevo a los distribuidores.
 */
public class Inventario {
//    private String NombreProducto;
//    private String codigo;
   
    private String fechaIngreso;
    private String existenciaProducto;
    private String codidoEmpleado;
    ArrayList<Producto> listaInventario= new ArrayList<>();// lo agrego para manejar todo segun existencias 
      
    public Inventario() {
    }

    public Inventario(String fechaIngreso, String existenciaProducto, String codidoEmpleado) {
        this.fechaIngreso = fechaIngreso;
        this.existenciaProducto = existenciaProducto;
        this.codidoEmpleado = codidoEmpleado;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getExistenciaProducto() {
        return existenciaProducto;
    }

    public void setExistenciaProducto(String existenciaProducto) {
        this.existenciaProducto = existenciaProducto;
    }

    public String getCodidoEmpleado() {
        return codidoEmpleado;
    }

    public void setCodidoEmpleado(String codidoEmpleado) {
        this.codidoEmpleado = codidoEmpleado;
    }

    public ArrayList<Producto> getListaInventario() {
        return listaInventario;
    }

    public void setListaInventario(ArrayList<Producto> listaInventario) {
        this.listaInventario = listaInventario;
    }
    
   //agregar los productos
    public void AgregarListaItems(Producto pi) {

        listaInventario.add(pi);
    }    
    
    //ver los productos disponibles o en el inventario(pil=producto inventario lista)
    
    public String verProductosInventario(){
     
        String lista="";
        Iterator<Producto> pil=listaInventario.iterator();
        while(pil.hasNext()){
            Producto iDatos=pil.next();
            lista+=iDatos.toString();
    }
        return lista;
            
    }
    
    public void cantProductos(){
        
        if(Integer.parseInt(verProductosInventario())<= 100){
            System.out.println("Los produtos se acercan al minimo, llamar a proveedor");
         
        }
        }
    
    
    
    
    
    
    
}
