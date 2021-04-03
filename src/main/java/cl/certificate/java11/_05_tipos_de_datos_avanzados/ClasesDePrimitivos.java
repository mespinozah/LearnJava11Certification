package cl.certificate.java11._05_tipos_de_datos_avanzados;

public class ClasesDePrimitivos {

    ClasesDePrimitivos() {
        
        /**
         * Las clases de los primitivos son:
         * 
         * +-----------------------+
         * | Primitivo | Clase     |
         * +-----------------------+
         * | byte      | Byte      |
         * | short     | Short     |
         * | int       | Integer   |
         * | long      | Long      |
         * | float     | Float     |
         * | double    | Double    |
         * | char      | Character |
         * | boolean   | Boolean   |
         * +-----------------------+
         * .
         */
        
        byte a1 = 10;
        Byte a2 = 10;
        
        short b1 = 10;
        Short b2 = 10;
        
        int c1 = 10;
        Integer c2 = 10;
        
        long d1 = 10;
        Long d2 = 10L;
        
        float e1 = 10.0f;
        Float e2 = 10.0f;
        
        double f1 = 10.0;
        Double f2 = 10.0;
        
        char g1 = 'A';
        Character g2 = 'A';
        
        boolean h1 = true;
        Boolean h2 = true;
        
        /**
         * ¿Cómo convertir un número a String?.
         */
        int cien = 100; // 100
        String test1 = String.valueOf(cien); // "100"
        
        /**
         * ¿Cómo convertir un String a número?.
         */
        String cienTxt = "100"; // "100"
        Integer test2 = Integer.parseInt(cienTxt); // 100
        
        /**
         * ¿Cómo comparar String y números desde clases?
         */
        String test3 = "hola", test4 = "HOLA";
        Integer test5 = 10, test6 = 20;
        
        Boolean compare1 = test3.equals(test4); // Falso
        Boolean compare2 = test3.equalsIgnoreCase(test4); // Verdadero
        Boolean compare3 = test5.equals(test6); // False
        
        /**
         * Convertir numeros a distintos tipos.
         */
        Integer entero = 10;
        Double a = entero.doubleValue();
        Short b = entero.shortValue();
        Long c = entero.longValue();
        Float d = entero.floatValue();
    }
}
