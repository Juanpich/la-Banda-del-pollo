package TP2EJ4;

public class Usuario {
	private String nombre;
	private int vecesAlquiler;
	
	public Usuario(String nombre) {
		this.nombre = nombre;
		this.vecesAlquiler = 0;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVecesAlquiler() {
		return vecesAlquiler;
	}
	public void reservoCancha() {
		this.vecesAlquiler++;
	}
	public boolean getAplicaDescuento(int veces) {
		return this.vecesAlquiler >= veces;
	}
	
	
}
