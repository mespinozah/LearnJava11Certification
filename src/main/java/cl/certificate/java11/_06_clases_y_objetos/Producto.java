package cl.certificate.java11._06_clases_y_objetos;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Producto {
    private Integer id;
    private String nombre;
    private BigDecimal precio;
    private LocalDate creacion;

    public Producto(Integer id, String nombre, BigDecimal precio, LocalDate creacion) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.creacion = creacion;
    }

    public Integer getId() { return id; }
    
    public void setId(Integer id) { this.id = id; }
    
    public String getNombre() { return nombre; }
    
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public BigDecimal getPrecio() { return precio; }
    
    public void setPrecio(BigDecimal precio) { this.precio = precio; }
    
    public LocalDate getCreacion() { return creacion; }
    
    public void setCreacion(LocalDate creacion) { this.creacion = creacion; }
    
    
    /**
     * ¿Cómo se define y se estructura un método?
     * 
     * <Modificador de acceso> <Tipo de retorno> <nombre>(<Parametros>) {
     *     // Contenido del metodo
     * 
     *    return <Retorno>; //(solo en caso de ser necesario)
     * }
     * 
     * Cabe recalcar que el tipo de retorno void no necesita que se
     * expecifique con return al final
     * 
     * Ejemplo: 
     * 
     * private void imprimirEnPantalla(String texto) {
     *     System.out.println(texto);
     * }
     * .
     */
    
    
    /**
     * Este método es el encargado de 
     * calcular el IVA de un producto
     * 
     * @param producto Objeto del producto a calcular.
     * @return Valor del IVA.
     */
    public double obtenerIva(Producto producto) {
        // Incializando el valor del iva del producto en 0
        double valorIvaProducto = 0; 
        
        // 19% de IVA en Chile
        final BigDecimal IVA = BigDecimal.valueOf(0.19); 
        
        // Calculando el valor del IVA del producto y convirtiendolo a double
        valorIvaProducto = producto.precio.multiply(IVA).doubleValue();
        
        // Devolviendo el valor del IVA del producto.
        return valorIvaProducto;
    }
}
