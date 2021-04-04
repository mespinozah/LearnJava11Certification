package cl.certificate.java11._07_mejorando_diseno_clases;

import java.util.Date;

public class InmutabilidadProducto {
    
    private Long id;
    private String nombre;
    private Double precio;
    private Date fechaCreacion;

    public InmutabilidadProducto(Long id, String nombre, Double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.fechaCreacion = new Date();
    }
    
    public Long getId() { return this.id; }
    public String getNombre() { return this.nombre; }
    public Date getFechaCreacion() { return this.fechaCreacion; }
    
     /**
     * Método publico que obtiene el precio del producto.
     * 
     * @return Precio del producto
     */
    public double getPrecio() {
        return calcularIva() + this.precio;
    }
    
    /**
     * Método privado encargado de calcular el IVA del producto
     * 
     * @return Valor del IVA del producto.
     */
    private double calcularIva() {
        final double IVA = 0.19;
        return this.precio * IVA;
    }
}

class test {
    
}