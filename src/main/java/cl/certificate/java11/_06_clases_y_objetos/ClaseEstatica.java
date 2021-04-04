package cl.certificate.java11._06_clases_y_objetos;

public class ClaseEstatica {
    
    /**
     * Los métodos o atributos estaticos nos sirven
     * para poder utilizarlos sin la necesidad de
     * crear una instancia u/o objeto de la clase.
     */
    public static final int CERO = 0;
    
    public static final String SALUDO = "Hola ¿Cómo estas?";
    
    public static void imprimirHolaMundo() {
        System.out.println("Hola Mundo");
    }
    
    public static int sumar(int[] numeros) {
        int suma = 0;
        
        for (var i = 0; i < numeros.length; i++) {
            suma += numeros[i]; 
        }
        return suma;
    }
    
}
