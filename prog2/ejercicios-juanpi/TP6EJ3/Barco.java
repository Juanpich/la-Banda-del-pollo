package TP6EJ3;

public class Barco {
	private int capacidad;

	public Barco(int capacidad) {
		super();
		this.capacidad = capacidad;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String toString() {
		return "Barco con capacidad de: " + this.getCapacidad() +'\n';
	}
	
}
