package TP1EJ2;

public class Electrodomestico {
	String nombre;
	double precioBase;
	String color;
	double consumoEnergetico;
	double peso;
	
	public Electrodomestico() {
		precioBase = 100;
		color = "gris plata";
		consumoEnergetico = 10;
		peso = 2;
	}
	public Electrodomestico(String nombre, double precio, String color, double consumo, double peso) {
		this.nombre = nombre;
		precioBase = precio;
		this.color = color;
		consumoEnergetico = consumo;
		this.peso = peso;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecio(double precio) {
		precioBase = precio;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setConsumo(double consumo) {
		consumoEnergetico = consumo;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getNombre() {
		return nombre;
	}
	public double getPrecio() {
		return precioBase;
	}
	public String getColor() {
		return color;
	}
	public double getConsumo() {
		return consumoEnergetico;
	}
	public double getPeso() {
		return peso;
	}
	public boolean getEsBajoConsumo() {
		return consumoEnergetico <=45;
	}
	public double getBalance() {
		return precioBase / peso;
	}
	public boolean getEsAltaGama() {
		double balance = getBalance();
		return balance >= 3;
	}
}
