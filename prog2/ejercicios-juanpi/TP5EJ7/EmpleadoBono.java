package TP5EJ7;

public class EmpleadoBono extends Empleado {
	private double bono;
	private int ventasQueDebeHacer;
	private int ventas;
	
	public EmpleadoBono(String nombre, String apellido, int dni, double sueldo, double bono, int ventasQueDebeHacer, int ventas) {
		super(nombre, apellido, dni, sueldo);
		this.bono = bono;
		this.ventasQueDebeHacer = ventasQueDebeHacer;
		this.ventas = ventas;
	}
	
	public int getVentas() {
		return ventas;
	}

	public void setVentas() {
		this.ventas ++;
	}
	public void setVentas(int ventas) {
		this.ventas = ventas;
	}

	public double getBono() {
		return bono;
	}
	public void setBono(double bono) {
		this.bono = bono;
	}
	public int getVentasQueDebeHacer() {
		return ventasQueDebeHacer;
	}
	public void setVentasQueDebeHacer(int ventasQueDebeHacer) {
		this.ventasQueDebeHacer = ventasQueDebeHacer;
	}
	public double getSueldo() {
		double aux = super.getSueldo();
		if(this.ventas >= this.ventasQueDebeHacer) {
			return aux + this.bono;
		}else {
			return aux;
		}
	}
	
}
