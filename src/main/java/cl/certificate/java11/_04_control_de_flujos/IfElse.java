package cl.certificate.java11._04_control_de_flujos;


public class IfElse {

    void ejemplo() {
        
        int a = 10, b = 20;
        
        if (a > b) {
            // Si a ES mayor al valor de b entrara en este bloque.
            System.out.println(a + " es mayor que " + b);
        } else {
            // Si a NO es mayor al valor de b entrara en este bloque.
            System.out.println(a + " es menor que " + b);
        }
        
        
        /**
         * ¿PERO QUE PASA SI SON IGUALES?, MOSTRARA QUE a ES MENOR QUE b
         * 
         * ¿CÓMO SOLUCIONAMOS ESTO?, FACIL UTILIZANDO ELSE IF JUNTOS COMO
         * UNA NUEVA CONDICION.
         */
        
        if (a > b) {
            // Si a ES MAYOR al valor de b entrara en este bloque.
            System.out.println(a + " es mayor que " + b);
        } else if (a == b) {
            // Si a es IGUAL a b entrara a este bloque
            System.out.println(a + " es igual que " + b);
        } else {
            // Si a NO es MAYOR NI IGUAL al valor de b entrara en este bloque.
            System.out.println(a + " es menor que " + b);
        }
    }
}
