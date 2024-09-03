package TP4EJ4;

public class Futbolista extends Integrante {
	int posicion;
	char pieHabil;
	int goles;
	public Futbolista(String nombre, String apellido, 
			int numeroPasaporte, String estado,
			String nacimiento, int posicion, char pieHabil) {
		super(nombre, apellido, numeroPasaporte, estado, nacimiento);
	}
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	public int getGoles() {
		return goles;
	}
	public void setGoles(int goles) {
		this.goles = goles;
	}	
	public char getPieHabil() {
		return this.pieHabil;
	}
	
	
}
