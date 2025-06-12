public class Main {
    public static void main(String[] args) {
        System.out.println("-------- EL BUHO --------"); //

        Ruta ruta1 = new Ruta(null, null, 0.0); //
        ruta1.setOrigen("Quito"); //
        ruta1.setDestino("Guayaquil"); //
        ruta1.setCostoNormal(20.0); //
        ruta1.imprimirDatos(); //

        Ticket ticket1 = new Normal(); //
        ticket1.setRuta(ruta1);
        ticket1.setAsiento("Ventana"); //
        ticket1.setPasajero(new Pasajero("Juan", "Perez", "189431556")); //
        ticket1.setTieneMaletaAdicional(false); //
        ticket1.imprimirDatos(); //
        System.out.println("Costo Total Ticket 1: " + ticket1.calcularCostoTotal()); //

        Ticket ticket2 = new VIP(); //
        ticket2.setRuta(new Ruta("Quito", "Tulcán", 17.50)); //
        ticket2.setAsiento("Adelante"); //
        ticket2.setPasajero(new Pasajero("Maria", "Lopez", "0984165498")); //
        ticket2.setTieneMaletaAdicional(true); //
        ticket2.imprimirDatos(); //
        System.out.println("Costo Total Ticket 2: " + ticket2.calcularCostoTotal()); //

        Pasajero pasajero1 = new Pasajero(null, null, null); //
        pasajero1.setNombre("Pedro"); //
        pasajero1.setApellido("Sanchez"); //
        pasajero1.setCedula("1786416846"); //
        pasajero1.imprimirDatos(); //

        Servicio servicio1 = new Servicio(null); //
        servicio1.setNombreServicio("Internet"); //
        servicio1.imprimirDatos(); //

        System.out.println("Objetos instanciados con valores");
        Ruta ruta2 = new Ruta("Quito", "Puyo", 15.0); //
        ruta2.imprimirDatos(); //

        Ticket ticket3 = new Normal(new Ruta("Quito", "Riobamba", 17.50), "Pasillo", new Pasajero("Ana", "Fernandez", "28941356894"), true); //
        ticket3.imprimirDatos(); //
        System.out.println("Costo Total Ticket 3: " + ticket3.calcularCostoTotal()); //

        Ticket ticket4 = new VIP(new Ruta("Guayaquil", "Quito", 20.0), "Ventana", new Pasajero("Pedro", "Torres", "48651687466"), false, "Televisión", "Noticias"); //
        ticket4.imprimirDatos();
        System.out.println("Costo Total Ticket 4: " + ticket4.calcularCostoTotal()); //

        Pasajero pasajero2 = new Pasajero("Laura", "Suarez", "1020304050"); //
        pasajero2.imprimirDatos();

        Servicio servicio2 = new Servicio("Comidas"); //
        servicio2.imprimirDatos();

        System.out.println("Servicio Premium");
        ServicioPremium servicioPremium = new ServicioPremium("Bebidas Ilimitadas", "Acceso Sala VIP"); //
        servicioPremium.imprimirDatos();
    }
}