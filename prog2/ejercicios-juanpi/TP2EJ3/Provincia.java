package TP2EJ3;

import java.util.ArrayList;

public class Provincia {
	String nombre;
	ArrayList <Ciudades> ciudades;
	public Provincia(String nombre) {
		this.nombre = nombre;
		this.ciudades = new ArrayList<Ciudades>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCiudades(Ciudades ciudad) {
		this.ciudades.add(ciudad);
	}
	public int getCantCiudades() {
		return ciudades.size();
	}
	public int getCiudadesGastanMasQueRecaudan() {
		int total = 0;
		for(int i = 0; i < this.getCantCiudades(); i++) {
			if(ciudades.get(i).gastaMasQUeRecauda()) {
				total++;
			}
		}
		return total;
	}
	
}
