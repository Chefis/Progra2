package ManejoInventario;

/*
 * Creado por: Daniela bolivar
 * Fecha: 14/04/2013
 * -------------------------------------------------- 
 * Modificado por: 
 * Fecha: 
 * --------------------------------------------------- 
 * Descripción:
 * Se usa para ofrecer al cliente los productos en el inventario, sin aun venderlos.
 * Esta proforma tiene que ser aceptada para que se pueda pasar a la orden de compra
 * y por ultimo a la factura.
 */

public  class Proforma {
    
   private String fechaEntregada;
   private String fechaVencimiento;
   private String detalle;
   private String total;
   private boolean proformaFirmada;
   private Vendedor vendedor; //composicion

    public Proforma() {
    }

    public Proforma(String fechaEntregada, String fechaVencimiento, String detalle, String total, boolean proformaFirmada, Vendedor vendedor) {
        this.fechaEntregada = fechaEntregada;
        this.fechaVencimiento = fechaVencimiento;
        this.detalle = detalle;
        this.total = total;
        this.proformaFirmada = proformaFirmada;
        this.vendedor = vendedor;
    }

    public String getFechaEntregada() {
        return fechaEntregada;
    }

    public void setFechaEntregada(String fechaEntregada) {
        this.fechaEntregada = fechaEntregada;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public boolean getProformaFirmada() {
        return proformaFirmada;
    }

    public void setProformaFirmada(boolean proformaFirmada) {
        this.proformaFirmada = proformaFirmada;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
   
   
     
   
}

