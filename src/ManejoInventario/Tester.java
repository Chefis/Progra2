
package ManejoInventario;

import java.util.Date;


public class Tester {

    
    public static void main(String[] args) {
       
        Categoria categoria = new Electrodomesticos("Electrodomesticos", "Linea blanca", true);
        Electrodomesticos electrodomesticos = new Electrodomesticos("Electrodomesticos", "Linea blanca", true);
        Producto producto = new Producto("A21", "Refri", "2 puertas", 20, 5, 20, 20, 1500, 2000, null, categoria, true, new Date("12/03/2013"));

        electrodomesticos.agregarProducto(producto);
        producto.sacarProducto(15);
        producto.agregarProducto(6);
        System.out.println(producto.consultarProducto());
        
        System.out.println(electrodomesticos.productoPorCategoria(electrodomesticos));
    }
}
