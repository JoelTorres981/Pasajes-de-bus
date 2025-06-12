public class Pasajero {
    private String nombre; // 
    private String apellido; // 
    private String cedula; // 

    // Constructor 
    public Pasajero(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    // Getters 
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    // Setters 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    // Personalized method to print data 
    public void imprimirDatos() {
        System.out.println("--- Datos del Pasajero ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Cédula: " + cedula);
    }
}