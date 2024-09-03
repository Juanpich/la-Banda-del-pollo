package TP2EJ2;

public class Persona {
	String nombre;
	String email;
	int tel;
	public Persona(String nombre, String email, int tel) {
		this.nombre = nombre;
		this.email = email;
		this.tel = tel;
	}
	public String getNombre() {
		return nombre;
	}
	public String getEmail() {
		return email;
	}
	public int getTelefono() {
		return tel;
	}
}
