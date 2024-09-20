package TP6EJ2;

import java.util.ArrayList;

public class CentroDeComputos {
	private ArrayList<Proceso>procesos;
	private ArrayList<Computadora>computadoras;
	public CentroDeComputos() {
		this.procesos = new ArrayList<Proceso>();
		this.computadoras = new ArrayList<Computadora>();
	}
	public void agregarProceso(Proceso proc) {
		if(proc != null) {
			if(this.procesos.size() > 0) {
				int i = 0;
				boolean agregado = false;
				while(i < this.procesos.size() && !agregado) {
					if(this.procesos.get(i).getMemoria() <= proc.getMemoria()) {
						this.procesos.add(i, proc);
						agregado= true;
					}
					i++;
				}
			}else {
				this.procesos.add(proc);
			}
		}
	}
	public void agregarComputadora(Computadora compu) {
		if(compu != null) {
			if(this.computadoras.size() > 0) {
				int i = 0;
				boolean agregado = false;
				int pos = -1;
				while(i < this.computadoras.size() && !agregado) {
					if(this.computadoras.get(i).getRapidez() <= compu.getRapidez()) {
						pos = i;
						agregado= true;
					}
					i++;
				}
				if(pos != -1)
					this.computadoras.add(pos, compu);
				else
					this.computadoras.add(compu);
			}else {
				this.computadoras.add(compu);
			}
		}
	}
	public void ejecutar() {
		if(this.procesos.size() > 0) {
			if(this.computadoras.size() > 0) {
				System.out.println("ejecutado");
				this.procesos.remove(0);
				this.computadoras.remove(0);
			}
		}
	}
	public void ejecutarTodo() {
		if(this.procesos.size() > 0 && this.computadoras.size() > 0) {
			int n = 0;
			if(this.procesos.size() <= this.computadoras.size()) 
				n =this.procesos.size();
			else
				n = this.computadoras.size();
			for(int i = 0; i < n; i++ ) {
				this.procesos.remove(0);
				this.computadoras.remove(0);
			}
			System.out.println("se han ejecutado todos los procesos posibles");
		}
	}
	public String getListaProcesos() {
		String aux = "Los procesos guardados son: " + '\n';
		for(int i = 0; i < this.procesos.size(); i++) {
			aux += this.procesos.get(i).toString() +  '\n';
		}
		return aux;
	}
	public String getListaComputadora() {
		String aux = "Las computadoras guardados son: " + '\n';
		for(int i = 0; i < this.computadoras.size(); i++) {
			aux += this.computadoras.get(i).toString() +  '\n';
		}
		return aux;
	}
	public String getListaCompleta() {
		return this.getListaProcesos() + this.getListaComputadora();
	}
}

