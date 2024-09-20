package TP6EJ4;

import java.util.ArrayList;

public class ColaElementos {
	private ArrayList<Elemento> elementos;
	public ColaElementos() {
		this.elementos = new ArrayList<Elemento>();	
	}
	public void agregar(Elemento elem) {
		if(elem != null) {
			if(this.elementos.size() > 0) {
				int i = 0;
				while(i < this.elementos.size() && this.elementos.get(i).getEsMenor(elem)) {
					i++;
				}
				this.elementos.add(i,elem);
			}else {
				this.elementos.add(elem);
			}
		}
	}
	public int getCantElementos() {
		return this.elementos.size();
	}
	public String getLista() {
		String aux = "";
		for(int i = 0; i < this.elementos.size(); i++) {
			aux += this.elementos.get(i).toString() +  '\n';
		}
		return aux;
	}
	public void removerPrimero() {
		this.elementos.remove(0);
	}
	
	
}
