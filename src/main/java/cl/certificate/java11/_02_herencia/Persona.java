package cl.certificate.java11._02_herencia;

public abstract class Persona {
    public String run;
    public String nombre;
    public String apellido;
    public int edad;
    public double estatura;
    public double peso;

    public Persona(String run, String nombre, String apellido, int edad, double estatura, double peso) {
        this.run = run;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
    }
}
