package TP6EJ1;

public class Principal {

	public static void main(String[] args) {
		Cliente n001 = new Cliente("Juan");
		Cliente m002 = new Cliente("Pepe");
		Pelicula p1 = new Pelicula("Elite", "asesinato", 1);
		Vehiculo v1 = new Vehiculo("Peugeot","DCK307", 100, "Diesel");
		p1.setAlquiler(n001);
		p1.setAlquiler(m002);
		System.out.println(p1.getListaClientes());
		System.out.println(n001.getFechaVencuida());
		p1.borrarClienteDeReserva(n001);
		p1.setAlquiler(m002);
		System.out.println(p1.getListaClientes());
		v1.setAlquiler(m002);
		v1.setAlquiler(n001);
		System.out.println(v1.getAlquiladoPor());
		
	}

}
