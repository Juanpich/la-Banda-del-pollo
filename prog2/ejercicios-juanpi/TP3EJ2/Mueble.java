package TP3EJ2;


public class Mueble {
	String tipoMueble;
	String color;
	String tipoMadera;
	double peso;
	double costoFabricacion;
	double valorVenta;
	double porcentajeVenta;
	
	
	
	public Mueble(String tipoMueble, String color, String tipoMadera,
			double peso, double costoFabricacion
			) {
		this.tipoMueble = tipoMueble;
		this.color = color;
		this.tipoMadera = tipoMadera;
		this.peso = peso;
		this.costoFabricacion = costoFabricacion;
		this.porcentajeVenta = 35;
	}
	public String getTipoMueble() {
		return tipoMueble;
	}
	public void setTipoMueble(String tipoMueble) {
		this.tipoMueble = tipoMueble;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTipoMadera() {
		return tipoMadera;
	}
	public void setTipoMadera(String tipoMadera) {
		this.tipoMadera = tipoMadera;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getCostoFabricacion() {
		return this.costoFabricacion ;
	}
	public void setCostoFabricacion(double costoFabricacion) {
		this.costoFabricacion = costoFabricacion;
	}
	public double getValorVenta() {
		return (this.costoFabricacion + (this.costoFabricacion * (this.porcentajeVenta /100)));
	}
	
	public double getPorcentajeVenta() {
		return porcentajeVenta;
	}
	public void setPorcentajeVenta(double porcentajeVenta) {
		this.porcentajeVenta = porcentajeVenta;
	}
	
}
