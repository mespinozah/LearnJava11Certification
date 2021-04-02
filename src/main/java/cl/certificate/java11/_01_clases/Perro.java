package cl.certificate.java11._01_clases;

public class Perro {
    
    // Atributos del Perro (Caracteristicas).
    public String nombre;
    public String color;
    public String raza;
    public String tamano;
    public int edad;
    
    // Constructor del Perro. 
    public Perro (String nombre, String color, String raza, String tamano, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.tamano = tamano;
        this.edad = edad;
    }
    
    // Distintas acciones o información que se puede rescatar de un perro.
    public void ladrar() {
        System.out.println("GUAUUUUU!!!!");
    }
    
    public int edadHumano() {
        return this.edad * 7;
    }
}
