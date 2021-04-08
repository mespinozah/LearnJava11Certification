package cl.certificate.java11._08_herencia;

import java.math.BigInteger;
import java.time.LocalDate;

public abstract class Producto {
        
    private Integer id;
    private String nombre;
    private BigInteger precio;
    private String descripcion;
    private LocalDate fechaCreacion;

    public Producto(Integer id, String nombre, BigInteger precio, String descripcion, LocalDate fechaCreacion) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public BigInteger getPrecio() { return precio; }
    public void setPrecio(BigInteger precio) { this.precio = precio; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public LocalDate getFechaCreacion() { return fechaCreacion; }
    public void setFechaCreacion(LocalDate fechaCreacion) { this.fechaCreacion = fechaCreacion; }
}