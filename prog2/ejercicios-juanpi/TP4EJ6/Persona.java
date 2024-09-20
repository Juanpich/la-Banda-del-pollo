package TP4EJ6;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private String cargo;
	public Persona(String nombre, String apellido, int edad, String cargo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.cargo = cargo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getInfo() {
		return this.getNombre() + " " + this.getApellido() + " tiene " + this.getEdad() + " años, es " + this.getCargo() + " de esta empresa";
	}
}
