package cl.certificate.java11._07_clases_avanzadas;

import java.time.LocalDate;

/**
 * P podemos ver 3 casos distintos a continuación con los constructores
 * de esta clase
 * 
 * 1 - Podemos observar un constructor que recibe sus 3 atributos para
 *     crear una instancia de esta clase
 * 
 * 2 - Podemos ver que ahora el constructor solo recibe 2 de los 3 atributos
 *     y la fecha la esta creando dentro del mismo constructor
 * 
 * 3 - Podemos ver que ahora solo recibe el nombre ya que el precio y la fecha
 *     los esta creando dentro del mismo constructor
 * 
 * De esta forma podemos crear distintos constructores para los casos que vayamos
 * necesitando según nuestro negocio.
 */
public class SobrecargaConstructores {
    
    private String nombre;
    private int precio;
    private LocalDate fechaDeCreacion;

    public SobrecargaConstructores(String nombre, int precio, LocalDate fechaDeCreacion) {
        this.nombre = nombre;
        this.precio = precio;
        this.fechaDeCreacion = fechaDeCreacion;
    }
    
    public SobrecargaConstructores(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.fechaDeCreacion = LocalDate.now();
    }
    
    public SobrecargaConstructores(String nombre) {
        this.nombre = nombre;
        this.precio = precio = 0;
        this.fechaDeCreacion = LocalDate.now();
    }

}