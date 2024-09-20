package TP2EJ5;

public class Principal {
	public static void main (String[] args) {
		Peluquero n1 = new Peluquero("Javier", 123456);
		Turno d1h9pelu1 = new Turno("01", 9 , n1);
		Turno d1h10pelu1 = new Turno("01", 10, n1);
		Turno d1h11pelu1 = new Turno("01", 11, n1);
		Turno d1h12pelu1 = new Turno("01", 12, n1);
		Turno d1h13pelu1 = new Turno("01", 13, n1);
		Turno d1h14pelu1 = new Turno("01", 14, n1);
		Cliente n001 = new Cliente("Pepe", 223344); 
		Cliente n002 = new Cliente("Juan", 223344); 
		Cliente n003 = new Cliente("Dante", 223344); 
		Cliente n004 = new Cliente("Jaimito", 223344); 
		Cliente n005 = new Cliente("Perez", 223344); 
		
		System.out.println(n1.getTurnosAsignados());
		System.out.println(n1.getPrimerTurnoDisponible().getInfoTurno());
		d1h9pelu1.setCliente(n001);
		System.out.println(n1.getPrimerTurnoDisponible().getInfoTurno());
				
		
		
		
		
	}
}
