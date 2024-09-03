package TP3EJ1;

public class Empleado {
	
	String nombre;
	int encuestasRealizadas;
	public Empleado(String nombre) {
		this.nombre = nombre;
	}
	public void setRealizoEncuesta() {
		encuestasRealizadas++;
	}
	public String getInfoEmpleado() {
		return "El empleado: " + nombre + ", ha realizado " + encuestasRealizadas + " encuestas";
	}
	
}
