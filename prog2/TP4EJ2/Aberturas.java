package TP4EJ2;

public class Aberturas extends Sensor {
	public Aberturas(String nombre, boolean estado) {
		super(nombre, estado);
	}
	public boolean revisarSensor() {
		return super.activado;
	}
}
