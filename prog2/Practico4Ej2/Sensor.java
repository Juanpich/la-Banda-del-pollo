package TP4EJ2;

public class Sensor {
	String nombre;
	boolean activado;
	public Sensor(String nombre) {
		this(nombre, false);
	}
	public Sensor(String nombre, boolean activado) {
		this.nombre = nombre;
		this.activado = activado;
	}
	public boolean getActivado() {
		return activado;
	}
	public void setActivado(boolean activado) {
		this.activado = activado;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean revisarSensor() {
		return this.activado;
	}
}
