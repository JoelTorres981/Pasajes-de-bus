public class Ruta {
    private String origen; //
    private String destino; //
    private double costoNormal; //

    // Constructor
    public Ruta(String origen, String destino, double costoNormal) {
        this.origen = origen;
        this.destino = destino;
        this.costoNormal = costoNormal;
    }

    // Getters
    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public double getCostoNormal() {
        return costoNormal;
    }

    // Setters
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setCostoNormal(double costoNormal) {
        this.costoNormal = costoNormal;
    }

    // Personalized method to print data
    public void imprimirDatos() {
        System.out.println("--- Datos de la Ruta ---");
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("Costo Normal: $" + String.format("%.2f", costoNormal));
    }
}
