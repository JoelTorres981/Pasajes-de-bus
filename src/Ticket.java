public abstract class Ticket { //
    protected Ruta ruta; //
    protected String asiento; //
    protected Pasajero pasajero; //
    protected boolean tieneMaletaAdicional; //

    // Constructor
    public Ticket() {
        // Default constructor
    }

    public Ticket(Ruta ruta, String asiento, Pasajero pasajero, boolean tieneMaletaAdicional) {
        this.ruta = ruta;
        this.asiento = asiento;
        this.pasajero = pasajero;
        this.tieneMaletaAdicional = tieneMaletaAdicional;
    }

    // Getters
    public Ruta getRuta() {
        return ruta;
    }

    public String getAsiento() {
        return asiento;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public boolean isTieneMaletaAdicional() {
        return tieneMaletaAdicional;
    }

    // Setters
    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public void setTieneMaletaAdicional(boolean tieneMaletaAdicional) {
        this.tieneMaletaAdicional = tieneMaletaAdicional;
    }

    // Abstract method to calculate cost
    public abstract double calcularCostoTotal();

    // Personalized method to print data
    public void imprimirDatos() {
        System.out.println("\n--- Información del Ticket ---");
        if (ruta != null) {
            System.out.println("Ruta: " + ruta.getOrigen() + " - " + ruta.getDestino());
            System.out.println("Costo Base de la Ruta: $" + String.format("%.2f", ruta.getCostoNormal()));
        } else {
            System.out.println("Ruta: No asignada");
        }
        System.out.println("Asiento: " + asiento);
        if (pasajero != null) {
            System.out.println("Pasajero: " + pasajero.getNombre() + " " + pasajero.getApellido());
        } else {
            System.out.println("Pasajero: No asignado");
        }
        System.out.println("Maleta Adicional: " + (tieneMaletaAdicional ? "Sí" : "No"));
    }
}
