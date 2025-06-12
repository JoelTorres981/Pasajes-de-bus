public class VIP extends Ticket { //
    private static final double RECARGO_VIP = 0.30; // 30% surcharge 
    private static final double COSTO_MALETA_ADICIONAL = 7.50; // Example cost for VIP additional luggage
    private String servicioAdicional1; // 
    private String servicioAdicional2; // 

    // Constructors 
    public VIP() {
        super();
    }

    public VIP(Ruta ruta, String asiento, Pasajero pasajero, boolean tieneMaletaAdicional, String servicioAdicional1, String servicioAdicional2) {
        super(ruta, asiento, pasajero, tieneMaletaAdicional); // 
        this.servicioAdicional1 = servicioAdicional1;
        this.servicioAdicional2 = servicioAdicional2;
    }

    // Getters 
    public String getServicioAdicional1() {
        return servicioAdicional1;
    }

    public String getServicioAdicional2() {
        return servicioAdicional2;
    }

    // Setters 
    public void setServicioAdicional1(String servicioAdicional1) {
        this.servicioAdicional1 = servicioAdicional1;
    }

    public void setServicioAdicional2(String servicioAdicional2) {
        this.servicioAdicional2 = servicioAdicional2;
    }

    @Override
    public double calcularCostoTotal() { // 
        double costo = 0;
        if (ruta != null) {
            costo = ruta.getCostoNormal() * (1 + RECARGO_VIP); // 
        }
        if (tieneMaletaAdicional) {
            costo += COSTO_MALETA_ADICIONAL; // 
        }
        return costo;
    }

    @Override
    public void imprimirDatos() { // 
        super.imprimirDatos();
        System.out.println("Tipo de Servicio: VIP"); // 
        System.out.println("Servicio Adicional VIP 1: " + (servicioAdicional1 != null ? servicioAdicional1 : "N/A"));
        System.out.println("Servicio Adicional VIP 2: " + (servicioAdicional2 != null ? servicioAdicional2 : "N/A"));
    }
}