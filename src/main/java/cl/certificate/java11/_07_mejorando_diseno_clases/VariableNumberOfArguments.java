package cl.certificate.java11._07_mejorando_diseno_clases;

 /**
     * Al utilizar los 3 puntos luego de un tipo de dato como por ejemplo
     * (String...) estamos diciendo que se recibira una cantidad desconocida
     * de atributos en este método por lo cual el método lo recibe como un
     * array del tipo ingresado como podemor observar a continuación en 2
     * ocaciones
     * 
     * 1 - En el main al recibir sus argumentos
     * 2 - En el método suma al recibir los numeros a sumar
     */
public class VariableNumberOfArguments {

    public static void main(String... args) {
        VariableNumberOfArguments test = new VariableNumberOfArguments();
    }
    
    public VariableNumberOfArguments() {
        int resultado1 = suma(); // Resutado: 0
        int resultado2 = suma(1, 5, 9); // Resultado: 15
        int resultado3 = suma(1, 7, 2, 2, 2, 6); // Resultado: 20
        
        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
    }
    
    /**
     * Suma los números ingresados
     * 
     * @param numeros Arreglo de numeros a sumar
     * @return Total del resultado.
     */
    private int suma(int... numeros) {
        int suma = 0;
        
        for(var i = 0; i<numeros.length; i++) {
            suma += numeros[i];
        }
        return suma;
    }
}