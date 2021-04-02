package cl.certificate.java11._04_flujos_de_control;

public class OperadorTernario {
    
    void ejemplo() {
        
        int a = 10, b = 20;
        
        /**
         * El operador ternario consta de 3 partes la primera parte es la 
         * condición luego viene el valor que tendra si es que esta condición
         * es verdadera y por ultimo el valor que tendra si la condición
         * es falsa
         * 
         * <variable> = (<condicion>) ? <valor true> : <valor false>;
         * 
         * Para mostrar un ejemplo lo mejor es pasar de un IF ELSE a 
         * un operador ternario.
         */
        
        String respuesta1;
        if (a > b) {
            respuesta1 = "a ES MAYOR que b";
        } else {
            respuesta1 = "a ES MENOR que b";
        }
        
        String respuesta2 =  (a > b) ? "a ES MAYOR que b" : "a ES MENOR que b";
        
        // respuesta1: "a ES MAYOR que b"
        // respuesta2: "a ES MAYOR que b"
    }
}
