package TP6EJ4;

public class Proceso extends Elemento {
	private int memoria;

	public Proceso(int memoria) {
		super();
		this.memoria = memoria;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	public String toString() {
		return "Proceso de memoria: " + this.getMemoria();
	}

	@Override
	public boolean getEsMenor(Elemento elemn) {
		Proceso otr = (Proceso)elemn;
		return this.getMemoria() < otr.getMemoria();
	}
}
