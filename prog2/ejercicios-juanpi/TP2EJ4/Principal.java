package TP2EJ4;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		Usuario juanpi = new Usuario("Juanpi");
		Usuario agus = new Usuario("Agustin");
		Usuario fran = new Usuario("Fransisco");
		Futbol dia30agosto = new Futbol(500);
		Paddle dia31agosto = new Paddle(100);
		usuarios.add(juanpi);
		usuarios.add(agus);
		usuarios.add(fran);
		dia30agosto.setReserva(juanpi);
		System.out.println("El descuento de socio aplica para " + juanpi.getNombre() + ": " + juanpi.getAplicaDescuento(3));
		dia30agosto.setReserva(juanpi);
		System.out.println("El descuento de socio aplica para " + juanpi.getNombre() + ": " + juanpi.getAplicaDescuento(3));
		dia30agosto.setReserva(fran);
		System.out.println("El descuento de socio aplica para " + fran.getNombre() + ": " + fran.getAplicaDescuento(3));
		dia31agosto.setReserva(juanpi);
		System.out.println("El descuento de socio aplica para " + juanpi.getNombre() + ": " + juanpi.getAplicaDescuento(3));
		
		
		
	}
}
