
package ManejoInventario;

/*
 * Creado por: Daniela Bolivar
 * Fecha: 21/04/2013
 * -------------------------------------------------- 
 * Modificado por: 
 * Fecha: 
 * --------------------------------------------------- 
 * Descripción:
 * 
 */
public class NoCategoria extends Exception{

    public NoCategoria() {
    }

    public NoCategoria(String message) {
        super(message);
    }

    public NoCategoria(String message, Throwable cause) {
        super(message, cause);
    }

    public NoCategoria(Throwable cause) {
        super(cause);
    }

    public NoCategoria(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
