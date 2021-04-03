package cl.certificate.java11._05_tipos_de_datos_avanzados;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigIntegerBigDecimal {
    
    public static void main(String[] args) {
        BigIntegerBigDecimal test = new BigIntegerBigDecimal();
    }
    
    BigIntegerBigDecimal() {
        
        /**
         * En este caso calcularemos el impuesto de Chile que es un 19%
         * a un precio X.
         */
        BigDecimal precio = BigDecimal.valueOf(1500.0);
        BigDecimal iva = BigDecimal.valueOf(0.19);
        BigDecimal impuesto = precio.multiply(iva); // 285.000
        precio = precio.add(impuesto).setScale(2, RoundingMode.HALF_UP);  // 1785.00

        /**
         * En este caso aplicaremos un descuento a precio.
         */
        BigInteger precio2 = BigInteger.valueOf(2500);
        BigInteger descuento = BigInteger.valueOf(750);
        precio2 = precio2.subtract(descuento); // 1750
    }
    
   
    
    
    
}
