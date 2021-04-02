package cl.certificate.java11._03_tipos_de_datos;

public class Operadores {

    void ejemplos1() {
        /**
         * (=) es el operador de asignación encargado de darle un valor a la
         * variable a
         */
        int a = 10;

        /**
         * (+) Es el operador para sumar 2 números o concatenar 2 textos
         */
        int b = 10 + 10; // 20
        b += 10; // 30
        String c = "Hola" + " Mundo"; // "Hola Mundo"

        /**
         * (-) Es el operador para restar o darle un valor negativo a un número
         */
        int d = 10 - 7; // 3
        d -= 2; // 1
        int e = -10; // 10 negativo

        /**
         * (*) Es el operador encargado de multiplicar
         */
        int f = 10 * 2; // 20
        f *= 2; // 40

        /**
         * (/) Es el operador para dividir
         */
        int g = 10 / 2; // 5
        g /= 2; // 2

        /**
         * (%) Es el operador de módulo encargado de obtener el resto de una
         * división
         */
        int h = 10 % 6; // (4) 10 divido en 6 es 1 y queda 4 restante.
        h %= 3; // (1) 4 divido en 3 es 1 y queda restante 1

    }

    void ejemplos2() {
        int a = 10; // Parte en 10
        a++; // (11) se le suma 11
        System.out.println(a++); // (11) primero imprime y luego suma quedando en 12

        int b = 10; // Parte en 10
        b--; // (9) se le resta 1
        System.out.println(b--); // (9) primero imprime y luego resta quedando en 8

        int c = 10; // Parte en 10
        ++c; // (11) se le suma 1
        System.out.println(++c); // (12) Se le suma 1 y luego imprime quedando en 12

        int d = 10; // Parte en 10
        --d; // (9) se le resta 1
        System.out.println(--d); // (8) Se le resta 1 y luego imprime quedando en 8

    }
}
