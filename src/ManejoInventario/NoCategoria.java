/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejoInventario;

/**
 *
 * @author Bolivar
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
