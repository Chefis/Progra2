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
