package TP4EJ4;

import java.util.ArrayList;

public class Seleccion {
	ArrayList <Integrante> seleccion; 
	public Seleccion() {
		seleccion = new ArrayList <Integrante>();
	}
	public void cargarSeleccion(Integrante inte) {
		if(!seleccion.contains(inte)) {
			seleccion.add(inte);
		}else {
			System.out.println("NO se crago a nadie");
		}
	}
	public int getCantidadIntegrantes() {
		return seleccion.size();
	}
	
}
