public class ServicioPremium extends Servicio { //
    private String caracteristicaAdicional1;
    private String caracteristicaAdicional2;

    // Constructor 
    public ServicioPremium(String nombreServicio, String caracteristicaAdicional1, String caracteristicaAdicional2) {
        super(nombreServicio); // Call to parent constructor
        this.caracteristicaAdicional1 = caracteristicaAdicional1;
        this.caracteristicaAdicional2 = caracteristicaAdicional2;
    }

    // Overloaded constructor for simpler instantiation
    public ServicioPremium(String caracteristicaAdicional1, String caracteristicaAdicional2) {
        super("Servicio Premium"); // Default name
        this.caracteristicaAdicional1 = caracteristicaAdicional1;
        this.caracteristicaAdicional2 = caracteristicaAdicional2;
    }

    // Getters 
    public String getCaracteristicaAdicional1() {
        return caracteristicaAdicional1;
    }

    public String getCaracteristicaAdicional2() {
        return caracteristicaAdicional2;
    }

    // Setters 
    public void setCaracteristicaAdicional1(String caracteristicaAdicional1) {
        this.caracteristicaAdicional1 = caracteristicaAdicional1;
    }

    public void setCaracteristicaAdicional2(String caracteristicaAdicional2) {
        this.caracteristicaAdicional2 = caracteristicaAdicional2;
    }

    @Override
    public void imprimirDatos() { // 
        super.imprimirDatos();
        System.out.println("Característica Adicional 1: " + caracteristicaAdicional1);
        System.out.println("Característica Adicional 2: " + caracteristicaAdicional2);
    }
}