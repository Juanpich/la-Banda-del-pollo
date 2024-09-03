package TP2EJ3;

import java.util.ArrayList;

public class Ciudades {
	ArrayList <Impuesto> impuestos;
	String nombre;
	int habitantes;
	double sueldoPromedio;
	double mantenimiento;
	double gastos;
	public Ciudades(String nombre, int habitantes, double sueldoPromedio, double mantenimiento) {
		this.nombre = nombre;
		this.habitantes = habitantes;
		this.sueldoPromedio = sueldoPromedio;
		this.mantenimiento = mantenimiento;
		this.impuestos = new ArrayList<Impuesto>();
		this.gastos = ((this.mantenimiento/100)*this.sueldoPromedio)* this.habitantes;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}
	public double getSueldoPromedio() {
		return sueldoPromedio;
	}
	public void setSueldoPromedio(double sueldoPromedio) {
		this.sueldoPromedio = sueldoPromedio;
	}
	public double getMantenimiento() {
		return mantenimiento;
	}
	public void setMantenimiento(double mantenimiento) {
		this.mantenimiento = mantenimiento;
	}
	public void cargarImpuesto(Impuesto imp) {
		this.impuestos.add(imp);
	}
	public double getGastosMantenimiento() {
		return this.gastos;
	}
	public int getCantInpuestos() {
		return impuestos.size();
	}
	public double getRecudado() {
		double recaudado =0;
		double descuento =0;
		for(int i = 0; i < this.getCantInpuestos(); i++) {
			descuento = this.impuestos.get(i).getImpuesto();
			recaudado += ( (descuento / 100) * this.sueldoPromedio);
		}
		return recaudado * this.habitantes;
	}
	public boolean gastaMasQUeRecauda() {
		return this.gastos > this.getRecudado();
	}
	
}
