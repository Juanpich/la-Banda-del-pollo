package TP4EJ6;

public class Usuario extends Persona {
	private String nombreUser;
	private String clave;
	
	public Usuario(String nombre, String apellido, int edad, String nombreUser, String clave) {
		super(nombre, apellido, edad, "Usuario");
		this.nombreUser = nombreUser;
		this.clave = clave;
	}
	public String getNombreUser() {
		return nombreUser;
	}
	public void setNombreUser(String nombreUser) {
		this.nombreUser = nombreUser;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getInfo() {
		return super.getInfo() + ", su usuario es: " +this.getNombreUser() + ", la clave que utiliza para acceder es: " + this.getClave() ;
	}
}	
