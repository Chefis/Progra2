
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
public class MueblesOficina extends Categoria implements IDescuento {

    @Override
    public double implementarDescuento(double precio) {

        double descuento = 0.50 * precio;
        return precio - descuento;
    }
}
