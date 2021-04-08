package cl.certificate.java11._08_herencia;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

public class Electrodomestico extends Producto {
    
    private BigDecimal peso;
    private String tipoCorriente;

    public Electrodomestico(BigDecimal peso, String tipoCorriente, Integer id, 
            String nombre, BigInteger precio, String descripcion, LocalDate fechaCreacion) {
        super(id, nombre, precio, descripcion, fechaCreacion);
        this.peso = peso;
        this.tipoCorriente = tipoCorriente;
    }

    public BigDecimal getPeso() { return peso; }
    public void setPeso(BigDecimal peso) { this.peso = peso; }
    public String getTipoCorriente() { return tipoCorriente; }
    public void setTipoCorriente(String tipoCorriente) { this.tipoCorriente = tipoCorriente; }
    
    public void ejemplo() {
        
        /**
         * Con la palabra reservada "super" somos capaces de acceder
         * a los atributos y métodos de la clase padre.
         */
        super.getPrecio();
        
        /**
         * Mientras que con la palabra reservada "this" somos
         * capaces de acceder a los atributos de la clase actual
         * o clase hija como es llamda.
         */
        this.tipoCorriente = "alto voltaje";
    }
}

