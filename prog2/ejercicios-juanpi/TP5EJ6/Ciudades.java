package TP5EJ6;

import java.util.ArrayList;

public class Ciudades {
	ArrayList <Contribuyente>contribuyentes;
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
		this.contribuyentes = new ArrayList<Contribuyente>();
		this.gastos = ((this.mantenimiento/100)*this.sueldoPromedio)* this.habitantes;
	}
	public void setContribuyente(Contribuyente cont) {
		if(cont != null) {
			this.contribuyentes.add(cont);
		}
	}
	public ArrayList<Contribuyente> getContribuyentes(){
		return new ArrayList<Contribuyente>(this.contribuyentes);
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
	public double getGastosMantenimiento() {
		return ((this.mantenimiento/100)*this.sueldoPromedio)* this.habitantes;
	}
	public double getRecudado() {
		double recaudado =0;
		for(int i = 0; i < this.contribuyentes.size(); i++) {
			recaudado += this.contribuyentes.get(i).getPaga(this.sueldoPromedio);
		}
		return recaudado;
	}
	public boolean gastaMasQUeRecauda() {
		System.out.println(this.gastos > this.getRecudado());
		return this.getGastosMantenimiento() > this.getRecudado();
	}
	
}
