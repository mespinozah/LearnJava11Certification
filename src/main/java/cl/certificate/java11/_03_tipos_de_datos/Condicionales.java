package cl.certificate.java11._03_tipos_de_datos;

public class Condicionales {
    
    void ejemplo() {
        
        int a = 3, b = 2;
        boolean c = false;

        /**
         * (==) Compara los valores si son iguales devuelve un true.
         */
        c = (a == b); // Falso
        
        /**
         * (!) Niega una afirmación.
         */
        c = !(a == b); // Verdadero

        /**
         * (!=) Pregunta si es distinto de algo.
         */
        c = (a != b); // Verdadero
    
        /**
         * (>) Pregunta si es mayor a.
         */
        c = (a > b); // Verdadero
        
        /**
         * (>=) Pregunta si es mayor o igual a.
         */
        c = (a >= b); // Verdadero
        
        /**
         * (<) Pregunta si es menor a.
         */
        c = (a < b); // Falso
        
        /**
         * (<=) Pregunta si es menor o igual a.
         */
        c = (a <= b); // Falso
        
        
        /**
         * (&&) Operador AND sirve para concatenar condiciones
         * y preguntar si es que AMBAS son verdaderas.
         */
        c = (a > b) && (b == 2); // Verdadero
        c = (a < b) && (b == 2); // Falso
        
        /**
         * (||) Operador O sirve para concatenar condiciones
         * y preguntar si que UNA de estas es verdera.
         */
        c = (a < b) || (b == 2); // Verdadero
        c = (a < b) || (b == 3); // Falso
    }
    
}
