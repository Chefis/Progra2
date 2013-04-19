package ManejoInventario;


import ManejoInventario.Cliente;
import ManejoInventario.Cliente;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M-01
 */
public class ClienteJuridico extends Cliente{
    private String responsableLegal="";

    public ClienteJuridico() {
    }

    public ClienteJuridico(String nombre, String direccion, int telefono,String responsableLegal) {
        super(nombre, direccion, telefono);
        this.responsableLegal=responsableLegal;
    }

    public String getResponsableLegal() {
        return responsableLegal;
    }

    public void setResponsableLegal(String responsableLegal) {
        this.responsableLegal = responsableLegal;
    }
    
    
    
    
}
