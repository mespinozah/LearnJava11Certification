package cl.certificate.java11._05_tipos_de_datos_avanzados;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateAndTime {
    
    public static void main(String[] args) {
        ZonedDateAndTime test = new ZonedDateAndTime();
    }
    
    ZonedDateAndTime() {
        
        ZoneId chile = ZoneId.of("America/Santiago");
        ZoneId lax = ZoneId.of("America/Los_Angeles");
        
        // 2020-06-05T10:15
        LocalDateTime fecha = LocalDateTime.of(2020, Month.JUNE, 5, 10, 15);
        
        /**
         * .toInstant().toString();
         *
         * Resultados:
         * 2020-06-05T14:15:00Z
         * 2020-06-05T17:15:00Z
         */
        ZonedDateTime horaChile = ZonedDateTime.of(fecha, chile);
        ZonedDateTime horaLax = ZonedDateTime.of(fecha, lax);
    }
}
