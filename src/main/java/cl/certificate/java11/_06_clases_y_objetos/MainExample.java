package cl.certificate.java11._06_clases_y_objetos;

import java.math.BigDecimal;
import java.time.LocalDate;


public class MainExample {
    
    public static void main(String[] args) {
        
        /**
         * Tenemos que producto necesita 4 atributos
         * para existir que serian:
         * 
         * id: Identificador único del producto
         * nombre: Nombre del producto
         * precio: Precio del producto
         * creacion: La fecha en que fue ingresado el producto.
         */
        int id = 100;
        String nombre = "Azucar";
        BigDecimal precio = BigDecimal.valueOf(799.0);
        LocalDate creacion = LocalDate.now();
        
        // Creando una instancia del objeto
        Producto producto = new Producto(id, nombre, precio, creacion);
        
        producto.getId(); // 100
        producto.getNombre(); // "Azucar"
        
        producto.setPrecio(BigDecimal.valueOf(1099.0)); // Ahora precio es 1099.0
        producto.getPrecio(); // 1099.0
        
        
        
        /**
         * ¿Cómo podemos llamar los métodos y atributos estaticos
         * creados anteriormente?
         */
        
        int cero = ClaseEstatica.CERO;
        String saludo = ClaseEstatica.SALUDO;
        
        int[] numerosASumar = {1, 6, 10, 11, 99, 2};
        int suma = ClaseEstatica.sumar(numerosASumar); // 129
        
        ClaseEstatica.imprimirHolaMundo(); // "Hola Mundo"
     
        
    }
}
