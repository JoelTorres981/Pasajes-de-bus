public class Servicio { //
    protected String nombreServicio; // 

    // Constructor 
    public Servicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    // Getter 
    public String getNombreServicio() {
        return nombreServicio;
    }

    // Setter 
    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    // Personalized method to print data 
    public void imprimirDatos() {
        System.out.println("--- Servicio Adicional ---");
        System.out.println("Nombre del Servicio: " + nombreServicio);
    }
}