package TP5EJ5;

import java.util.ArrayList;
import java.util.Scanner;

public class Lote {
	private int hectareas;
	private boolean esLoteEspecial;
	private ArrayList<String>minerales;
	public Lote(int hectareas) {
		this.hectareas= hectareas;
		this.cargarMinerales();
	}
	
	public boolean getEsLoteEspecial() {
		return esLoteEspecial;
	}

	public void setEsLoteEspecial(boolean esLoteEspecial) {
		this.esLoteEspecial = esLoteEspecial;
	}

	public int getHectareas() {
		return hectareas;
	}

	public void setHectareas(int hectareas) {
		this.hectareas = hectareas;
	}
	public ArrayList<String> getMinerales(){
		return new ArrayList<String>(this.minerales);
	}
	

	public void cargarMinerales() {
		this.minerales = new ArrayList<String>();
		System.out.println("Cargar cualidades para el lote");
		String aux = "";
		boolean sigo = true;
		while(sigo) {
			try {
				Scanner scanner = new Scanner(System.in);
					System.out.println("Ingrese un mineral:");
					aux = scanner.nextLine();
					this.minerales.add(aux);
					aux = "";
					System.out.println("Desea seguir avanzando si = true, no = false:");
					sigo = scanner.nextBoolean();
				
			}catch(Exception exc) {
				System.out.println(exc);	
			}
		}
	}
}
