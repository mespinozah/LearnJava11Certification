package cl.certificate.java11._06_clases_y_objetos;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Constantes {
    
    Constantes() {
        /**
         * Una constante es lo inverso a una variable como
         * la palabra lo dice es un valor que no cambia NUNCA
         * el ejemplo más común y simple de entender de una 
         * constante es el valor de PI sabemos que PI es
         * 3.1415...y continuaaa pero es un valor el cual no
         * cambia, no veremos a PI como 3.1516, por lo tanto
         * PI es una constante
         * 
         * ¿Cómo hacemos en Java para que el valor de PI no se
         * pueda modificar?
         * 
         * facíl utilizando la palabra reservada final como se 
         * puede ver a continuación.
         */
        final double PI = 3.1415; 
        
        
        /**
         * Es posible encontrar distintas constantes dentro de Java
         * como las que veremos a continuación.
         */
        
        BigDecimal ceroDecimal = BigDecimal.ZERO;
        BigDecimal unoDecimal = BigDecimal.ONE;
        BigDecimal diezDecimal = BigDecimal.TEN;
        
        BigInteger ceroInt = BigInteger.ZERO;
        BigInteger uniInt = BigInteger.ONE;
        BigInteger dosInt = BigInteger.TWO;
        BigInteger diezInt = BigInteger.TEN;
        
        boolean verdadero = Boolean.TRUE;
        boolean falso = Boolean.FALSE;
        
        int minValueInt = Integer.MIN_VALUE;
        int maxValueInt = Integer.MAX_VALUE;
        
        double minValueDouble = Double.MIN_VALUE;
        double maxValueDouble = Double.MAX_VALUE;
        
    }
    
    
    
}
