package cl.certificate.java11._02_herencia;

public class Empleado extends Persona {
    String tipoContrato;
    String sueldo;

    public Empleado(String tipoContrato, String sueldo, String run, String nombre, String apellido, int edad, double estatura, double peso) {
        super(run, nombre, apellido, edad, estatura, peso);
        this.tipoContrato = tipoContrato;
        this.sueldo = sueldo;
    }
}
