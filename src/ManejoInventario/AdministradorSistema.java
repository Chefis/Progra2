/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejoInventario;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author M-01
 */
public class AdministradorSistema {
    

    private ArrayList<Usuario> lU = new ArrayList<Usuario>();
    //Esto es para vailidar al adiministrador del sistema
    private String nombre = "Admin";
    private String puesto = "Administrador del Sistema";
    private String contrasena = "1234";

    public AdministradorSistema() {
    }

    public AdministradorSistema(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;

    }
          
    public ArrayList<Usuario> getlU() {
        return lU;
    }

    public void setlU(ArrayList<Usuario> lU) {
        this.lU = lU;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void agregarUsuarios(Usuario u) {
        lU.add(u);

    }

    public String verUsuarios() {
        String listaU = "";
        int cont = 0;
        Iterator<Usuario> it = lU.iterator();
        while (it.hasNext()) {
            cont++;
            listaU += cont + "." + it.next().toString() + "\n";
        }
        return "Usuarios:\n" + listaU;
    }
    
}

