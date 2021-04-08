package cl.certificate.java11._07_clases_avanzadas;

public enum EstadoEnum {
    PENDIENTE,
    
    ACTIVO,
    
    CANCELADO,
    
    FINALIZADO
}

class Compra {
    
    int cantidadProductos;
    EstadoEnum estado;
    
    
    public void getEstadoCompra() {
        if (EstadoEnum.ACTIVO.name().equalsIgnoreCase("ACTIVO")) {
            System.out.println("COMPRA ACTIVA");
        } else if (EstadoEnum.CANCELADO.name().equalsIgnoreCase("CANCELADO")) {
            System.out.println("COMPRA CANCELADA");
        } else if (EstadoEnum.PENDIENTE.name().equalsIgnoreCase("PENDIENTE")) {
            System.out.println("COMPRA PENDIENTE");
        } else {
            System.out.println("COMPRA FINALIZADA");
        }
    }
    
}


