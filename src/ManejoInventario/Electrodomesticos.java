
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
public class Electrodomesticos extends Categoria implements ITaxable {

    @Override
    public double implementarImpuesto(double precio) {

        double impuesto = 0.10 * precio;
        return precio + impuesto;

    }
}
