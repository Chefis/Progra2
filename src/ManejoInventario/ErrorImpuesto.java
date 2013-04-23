/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejoInventario;

/**
 *
 * @author Bolivar
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
