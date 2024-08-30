package TP4EJ2;

public class Movimiento extends Sensor {
	public Movimiento(String nombre, boolean estado) {
		super(nombre, estado);
	}
	public boolean revisarSensor() {
		return super.activado;
	}
	
}
