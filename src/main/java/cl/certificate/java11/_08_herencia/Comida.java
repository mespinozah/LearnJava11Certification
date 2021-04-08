package cl.certificate.java11._08_herencia;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

public class Comida extends Producto {
    
    private BigDecimal gramaje;
    private String tipoEmpaque;

    public Comida(BigDecimal gramaje, String tipoEmpaque, Integer id, String nombre, 
            BigInteger precio, String descripcion, LocalDate fechaCreacion) {
        super(id, nombre, precio, descripcion, fechaCreacion);
        this.gramaje = gramaje;
        this.tipoEmpaque = tipoEmpaque;
    }

    public BigDecimal getGramaje() { return gramaje; }
    public void setGramaje(BigDecimal gramaje) { this.gramaje = gramaje; }
    public String getTipoEmpaque() { return tipoEmpaque; }
    public void setTipoEmpaque(String tipoEmpaque) { this.tipoEmpaque = tipoEmpaque; }
}