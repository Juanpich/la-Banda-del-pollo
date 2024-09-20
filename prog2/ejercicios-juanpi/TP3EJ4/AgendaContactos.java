package TP3EJ4;

import java.util.ArrayList;

public class AgendaContactos {
	private ArrayList<Contacto>contactos;
	public AgendaContactos() {
		this.contactos = new ArrayList<Contacto>();
	}
	public void setContacto(Contacto cont) {
		if(cont != null) {
			this.contactos.add(cont);
		}
	}
	public int getCantContactos() {
		return this.contactos.size();
	}
	public double getPromedioEdad() {
		double aux=0;
		for(int i = 0; i < this.contactos.size(); i++) {
			aux += this.contactos.get(i).getEdad();	
		}
		return aux/this.contactos.size();
	}
	public ArrayList<Contacto> getContactosIguales(){
		ArrayList<Contacto> aux = new ArrayList<Contacto>();
		if(this.contactos.size() != 1) {
			for(int i = 0; i < this.contactos.size(); i++) {
				int j = i+1;
				boolean encontre = false;
				while(j < this.contactos.size() && !encontre) {
					if(this.contactos.get(i).equals(this.contactos.get(j))) {
						encontre = true;
						aux.add(this.contactos.get(i));
					}
					j++;
				}
				
			}
		}
		return aux;
	}
	public ArrayList<Contacto> getContactosConMismoNumero(){
		ArrayList<Contacto> aux = new ArrayList<Contacto>();
		if(this.contactos.size() != 1) {
			for(int i = 0; i < this.contactos.size(); i++) {
				int j = i+1;
				boolean encontre = false;
				while(j < this.contactos.size() && !encontre) {
					if(this.contactos.get(i).getNumTel() == this.contactos.get(j).getNumTel()) {
						encontre = true;
						aux.add(this.contactos.get(i));
					}
				}	
			}
		}
		return aux;
	}
}
