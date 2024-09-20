package TP6EJ3;

import java.util.ArrayList;

public class Puerto {
	private ArrayList<Barco>barcos;
	private ArrayList<Camion>camiones;
	public Puerto() {
		this.barcos = new ArrayList<>();
		this.camiones = new ArrayList<>();
	}
	public void descargarCamion() {
		if(this.camiones.size() > 0 && this.barcos.size() >0) {
			this.camiones.remove(0);
			this.barcos.remove(0);
		}
	}
	public void descargarTodo() {
		for(int i = 0; i < this.camiones.size(); i++) {
			this.descargarCamion();
		}
	}
	public void agregarBarco(Barco bar) {
		if(bar != null) {
			if(this.barcos.size() > 0) {
				int pos = 0;
				while(pos < this.barcos.size() && this.esMenorCapacidad(this.barcos.get(pos), bar)) {
					pos++;
				}
				this.barcos.add(pos, bar);
			}else {
				this.barcos.add(bar);
			}
		}
	}
	public void agregarCamion(Camion cam) {
		if(cam != null) {
			if(this.camiones.size() > 0) {
				int pos = 0;
				while(pos < this.camiones.size() && this.seCargoAntes(this.camiones.get(pos), cam)) {
					pos++;
				}
				this.camiones.add(pos, cam);
			}else {
				this.camiones.add(cam);
			}
		}
	}
	public String listaCamione() {
		String aux = "Camiones >" +'\n';
		for(int i = 0; i <this.camiones.size(); i++) {
			aux += this.camiones.get(i).toString();
		}
		return aux;
	}
	public String listaBarcos() {
		String aux = "Barcos >" +'\n';
		for(int i = 0; i <this.barcos.size(); i++) {
			aux += this.barcos.get(i).toString();
		}
		return aux;
	}
	public String listaCompleta() {
		return "En la lista de espera hay: " + '\n' +this.listaBarcos() + this.listaCamione();
	}
	private boolean seCargoAntes(Camion camAc, Camion cam) {
		return camAc.getFechaCarga().isBefore(cam.getFechaCarga());
	}
	private boolean esMenorCapacidad(Barco barAc, Barco bar) {
		return barAc.getCapacidad() > bar.getCapacidad();
	}
}
