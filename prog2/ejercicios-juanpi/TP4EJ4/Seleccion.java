package TP4EJ4;

import java.util.ArrayList;

public class Seleccion {
	 private ArrayList <Integrante> seleccion; 
	public Seleccion() {
		seleccion = new ArrayList <Integrante>();
	}
	public void cargarSeleccion(Integrante inte) {
		if(!seleccion.contains(inte)) {
			seleccion.add(inte);
		}else {
			System.out.println("Esta persona ya esta");
		}
	}
	public int getCantidadIntegrantes() {
		return seleccion.size();
	}
	public void todoEqupoDe(String estado) {
		for(int i =0; i <seleccion.size(); i++) {
			seleccion.get(i).setEstado(estado);
		}
	}
	
}
