package cl.certificate.java11._08_herencia;

import java.math.BigDecimal;

public abstract class TransporteAereo {
    
   private String nombre;
   private BigDecimal peso;
   
   /**
    * Método abstracto sin implementación
    * para ser implementado en las clases
    * hijas, con esto le decimos a las clases
    * hijas que si o si deben tener este método
    * pero cada una debe crear su implementación.
    */
   public abstract void aterrizar();
}
