
package ManejoInventario;
/*
 * Creado por: Daniela Bolivar
 * Fecha: 
 * -------------------------------------------------- 
 * Modificado por: 
 * Fecha: 
 * --------------------------------------------------- 
 * Descripción:
 * 
 */
public class Ti extends Categoria implements IDescuento{
    
    @Override
      public double implementarDescuento(double precio){
        
        double descuento=0.30*precio;
       return precio-descuento;
        
    }

}

