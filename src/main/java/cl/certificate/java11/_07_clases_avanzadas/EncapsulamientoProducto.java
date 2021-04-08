package cl.certificate.java11._07_clases_avanzadas;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EncapsulamientoProducto {
    
    private Short id;
    private String nombre;
    private BigDecimal precio;
    private LocalDate fechaCreacion;
    
    private EncapsulamientoProducto(short id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = BigDecimal.valueOf(precio);
        this.fechaCreacion = LocalDate.now();
    }
    
    /**
     * Método publico que obtiene el precio del producto.
     * 
     * @return Precio del producto
     */
    public double obtenerPrecio() {
        return calcularIva().add(this.precio).doubleValue();
    }
    
    /**
     * Método privado encargado de calcular el IVA del producto
     * 
     * @return Valor del IVA del producto.
     */
    private BigDecimal calcularIva() {
        final BigDecimal IVA = BigDecimal.valueOf(0.19);
        return this.precio.multiply(IVA);
    }
}