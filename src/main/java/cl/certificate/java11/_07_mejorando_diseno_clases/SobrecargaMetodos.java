package cl.certificate.java11._07_mejorando_diseno_clases;

import java.math.BigDecimal;

public class SobrecargaMetodos {
    
    /**
     * La sorbe carga de métodos vendria siendo
     * la forma en que tiene una clase de adaptar
     * el mismo método en este caso llamado "setPrecio"
     * a distintos casos como por ejemplo:
     * 
     * -> Recibir un BigDecimal como precio
     * -> Recibir un Integer como precio
     * -> Recibir un precio y el descuento
     * 
     * Si nos damos cuenta los 3 métodos tienen el mismo
     * nombre pero cambia su implementación o los parámetros
     * de entrada que recibe.
     */
    
    private BigDecimal precio;
    private BigDecimal descuento;
    
    public SobrecargaMetodos() {
        this.descuento  = BigDecimal.ZERO;
    }
    
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    
    public void setPrecio(Integer precio) {
        this.precio = BigDecimal.valueOf(precio);
    }
    
    public void setPrecio(BigDecimal precio, BigDecimal descuento) {
        this.precio = precio;
        this.descuento = descuento;
    }
}
