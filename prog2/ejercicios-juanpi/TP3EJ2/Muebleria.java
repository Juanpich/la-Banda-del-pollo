package TP3EJ2;

import java.util.ArrayList;

public class Muebleria {
	private ArrayList <Mueble> muebles;

	public Muebleria() {
		this.muebles = new ArrayList<Mueble>();
	}
	public void cargarMueble(Mueble mueb) {
		this.muebles.add(mueb);
	}
	public int getCantMuebles() {
		return this.muebles.size();
	}
	public int getCantidadDe(String tipo) {
		int total=0;
		for(int i = 0; i < muebles.size(); i++) {
			if(muebles.get(i).getTipoMueble() == tipo) {
				total++;
			}
		}
		return total;
	}
	public double getCostoFabricaccionDeTodos() {
		double total=0;
		for(int i = 0; i < muebles.size(); i++) {
			total += muebles.get(i).getCostoFabricacion();
			

		}
		return total;
	}
	public double getCostoVentaDeTodos() {
		double total=0;
		for(int i = 0; i < muebles.size(); i++) {
			total += muebles.get(i).getValorVenta();
			

		}
		return total;
	}
	
	
	
	
}
