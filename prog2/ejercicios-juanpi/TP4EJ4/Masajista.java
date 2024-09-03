package TP4EJ4;



public class Masajista extends Integrante {
	int aniosExperiencia;
	String titulo;
	public Masajista(String nombre, String apellido, 
			int numeroPasaporte, String estado,
			String nacimiento, int aniosExperiencia, String titulo) {
		super(nombre, apellido, numeroPasaporte, estado, nacimiento);
		this.aniosExperiencia = aniosExperiencia;
		this.titulo = titulo;
	}
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}
	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	
}
