package TP2EJ3;

public class Impuesto {
  String nombre;
  double impuesto;
  	public Impuesto(String nombre, double impuesto) {
  		this.nombre = nombre;
  		this.impuesto = impuesto;
  	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}
	public boolean equals( Impuesto imp) {
		Impuesto im = (Impuesto)imp;
		return this.getNombre() == im.getNombre();
	}
  
}
