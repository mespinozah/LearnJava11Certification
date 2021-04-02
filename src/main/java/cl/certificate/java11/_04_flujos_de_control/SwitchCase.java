package cl.certificate.java11._04_flujos_de_control;

public class SwitchCase {
    
    void ejemplo() {
        
        int diaSemana = 1;
        String diaSemanaTxt;
        
        switch(diaSemana) {
            case 1:
                diaSemanaTxt = "LUNES";
                break;
            
            case 2:
                diaSemanaTxt = "MARTES";
                break;
            
            case 3:
                diaSemanaTxt = "MIERCOLES";
                break;
                
            case 4:
                diaSemanaTxt = "JUEVES";
                break;
                
            case 5:
                diaSemanaTxt = "VIERNES";
                break;
                
            case 6:
                diaSemanaTxt = "SABADO";
                break;
                
            case 7:
                diaSemanaTxt = "DOMINGO";
                break;
                
            default:
                diaSemanaTxt = "EL DIA DE LA SEMANA INGRESADO NO ES VALIDO";
                break;
        }
        
        System.out.println(diaSemanaTxt); // LUNES
        
        String test;
    }
}
