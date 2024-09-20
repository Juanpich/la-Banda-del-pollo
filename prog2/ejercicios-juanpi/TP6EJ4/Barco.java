package TP6EJ4;

public class Barco extends Elemento {
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

	@Override
	public boolean getEsMenor(Elemento elemn) {
			Barco otr = (Barco) elemn;
			return this.getCapacidad() < otr.getCapacidad(); 		
	}
	
}
