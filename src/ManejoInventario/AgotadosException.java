
package ManejoInventario;

/*
 * Creado por: Daniela Bolivar
 * Fecha: 21/04/2013
 * -------------------------------------------------- 
 * Modificado por: 
 * Fecha: 
 * --------------------------------------------------- 
 * Descripción:
 * Exception para los productos agotados.
 */
public class AgotadosException extends Exception{

    public AgotadosException() {
    }

    public AgotadosException(String message) {
        super(message);
    }

    public AgotadosException(String message, Throwable cause) {
        super(message, cause);
    }

    public AgotadosException(Throwable cause) {
        super(cause);
    }

    public AgotadosException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
