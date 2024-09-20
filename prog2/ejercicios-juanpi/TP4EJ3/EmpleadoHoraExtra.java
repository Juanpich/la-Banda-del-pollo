package TP4EJ3;

public class EmpleadoHoraExtra extends Empleado {
	private int horas;
	private double precioPorHora;
	public EmpleadoHoraExtra(String nombre, int dni, double sueldo, int horas, double precioPorHora) {
		super(nombre, dni, sueldo);
		this.horas = horas;
		this.precioPorHora = precioPorHora;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public double getPrecioPorHora() {
		return precioPorHora;
	}
	public void setPrecioPorHora(double precioPorHora) {
		this.precioPorHora = precioPorHora;
	}
	public double getSueldo() {
		return super.getSueldo() + (this.horas * this .precioPorHora);
	}
}
