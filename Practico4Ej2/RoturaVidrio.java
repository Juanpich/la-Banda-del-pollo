package TP4EJ2;

public class RoturaVidrio extends Sensor {

	public RoturaVidrio(String nombre, boolean estado) {
		super(nombre, estado);
		
	}
	public boolean revisarSensor() {
		return super.activado;
	}
}
