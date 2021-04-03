package cl.certificate.java11._05_tipos_de_datos_avanzados;

public class CadenasTexto {
    
    public static void main(String[] args) {
        CadenasTexto test = new CadenasTexto();
    }
    
    CadenasTexto() {
        
        /**
         * ¿Como seria una cadena de Texto utilizando char?.
         */
        char[] a = {'H', 'O', 'L', 'A', ' ', 'M', 'U', 'N', 'D', 'O'};
        
        /**
         * Es bastante tedioso por eso existe una forma  más rápida de hacerlo
         * la cual se llama String de esta forma podemos escribir el texto
         * entre comillas dobles ("<texto>").
         */
        String b = "HOLA MUNDO";
        
        /**
         * También existe esta forma pero no es recomendada.
         */
        String c = new String("HOLA MUNDO 2");
        
        /**
         * Métodos de los String.
         */
        String text = " Hola Mundo desde Java 11 ";
        
        /**
         * TRIM: Método que elimina los caracteres blancos iniciales 
         * y finales de la cadena, devolviendo una copia de la misma.
         */
        String trimStr = text.trim(); // "Hola Mundo desde Java 11"
        
        /**
         * CONCAT: Método que concatena el String incial con uno nuevo.
         */
        String concatStr = text.concat("SE"); // " Hola Mundo desde Java 11 SE"
        
        /**
         * Convierte el texto en minuscula.
         */
        String lowerStr = text.toLowerCase(); // " hola mundo desde java 11 "
        
        /**
         * Convierte el texto a mayuscula.
         */
        String upperStr = text.toUpperCase(); // " HOLA MUNDO DESDE JAVA 11 " 
    }
}
