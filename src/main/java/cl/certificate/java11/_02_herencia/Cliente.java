package cl.certificate.java11._02_herencia;

public class Cliente extends Persona {
    String categoria;
    String codigo;

    public Cliente(String categoria, String codigo, String run, String nombre, String apellido, int edad, double estatura, double peso) {
        super(run, nombre, apellido, edad, estatura, peso);
        this.categoria = categoria;
        this.codigo = codigo;
    }   
}
