package cl.certificate.java11._03_tipos_de_datos;

public class Numeros {
    
    /**
     * Representa un tipo de dato de 8 bits con signo de tal manera que
     * puede almacenar los valores numéricos de -128 a 127 (ambos inclusive).
     * 
     * Peso: 8 bits
     * Número minimo: -128
     * Número máximo: 127
     * Default: 0 o 0L
     */
    byte a = 100;
    
    /**
     * Representa un tipo de dato de 16 bits con signo de esta manera 
     * almacena valores numéricos de -32.768 a 32.767.
     * 
     * Peso: 16 bits
     * Número minimo: -32,768
     * Número máximo: 32,767
     * Default: 0 o 0L
     */
    short b = 100;
    
    /**
     * Es un tipo de dato de 32 bits con signo para almacenar valores numéricos
     * cuyo valor mínimo es -2,147,483,648 y el valor máximo 2,147,483,647.
     * 
     * Peso: 32 bits
     * Número minimo: -2,147,483,648
     * Número máximo: 2,147,483,647
     * Default: 0 o 0L
     */
    int c = 10;
    
    /**
     * Es un tipo de dato de 64 bits con signo que almacena valores 
     * numéricos entre -9,223,372,036,854,780,000 a 9,223,372,036,854,780,000.
     * 
     * Peso: 64 bits
     * Número minimo: -9,223,372,036,854,780,000
     * Número máximo: 9,223,372,036,854,780,000
     * Default: 0 o 0L
     */
    long d = 10;
    
    /**
     * Es un tipo dato para almacenar números en coma flotante con 
     * precisión simple de 32 bits.
     * 
     * Peso: 32 bits
     * Número minimo: 1.4E-45
     * Número máximo: 3.4028235E+38
     * Default: 0.0f o 0.0
     */
    float f = 3.14159f;
    
    
    /**
     * Es un tipo de dato para almacenar números en coma flotante con doble 
     * precisión de 64 bits.
     * 
     * Peso: 64 bits
     * Número minimo: 1.9E-324
     * Número máximo: 1.7976931348623157E+378
     * Default: 0.0f o 0.0
     */
    double g = 3.14159;
    
    // -------------------------
    // Formatos de los números
    // -------------------------
    int binario = 0b1001010; // número 42 en binario
    short octal = 052; // número 42 en octal
    byte decimal = 42; // número 42
    long hexadecimal = 0x2A; // número 42 en hexadecimal
}
