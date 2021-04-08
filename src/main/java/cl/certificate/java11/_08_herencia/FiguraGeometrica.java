package cl.certificate.java11._08_herencia;

public class FiguraGeometrica {
    
    /**
     * Circulo, cuadrado, triangulo, etc.
     */
    private String nombre;
    private double largo;
    private double ancho;
    
    /**
     * Area cuadrado.
     */
    public double area(double largo) {
        return largo * largo;
    }
    
    /**
     * Area rectangulo.
     */
    public double area(double largo, double ancho) {
        return largo * ancho;
    }
    
    /**
     * Mismo método con 2 implementaciones distintas
     * para calcular el area de un cuadrado o
     * rectangulo.
     */
}

