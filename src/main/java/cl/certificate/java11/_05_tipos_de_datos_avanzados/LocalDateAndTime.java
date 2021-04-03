package cl.certificate.java11._05_tipos_de_datos_avanzados;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateAndTime {
    
    public static void main(String[] args) {
        LocalDateAndTime localDateAndTime = new LocalDateAndTime();
    }
    
    LocalDateAndTime() {
        
        /**
         * Fecha actual al momento de instanciar
         * 
         * Formato de retorno: <Año>-<Mes>-<Dia>
         * .
         */
        LocalDate hoy = LocalDate.now(); // Ejemplo: 2021-04-03
        
        /**
         * Hora actual al momento de instanciar
         * 
         * Formato de retorno: <Hora>:<Minutos>:<Segundos>.<Milisegundos>
         * .
         */
        LocalTime horaActual = LocalTime.now(); // Ejemplo: 16:58:42.434494
        
        /**
         * Fecha y hora actual al momento de instanciar
         * 
         * Formato de retorno: 
         * <Año>-<Mes>-<Dia>T<Hora>:<Minutos>:<Segundos><LocalTime>
         * 
         * Ejemplo 2021-04-03T17:04:30-03:00
         * .
         */
        LocalDateTime fechaYHoraActual = LocalDateTime.now(); // 
        
        
        /**
         * Como crear una fecha personalizada
         * 
         * Año, Mes, Dia.
         */
        LocalDate date1 = LocalDate.of(2021, 02, 01); // 2021-02-01
        
        /**
         * Como crear una hora personalizada
         * 
         * Hora, Minutos.
         */
        LocalTime hora1 = LocalTime.of(10, 0); // 10:00
    }
    
}
