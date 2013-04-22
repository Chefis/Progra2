package ManejoInventario;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bolivar
 */
public class ErrorDescuento extends Exception{

    public ErrorDescuento() {
    }

    public ErrorDescuento(String message) {
        super(message);
    }

    public ErrorDescuento(String message, Throwable cause) {
        super(message, cause);
    }

    public ErrorDescuento(Throwable cause) {
        super(cause);
    }

    public ErrorDescuento(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
 
    
}
