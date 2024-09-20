package TP4EJ3;

public class EmpleadoComision extends Empleado {
	private int ventas;
	private double porcentaje;
	public EmpleadoComision(String nombre, int dni, double sueldo, int ventas, double porcentaje) {
		super(nombre, dni, sueldo);
		this.ventas = ventas;
		this.porcentaje = porcentaje;
	}
	public int getVentas() {
		return ventas;
	}
	public void setVentas() {
		this.ventas++;
	}
	public double getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	public double getSueldo() {
		return super.getSueldo() + (this.porcentaje /100 * this.ventas);
	}
	
}
