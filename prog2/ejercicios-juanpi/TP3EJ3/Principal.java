package TP3EJ3;

public class Principal {

	public static void main(String[] args) {
		Juego juego1 = new Juego();
		Jugador juan = new Jugador("juanpi", "superman", 200, 400, 300, 19, 100, 190);
		Jugador pepe = new Jugador("pepe", "airoman", 300, 200, 400, 19, 100, 190);
		Jugador fran = new Jugador("fran", "ralf", 400, 200, 300, 19, 100, 190);
		juego1.cargarJugadores(juan);
		juego1.cargarJugadores(pepe);
		juego1.cargarJugadores(fran);
		System.out.println(juego1.comenzarJuego("velocidad"));
		System.out.println(juego1.comenzarJuego("fuerza"));
		System.out.println(juego1.comenzarJuego("vision nocturna"));
	}

}
