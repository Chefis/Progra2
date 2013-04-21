package ManejoInventario;

/*
 * Creado por: 
 * Fecha: 
 * -------------------------------------------------- 
 * Modificado por: Jennier Camacho
 * Fecha: 19/04/2013
 * --------------------------------------------------- 
 * Descripción:
 * 
 */
public class ClienteJuridico extends Cliente{
    
    private String responsableLegal;

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
    
    @Override
    public String toString(){
        return "Nombre: " +this.getNombre()+ "\nResponsable: " +this.getResponsableLegal()+ "\nDirección: " +this.getDireccion()+ "\nTeléfono: " +this.getTelefono()+"\n\n";
    }
    
    
}
