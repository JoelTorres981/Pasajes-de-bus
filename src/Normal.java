public class Normal extends Ticket { //
    private static final double COSTO_MALETA_ADICIONAL = 5.0; // Example cost for additional luggage

    // Constructors 
    public Normal() {
        super();
    }

    public Normal(Ruta ruta, String asiento, Pasajero pasajero, boolean tieneMaletaAdicional) {
        super(ruta, asiento, pasajero, tieneMaletaAdicional); // 
    }

    @Override
    public double calcularCostoTotal() { // 
        double costo = 0;
        if (ruta != null) {
            costo = ruta.getCostoNormal(); // 
        }
        if (tieneMaletaAdicional) {
            costo += COSTO_MALETA_ADICIONAL; // 
        }
        return costo;
    }

    @Override
    public void imprimirDatos() { // 
        super.imprimirDatos();
        System.out.println("Tipo de Servicio: Normal"); // 
    }
}