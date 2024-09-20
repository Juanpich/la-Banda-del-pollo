package TP5EJ8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Evaluador {
	private static ArrayList <String> cualidadesParaExperto =new ArrayList<>(Arrays.asList("agentes", "visualizacion", "redes de comunicacion"));
	private ArrayList<TrabajoPractico> trabajos;
	private ArrayList<String>cualidades;
	private String nombre;
	public Evaluador(String nombre) {
		this.nombre = nombre;
		this.setCualidades();
	}
	public int getCantTrabajosAsig() {
		return this.trabajos.size();
	}
	private void setCualidades() {
		this.cualidades = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Cargar cualidades al evaluador " + this.getNombre());
	    boolean sigo = true;

	    while (sigo) {
	        try {
	            System.out.println("Ingrese una cualidad:");
	            String aux = scanner.nextLine();
	            this.cualidades.add(aux);

	            System.out.println("¿Desea seguir avanzando? si/no:");
	            String respuesta = scanner.nextLine().toLowerCase();
	            if (!respuesta.equals("si")) {
	                sigo = false;
	            }
	        } catch (Exception exc) {
	            System.out.println("Ha ocurrido un error: " + exc.getMessage());
	        }
	      }

	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void agregoCualidad(String cualidad) {
		this.cualidades.add(cualidad);
	}
	public boolean getEsExperto() {
		int pos =0;
		while(pos < this.cualidadesParaExperto.size() && this.cualidades.contains(this.cualidadesParaExperto.get(pos))) {
			pos++;
		}
		if(pos == this.cualidadesParaExperto.size()) {
			return true;
		}else {
			return false;
		}
	}
	public void agregarTrabajo(TrabajoPractico tp) {
		if(tp != null) {
			this.trabajos.add(tp);
		}
	}
	public boolean contieneCualidad(String cual) {
		return this.cualidades.contains(cual);
	}
	public boolean puedoEvaluarElTrabajo(TrabajoPractico tp) {
		if(tp != null) {
			if(tp.sePuedeAsiganrEvaluador(this))
				return true;
			else
				return false;
		}else
			return false;
		
	}
}
