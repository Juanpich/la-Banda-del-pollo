package TP4EJ3;

public class Empleado {
	private String nombre;
	private int dni;
	private double sueldo;
	public Empleado(String nombre, int dni, double sueldo) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.sueldo = sueldo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
}
