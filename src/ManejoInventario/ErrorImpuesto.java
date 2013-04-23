
package ManejoInventario;

/*
 * Creado por: Daniela Bolivar Villegas
 * Fecha: 21/04/2013
 * -------------------------------------------------- 
 * Modificado por: 
 * Fecha: 
 * --------------------------------------------------- 
 * Descripción: 
 */

public class ErrorImpuesto extends Exception{

    public ErrorImpuesto() {
    }

    public ErrorImpuesto(String message) {
        super(message);
    }

    public ErrorImpuesto(String message, Throwable cause) {
        super(message, cause);
    }

    public ErrorImpuesto(Throwable cause) {
        super(cause);
    }

    public ErrorImpuesto(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
