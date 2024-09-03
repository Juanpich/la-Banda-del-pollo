package TP3EJ3;

public class Jugador {
	private String nombreReal;
	private String nombreSuper;
	private int fuerza;
	private int visionNocturna;
	private int velocidad;
	private int edad;
	private double peso;
	private double altura;
	public Jugador(String nombreReal, String nombreSuper, int fuerza, int visionNocturna, int velocidad, int edad,
			double peso, double altura) {
		super();
		this.nombreReal = nombreReal;
		this.nombreSuper = nombreSuper;
		this.fuerza = fuerza;
		this.visionNocturna = visionNocturna;
		this.velocidad = velocidad;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}
	public String getNombreReal() {
		return nombreReal;
	}
	public void setNombreReal(String nombreReal) {
		this.nombreReal = nombreReal;
	}
	public String getNombreSuper() {
		return nombreSuper;
	}
	public void setNombreSuper(String nombreSuper) {
		this.nombreSuper = nombreSuper;
	}
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	public int getVisionNocturna() {
		return visionNocturna;
	}
	public void setVisionNocturna(int visionNocturna) {
		this.visionNocturna = visionNocturna;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
