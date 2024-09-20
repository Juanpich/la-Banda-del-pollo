package TP4EJ6;

public class Empleado extends Persona {
	private int legajo;
	private double sueldo;
	
	public Empleado(String nombre, String apellido, int edad, int legajo, double sueldo) {
		super(nombre, apellido, edad, "Empleado");
		this.legajo = legajo;
		this.sueldo = sueldo;
	}
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public String getInfo() {
		return super.getInfo() + ", su legajo es el nro:" + this.getLegajo() + ", su sueldo actual es de: $" + this.getSueldo(); 
	}
	
}
