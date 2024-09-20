package TP5EJ6;

public abstract class Contribuyente {
	private String nombre;
	private double descuento;
	private static int identificador=0;
	private int id;
	public Contribuyente(String nombre, double impuesto) {
		this.nombre = nombre;
		this.id = this.identificador;
		this.identificador++;
		this.descuento =impuesto;	
}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public abstract double getPaga(double sueldo);
}
